package typingsSlinky.materialUi.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.materialUi.MaterialUI.Table.TableHeaderProps
import typingsSlinky.materialUi.tableHeaderMod.default
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TableHeader {
  @JSImport("material-ui/Table/TableHeader", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def adjustForCheckbox(value: Boolean): this.type = set("adjustForCheckbox", value.asInstanceOf[js.Any])
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def displaySelectAll(value: Boolean): this.type = set("displaySelectAll", value.asInstanceOf[js.Any])
    @scala.inline
    def enableSelectAll(value: Boolean): this.type = set("enableSelectAll", value.asInstanceOf[js.Any])
    @scala.inline
    def onSelectAll(value: /* checked */ Boolean => Unit): this.type = set("onSelectAll", js.Any.fromFunction1(value))
    @scala.inline
    def selectAllSelected(value: Boolean): this.type = set("selectAllSelected", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: TableHeaderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: TableHeader.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

