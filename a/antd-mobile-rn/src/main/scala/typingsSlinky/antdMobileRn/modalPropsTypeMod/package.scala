package typingsSlinky.antdMobileRn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object modalPropsTypeMod {
  type Callback = js.Function2[
    /* valueOrLogin */ java.lang.String, 
    /* password */ js.UndefOr[java.lang.String], 
    scala.Unit
  ]
  type CallbackOrActions[T] = typingsSlinky.antdMobileRn.modalPropsTypeMod.Callback | js.Array[typingsSlinky.antdMobileRn.modalPropsTypeMod.Action[T]]
}
