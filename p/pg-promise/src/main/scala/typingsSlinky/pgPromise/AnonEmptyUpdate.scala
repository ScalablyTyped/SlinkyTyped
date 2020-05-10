package typingsSlinky.pgPromise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEmptyUpdate extends js.Object {
  var emptyUpdate: js.UndefOr[js.Any] = js.native
  var tableAlias: js.UndefOr[String] = js.native
  var valueAlias: js.UndefOr[String] = js.native
}

object AnonEmptyUpdate {
  @scala.inline
  def apply(): AnonEmptyUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonEmptyUpdate]
  }
  @scala.inline
  implicit class AnonEmptyUpdateOps[Self <: AnonEmptyUpdate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEmptyUpdate(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emptyUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmptyUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emptyUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withTableAlias(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableAlias")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableAlias: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableAlias")(js.undefined)
        ret
    }
    @scala.inline
    def withValueAlias(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueAlias")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueAlias: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueAlias")(js.undefined)
        ret
    }
  }
  
}

