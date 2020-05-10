package typingsSlinky.alex.mod

import typingsSlinky.alex.alexNumbers.`0`
import typingsSlinky.alex.alexNumbers.`1`
import typingsSlinky.alex.alexNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AlexOptions extends js.Object {
  /** an array of rules (the default is []) */
  var allow: js.UndefOr[js.Array[String]] = js.native
  /**
    * When turned on (`true`), pairs such as `he` and `she` and `garbageman` or `garbagewoman` are seen as errors.
    * When turned off (`false`, the default), such pairs are okay
    */
  var noBinary: js.UndefOr[Boolean] = js.native
  /**
    * the minimum rating (including) that you want to check for.
    * If you set it to 1 (maybe) then it will warn for level 1 and 2 (likely) profanities,
    * but not for level 0 (unlikely).
    */
  var profanitySureness: js.UndefOr[`0` | `1` | `2`] = js.native
}

object AlexOptions {
  @scala.inline
  def apply(): AlexOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlexOptions]
  }
  @scala.inline
  implicit class AlexOptionsOps[Self <: AlexOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllow(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allow")(js.undefined)
        ret
    }
    @scala.inline
    def withNoBinary(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noBinary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoBinary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noBinary")(js.undefined)
        ret
    }
    @scala.inline
    def withProfanitySureness(value: `0` | `1` | `2`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profanitySureness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProfanitySureness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profanitySureness")(js.undefined)
        ret
    }
  }
  
}

