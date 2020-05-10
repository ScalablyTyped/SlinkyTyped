package typingsSlinky.googleapis.chatV1Mod.chatV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Parameters that a bot can use to configure how it&#39;s response is posted.
  */
@js.native
trait SchemaActionResponse extends js.Object {
  /**
    * The type of bot response.
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * URL for users to auth or config. (Only for REQUEST_CONFIG response
    * types.)
    */
  var url: js.UndefOr[String] = js.native
}

object SchemaActionResponse {
  @scala.inline
  def apply(): SchemaActionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaActionResponse]
  }
  @scala.inline
  implicit class SchemaActionResponseOps[Self <: SchemaActionResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
  }
  
}

