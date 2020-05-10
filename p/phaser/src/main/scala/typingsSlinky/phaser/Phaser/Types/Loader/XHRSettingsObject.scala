package typingsSlinky.phaser.Phaser.Types.Loader

import typingsSlinky.phaser.integer
import typingsSlinky.std.XMLHttpRequestResponseType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XHRSettingsObject extends js.Object {
  /**
    * Should the XHR request use async or not?
    */
  var async: js.UndefOr[Boolean] = js.native
  /**
    * This value is used to populate the XHR `setRequestHeader` and is undefined by default.
    */
  var header: js.UndefOr[String] = js.native
  /**
    * This value is used to populate the XHR `setRequestHeader` and is undefined by default.
    */
  var headerValue: js.UndefOr[String] = js.native
  /**
    * Provide a custom mime-type to use instead of the default.
    */
  var overrideMimeType: js.UndefOr[String] = js.native
  /**
    * Optional password for the XHR request.
    */
  var password: js.UndefOr[String] = js.native
  /**
    * This value is used to populate the XHR `setRequestHeader` and is undefined by default.
    */
  var requestedWith: js.UndefOr[String] = js.native
  /**
    * The response type of the XHR request, i.e. `blob`, `text`, etc.
    */
  var responseType: XMLHttpRequestResponseType = js.native
  /**
    * Optional XHR timeout value.
    */
  var timeout: js.UndefOr[integer] = js.native
  /**
    * Optional username for the XHR request.
    */
  var user: js.UndefOr[String] = js.native
}

object XHRSettingsObject {
  @scala.inline
  def apply(responseType: XMLHttpRequestResponseType): XHRSettingsObject = {
    val __obj = js.Dynamic.literal(responseType = responseType.asInstanceOf[js.Any])
    __obj.asInstanceOf[XHRSettingsObject]
  }
  @scala.inline
  implicit class XHRSettingsObjectOps[Self <: XHRSettingsObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResponseType(value: XMLHttpRequestResponseType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAsync(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("async")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAsync: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("async")(js.undefined)
        ret
    }
    @scala.inline
    def withHeader(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerValue")(js.undefined)
        ret
    }
    @scala.inline
    def withOverrideMimeType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrideMimeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverrideMimeType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrideMimeType")(js.undefined)
        ret
    }
    @scala.inline
    def withPassword(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("password")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPassword: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("password")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestedWith(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestedWith")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestedWith: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestedWith")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeout(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(js.undefined)
        ret
    }
    @scala.inline
    def withUser(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(js.undefined)
        ret
    }
  }
  
}

