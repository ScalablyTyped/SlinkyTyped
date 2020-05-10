package typingsSlinky.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaSearchItemsByViewUrlRequest extends js.Object {
  /**
    * Common debug options.
    */
  var debugOptions: js.UndefOr[SchemaDebugOptions] = js.native
  /**
    * The next_page_token value returned from a previous request, if any.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * Specify the full view URL to find the corresponding item. The maximum
    * length is 2048 characters.
    */
  var viewUrl: js.UndefOr[String] = js.native
}

object SchemaSearchItemsByViewUrlRequest {
  @scala.inline
  def apply(): SchemaSearchItemsByViewUrlRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSearchItemsByViewUrlRequest]
  }
  @scala.inline
  implicit class SchemaSearchItemsByViewUrlRequestOps[Self <: SchemaSearchItemsByViewUrlRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDebugOptions(value: SchemaDebugOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debugOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebugOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debugOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withPageToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageToken")(js.undefined)
        ret
    }
    @scala.inline
    def withViewUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewUrl")(js.undefined)
        ret
    }
  }
  
}

