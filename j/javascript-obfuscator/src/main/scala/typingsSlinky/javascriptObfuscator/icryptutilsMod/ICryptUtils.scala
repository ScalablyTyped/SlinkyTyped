package typingsSlinky.javascriptObfuscator.icryptutilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICryptUtils extends js.Object {
  /**
    * @param string
    */
  def btoa(string: String): String = js.native
  /**
    * @param str
    * @param length
    * @returns {[string, string]}
    */
  def hideString(str: String, length: Double): js.Tuple2[String, String] = js.native
  /**
    * @param key
    * @param string
    * @returns {string}
    */
  /* tslint:disable */
  def rc4(string: String, key: String): String = js.native
}

object ICryptUtils {
  @scala.inline
  def apply(
    btoa: String => String,
    hideString: (String, Double) => js.Tuple2[String, String],
    rc4: (String, String) => String
  ): ICryptUtils = {
    val __obj = js.Dynamic.literal(btoa = js.Any.fromFunction1(btoa), hideString = js.Any.fromFunction2(hideString), rc4 = js.Any.fromFunction2(rc4))
    __obj.asInstanceOf[ICryptUtils]
  }
  @scala.inline
  implicit class ICryptUtilsOps[Self <: ICryptUtils] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBtoa(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("btoa")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHideString(value: (String, Double) => js.Tuple2[String, String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideString")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRc4(value: (String, String) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rc4")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

