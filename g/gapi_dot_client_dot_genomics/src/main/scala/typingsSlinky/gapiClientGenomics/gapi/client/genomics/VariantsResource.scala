package typingsSlinky.gapiClientGenomics.gapi.client.genomics

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientGenomics.anon.Accesstoken
import typingsSlinky.gapiClientGenomics.anon.UpdateMask
import typingsSlinky.gapiClientGenomics.anon.UploadType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VariantsResource extends js.Object {
  
  /**
    * Creates a new variant.
    *
    * For the definitions of variants and other genomics resources, see
    * [Fundamentals of Google
    * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
    */
  def create(request: Accesstoken): Request[Variant] = js.native
  
  /**
    * Deletes a variant.
    *
    * For the definitions of variants and other genomics resources, see
    * [Fundamentals of Google
    * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
    */
  def delete(request: UploadType): Request[js.Object] = js.native
  
  /**
    * Gets a variant by ID.
    *
    * For the definitions of variants and other genomics resources, see
    * [Fundamentals of Google
    * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
    */
  def get(request: UploadType): Request[Variant] = js.native
  
  /**
    * Creates variant data by asynchronously importing the provided information.
    *
    * For the definitions of variant sets and other genomics resources, see
    * [Fundamentals of Google
    * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
    *
    * The variants for import will be merged with any existing variant that
    * matches its reference sequence, start, end, reference bases, and
    * alternative bases. If no such variant exists, a new one will be created.
    *
    * When variants are merged, the call information from the new variant
    * is added to the existing variant, and Variant info fields are merged
    * as specified in
    * infoMergeConfig.
    * As a special case, for single-sample VCF files, QUAL and FILTER fields will
    * be moved to the call level; these are sometimes interpreted in a
    * call-specific context.
    * Imported VCF headers are appended to the metadata already in a variant set.
    */
  def `import`(request: Accesstoken): Request[Operation] = js.native
  
  /**
    * Merges the given variants with existing variants.
    *
    * For the definitions of variants and other genomics resources, see
    * [Fundamentals of Google
    * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
    *
    * Each variant will be
    * merged with an existing variant that matches its reference sequence,
    * start, end, reference bases, and alternative bases. If no such variant
    * exists, a new one will be created.
    *
    * When variants are merged, the call information from the new variant
    * is added to the existing variant. Variant info fields are merged as
    * specified in the
    * infoMergeConfig
    * field of the MergeVariantsRequest.
    *
    * Please exercise caution when using this method!  It is easy to introduce
    * mistakes in existing variants and difficult to back out of them.  For
    * example,
    * suppose you were trying to merge a new variant with an existing one and
    * both
    * variants contain calls that belong to callsets with the same callset ID.
    *
    * // Existing variant - irrelevant fields trimmed for clarity
    * {
    * "variantSetId": "10473108253681171589",
    * "referenceName": "1",
    * "start": "10582",
    * "referenceBases": "G",
    * "alternateBases": [
    * "A"
    * ],
    * "calls": [
    * {
    * "callSetId": "10473108253681171589-0",
    * "callSetName": "CALLSET0",
    * "genotype": [
    * 0,
    * 1
    * ],
    * }
    * ]
    * }
    *
    * // New variant with conflicting call information
    * {
    * "variantSetId": "10473108253681171589",
    * "referenceName": "1",
    * "start": "10582",
    * "referenceBases": "G",
    * "alternateBases": [
    * "A"
    * ],
    * "calls": [
    * {
    * "callSetId": "10473108253681171589-0",
    * "callSetName": "CALLSET0",
    * "genotype": [
    * 1,
    * 1
    * ],
    * }
    * ]
    * }
    *
    * The resulting merged variant would overwrite the existing calls with those
    * from the new variant:
    *
    * {
    * "variantSetId": "10473108253681171589",
    * "referenceName": "1",
    * "start": "10582",
    * "referenceBases": "G",
    * "alternateBases": [
    * "A"
    * ],
    * "calls": [
    * {
    * "callSetId": "10473108253681171589-0",
    * "callSetName": "CALLSET0",
    * "genotype": [
    * 1,
    * 1
    * ],
    * }
    * ]
    * }
    *
    * This may be the desired outcome, but it is up to the user to determine if
    * if that is indeed the case.
    */
  def merge(request: Accesstoken): Request[js.Object] = js.native
  
  /**
    * Updates a variant.
    *
    * For the definitions of variants and other genomics resources, see
    * [Fundamentals of Google
    * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
    *
    * This method supports patch semantics. Returns the modified variant without
    * its calls.
    */
  def patch(request: UpdateMask): Request[Variant] = js.native
  
  /**
    * Gets a list of variants matching the criteria.
    *
    * For the definitions of variants and other genomics resources, see
    * [Fundamentals of Google
    * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
    *
    * Implements
    * [GlobalAllianceApi.searchVariants](https://github.com/ga4gh/schemas/blob/v0.5.1/src/main/resources/avro/variantmethods.avdl#L126).
    */
  def search(request: Accesstoken): Request[SearchVariantsResponse] = js.native
}
object VariantsResource {
  
  @scala.inline
  def apply(
    create: Accesstoken => Request[Variant],
    delete: UploadType => Request[js.Object],
    get: UploadType => Request[Variant],
    `import`: Accesstoken => Request[Operation],
    merge: Accesstoken => Request[js.Object],
    patch: UpdateMask => Request[Variant],
    search: Accesstoken => Request[SearchVariantsResponse]
  ): VariantsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), merge = js.Any.fromFunction1(merge), patch = js.Any.fromFunction1(patch), search = js.Any.fromFunction1(search))
    __obj.updateDynamic("import")(js.Any.fromFunction1(`import`))
    __obj.asInstanceOf[VariantsResource]
  }
  
  @scala.inline
  implicit class VariantsResourceOps[Self <: VariantsResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCreate(value: Accesstoken => Request[Variant]): Self = this.set("create", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDelete(value: UploadType => Request[js.Object]): Self = this.set("delete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGet(value: UploadType => Request[Variant]): Self = this.set("get", js.Any.fromFunction1(value))
    
    @scala.inline
    def setImport(value: Accesstoken => Request[Operation]): Self = this.set("import", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMerge(value: Accesstoken => Request[js.Object]): Self = this.set("merge", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPatch(value: UpdateMask => Request[Variant]): Self = this.set("patch", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSearch(value: Accesstoken => Request[SearchVariantsResponse]): Self = this.set("search", js.Any.fromFunction1(value))
  }
}
