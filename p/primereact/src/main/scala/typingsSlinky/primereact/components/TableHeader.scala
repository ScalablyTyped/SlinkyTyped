package typingsSlinky.primereact.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.primereact.tableHeaderMod.TableHeaderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TableHeader {
  
  @JSImport("primereact/components/datatable/TableHeader", "TableHeader")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: TableHeader.type): Default[tag.type, typingsSlinky.primereact.tableHeaderMod.TableHeader] = new Default[tag.type, typingsSlinky.primereact.tableHeaderMod.TableHeader](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: TableHeaderProps): Default[tag.type, typingsSlinky.primereact.tableHeaderMod.TableHeader] = new Default[tag.type, typingsSlinky.primereact.tableHeaderMod.TableHeader](js.Array(this.component, p.asInstanceOf[js.Any]))
}
