package typingsSlinky.gapiClientGenomics.gapi.client.genomics

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientGenomics.AnonAccesstoken
import typingsSlinky.gapiClientGenomics.AnonCallSetId
import typingsSlinky.gapiClientGenomics.AnonCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CallsetsResource extends js.Object {
  /**
    * Creates a new call set.
    *
    * For the definitions of call sets and other genomics resources, see
    * [Fundamentals of Google
    * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
    */
  def create(request: AnonAccesstoken): Request_[CallSet] = js.native
  /**
    * Deletes a call set.
    *
    * For the definitions of call sets and other genomics resources, see
    * [Fundamentals of Google
    * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
    */
  def delete(request: AnonCallSetId): Request_[js.Object] = js.native
  /**
    * Gets a call set by ID.
    *
    * For the definitions of call sets and other genomics resources, see
    * [Fundamentals of Google
    * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
    */
  def get(request: AnonCallSetId): Request_[CallSet] = js.native
  /**
    * Updates a call set.
    *
    * For the definitions of call sets and other genomics resources, see
    * [Fundamentals of Google
    * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
    *
    * This method supports patch semantics.
    */
  def patch(request: AnonCallback): Request_[CallSet] = js.native
  /**
    * Gets a list of call sets matching the criteria.
    *
    * For the definitions of call sets and other genomics resources, see
    * [Fundamentals of Google
    * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
    *
    * Implements
    * [GlobalAllianceApi.searchCallSets](https://github.com/ga4gh/schemas/blob/v0.5.1/src/main/resources/avro/variantmethods.avdl#L178).
    */
  def search(request: AnonAccesstoken): Request_[SearchCallSetsResponse] = js.native
}

object CallsetsResource {
  @scala.inline
  def apply(
    create: AnonAccesstoken => Request_[CallSet],
    delete: AnonCallSetId => Request_[js.Object],
    get: AnonCallSetId => Request_[CallSet],
    patch: AnonCallback => Request_[CallSet],
    search: AnonAccesstoken => Request_[SearchCallSetsResponse]
  ): CallsetsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), patch = js.Any.fromFunction1(patch), search = js.Any.fromFunction1(search))
    __obj.asInstanceOf[CallsetsResource]
  }
  @scala.inline
  implicit class CallsetsResourceOps[Self <: CallsetsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreate(value: AnonAccesstoken => Request_[CallSet]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDelete(value: AnonCallSetId => Request_[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonCallSetId => Request_[CallSet]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: AnonCallback => Request_[CallSet]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSearch(value: AnonAccesstoken => Request_[SearchCallSetsResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("search")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

