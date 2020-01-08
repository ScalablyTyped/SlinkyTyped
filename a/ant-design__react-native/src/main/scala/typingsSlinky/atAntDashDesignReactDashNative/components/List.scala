package typingsSlinky.atAntDashDesignReactDashNative.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ReactComponentClass
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.atAntDashDesignReactDashNative.libListMod.ListProps
import typingsSlinky.atAntDashDesignReactDashNative.libListMod.default
import typingsSlinky.atAntDashDesignReactDashNative.libListStyleMod.ListStyle
import typingsSlinky.reactDashNative.reactDashNativeMod.StyleProp
import typingsSlinky.reactDashNative.reactDashNativeMod.ViewStyle
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object List
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("@ant-design/react-native/lib/list", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    renderFooter: js.Function0[ReactComponentClass[_]] | String | typingsSlinky.react.reactMod._Global_.JSX.Element = null,
    renderHeader: js.Function0[ReactComponentClass[_]] | String | typingsSlinky.react.reactMod._Global_.JSX.Element = null,
    style: StyleProp[ViewStyle] = null,
    styles: Partial[ListStyle] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (renderFooter != null) __obj.updateDynamic("renderFooter")(renderFooter.asInstanceOf[js.Any])
    if (renderHeader != null) __obj.updateDynamic("renderHeader")(renderHeader.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, default] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.atAntDashDesignReactDashNative.libListMod.default](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = ListProps
}

