package typingsSlinky.reactStarRatingComponent.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactStarRatingComponent.mod.StarRatingComponentProps
import typingsSlinky.reactStarRatingComponent.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactStarRatingComponent
  extends ExternalComponentWithAttributesWithRefType[tag.type, ^] {
  @JSImport("react-star-rating-component", JSImport.Namespace)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    name: String,
    value: Double,
    editing: js.UndefOr[Boolean] = js.undefined,
    emptyStarColor: String = null,
    onStarClick: (/* nextValue */ Double, /* prevValue */ Double, /* name */ String) => Unit = null,
    onStarHover: (/* nextValue */ Double, /* prevValue */ Double, /* name */ String) => Unit = null,
    onStarHoverOut: (/* nextValue */ Double, /* prevValue */ Double, /* name */ String) => Unit = null,
    renderStarIcon: (/* nextValue */ Double, /* prevValue */ Double, /* name */ String) => TagMod[Any] | String = null,
    renderStarIconHalf: (/* nextValue */ Double, /* prevValue */ Double, /* name */ String) => TagMod[Any] | String = null,
    starColor: String = null,
    starCount: Int | Double = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, ^] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (!js.isUndefined(editing)) __obj.updateDynamic("editing")(editing.asInstanceOf[js.Any])
    if (emptyStarColor != null) __obj.updateDynamic("emptyStarColor")(emptyStarColor.asInstanceOf[js.Any])
    if (onStarClick != null) __obj.updateDynamic("onStarClick")(js.Any.fromFunction3(onStarClick))
    if (onStarHover != null) __obj.updateDynamic("onStarHover")(js.Any.fromFunction3(onStarHover))
    if (onStarHoverOut != null) __obj.updateDynamic("onStarHoverOut")(js.Any.fromFunction3(onStarHoverOut))
    if (renderStarIcon != null) __obj.updateDynamic("renderStarIcon")(js.Any.fromFunction3(renderStarIcon))
    if (renderStarIconHalf != null) __obj.updateDynamic("renderStarIconHalf")(js.Any.fromFunction3(renderStarIconHalf))
    if (starColor != null) __obj.updateDynamic("starColor")(starColor.asInstanceOf[js.Any])
    if (starCount != null) __obj.updateDynamic("starCount")(starCount.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = StarRatingComponentProps
}

