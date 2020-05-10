package typingsSlinky.googleapis.loggingV2Mod.loggingV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Result returned from ListSinks.
  */
@js.native
trait SchemaListSinksResponse extends js.Object {
  /**
    * If there might be more results than appear in this response, then
    * nextPageToken is included. To get the next set of results, call the same
    * method again using the value of nextPageToken as pageToken.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * A list of sinks.
    */
  var sinks: js.UndefOr[js.Array[SchemaLogSink]] = js.native
}

object SchemaListSinksResponse {
  @scala.inline
  def apply(): SchemaListSinksResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListSinksResponse]
  }
  @scala.inline
  implicit class SchemaListSinksResponseOps[Self <: SchemaListSinksResponse] (val x: Self) extends AnyVal {
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
    def withSinks(value: js.Array[SchemaLogSink]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sinks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSinks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sinks")(js.undefined)
        ret
    }
  }
  
}

