package typingsSlinky.awsSdk.shieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Mitigation extends js.Object {
  /**
    * The name of the mitigation taken for this attack.
    */
  var MitigationName: js.UndefOr[String] = js.native
}

object Mitigation {
  @scala.inline
  def apply(): Mitigation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Mitigation]
  }
  @scala.inline
  implicit class MitigationOps[Self <: Mitigation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMitigationName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MitigationName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMitigationName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MitigationName")(js.undefined)
        ret
    }
  }
  
}

