package typingsSlinky.knuddelsUserappsApi.anon

import typingsSlinky.knuddelsUserappsApi.mod.global.User
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MinimumValue extends js.Object {
  var maximumValue: js.UndefOr[Double] = js.native
  var minimumValue: js.UndefOr[Double] = js.native
  var targetUsers: js.UndefOr[js.Array[User]] = js.native
}

object MinimumValue {
  @scala.inline
  def apply(): MinimumValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MinimumValue]
  }
  @scala.inline
  implicit class MinimumValueOps[Self <: MinimumValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaximumValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximumValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumValue")(js.undefined)
        ret
    }
    @scala.inline
    def withMinimumValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimumValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumValue")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetUsers(value: js.Array[User]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetUsers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetUsers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetUsers")(js.undefined)
        ret
    }
  }
  
}

