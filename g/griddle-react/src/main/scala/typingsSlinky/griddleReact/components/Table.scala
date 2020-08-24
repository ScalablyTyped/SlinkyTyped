package typingsSlinky.griddleReact.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.griddleReact.mod.components.TableProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Table {
  @JSImport("griddle-react", "components.Table")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.griddleReact.mod.components.Table] {
    @scala.inline
    def NoResults(value: js.Any): this.type = set("NoResults", value.asInstanceOf[js.Any])
    @scala.inline
    def TableBody(value: js.Any): this.type = set("TableBody", value.asInstanceOf[js.Any])
    @scala.inline
    def TableHeading(value: js.Any): this.type = set("TableHeading", value.asInstanceOf[js.Any])
    @scala.inline
    def visibleRows(value: Double): this.type = set("visibleRows", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: TableProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Table.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

