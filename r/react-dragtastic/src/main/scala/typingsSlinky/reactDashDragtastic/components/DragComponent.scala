package typingsSlinky.reactDashDragtastic.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashDragtastic.reactDashDragtasticMod.DragComponentProps
import typingsSlinky.reactDashDragtastic.reactDashDragtasticMod.Id
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DragComponent
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactDashDragtastic.reactDashDragtasticMod.DragComponent] {
  @JSImport("react-dragtastic", "DragComponent")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    alwaysRender: js.UndefOr[Boolean] = js.undefined,
    `for`: Id = null,
    onDrag: () => Unit = null,
    subscribeTo: js.Array[String] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactDashDragtastic.reactDashDragtasticMod.DragComponent] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alwaysRender)) __obj.updateDynamic("alwaysRender")(alwaysRender.asInstanceOf[js.Any])
    if (`for` != null) __obj.updateDynamic("for")(`for`.asInstanceOf[js.Any])
    if (onDrag != null) __obj.updateDynamic("onDrag")(js.Any.fromFunction0(onDrag))
    if (subscribeTo != null) __obj.updateDynamic("subscribeTo")(subscribeTo.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.reactDashDragtastic.reactDashDragtasticMod.DragComponent] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.reactDashDragtastic.reactDashDragtasticMod.DragComponent](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = DragComponentProps
}

