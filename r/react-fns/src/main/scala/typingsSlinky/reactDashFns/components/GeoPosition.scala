package typingsSlinky.reactDashFns.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ReactComponentClass
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashFns.distGeoPositionGeoPositionMod.GeoPositionProps
import typingsSlinky.reactDashFns.distTypesMod.SharedRenderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object GeoPosition
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactDashFns.reactDashFnsMod.GeoPosition] {
  @JSImport("react-fns", "GeoPosition")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    component: ReactComponentClass[GeoPositionProps | Unit] = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    render: GeoPositionProps => TagMod[Any] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactDashFns.reactDashFnsMod.GeoPosition] = {
    val __obj = js.Dynamic.literal()
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction1(render))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.reactDashFns.reactDashFnsMod.GeoPosition] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.reactDashFns.reactDashFnsMod.GeoPosition](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = SharedRenderProps[GeoPositionProps]
}

