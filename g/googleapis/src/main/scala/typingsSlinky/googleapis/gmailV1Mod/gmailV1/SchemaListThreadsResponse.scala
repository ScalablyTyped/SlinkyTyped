package typingsSlinky.googleapis.gmailV1Mod.gmailV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaListThreadsResponse extends js.Object {
  /**
    * Page token to retrieve the next page of results in the list.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * Estimated total number of results.
    */
  var resultSizeEstimate: js.UndefOr[Double] = js.native
  /**
    * List of threads. Note that each thread resource does not contain a list
    * of messages. The list of messages for a given thread can be fetched using
    * the threads.get method.
    */
  var threads: js.UndefOr[js.Array[SchemaThread]] = js.native
}

object SchemaListThreadsResponse {
  @scala.inline
  def apply(): SchemaListThreadsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListThreadsResponse]
  }
  @scala.inline
  implicit class SchemaListThreadsResponseOps[Self <: SchemaListThreadsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextPageToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextPageToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(js.undefined)
        ret
    }
    @scala.inline
    def withResultSizeEstimate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultSizeEstimate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResultSizeEstimate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultSizeEstimate")(js.undefined)
        ret
    }
    @scala.inline
    def withThreads(value: js.Array[SchemaThread]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threads")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThreads: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threads")(js.undefined)
        ret
    }
  }
  
}

