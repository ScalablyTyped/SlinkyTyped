package typingsSlinky.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlobalAccessHandler extends js.Object {
  /**
    * Queries which additional globals exist.
    */
  def enumerate(): js.Array[String] = js.native
  /**
    * Called whenever an attempt to access a non-existent global variable is
    * made. Return `undefined` to treat the variable as inexistent.
    *
    * @param property Name of non-existent global that is being accessed.
    */
  def get(property: String): js.Any = js.native
}

object GlobalAccessHandler {
  @scala.inline
  def apply(enumerate: () => js.Array[String], get: String => js.Any): GlobalAccessHandler = {
    val __obj = js.Dynamic.literal(enumerate = js.Any.fromFunction0(enumerate), get = js.Any.fromFunction1(get))
    __obj.asInstanceOf[GlobalAccessHandler]
  }
  @scala.inline
  implicit class GlobalAccessHandlerOps[Self <: GlobalAccessHandler] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnumerate(value: () => js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enumerate")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet(value: String => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

