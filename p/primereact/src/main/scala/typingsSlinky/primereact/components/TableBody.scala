package typingsSlinky.primereact.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.primereact.tableBodyMod.TableBodyProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TableBody {
  
  @JSImport("primereact/components/datatable/TableBody", "TableBody")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: TableBody.type): Default[tag.type, typingsSlinky.primereact.tableBodyMod.TableBody] = new Default[tag.type, typingsSlinky.primereact.tableBodyMod.TableBody](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: TableBodyProps): Default[tag.type, typingsSlinky.primereact.tableBodyMod.TableBody] = new Default[tag.type, typingsSlinky.primereact.tableBodyMod.TableBody](js.Array(this.component, p.asInstanceOf[js.Any]))
}
