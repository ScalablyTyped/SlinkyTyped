package typingsSlinky.actionsOnGoogle.simpleMod

import typingsSlinky.actionsOnGoogle.richMod._RichResponseItem
import typingsSlinky.actionsOnGoogle.v2Mod.GoogleActionsV2SimpleResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("actions-on-google/dist/service/actionssdk/conversation/response/simple", "SimpleResponse")
@js.native
class SimpleResponse protected ()
  extends _RichResponseItem
     with GoogleActionsV2SimpleResponse {
  def this(options: String) = this()
  /**
    * @param options SimpleResponse options
    * @public
    */
  def this(options: SimpleResponseOptions) = this()
}
