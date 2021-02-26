package typingsSlinky.primereact.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.primereact.tableFooterMod.TableFooterProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TableFooter {
  
  @JSImport("primereact/components/datatable/TableFooter", "TableFooter")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: TableFooter.type): Default[tag.type, typingsSlinky.primereact.tableFooterMod.TableFooter] = new Default[tag.type, typingsSlinky.primereact.tableFooterMod.TableFooter](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: TableFooterProps): Default[tag.type, typingsSlinky.primereact.tableFooterMod.TableFooter] = new Default[tag.type, typingsSlinky.primereact.tableFooterMod.TableFooter](js.Array(this.component, p.asInstanceOf[js.Any]))
}
