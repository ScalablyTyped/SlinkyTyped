package typingsSlinky.reactMdAlert

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object snackbarQueueMod {
  type ActionEventHandler[M /* <: typingsSlinky.reactMdAlert.messageQueueContextMod.ToastMessage */] = js.Function2[
    /* message */ M, 
    /* event */ slinky.web.SyntheticMouseEvent[org.scalajs.dom.raw.HTMLButtonElement], 
    scala.Unit
  ]
}
