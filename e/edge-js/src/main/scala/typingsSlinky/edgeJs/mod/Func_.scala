package typingsSlinky.edgeJs.mod

import typingsSlinky.edgeJs.edgeJsBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Func_[TInput, TOutput] extends js.Object {
  def apply(payload: TInput, callback: js.Function2[/* error */ js.Error, /* result */ TOutput, Unit]): Unit = js.native
  def apply(payload: TInput, sync: `true`): TOutput = js.native
}

