package typingsSlinky.gapiClientGenomics.gapi.client.genomics

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientGenomics.AnonAccesstoken
import typingsSlinky.gapiClientGenomics.AnonPp
import typingsSlinky.gapiClientGenomics.AnonPrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReadgroupsetsResource extends js.Object {
  var coveragebuckets: CoveragebucketsResource = js.native
  /**
    * Deletes a read group set.
    *
    * For the definitions of read group sets and other genomics resources, see
    * [Fundamentals of Google
    * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
    */
  def delete(request: AnonPp): Request_[js.Object] = js.native
  /**
    * Exports a read group set to a BAM file in Google Cloud Storage.
    *
    * For the definitions of read group sets and other genomics resources, see
    * [Fundamentals of Google
    * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
    *
    * Note that currently there may be some differences between exported BAM
    * files and the original BAM file at the time of import. See
    * ImportReadGroupSets
    * for caveats.
    */
  def export(request: AnonPp): Request_[Operation] = js.native
  /**
    * Gets a read group set by ID.
    *
    * For the definitions of read group sets and other genomics resources, see
    * [Fundamentals of Google
    * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
    */
  def get(request: AnonPp): Request_[ReadGroupSet] = js.native
  /**
    * Creates read group sets by asynchronously importing the provided
    * information.
    *
    * For the definitions of read group sets and other genomics resources, see
    * [Fundamentals of Google
    * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
    *
    * The caller must have WRITE permissions to the dataset.
    *
    * ## Notes on [BAM](https://samtools.github.io/hts-specs/SAMv1.pdf) import
    *
    * - Tags will be converted to strings - tag types are not preserved
    * - Comments (`@CO`) in the input file header will not be preserved
    * - Original header order of references (`@SQ`) will not be preserved
    * - Any reverse stranded unmapped reads will be reverse complemented, and
    * their qualities (also the "BQ" and "OQ" tags, if any) will be reversed
    * - Unmapped reads will be stripped of positional information (reference name
    * and position)
    */
  def `import`(request: AnonAccesstoken): Request_[Operation] = js.native
  /**
    * Updates a read group set.
    *
    * For the definitions of read group sets and other genomics resources, see
    * [Fundamentals of Google
    * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
    *
    * This method supports patch semantics.
    */
  def patch(request: AnonPrettyPrint): Request_[ReadGroupSet] = js.native
  /**
    * Searches for read group sets matching the criteria.
    *
    * For the definitions of read group sets and other genomics resources, see
    * [Fundamentals of Google
    * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
    *
    * Implements
    * [GlobalAllianceApi.searchReadGroupSets](https://github.com/ga4gh/schemas/blob/v0.5.1/src/main/resources/avro/readmethods.avdl#L135).
    */
  def search(request: AnonAccesstoken): Request_[SearchReadGroupSetsResponse] = js.native
}

object ReadgroupsetsResource {
  @scala.inline
  def apply(
    coveragebuckets: CoveragebucketsResource,
    delete: AnonPp => Request_[js.Object],
    export: AnonPp => Request_[Operation],
    get: AnonPp => Request_[ReadGroupSet],
    `import`: AnonAccesstoken => Request_[Operation],
    patch: AnonPrettyPrint => Request_[ReadGroupSet],
    search: AnonAccesstoken => Request_[SearchReadGroupSetsResponse]
  ): ReadgroupsetsResource = {
    val __obj = js.Dynamic.literal(coveragebuckets = coveragebuckets.asInstanceOf[js.Any], delete = js.Any.fromFunction1(delete), export = js.Any.fromFunction1(export), get = js.Any.fromFunction1(get), patch = js.Any.fromFunction1(patch), search = js.Any.fromFunction1(search))
    __obj.updateDynamic("import")(js.Any.fromFunction1(`import`))
    __obj.asInstanceOf[ReadgroupsetsResource]
  }
  @scala.inline
  implicit class ReadgroupsetsResourceOps[Self <: ReadgroupsetsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCoveragebuckets(value: CoveragebucketsResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coveragebuckets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDelete(value: AnonPp => Request_[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withExport(value: AnonPp => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("export")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonPp => Request_[ReadGroupSet]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withImport(value: AnonAccesstoken => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("import")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: AnonPrettyPrint => Request_[ReadGroupSet]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSearch(value: AnonAccesstoken => Request_[SearchReadGroupSetsResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("search")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

