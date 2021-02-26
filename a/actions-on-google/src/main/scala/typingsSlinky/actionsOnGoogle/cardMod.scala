package typingsSlinky.actionsOnGoogle

import typingsSlinky.actionsOnGoogle.basicMod.BasicCardOptions
import typingsSlinky.actionsOnGoogle.buttonMod.ButtonOptions
import typingsSlinky.actionsOnGoogle.richMod._RichResponseItem
import typingsSlinky.actionsOnGoogle.tableMod.TableOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cardMod {
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/response/card", "BasicCard")
  @js.native
  class BasicCard protected ()
    extends typingsSlinky.actionsOnGoogle.basicMod.BasicCard
       with _RichResponseItem {
    /** @public */
    def this(options: BasicCardOptions) = this()
  }
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/response/card", "Button")
  @js.native
  class Button protected ()
    extends typingsSlinky.actionsOnGoogle.buttonMod.Button {
    /**
      * @param options Button options
      * @public
      */
    def this(options: ButtonOptions) = this()
  }
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/response/card", "Table")
  @js.native
  class Table protected ()
    extends typingsSlinky.actionsOnGoogle.tableMod.Table
       with _RichResponseItem {
    /** @public */
    def this(options: TableOptions) = this()
  }
}
