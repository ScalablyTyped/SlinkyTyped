package typingsSlinky.glDashReactDashNative.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.WebGLRenderingContext
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.glDashReactDashNative.gLViewNativeMod.GLViewNativeProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object GLViewNative
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.glDashReactDashNative.gLViewNativeMod.GLViewNative] {
  @JSImport("gl-react-native/GLViewNative", "GLViewNative")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    onContextCreate: /* gl */ WebGLRenderingContext => Unit = null,
    onContextFailure: /* e */ js.Error => Unit = null,
    style: js.Any = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.glDashReactDashNative.gLViewNativeMod.GLViewNative] = {
    val __obj = js.Dynamic.literal()
    if (onContextCreate != null) __obj.updateDynamic("onContextCreate")(js.Any.fromFunction1(onContextCreate))
    if (onContextFailure != null) __obj.updateDynamic("onContextFailure")(js.Any.fromFunction1(onContextFailure))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.glDashReactDashNative.gLViewNativeMod.GLViewNative] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.glDashReactDashNative.gLViewNativeMod.GLViewNative](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = GLViewNativeProps
}

