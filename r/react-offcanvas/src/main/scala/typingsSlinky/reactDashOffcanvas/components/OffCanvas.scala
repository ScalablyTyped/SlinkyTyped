package typingsSlinky.reactDashOffcanvas.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashOffcanvas.reactDashOffcanvasMod.OffCanvasProps
import typingsSlinky.reactDashOffcanvas.reactDashOffcanvasStrings.left
import typingsSlinky.reactDashOffcanvas.reactDashOffcanvasStrings.overlay
import typingsSlinky.reactDashOffcanvas.reactDashOffcanvasStrings.parallax
import typingsSlinky.reactDashOffcanvas.reactDashOffcanvasStrings.push
import typingsSlinky.reactDashOffcanvas.reactDashOffcanvasStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object OffCanvas
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactDashOffcanvas.reactDashOffcanvasMod.OffCanvas] {
  @JSImport("react-offcanvas", "OffCanvas")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    effect: push | overlay | parallax = null,
    isMenuOpened: js.UndefOr[Boolean] = js.undefined,
    position: left | right = null,
    transitionDuration: Int | Double = null,
    width: Int | Double = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactDashOffcanvas.reactDashOffcanvasMod.OffCanvas] = {
    val __obj = js.Dynamic.literal()
    if (effect != null) __obj.updateDynamic("effect")(effect.asInstanceOf[js.Any])
    if (!js.isUndefined(isMenuOpened)) __obj.updateDynamic("isMenuOpened")(isMenuOpened.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (transitionDuration != null) __obj.updateDynamic("transitionDuration")(transitionDuration.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.reactDashOffcanvas.reactDashOffcanvasMod.OffCanvas] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.reactDashOffcanvas.reactDashOffcanvasMod.OffCanvas](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = OffCanvasProps
}

