package typingsSlinky.gapiClientAnalytics.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Effective extends js.Object {
  /**
    * All the permissions that the user has for this web property. These include any implied permissions (e.g., EDIT implies VIEW) or inherited permissions
    * from the parent account.
    */
  var effective: js.UndefOr[js.Array[String]] = js.native
}

object Effective {
  @scala.inline
  def apply(): Effective = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Effective]
  }
  @scala.inline
  implicit class EffectiveOps[Self <: Effective] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEffective(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("effective")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEffective: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("effective")(js.undefined)
        ret
    }
  }
  
}

