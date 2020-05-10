package typingsSlinky.blueprintjsTable.components

import org.scalajs.dom.raw.HTMLElement
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.blueprintjsCore.PartialIPopoverProps
import typingsSlinky.blueprintjsCore.intentMod.Intent
import typingsSlinky.blueprintjsCore.propsMod.MaybeElement
import typingsSlinky.blueprintjsIcons.iconNameMod.IconName
import typingsSlinky.blueprintjsTable.copyCellsMenuItemMod.ICopyCellsMenuItemProps
import typingsSlinky.blueprintjsTable.menuContextMod.IMenuContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object CopyCellsMenuItem {
  @JSImport("@blueprintjs/table", "CopyCellsMenuItem")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.blueprintjsTable.mod.CopyCellsMenuItem] {
    @scala.inline
    def active(value: Boolean): this.type = set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def href(value: String): this.type = set("href", value.asInstanceOf[js.Any])
    @scala.inline
    def iconReactElement(value: ReactElement): this.type = set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def icon(value: IconName | MaybeElement): this.type = set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def iconNull: this.type = set("icon", null)
    @scala.inline
    def intent(value: Intent): this.type = set("intent", value.asInstanceOf[js.Any])
    @scala.inline
    def label(value: String): this.type = set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def labelClassName(value: String): this.type = set("labelClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def labelElementReactElement(value: ReactElement): this.type = set("labelElement", value.asInstanceOf[js.Any])
    @scala.inline
    def labelElement(value: TagMod[Any]): this.type = set("labelElement", value.asInstanceOf[js.Any])
    @scala.inline
    def multiline(value: Boolean): this.type = set("multiline", value.asInstanceOf[js.Any])
    @scala.inline
    def onClick(value: /* event */ SyntheticMouseEvent[HTMLElement] => Unit): this.type = set("onClick", js.Any.fromFunction1(value))
    @scala.inline
    def onCopy(value: /* success */ Boolean => Unit): this.type = set("onCopy", js.Any.fromFunction1(value))
    @scala.inline
    def popoverProps(value: PartialIPopoverProps): this.type = set("popoverProps", value.asInstanceOf[js.Any])
    @scala.inline
    def shouldDismissPopover(value: Boolean): this.type = set("shouldDismissPopover", value.asInstanceOf[js.Any])
    @scala.inline
    def tagName(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176 */ js.Any): this.type = set("tagName", value.asInstanceOf[js.Any])
    @scala.inline
    def target(value: String): this.type = set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def text(value: TagMod[Any]): this.type = set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def textClassName(value: String): this.type = set("textClassName", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ICopyCellsMenuItemProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(context: IMenuContext, getCellData: (Double, Double) => js.Any): Builder = {
    val __props = js.Dynamic.literal(context = context.asInstanceOf[js.Any], getCellData = js.Any.fromFunction2(getCellData))
    new Builder(js.Array(this.component, __props.asInstanceOf[ICopyCellsMenuItemProps]))
  }
}

