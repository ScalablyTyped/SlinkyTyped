package typingsSlinky.reactMdTable.tableMod

import org.scalajs.dom.raw.HTMLTableElement
import typingsSlinky.react.mod.TableHTMLAttributes
import typingsSlinky.reactMdTable.configMod.TableConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableProps
  extends TableHTMLAttributes[HTMLTableElement]
     with TableConfiguration
object TableProps {
  
  @scala.inline
  def apply(): TableProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableProps]
  }
}
