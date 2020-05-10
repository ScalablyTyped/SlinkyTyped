package typingsSlinky.samchon.icasegeneratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICaseGenerator extends js.Object {
  /**
    * Get index'th case.
    *
    * @param index Index number
    * @return The row of the index'th in combined permuation case
    */
  def at(index: Double): js.Array[Double] = js.native
  /**
    * Get size of all cases.
    *
    * @return Get a number of the all cases.
    */
  def size(): Double = js.native
}

object ICaseGenerator {
  @scala.inline
  def apply(at: Double => js.Array[Double], size: () => Double): ICaseGenerator = {
    val __obj = js.Dynamic.literal(at = js.Any.fromFunction1(at), size = js.Any.fromFunction0(size))
    __obj.asInstanceOf[ICaseGenerator]
  }
  @scala.inline
  implicit class ICaseGeneratorOps[Self <: ICaseGenerator] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAt(value: Double => js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("at")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSize(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

