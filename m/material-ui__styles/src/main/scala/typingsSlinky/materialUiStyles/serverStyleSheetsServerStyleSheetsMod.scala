package typingsSlinky.materialUiStyles

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@material-ui/styles/ServerStyleSheets/ServerStyleSheets", JSImport.Namespace)
@js.native
object serverStyleSheetsServerStyleSheetsMod extends js.Object {
  
  @js.native
  trait ServerStyleSheets extends js.Object {
    
    def collect(children: ReactElement): ReactElement = js.native
    def collect(children: ReactElement, options: js.Object): ReactElement = js.native
    
    def getStyleElement(): ReactElement = js.native
    def getStyleElement(props: js.Object): ReactElement = js.native
  }
  
  @js.native
  class default () extends ServerStyleSheets {
    def this(options: js.Object) = this()
  }
}
