package typingsSlinky.antdMobileRn.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.antdMobileRn.activityIndicatorIndexNativeMod.ActivityIndicatorNativeProps
import typingsSlinky.antdMobileRn.antdMobileRnStrings.large
import typingsSlinky.antdMobileRn.antdMobileRnStrings.small
import typingsSlinky.antdMobileRn.styleIndexDotnativeMod.IActivityIndicatorStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ActivityIndicator
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.antdMobileRn.mod.ActivityIndicator] {
  @JSImport("antd-mobile-rn", "ActivityIndicator")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    animating: js.UndefOr[Boolean] = js.undefined,
    color: String = null,
    size: large | small = null,
    styles: IActivityIndicatorStyle = null,
    text: String = null,
    toast: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.antdMobileRn.mod.ActivityIndicator] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animating)) __obj.updateDynamic("animating")(animating.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (!js.isUndefined(toast)) __obj.updateDynamic("toast")(toast.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.antdMobileRn.mod.ActivityIndicator] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.antdMobileRn.mod.ActivityIndicator](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = ActivityIndicatorNativeProps
}

