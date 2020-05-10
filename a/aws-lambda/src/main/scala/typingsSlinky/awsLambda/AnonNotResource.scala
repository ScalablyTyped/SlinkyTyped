package typingsSlinky.awsLambda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonNotResource extends js.Object {
  var NotResource: String | js.Array[String] = js.native
}

object AnonNotResource {
  @scala.inline
  def apply(NotResource: String | js.Array[String]): AnonNotResource = {
    val __obj = js.Dynamic.literal(NotResource = NotResource.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNotResource]
  }
  @scala.inline
  implicit class AnonNotResourceOps[Self <: AnonNotResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNotResource(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NotResource")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

