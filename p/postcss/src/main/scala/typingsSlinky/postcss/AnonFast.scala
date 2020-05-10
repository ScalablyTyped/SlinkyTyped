package typingsSlinky.postcss

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFast extends js.Object {
  /**
    * Used to narrow down values and speed up the regexp search. Searching
    * every single value with a regexp can be slow. If you pass a fast
    * string, PostCSS will first check whether the value contains the fast
    * string; and only if it does will PostCSS check that value against
    * regexp. For example, instead of just checking for /\d+rem/ on all
    * values, set fast: 'rem' to first check whether a value has the rem
    * unit, and only if it does perform the regexp check.
    */
  var fast: js.UndefOr[String] = js.native
  /**
    * Property names. The method will only search for values that match
    * regexp  within declarations of listed properties.
    */
  var props: js.UndefOr[js.Array[String]] = js.native
}

object AnonFast {
  @scala.inline
  def apply(): AnonFast = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonFast]
  }
  @scala.inline
  implicit class AnonFastOps[Self <: AnonFast] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFast(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fast")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFast: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fast")(js.undefined)
        ret
    }
    @scala.inline
    def withProps(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("props")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("props")(js.undefined)
        ret
    }
  }
  
}

