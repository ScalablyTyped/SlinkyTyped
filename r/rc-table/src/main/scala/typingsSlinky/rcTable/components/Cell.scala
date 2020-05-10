package typingsSlinky.rcTable.components

import org.scalajs.dom.raw.HTMLElement
import slinky.core.ReactComponentClass
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.rcTable.cellMod.CellProps
import typingsSlinky.rcTable.interfaceMod.AlignType
import typingsSlinky.rcTable.interfaceMod.CustomizeComponent
import typingsSlinky.rcTable.interfaceMod.DataIndex
import typingsSlinky.rcTable.interfaceMod.RenderedCell
import typingsSlinky.rcTable.rcTableBooleans.`false`
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.react.mod.Ref
import typingsSlinky.react.mod.RefAttributes
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Cell {
  @JSImport("rc-table/lib/Cell", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, Ref[js.Any] with js.Object] {
    @scala.inline
    def additionalProps(value: HTMLAttributes[HTMLElement]): this.type = set("additionalProps", value.asInstanceOf[js.Any])
    @scala.inline
    def align(value: AlignType): this.type = set("align", value.asInstanceOf[js.Any])
    @scala.inline
    def appendNodeReactElement(value: ReactElement): this.type = set("appendNode", value.asInstanceOf[js.Any])
    @scala.inline
    def appendNode(value: TagMod[Any]): this.type = set("appendNode", value.asInstanceOf[js.Any])
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def colSpan(value: Double): this.type = set("colSpan", value.asInstanceOf[js.Any])
    @scala.inline
    def componentFunctionComponent(value: ReactComponentClass[js.Any]): this.type = set("component", value.asInstanceOf[js.Any])
    @scala.inline
    def componentComponentClass(value: ReactComponentClass[js.Any]): this.type = set("component", value.asInstanceOf[js.Any])
    @scala.inline
    def component(value: CustomizeComponent): this.type = set("component", value.asInstanceOf[js.Any])
    @scala.inline
    def dataIndex(value: DataIndex): this.type = set("dataIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def ellipsis(value: Boolean): this.type = set("ellipsis", value.asInstanceOf[js.Any])
    @scala.inline
    def firstFixLeft(value: Boolean): this.type = set("firstFixLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def firstFixRight(value: Boolean): this.type = set("firstFixRight", value.asInstanceOf[js.Any])
    @scala.inline
    def fixLeft(value: Double | `false`): this.type = set("fixLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def fixRight(value: Double | `false`): this.type = set("fixRight", value.asInstanceOf[js.Any])
    @scala.inline
    def index(value: Double): this.type = set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def lastFixLeft(value: Boolean): this.type = set("lastFixLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def lastFixRight(value: Boolean): this.type = set("lastFixRight", value.asInstanceOf[js.Any])
    @scala.inline
    def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def record(value: Record[String, js.Any]): this.type = set("record", value.asInstanceOf[js.Any])
    @scala.inline
    def render(
      value: (/* value */ js.Any, Record[String, js.Any], /* index */ Double) => TagMod[Any] | (RenderedCell[Record[String, js.Any]])
    ): this.type = set("render", js.Any.fromFunction3(value))
    @scala.inline
    def rowSpan(value: Double): this.type = set("rowSpan", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: (CellProps[Record[String, js.Any]]) with RefAttributes[js.Any]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Cell.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

