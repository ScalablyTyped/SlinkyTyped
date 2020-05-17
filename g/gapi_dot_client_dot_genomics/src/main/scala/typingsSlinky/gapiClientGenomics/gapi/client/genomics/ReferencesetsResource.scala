package typingsSlinky.gapiClientGenomics.gapi.client.genomics

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientGenomics.anon.Accesstoken
import typingsSlinky.gapiClientGenomics.anon.ReferenceSetId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReferencesetsResource extends js.Object {
  /**
    * Gets a reference set.
    *
    * For the definitions of references and other genomics resources, see
    * [Fundamentals of Google
    * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
    *
    * Implements
    * [GlobalAllianceApi.getReferenceSet](https://github.com/ga4gh/schemas/blob/v0.5.1/src/main/resources/avro/referencemethods.avdl#L83).
    */
  def get(request: ReferenceSetId): Request[ReferenceSet] = js.native
  /**
    * Searches for reference sets which match the given criteria.
    *
    * For the definitions of references and other genomics resources, see
    * [Fundamentals of Google
    * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
    *
    * Implements
    * [GlobalAllianceApi.searchReferenceSets](https://github.com/ga4gh/schemas/blob/v0.5.1/src/main/resources/avro/referencemethods.avdl#L71)
    */
  def search(request: Accesstoken): Request[SearchReferenceSetsResponse] = js.native
}

object ReferencesetsResource {
  @scala.inline
  def apply(
    get: ReferenceSetId => Request[ReferenceSet],
    search: Accesstoken => Request[SearchReferenceSetsResponse]
  ): ReferencesetsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), search = js.Any.fromFunction1(search))
    __obj.asInstanceOf[ReferencesetsResource]
  }
  @scala.inline
  implicit class ReferencesetsResourceOps[Self <: ReferencesetsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet(value: ReferenceSetId => Request[ReferenceSet]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSearch(value: Accesstoken => Request[SearchReferenceSetsResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("search")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

