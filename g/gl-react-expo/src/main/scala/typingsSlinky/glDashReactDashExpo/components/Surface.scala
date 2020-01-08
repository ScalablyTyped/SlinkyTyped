package typingsSlinky.glDashReactDashExpo.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.glDashReact.glDashReactMod.SurfaceProps
import typingsSlinky.glDashReact.glDashReactMod.Visitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Surface
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.glDashReactDashExpo.glDashReactDashExpoMod.Surface] {
  @JSImport("gl-react-expo", "Surface")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    onLoad: () => Unit = null,
    onLoadError: /* e */ js.Error => Unit = null,
    preload: js.Array[_] = null,
    style: js.Any = null,
    visitor: Visitor = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.glDashReactDashExpo.glDashReactDashExpoMod.Surface] = {
    val __obj = js.Dynamic.literal()
    if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction0(onLoad))
    if (onLoadError != null) __obj.updateDynamic("onLoadError")(js.Any.fromFunction1(onLoadError))
    if (preload != null) __obj.updateDynamic("preload")(preload.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (visitor != null) __obj.updateDynamic("visitor")(visitor.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.glDashReactDashExpo.glDashReactDashExpoMod.Surface] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.glDashReactDashExpo.glDashReactDashExpoMod.Surface](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = SurfaceProps
}

