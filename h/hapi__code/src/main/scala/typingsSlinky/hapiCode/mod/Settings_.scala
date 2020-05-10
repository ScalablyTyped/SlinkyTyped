package typingsSlinky.hapiCode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Settings_ extends js.Object {
  /**
    * Ignore object prototypes when doing a deep comparison.
    * 
    * @defaults false
    */
  var comparePrototypes: js.UndefOr[Boolean] = js.native
  /**
    * Truncate long assertion error messages for readability.
    * 
    * @default false
    */
  var truncateMessages: js.UndefOr[Boolean] = js.native
}

object Settings_ {
  @scala.inline
  def apply(): Settings_ = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Settings_]
  }
  @scala.inline
  implicit class Settings_Ops[Self <: Settings_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComparePrototypes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comparePrototypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComparePrototypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comparePrototypes")(js.undefined)
        ret
    }
    @scala.inline
    def withTruncateMessages(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("truncateMessages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTruncateMessages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("truncateMessages")(js.undefined)
        ret
    }
  }
  
}

