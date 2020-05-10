package typingsSlinky.angularMaterial.mod.angularAugmentingMod.material

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IThemeConfig extends js.Object {
  var alwaysWatchTheme: Boolean = js.native
  var defaultTheme: String = js.native
  var disableTheming: Boolean = js.native
  var generateOnDemand: Boolean = js.native
  var nonce: String = js.native
  var registeredStyles: js.Array[String] = js.native
}

object IThemeConfig {
  @scala.inline
  def apply(
    alwaysWatchTheme: Boolean,
    defaultTheme: String,
    disableTheming: Boolean,
    generateOnDemand: Boolean,
    nonce: String,
    registeredStyles: js.Array[String]
  ): IThemeConfig = {
    val __obj = js.Dynamic.literal(alwaysWatchTheme = alwaysWatchTheme.asInstanceOf[js.Any], defaultTheme = defaultTheme.asInstanceOf[js.Any], disableTheming = disableTheming.asInstanceOf[js.Any], generateOnDemand = generateOnDemand.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any], registeredStyles = registeredStyles.asInstanceOf[js.Any])
    __obj.asInstanceOf[IThemeConfig]
  }
  @scala.inline
  implicit class IThemeConfigOps[Self <: IThemeConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlwaysWatchTheme(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alwaysWatchTheme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultTheme(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultTheme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisableTheming(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableTheming")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGenerateOnDemand(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generateOnDemand")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNonce(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonce")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRegisteredStyles(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registeredStyles")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

