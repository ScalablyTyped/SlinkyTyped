package typingsSlinky.dwt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** 
  * interface for a base64 result
  */
@js.native
trait Base64Result extends js.Object {
  def getData(offset: Double, length: Double): String = js.native
  def getLength(): Double = js.native
  def getMD5(): String = js.native
}

object Base64Result {
  @scala.inline
  def apply(getData: (Double, Double) => String, getLength: () => Double, getMD5: () => String): Base64Result = {
    val __obj = js.Dynamic.literal(getData = js.Any.fromFunction2(getData), getLength = js.Any.fromFunction0(getLength), getMD5 = js.Any.fromFunction0(getMD5))
    __obj.asInstanceOf[Base64Result]
  }
  @scala.inline
  implicit class Base64ResultOps[Self <: Base64Result] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetData(value: (Double, Double) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getData")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetLength(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLength")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetMD5(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMD5")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

