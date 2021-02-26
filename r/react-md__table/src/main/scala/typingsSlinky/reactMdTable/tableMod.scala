package typingsSlinky.reactMdTable

import org.scalajs.dom.raw.HTMLTableElement
import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.react.mod.RefAttributes
import typingsSlinky.react.mod.TableHTMLAttributes
import typingsSlinky.reactMdTable.configMod.TableConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableMod {
  
  @JSImport("@react-md/table/types/Table", "Table")
  @js.native
  val Table: ForwardRefExoticComponent[TableProps with RefAttributes[HTMLTableElement]] = js.native
  
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
}
