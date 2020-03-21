package typingsSlinky.blueprintjsTable.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.blueprintjsCore.PartialIPopoverProps
import typingsSlinky.blueprintjsCore.intentMod.Intent
import typingsSlinky.blueprintjsCore.propsMod.MaybeElement
import typingsSlinky.blueprintjsIcons.iconNameMod.IconName
import typingsSlinky.blueprintjsTable.copyCellsMenuItemMod.ICopyCellsMenuItemProps
import typingsSlinky.blueprintjsTable.menuContextMod.IMenuContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object CopyCellsMenuItem
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.blueprintjsTable.mod.CopyCellsMenuItem] {
  @JSImport("@blueprintjs/table", "CopyCellsMenuItem")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, disabled, href, label, target */
  def apply(
    context: IMenuContext,
    getCellData: (Double, Double) => js.Any,
    text: TagMod[Any],
    active: js.UndefOr[Boolean] = js.undefined,
    icon: IconName | MaybeElement = null,
    intent: Intent = null,
    labelClassName: String = null,
    labelElement: TagMod[Any] = null,
    multiline: js.UndefOr[Boolean] = js.undefined,
    onClick: /* event */ SyntheticMouseEvent[HTMLElement] => Unit = null,
    onCopy: /* success */ Boolean => Unit = null,
    popoverProps: PartialIPopoverProps = null,
    shouldDismissPopover: js.UndefOr[Boolean] = js.undefined,
    tagName: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ js.Any = null,
    textClassName: String = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.blueprintjsTable.mod.CopyCellsMenuItem] = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], getCellData = js.Any.fromFunction2(getCellData), text = text.asInstanceOf[js.Any])
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (intent != null) __obj.updateDynamic("intent")(intent.asInstanceOf[js.Any])
    if (labelClassName != null) __obj.updateDynamic("labelClassName")(labelClassName.asInstanceOf[js.Any])
    if (labelElement != null) __obj.updateDynamic("labelElement")(labelElement.asInstanceOf[js.Any])
    if (!js.isUndefined(multiline)) __obj.updateDynamic("multiline")(multiline.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onCopy != null) __obj.updateDynamic("onCopy")(js.Any.fromFunction1(onCopy))
    if (popoverProps != null) __obj.updateDynamic("popoverProps")(popoverProps.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldDismissPopover)) __obj.updateDynamic("shouldDismissPopover")(shouldDismissPopover.asInstanceOf[js.Any])
    if (tagName != null) __obj.updateDynamic("tagName")(tagName.asInstanceOf[js.Any])
    if (textClassName != null) __obj.updateDynamic("textClassName")(textClassName.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ICopyCellsMenuItemProps
}

