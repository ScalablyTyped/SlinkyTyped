package typingsSlinky.primereact.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.primereact.anon.EventValue
import typingsSlinky.primereact.pickListSubListMod.PickListSubListProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object PickListSubList {
  @JSImport("primereact/components/picklist/PickListSubList", "PickListSubList")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.primereact.pickListSubListMod.PickListSubList] {
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def header(value: String): this.type = set("header", value.asInstanceOf[js.Any])
    @scala.inline
    def itemTemplate(value: /* item */ js.Any => js.UndefOr[ReactElement]): this.type = set("itemTemplate", js.Any.fromFunction1(value))
    @scala.inline
    def list(value: js.Array[_]): this.type = set("list", value.asInstanceOf[js.Any])
    @scala.inline
    def listClassName(value: String): this.type = set("listClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def metaKeySelection(value: Boolean): this.type = set("metaKeySelection", value.asInstanceOf[js.Any])
    @scala.inline
    def onItemClick(value: () => Unit): this.type = set("onItemClick", js.Any.fromFunction0(value))
    @scala.inline
    def onSelectionChange(value: /* e */ EventValue => Unit): this.type = set("onSelectionChange", js.Any.fromFunction1(value))
    @scala.inline
    def selection(value: js.Array[_]): this.type = set("selection", value.asInstanceOf[js.Any])
    @scala.inline
    def showControls(value: Boolean): this.type = set("showControls", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: js.Object): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: PickListSubListProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: PickListSubList.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

