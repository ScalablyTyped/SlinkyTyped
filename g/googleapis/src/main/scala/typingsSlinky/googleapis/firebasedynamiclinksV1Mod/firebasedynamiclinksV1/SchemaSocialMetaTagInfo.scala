package typingsSlinky.googleapis.firebasedynamiclinksV1Mod.firebasedynamiclinksV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Parameters for social meta tag params. Used to set meta tag data for link
  * previews on social sites.
  */
@js.native
trait SchemaSocialMetaTagInfo extends js.Object {
  /**
    * A short description of the link. Optional.
    */
  var socialDescription: js.UndefOr[String] = js.native
  /**
    * An image url string. Optional.
    */
  var socialImageLink: js.UndefOr[String] = js.native
  /**
    * Title to be displayed. Optional.
    */
  var socialTitle: js.UndefOr[String] = js.native
}

object SchemaSocialMetaTagInfo {
  @scala.inline
  def apply(): SchemaSocialMetaTagInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSocialMetaTagInfo]
  }
  @scala.inline
  implicit class SchemaSocialMetaTagInfoOps[Self <: SchemaSocialMetaTagInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSocialDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("socialDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSocialDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("socialDescription")(js.undefined)
        ret
    }
    @scala.inline
    def withSocialImageLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("socialImageLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSocialImageLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("socialImageLink")(js.undefined)
        ret
    }
    @scala.inline
    def withSocialTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("socialTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSocialTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("socialTitle")(js.undefined)
        ret
    }
  }
  
}

