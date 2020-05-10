package typingsSlinky.breeze.breeze

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComplexObject extends js.Object {
  var complexAspect: ComplexAspect = js.native
  var complexType: ComplexType = js.native
}

object ComplexObject {
  @scala.inline
  def apply(complexAspect: ComplexAspect, complexType: ComplexType): ComplexObject = {
    val __obj = js.Dynamic.literal(complexAspect = complexAspect.asInstanceOf[js.Any], complexType = complexType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComplexObject]
  }
  @scala.inline
  implicit class ComplexObjectOps[Self <: ComplexObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComplexAspect(value: ComplexAspect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complexAspect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComplexType(value: ComplexType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complexType")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

