package typingsSlinky.reactDashStars.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashStars.reactDashStarsMod.ReactStarsProps
import typingsSlinky.reactDashStars.reactDashStarsMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactDashStars
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-stars", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, onChange, size */
  def apply(
    char: String = null,
    color1: String = null,
    color2: String = null,
    count: Int | Double = null,
    edit: js.UndefOr[Boolean] = js.undefined,
    half: js.UndefOr[Boolean] = js.undefined,
    value: Int | Double = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (char != null) __obj.updateDynamic("char")(char.asInstanceOf[js.Any])
    if (color1 != null) __obj.updateDynamic("color1")(color1.asInstanceOf[js.Any])
    if (color2 != null) __obj.updateDynamic("color2")(color2.asInstanceOf[js.Any])
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (!js.isUndefined(edit)) __obj.updateDynamic("edit")(edit.asInstanceOf[js.Any])
    if (!js.isUndefined(half)) __obj.updateDynamic("half")(half.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, default] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.reactDashStars.reactDashStarsMod.default](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = ReactStarsProps
}

