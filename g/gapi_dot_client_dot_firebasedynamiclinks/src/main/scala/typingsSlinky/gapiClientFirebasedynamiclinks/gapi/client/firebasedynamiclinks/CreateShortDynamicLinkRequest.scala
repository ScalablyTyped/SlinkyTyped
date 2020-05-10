package typingsSlinky.gapiClientFirebasedynamiclinks.gapi.client.firebasedynamiclinks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateShortDynamicLinkRequest extends js.Object {
  /**
    * Information about the Dynamic Link to be shortened.
    * [Learn more](https://firebase.google.com/docs/dynamic-links/android#create-a-dynamic-link-programmatically).
    */
  var dynamicLinkInfo: js.UndefOr[DynamicLinkInfo] = js.native
  /**
    * Full long Dynamic Link URL with desired query parameters specified.
    * For example,
    * "https://sample.app.goo.gl/?link=http://www.google.com&apn=com.sample",
    * [Learn more](https://firebase.google.com/docs/dynamic-links/android#create-a-dynamic-link-programmatically).
    */
  var longDynamicLink: js.UndefOr[String] = js.native
  /** Short Dynamic Link suffix. Optional. */
  var suffix: js.UndefOr[Suffix] = js.native
}

object CreateShortDynamicLinkRequest {
  @scala.inline
  def apply(): CreateShortDynamicLinkRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateShortDynamicLinkRequest]
  }
  @scala.inline
  implicit class CreateShortDynamicLinkRequestOps[Self <: CreateShortDynamicLinkRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDynamicLinkInfo(value: DynamicLinkInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynamicLinkInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDynamicLinkInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynamicLinkInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withLongDynamicLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longDynamicLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLongDynamicLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longDynamicLink")(js.undefined)
        ret
    }
    @scala.inline
    def withSuffix(value: Suffix): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suffix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuffix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suffix")(js.undefined)
        ret
    }
  }
  
}

