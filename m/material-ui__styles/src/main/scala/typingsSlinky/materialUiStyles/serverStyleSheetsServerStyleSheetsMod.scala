package typingsSlinky.materialUiStyles

import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serverStyleSheetsServerStyleSheetsMod {
  
  @JSImport("@material-ui/styles/ServerStyleSheets/ServerStyleSheets", JSImport.Default)
  @js.native
  class default () extends ServerStyleSheets {
    def this(options: js.Object) = this()
  }
  
  @js.native
  trait ServerStyleSheets extends StObject {
    
    def collect(children: ReactElement): ReactElement = js.native
    def collect(children: ReactElement, options: js.Object): ReactElement = js.native
    
    def getStyleElement(): ReactElement = js.native
    def getStyleElement(props: js.Object): ReactElement = js.native
  }
}
