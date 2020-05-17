package typingsSlinky.firebasePerformance.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttributeName extends js.Object {
  var attributeName: String = js.native
}

object AttributeName {
  @scala.inline
  def apply(attributeName: String): AttributeName = {
    val __obj = js.Dynamic.literal(attributeName = attributeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttributeName]
  }
  @scala.inline
  implicit class AttributeNameOps[Self <: AttributeName] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttributeName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributeName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

