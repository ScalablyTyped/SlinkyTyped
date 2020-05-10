package typingsSlinky.jupyterlabExtensionmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonInsecure extends js.Object {
  /**
    * Package is insecure or have vulnerable dependencies (based on the nsp registry).
    */
  var insecure: Double = js.native
  /**
    * Package has a version < 1.0.0.
    */
  var unstable: Boolean = js.native
}

object AnonInsecure {
  @scala.inline
  def apply(insecure: Double, unstable: Boolean): AnonInsecure = {
    val __obj = js.Dynamic.literal(insecure = insecure.asInstanceOf[js.Any], unstable = unstable.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonInsecure]
  }
  @scala.inline
  implicit class AnonInsecureOps[Self <: AnonInsecure] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInsecure(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insecure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnstable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unstable")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

