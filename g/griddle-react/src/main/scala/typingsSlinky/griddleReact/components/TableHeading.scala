package typingsSlinky.griddleReact.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.griddleReact.mod.components.TableHeadingProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TableHeading {
  
  @JSImport("griddle-react", "components.TableHeading")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.griddleReact.mod.components.TableHeading] {
    
    @scala.inline
    def columnIdsVarargs(value: Double*): this.type = set("columnIds", js.Array(value :_*))
    
    @scala.inline
    def columnIds(value: js.Array[Double]): this.type = set("columnIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def columnTitlesVarargs(value: String*): this.type = set("columnTitles", js.Array(value :_*))
    
    @scala.inline
    def columnTitles(value: js.Array[String]): this.type = set("columnTitles", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: TableHeadingProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(TableHeadingCell: js.Any): Builder = {
    val __props = js.Dynamic.literal(TableHeadingCell = TableHeadingCell.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[TableHeadingProps]))
  }
}
