package typingsSlinky.breeze.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IsCaseSensitive extends js.Object {
  var isCaseSensitive: js.UndefOr[Boolean] = js.native
  var name: js.UndefOr[String] = js.native
  var usesSql92CompliantStringComparison: js.UndefOr[Boolean] = js.native
}

object IsCaseSensitive {
  @scala.inline
  def apply(): IsCaseSensitive = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IsCaseSensitive]
  }
  @scala.inline
  implicit class IsCaseSensitiveOps[Self <: IsCaseSensitive] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsCaseSensitive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCaseSensitive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsCaseSensitive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCaseSensitive")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withUsesSql92CompliantStringComparison(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usesSql92CompliantStringComparison")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsesSql92CompliantStringComparison: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usesSql92CompliantStringComparison")(js.undefined)
        ret
    }
  }
  
}

