package typingsSlinky.foreach

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("foreach", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  /**
    * Performs the specified action for each own property in an object.
    *
    * @param callbackfn A function that accepts up to three arguments.
    *        `forEach` calls the `callbackfn` function one time for each own property in the object.
    * @param thisArg A value to which the `this` keyword can refer in the `callbackfn` function.
    *        If `thisArg` is omitted, `undefined` is used as the `this` value.
    */
  def apply[O /* <: Record[String, _] */, THIS_ARG](
    target: O,
    callbackfn: js.ThisFunction3[/* this */ THIS_ARG, /* value */ js.Any, /* property */ String, /* target */ O, Unit]
  ): Unit = js.native
  def apply[O /* <: Record[String, _] */, THIS_ARG](
    target: O,
    callbackfn: js.ThisFunction3[/* this */ THIS_ARG, /* value */ js.Any, /* property */ String, /* target */ O, Unit],
    thisArg: THIS_ARG
  ): Unit = js.native
}
