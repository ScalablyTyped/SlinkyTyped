package typingsSlinky.primereact.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.primereact.tableHeaderMod.TableHeaderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TableHeader {
  @JSImport("primereact/components/datatable/TableHeader", "TableHeader")
  @js.native
  object component extends js.Object
  
  def withProps(p: TableHeaderProps): Default[tag.type, typingsSlinky.primereact.tableHeaderMod.TableHeader] = new Default[tag.type, typingsSlinky.primereact.tableHeaderMod.TableHeader](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: TableHeader.type): Default[tag.type, typingsSlinky.primereact.tableHeaderMod.TableHeader] = new Default[tag.type, typingsSlinky.primereact.tableHeaderMod.TableHeader](js.Array(this.component, js.Dictionary.empty))()
}

