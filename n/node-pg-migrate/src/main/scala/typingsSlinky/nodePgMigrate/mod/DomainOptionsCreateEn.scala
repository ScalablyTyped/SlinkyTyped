package typingsSlinky.nodePgMigrate.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DomainOptionsCreateEn extends js.Object {
  var collation: js.UndefOr[String] = js.native
}

object DomainOptionsCreateEn {
  @scala.inline
  def apply(): DomainOptionsCreateEn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomainOptionsCreateEn]
  }
  @scala.inline
  implicit class DomainOptionsCreateEnOps[Self <: DomainOptionsCreateEn] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCollation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collation")(js.undefined)
        ret
    }
  }
  
}

