package typingsSlinky.nodePgMigrate.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DomainOptionsAlterEn extends js.Object {
  var allowNull: js.UndefOr[Boolean] = js.native
}

object DomainOptionsAlterEn {
  @scala.inline
  def apply(): DomainOptionsAlterEn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomainOptionsAlterEn]
  }
  @scala.inline
  implicit class DomainOptionsAlterEnOps[Self <: DomainOptionsAlterEn] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowNull(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowNull")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowNull")(js.undefined)
        ret
    }
  }
  
}

