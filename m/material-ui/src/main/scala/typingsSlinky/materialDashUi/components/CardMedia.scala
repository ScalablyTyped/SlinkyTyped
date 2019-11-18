package typingsSlinky.materialDashUi.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.materialDashUi.__MaterialUI.Card.CardMediaProps
import typingsSlinky.materialDashUi.cardCardMediaMod.default
import typingsSlinky.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object CardMedia
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typingsSlinky.materialDashUi.cardCardMediaMod.default].asInstanceOf[String | js.Object]
  def apply(
    actAsExpander: js.UndefOr[Boolean] = js.undefined,
    expandable: js.UndefOr[Boolean] = js.undefined,
    mediaStyle: CSSProperties = null,
    overlay: TagMod[Any] = null,
    overlayContainerStyle: CSSProperties = null,
    overlayContentStyle: CSSProperties = null,
    overlayStyle: CSSProperties = null,
    style: CSSProperties = null,
    overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(actAsExpander)) __obj.updateDynamic("actAsExpander")(actAsExpander.asInstanceOf[js.Any])
    if (!js.isUndefined(expandable)) __obj.updateDynamic("expandable")(expandable.asInstanceOf[js.Any])
    if (mediaStyle != null) __obj.updateDynamic("mediaStyle")(mediaStyle.asInstanceOf[js.Any])
    if (overlay != null) __obj.updateDynamic("overlay")(overlay.asInstanceOf[js.Any])
    if (overlayContainerStyle != null) __obj.updateDynamic("overlayContainerStyle")(overlayContainerStyle.asInstanceOf[js.Any])
    if (overlayContentStyle != null) __obj.updateDynamic("overlayContentStyle")(overlayContentStyle.asInstanceOf[js.Any])
    if (overlayStyle != null) __obj.updateDynamic("overlayStyle")(overlayStyle.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = CardMediaProps
}

