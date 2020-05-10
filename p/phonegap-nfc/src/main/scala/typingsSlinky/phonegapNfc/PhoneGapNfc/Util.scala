package typingsSlinky.phonegapNfc.PhoneGapNfc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Util extends js.Object {
  /**
    * Convert bytes to hexadecimal string
    * @param bytes
    */
  def bytesToHexString(bytes: js.Array[Double]): String = js.native
  /**
    * Convert bytes to string
    * @param bytes
    */
  def bytesToString(bytes: js.Array[Double]): String = js.native
  /**
    * Convert string to bytes
    * @param string
    */
  def stringToBytes(string: String): js.Array[Double] = js.native
}

object Util {
  @scala.inline
  def apply(
    bytesToHexString: js.Array[Double] => String,
    bytesToString: js.Array[Double] => String,
    stringToBytes: String => js.Array[Double]
  ): Util = {
    val __obj = js.Dynamic.literal(bytesToHexString = js.Any.fromFunction1(bytesToHexString), bytesToString = js.Any.fromFunction1(bytesToString), stringToBytes = js.Any.fromFunction1(stringToBytes))
    __obj.asInstanceOf[Util]
  }
  @scala.inline
  implicit class UtilOps[Self <: Util] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBytesToHexString(value: js.Array[Double] => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bytesToHexString")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withBytesToString(value: js.Array[Double] => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bytesToString")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStringToBytes(value: String => js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stringToBytes")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

