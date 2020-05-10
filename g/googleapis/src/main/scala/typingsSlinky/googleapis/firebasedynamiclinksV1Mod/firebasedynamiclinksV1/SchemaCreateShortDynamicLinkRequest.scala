package typingsSlinky.googleapis.firebasedynamiclinksV1Mod.firebasedynamiclinksV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request to create a short Dynamic Link.
  */
@js.native
trait SchemaCreateShortDynamicLinkRequest extends js.Object {
  /**
    * Information about the Dynamic Link to be shortened. [Learn
    * more](https://firebase.google.com/docs/reference/dynamic-links/link-shortener).
    */
  var dynamicLinkInfo: js.UndefOr[SchemaDynamicLinkInfo] = js.native
  /**
    * Full long Dynamic Link URL with desired query parameters specified. For
    * example,
    * &quot;https://sample.app.goo.gl/?link=http://www.google.com&amp;apn=com.sample&quot;,
    * [Learn
    * more](https://firebase.google.com/docs/reference/dynamic-links/link-shortener).
    */
  var longDynamicLink: js.UndefOr[String] = js.native
  /**
    * Google SDK version. Version takes the form
    * &quot;$major.$minor.$patch&quot;
    */
  var sdkVersion: js.UndefOr[String] = js.native
  /**
    * Short Dynamic Link suffix. Optional.
    */
  var suffix: js.UndefOr[SchemaSuffix] = js.native
}

object SchemaCreateShortDynamicLinkRequest {
  @scala.inline
  def apply(): SchemaCreateShortDynamicLinkRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateShortDynamicLinkRequest]
  }
  @scala.inline
  implicit class SchemaCreateShortDynamicLinkRequestOps[Self <: SchemaCreateShortDynamicLinkRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDynamicLinkInfo(value: SchemaDynamicLinkInfo): Self = {
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
    def withSdkVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sdkVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSdkVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sdkVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withSuffix(value: SchemaSuffix): Self = {
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

