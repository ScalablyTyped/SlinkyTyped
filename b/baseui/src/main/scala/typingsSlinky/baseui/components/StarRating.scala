package typingsSlinky.baseui.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.baseui.AnonValueNumber
import typingsSlinky.baseui.ratingMod.RatingOverrides
import typingsSlinky.baseui.ratingMod.StarRatingProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object StarRating
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.baseui.ratingMod.StarRating] {
  @JSImport("baseui/rating", "StarRating")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    numItems: Int | Double = null,
    onChange: /* args */ AnonValueNumber => _ = null,
    overrides: RatingOverrides = null,
    value: Int | Double = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.baseui.ratingMod.StarRating] = {
    val __obj = js.Dynamic.literal()
    if (numItems != null) __obj.updateDynamic("numItems")(numItems.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.baseui.ratingMod.StarRating] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.baseui.ratingMod.StarRating](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = StarRatingProps
}

