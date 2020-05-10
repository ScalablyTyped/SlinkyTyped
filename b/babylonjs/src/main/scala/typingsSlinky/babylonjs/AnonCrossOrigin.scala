package typingsSlinky.babylonjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCrossOrigin extends js.Object {
  var crossOrigin: String | Null = js.native
}

object AnonCrossOrigin {
  @scala.inline
  def apply(): AnonCrossOrigin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonCrossOrigin]
  }
  @scala.inline
  implicit class AnonCrossOriginOps[Self <: AnonCrossOrigin] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCrossOrigin(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crossOrigin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCrossOriginNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crossOrigin")(null)
        ret
    }
  }
  
}

