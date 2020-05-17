package typingsSlinky.loopback.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Relations extends js.Object {
  var dataSource: js.Any = js.native
  var relations: js.UndefOr[js.Any] = js.native
}

object Relations {
  @scala.inline
  def apply(dataSource: js.Any): Relations = {
    val __obj = js.Dynamic.literal(dataSource = dataSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[Relations]
  }
  @scala.inline
  implicit class RelationsOps[Self <: Relations] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataSource(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRelations(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relations")(js.undefined)
        ret
    }
  }
  
}

