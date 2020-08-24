package typingsSlinky.reactMdTable

import org.scalajs.dom.raw.HTMLDivElement
import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.react.mod.RefAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@react-md/table/types/TableContainer", JSImport.Namespace)
@js.native
object tableContainerMod extends js.Object {
  /**
    * An extremely "useful" component that should be used with the `Table`
    * component if you want to make a responsive table within the page. If you
    * don't want to use this component, you can just apply `overflow: auto` to a
    * parent element of the table.
    */
  val default: ForwardRefExoticComponent[TableContainerProps with RefAttributes[HTMLDivElement]] = js.native
  type TableContainerProps = HTMLAttributes[HTMLDivElement]
}

