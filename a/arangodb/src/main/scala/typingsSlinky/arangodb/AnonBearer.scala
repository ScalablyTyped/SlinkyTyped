package typingsSlinky.arangodb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBearer extends js.Object {
  var bearer: String = js.native
}

object AnonBearer {
  @scala.inline
  def apply(bearer: String): AnonBearer = {
    val __obj = js.Dynamic.literal(bearer = bearer.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBearer]
  }
  @scala.inline
  implicit class AnonBearerOps[Self <: AnonBearer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBearer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bearer")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

