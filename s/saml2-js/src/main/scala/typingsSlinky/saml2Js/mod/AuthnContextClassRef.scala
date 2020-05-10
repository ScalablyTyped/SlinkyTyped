package typingsSlinky.saml2Js.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthnContextClassRef extends js.Object {
  var class_refs: js.Array[String] = js.native
  var comparison: String = js.native
}

object AuthnContextClassRef {
  @scala.inline
  def apply(class_refs: js.Array[String], comparison: String): AuthnContextClassRef = {
    val __obj = js.Dynamic.literal(class_refs = class_refs.asInstanceOf[js.Any], comparison = comparison.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthnContextClassRef]
  }
  @scala.inline
  implicit class AuthnContextClassRefOps[Self <: AuthnContextClassRef] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClass_refs(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("class_refs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComparison(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comparison")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

