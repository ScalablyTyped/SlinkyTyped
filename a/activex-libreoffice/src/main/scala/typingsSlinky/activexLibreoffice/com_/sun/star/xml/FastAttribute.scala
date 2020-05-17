package typingsSlinky.activexLibreoffice.com_.sun.star.xml

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A struct to keep information of an element's attribute. */
@js.native
trait FastAttribute extends js.Object {
  /** the token corresponding to the attribute */
  var Token: Double = js.native
  /** the attribute value */
  var Value: String = js.native
}

object FastAttribute {
  @scala.inline
  def apply(Token: Double, Value: String): FastAttribute = {
    val __obj = js.Dynamic.literal(Token = Token.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[FastAttribute]
  }
  @scala.inline
  implicit class FastAttributeOps[Self <: FastAttribute] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withToken(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Token")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

