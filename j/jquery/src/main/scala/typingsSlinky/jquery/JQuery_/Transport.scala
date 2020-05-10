package typingsSlinky.jquery.JQuery_

import typingsSlinky.jquery.JQuery_.Ajax.TextStatus
import typingsSlinky.jquery.JQuery_.Transport.SuccessCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Transport extends js.Object {
  def abort(): Unit = js.native
  def send(headers: PlainObject[_], completeCallback: SuccessCallback): Unit = js.native
}

@JSGlobal("JQuery.Transport")
@js.native
object Transport extends js.Object {
  type SuccessCallback = js.Function4[
    /* status */ Double, 
    /* statusText */ TextStatus, 
    /* responses */ js.UndefOr[PlainObject[js.Any]], 
    /* headers */ js.UndefOr[String], 
    Unit
  ]
}

