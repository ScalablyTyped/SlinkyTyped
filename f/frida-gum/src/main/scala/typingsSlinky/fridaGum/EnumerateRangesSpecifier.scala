package typingsSlinky.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnumerateRangesSpecifier extends js.Object {
  /**
    * Whether neighboring ranges with the same protection should be coalesced. The default is false.
    */
  var coalesce: Boolean = js.native
  /**
    * Minimum protection required to be included in the result.
    */
  var protection: PageProtection = js.native
}

object EnumerateRangesSpecifier {
  @scala.inline
  def apply(coalesce: Boolean, protection: PageProtection): EnumerateRangesSpecifier = {
    val __obj = js.Dynamic.literal(coalesce = coalesce.asInstanceOf[js.Any], protection = protection.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumerateRangesSpecifier]
  }
  @scala.inline
  implicit class EnumerateRangesSpecifierOps[Self <: EnumerateRangesSpecifier] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCoalesce(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coalesce")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProtection(value: PageProtection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protection")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

