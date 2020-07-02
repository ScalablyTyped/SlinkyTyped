package typingsSlinky.rcTable.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.rcTable.cellMod.CellProps
import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.react.mod.RefAttributes
import typingsSlinky.react.mod.WeakValidationMap
import typingsSlinky.std.Partial
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
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def defaultProps(value: Partial[CellProps[js.Any] with RefAttributes[js.Any]]): this.type = set("defaultProps", value.asInstanceOf[js.Any])
    @scala.inline
    def displayName(value: String): this.type = set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def propTypes(value: WeakValidationMap[CellProps[js.Any] with RefAttributes[js.Any]]): this.type = set("propTypes", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ForwardRefExoticComponent[CellProps[js.Any] with RefAttributes[js.Any]]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(DollarDollartypeof: js.Symbol): Builder = {
    val __props = js.Dynamic.literal()
    __props.updateDynamic("$$typeof")(DollarDollartypeof.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ForwardRefExoticComponent[CellProps[js.Any] with RefAttributes[js.Any]]]))
  }
}

