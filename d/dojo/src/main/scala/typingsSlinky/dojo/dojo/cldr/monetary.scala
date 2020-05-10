package typingsSlinky.dojo.dojo.cldr

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/cldr/monetary.html
  *
  * TODOC
  *
  */
@js.native
trait monetary extends js.Object {
  /**
    * A mapping of currency code to currency-specific formatting information. Returns a unique object with properties: places, round.
    *
    * @param code an ISO 4217 currency code
    */
  def getData(code: String): js.Object = js.native
}

object monetary {
  @scala.inline
  def apply(getData: String => js.Object): monetary = {
    val __obj = js.Dynamic.literal(getData = js.Any.fromFunction1(getData))
    __obj.asInstanceOf[monetary]
  }
  @scala.inline
  implicit class monetaryOps[Self <: monetary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetData(value: String => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getData")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

