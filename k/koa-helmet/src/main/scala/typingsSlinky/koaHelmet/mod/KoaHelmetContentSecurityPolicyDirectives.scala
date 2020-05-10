package typingsSlinky.koaHelmet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KoaHelmetContentSecurityPolicyDirectives extends js.Object {
  var baseUri: js.UndefOr[js.Array[KoaHelmetCspDirectiveValue]] = js.native
  var childSrc: js.UndefOr[js.Array[KoaHelmetCspDirectiveValue]] = js.native
  var connectSrc: js.UndefOr[js.Array[KoaHelmetCspDirectiveValue]] = js.native
  var defaultSrc: js.UndefOr[js.Array[KoaHelmetCspDirectiveValue]] = js.native
  var fontSrc: js.UndefOr[js.Array[KoaHelmetCspDirectiveValue]] = js.native
  var formAction: js.UndefOr[js.Array[KoaHelmetCspDirectiveValue]] = js.native
  var frameAncestors: js.UndefOr[js.Array[KoaHelmetCspDirectiveValue]] = js.native
  var frameSrc: js.UndefOr[js.Array[KoaHelmetCspDirectiveValue]] = js.native
  var imgSrc: js.UndefOr[js.Array[KoaHelmetCspDirectiveValue]] = js.native
  var mediaSrc: js.UndefOr[js.Array[KoaHelmetCspDirectiveValue]] = js.native
  var objectSrc: js.UndefOr[js.Array[KoaHelmetCspDirectiveValue]] = js.native
  var pluginTypes: js.UndefOr[js.Array[KoaHelmetCspDirectiveValue]] = js.native
  var reportUri: js.UndefOr[String] = js.native
  var sandbox: js.UndefOr[js.Array[KoaHelmetCspDirectiveValue]] = js.native
  var scriptSrc: js.UndefOr[js.Array[KoaHelmetCspDirectiveValue]] = js.native
  var styleSrc: js.UndefOr[js.Array[KoaHelmetCspDirectiveValue]] = js.native
}

object KoaHelmetContentSecurityPolicyDirectives {
  @scala.inline
  def apply(): KoaHelmetContentSecurityPolicyDirectives = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KoaHelmetContentSecurityPolicyDirectives]
  }
  @scala.inline
  implicit class KoaHelmetContentSecurityPolicyDirectivesOps[Self <: KoaHelmetContentSecurityPolicyDirectives] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBaseUri(value: js.Array[KoaHelmetCspDirectiveValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseUri")(js.undefined)
        ret
    }
    @scala.inline
    def withChildSrc(value: js.Array[KoaHelmetCspDirectiveValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childSrc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildSrc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childSrc")(js.undefined)
        ret
    }
    @scala.inline
    def withConnectSrc(value: js.Array[KoaHelmetCspDirectiveValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectSrc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectSrc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectSrc")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultSrc(value: js.Array[KoaHelmetCspDirectiveValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultSrc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultSrc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultSrc")(js.undefined)
        ret
    }
    @scala.inline
    def withFontSrc(value: js.Array[KoaHelmetCspDirectiveValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontSrc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontSrc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontSrc")(js.undefined)
        ret
    }
    @scala.inline
    def withFormAction(value: js.Array[KoaHelmetCspDirectiveValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formAction")(js.undefined)
        ret
    }
    @scala.inline
    def withFrameAncestors(value: js.Array[KoaHelmetCspDirectiveValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frameAncestors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrameAncestors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frameAncestors")(js.undefined)
        ret
    }
    @scala.inline
    def withFrameSrc(value: js.Array[KoaHelmetCspDirectiveValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frameSrc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrameSrc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frameSrc")(js.undefined)
        ret
    }
    @scala.inline
    def withImgSrc(value: js.Array[KoaHelmetCspDirectiveValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imgSrc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImgSrc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imgSrc")(js.undefined)
        ret
    }
    @scala.inline
    def withMediaSrc(value: js.Array[KoaHelmetCspDirectiveValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaSrc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMediaSrc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaSrc")(js.undefined)
        ret
    }
    @scala.inline
    def withObjectSrc(value: js.Array[KoaHelmetCspDirectiveValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectSrc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjectSrc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectSrc")(js.undefined)
        ret
    }
    @scala.inline
    def withPluginTypes(value: js.Array[KoaHelmetCspDirectiveValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pluginTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPluginTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pluginTypes")(js.undefined)
        ret
    }
    @scala.inline
    def withReportUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReportUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportUri")(js.undefined)
        ret
    }
    @scala.inline
    def withSandbox(value: js.Array[KoaHelmetCspDirectiveValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sandbox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSandbox: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sandbox")(js.undefined)
        ret
    }
    @scala.inline
    def withScriptSrc(value: js.Array[KoaHelmetCspDirectiveValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scriptSrc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScriptSrc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scriptSrc")(js.undefined)
        ret
    }
    @scala.inline
    def withStyleSrc(value: js.Array[KoaHelmetCspDirectiveValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styleSrc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyleSrc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styleSrc")(js.undefined)
        ret
    }
  }
  
}

