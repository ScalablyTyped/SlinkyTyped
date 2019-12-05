package typingsSlinky.reactDashOverlays.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.react.reactMod.CSSProperties
import typingsSlinky.reactDashOverlays.libAffixMod.AffixProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Affix
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactDashOverlays.libMod.Affix] {
  @JSImport("react-overlays/lib", "Affix")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    affixClassName: String = null,
    affixStyle: CSSProperties = null,
    bottomClassName: String = null,
    bottomStyle: CSSProperties = null,
    offsetBottom: Int | Double = null,
    offsetTop: Int | Double = null,
    onAffix: () => Unit = null,
    onAffixBottom: () => Unit = null,
    onAffixTop: () => Unit = null,
    onAffixed: () => Unit = null,
    onAffixedBottom: () => Unit = null,
    onAffixedTop: () => Unit = null,
    topClassName: String = null,
    topStyle: CSSProperties = null,
    viewportOffsetTop: Int | Double = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactDashOverlays.libMod.Affix] = {
    val __obj = js.Dynamic.literal()
    if (affixClassName != null) __obj.updateDynamic("affixClassName")(affixClassName.asInstanceOf[js.Any])
    if (affixStyle != null) __obj.updateDynamic("affixStyle")(affixStyle.asInstanceOf[js.Any])
    if (bottomClassName != null) __obj.updateDynamic("bottomClassName")(bottomClassName.asInstanceOf[js.Any])
    if (bottomStyle != null) __obj.updateDynamic("bottomStyle")(bottomStyle.asInstanceOf[js.Any])
    if (offsetBottom != null) __obj.updateDynamic("offsetBottom")(offsetBottom.asInstanceOf[js.Any])
    if (offsetTop != null) __obj.updateDynamic("offsetTop")(offsetTop.asInstanceOf[js.Any])
    if (onAffix != null) __obj.updateDynamic("onAffix")(js.Any.fromFunction0(onAffix))
    if (onAffixBottom != null) __obj.updateDynamic("onAffixBottom")(js.Any.fromFunction0(onAffixBottom))
    if (onAffixTop != null) __obj.updateDynamic("onAffixTop")(js.Any.fromFunction0(onAffixTop))
    if (onAffixed != null) __obj.updateDynamic("onAffixed")(js.Any.fromFunction0(onAffixed))
    if (onAffixedBottom != null) __obj.updateDynamic("onAffixedBottom")(js.Any.fromFunction0(onAffixedBottom))
    if (onAffixedTop != null) __obj.updateDynamic("onAffixedTop")(js.Any.fromFunction0(onAffixedTop))
    if (topClassName != null) __obj.updateDynamic("topClassName")(topClassName.asInstanceOf[js.Any])
    if (topStyle != null) __obj.updateDynamic("topStyle")(topStyle.asInstanceOf[js.Any])
    if (viewportOffsetTop != null) __obj.updateDynamic("viewportOffsetTop")(viewportOffsetTop.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = AffixProps
}

