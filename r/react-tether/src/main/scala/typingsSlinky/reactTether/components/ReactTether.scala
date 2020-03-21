package typingsSlinky.reactTether.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.core.facade.ReactRef
import slinky.web.html.`*`.tag
import typingsSlinky.reactTether.mod.ReactTether.Constraints
import typingsSlinky.reactTether.mod.ReactTether.TetherComponentProps
import typingsSlinky.reactTether.mod.ReactTether.UpdateEventData
import typingsSlinky.reactTether.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactTether
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-tether", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, id, style */
  def apply(
    attachment: String,
    bodyElement: HTMLElement = null,
    classPrefix: String = null,
    constraints: js.Array[Constraints] = null,
    element: HTMLElement | String | js.Any = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    offset: String = null,
    onRepositioned: () => Unit = null,
    onUpdate: /* data */ UpdateEventData => Unit = null,
    optimizations: js.Any = null,
    renderElement: /* ref */ ReactRef[org.scalajs.dom.raw.Element] => TagMod[Any] = null,
    renderElementTag: String = null,
    renderElementTo: org.scalajs.dom.raw.Element | String = null,
    renderTarget: /* ref */ ReactRef[org.scalajs.dom.raw.Element] => TagMod[Any] = null,
    target: HTMLElement | String | js.Any = null,
    targetAttachment: String = null,
    targetModifier: String = null,
    targetOffset: String = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(attachment = attachment.asInstanceOf[js.Any])
    if (bodyElement != null) __obj.updateDynamic("bodyElement")(bodyElement.asInstanceOf[js.Any])
    if (classPrefix != null) __obj.updateDynamic("classPrefix")(classPrefix.asInstanceOf[js.Any])
    if (constraints != null) __obj.updateDynamic("constraints")(constraints.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (onRepositioned != null) __obj.updateDynamic("onRepositioned")(js.Any.fromFunction0(onRepositioned))
    if (onUpdate != null) __obj.updateDynamic("onUpdate")(js.Any.fromFunction1(onUpdate))
    if (optimizations != null) __obj.updateDynamic("optimizations")(optimizations.asInstanceOf[js.Any])
    if (renderElement != null) __obj.updateDynamic("renderElement")(js.Any.fromFunction1(renderElement))
    if (renderElementTag != null) __obj.updateDynamic("renderElementTag")(renderElementTag.asInstanceOf[js.Any])
    if (renderElementTo != null) __obj.updateDynamic("renderElementTo")(renderElementTo.asInstanceOf[js.Any])
    if (renderTarget != null) __obj.updateDynamic("renderTarget")(js.Any.fromFunction1(renderTarget))
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (targetAttachment != null) __obj.updateDynamic("targetAttachment")(targetAttachment.asInstanceOf[js.Any])
    if (targetModifier != null) __obj.updateDynamic("targetModifier")(targetModifier.asInstanceOf[js.Any])
    if (targetOffset != null) __obj.updateDynamic("targetOffset")(targetOffset.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = TetherComponentProps
}

