package typingsSlinky.fabric.fabricImplMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IUtilArray extends js.Object {
  /**
  	 * Invokes method on all items in a given array
  	 * @param array Array to iterate over
  	 * @param method Name of a method to invoke
  	 */
  def invoke(array: js.Array[_], method: String): js.Array[_] = js.native
  /**
  	 * Finds maximum value in array (not necessarily "first" one)
  	 * @param array Array to iterate over
  	 */
  def max(array: js.Array[_], byProperty: String): js.Any = js.native
  /**
  	 * Finds minimum value in array (not necessarily "first" one)
  	 * @param array Array to iterate over
  	 */
  def min(array: js.Array[_], byProperty: String): js.Any = js.native
}

object IUtilArray {
  @scala.inline
  def apply(
    invoke: (js.Array[_], String) => js.Array[_],
    max: (js.Array[_], String) => js.Any,
    min: (js.Array[_], String) => js.Any
  ): IUtilArray = {
    val __obj = js.Dynamic.literal(invoke = js.Any.fromFunction2(invoke), max = js.Any.fromFunction2(max), min = js.Any.fromFunction2(min))
    __obj.asInstanceOf[IUtilArray]
  }
  @scala.inline
  implicit class IUtilArrayOps[Self <: IUtilArray] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInvoke(value: (js.Array[_], String) => js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invoke")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withMax(value: (js.Array[_], String) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withMin(value: (js.Array[_], String) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

