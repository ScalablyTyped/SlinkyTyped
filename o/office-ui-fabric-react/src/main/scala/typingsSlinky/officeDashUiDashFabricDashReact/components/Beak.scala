package typingsSlinky.officeDashUiDashFabricDashReact.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.atUifabricUtilities.libCreateRefMod.IRefObject
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsCoachmarkBeakBeakDotTypesMod.IBeak
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsCoachmarkBeakBeakDotTypesMod.IBeakProps
import typingsSlinky.officeDashUiDashFabricDashReact.libUtilitiesPositioningPositioningDotTypesMod.RectangleEdge
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Beak
  extends ExternalComponentWithAttributesWithRefType[
      tag.type, 
      typingsSlinky.officeDashUiDashFabricDashReact.libComponentsCoachmarkBeakBeakMod.Beak
    ] {
  @JSImport("office-ui-fabric-react/lib/components/Coachmark/Beak/Beak", "Beak")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    bottom: String = null,
    color: String = null,
    componentRef: IRefObject[IBeak] = null,
    direction: RectangleEdge = null,
    height: Int | Double = null,
    left: String = null,
    right: String = null,
    top: String = null,
    width: Int | Double = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[
    tag.type, 
    typingsSlinky.officeDashUiDashFabricDashReact.libComponentsCoachmarkBeakBeakMod.Beak
  ] = {
    val __obj = js.Dynamic.literal()
    if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[
    tag.type, 
    typingsSlinky.officeDashUiDashFabricDashReact.libComponentsCoachmarkBeakBeakMod.Beak
  ] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.officeDashUiDashFabricDashReact.libComponentsCoachmarkBeakBeakMod.Beak](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = IBeakProps
}

