package typingsSlinky.atMaterialDashUiStyles

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material-ui/styles/ServerStyleSheets/ServerStyleSheets", JSImport.Namespace)
@js.native
object serverStyleSheetsServerStyleSheetsMod extends js.Object {
  @js.native
  trait ServerStyleSheets extends js.Object {
    def collect(children: TagMod[Any]): ReactElement = js.native
    def collect(children: TagMod[Any], options: js.Object): ReactElement = js.native
    def getStyleElement(): ReactElement = js.native
    def getStyleElement(props: js.Object): ReactElement = js.native
  }
  
  @js.native
  class default () extends ServerStyleSheets {
    def this(options: js.Object) = this()
  }
  
}

