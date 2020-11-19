package typingsSlinky.gapiClientGenomics.gapi.client.genomics

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientGenomics.anon.Accesstoken
import typingsSlinky.gapiClientGenomics.anon.Uploadprotocol
import typingsSlinky.gapiClientGenomics.anon.VariantSetId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VariantsetsResource extends js.Object {
  
  /**
    * Creates a new variant set.
    *
    * For the definitions of variant sets and other genomics resources, see
    * [Fundamentals of Google
    * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
    *
    * The provided variant set must have a valid `datasetId` set - all other
    * fields are optional. Note that the `id` field will be ignored, as this is
    * assigned by the server.
    */
  def create(request: Accesstoken): Request[VariantSet] = js.native
  
  /**
    * Deletes a variant set including all variants, call sets, and calls within.
    * This is not reversible.
    *
    * For the definitions of variant sets and other genomics resources, see
    * [Fundamentals of Google
    * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
    */
  def delete(request: Uploadprotocol): Request[js.Object] = js.native
  
  /**
    * Exports variant set data to an external destination.
    *
    * For the definitions of variant sets and other genomics resources, see
    * [Fundamentals of Google
    * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
    */
  def export(request: Uploadprotocol): Request[Operation] = js.native
  
  /**
    * Gets a variant set by ID.
    *
    * For the definitions of variant sets and other genomics resources, see
    * [Fundamentals of Google
    * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
    */
  def get(request: Uploadprotocol): Request[VariantSet] = js.native
  
  /**
    * Updates a variant set using patch semantics.
    *
    * For the definitions of variant sets and other genomics resources, see
    * [Fundamentals of Google
    * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
    */
  def patch(request: VariantSetId): Request[VariantSet] = js.native
  
  /**
    * Returns a list of all variant sets matching search criteria.
    *
    * For the definitions of variant sets and other genomics resources, see
    * [Fundamentals of Google
    * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
    *
    * Implements
    * [GlobalAllianceApi.searchVariantSets](https://github.com/ga4gh/schemas/blob/v0.5.1/src/main/resources/avro/variantmethods.avdl#L49).
    */
  def search(request: Accesstoken): Request[SearchVariantSetsResponse] = js.native
}
object VariantsetsResource {
  
  @scala.inline
  def apply(
    create: Accesstoken => Request[VariantSet],
    delete: Uploadprotocol => Request[js.Object],
    export: Uploadprotocol => Request[Operation],
    get: Uploadprotocol => Request[VariantSet],
    patch: VariantSetId => Request[VariantSet],
    search: Accesstoken => Request[SearchVariantSetsResponse]
  ): VariantsetsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), export = js.Any.fromFunction1(export), get = js.Any.fromFunction1(get), patch = js.Any.fromFunction1(patch), search = js.Any.fromFunction1(search))
    __obj.asInstanceOf[VariantsetsResource]
  }
  
  @scala.inline
  implicit class VariantsetsResourceOps[Self <: VariantsetsResource] (val x: Self) extends AnyVal {
    
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
    def setCreate(value: Accesstoken => Request[VariantSet]): Self = this.set("create", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDelete(value: Uploadprotocol => Request[js.Object]): Self = this.set("delete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setExport(value: Uploadprotocol => Request[Operation]): Self = this.set("export", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGet(value: Uploadprotocol => Request[VariantSet]): Self = this.set("get", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPatch(value: VariantSetId => Request[VariantSet]): Self = this.set("patch", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSearch(value: Accesstoken => Request[SearchVariantSetsResponse]): Self = this.set("search", js.Any.fromFunction1(value))
  }
}
