package typingsSlinky.actionsOnGoogle

import typingsSlinky.actionsOnGoogle.basicMod.BasicCardOptions
import typingsSlinky.actionsOnGoogle.buttonMod.ButtonOptions
import typingsSlinky.actionsOnGoogle.richMod._RichResponseItem
import typingsSlinky.actionsOnGoogle.tableMod.TableOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("actions-on-google/dist/service/actionssdk/conversation/response/card", JSImport.Namespace)
@js.native
object cardMod extends js.Object {
  @js.native
  class BasicCard protected ()
    extends typingsSlinky.actionsOnGoogle.basicMod.BasicCard
       with _RichResponseItem {
    /** @public */
    def this(options: BasicCardOptions) = this()
  }
  
  @js.native
  class Button protected ()
    extends typingsSlinky.actionsOnGoogle.buttonMod.Button {
    /**
      * @param options Button options
      * @public
      */
    def this(options: ButtonOptions) = this()
  }
  
  @js.native
  class Table protected ()
    extends typingsSlinky.actionsOnGoogle.tableMod.Table
       with _RichResponseItem {
    /** @public */
    def this(options: TableOptions) = this()
  }
  
}

