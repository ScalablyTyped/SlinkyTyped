package typingsSlinky.googleapis.firebasedynamiclinksV1Mod.firebasedynamiclinksV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Managed Short Link.
  */
@js.native
trait SchemaManagedShortLink extends js.Object {
  /**
    * Creation timestamp of the short link.
    */
  var creationTime: js.UndefOr[String] = js.native
  /**
    * Attributes that have been flagged about this short url.
    */
  var flaggedAttribute: js.UndefOr[js.Array[String]] = js.native
  /**
    * Full Dyamic Link info
    */
  var info: js.UndefOr[SchemaDynamicLinkInfo] = js.native
  /**
    * Short durable link url, for example,
    * &quot;https://sample.app.goo.gl/xyz123&quot;.  Required.
    */
  var link: js.UndefOr[String] = js.native
  /**
    * Link name defined by the creator.  Required.
    */
  var linkName: js.UndefOr[String] = js.native
  /**
    * Visibility status of link.
    */
  var visibility: js.UndefOr[String] = js.native
}

object SchemaManagedShortLink {
  @scala.inline
  def apply(): SchemaManagedShortLink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaManagedShortLink]
  }
  @scala.inline
  implicit class SchemaManagedShortLinkOps[Self <: SchemaManagedShortLink] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreationTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationTime")(js.undefined)
        ret
    }
    @scala.inline
    def withFlaggedAttribute(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flaggedAttribute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlaggedAttribute: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flaggedAttribute")(js.undefined)
        ret
    }
    @scala.inline
    def withInfo(value: SchemaDynamicLinkInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("info")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("info")(js.undefined)
        ret
    }
    @scala.inline
    def withLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("link")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("link")(js.undefined)
        ret
    }
    @scala.inline
    def withLinkName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinkName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkName")(js.undefined)
        ret
    }
    @scala.inline
    def withVisibility(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibility")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisibility: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibility")(js.undefined)
        ret
    }
  }
  
}

