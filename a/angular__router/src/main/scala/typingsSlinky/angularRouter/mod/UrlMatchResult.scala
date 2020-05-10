package typingsSlinky.angularRouter.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UrlMatchResult extends js.Object {
  var consumed: js.Array[UrlSegment] = js.native
  var posParams: js.UndefOr[StringDictionary[UrlSegment]] = js.native
}

object UrlMatchResult {
  @scala.inline
  def apply(consumed: js.Array[UrlSegment]): UrlMatchResult = {
    val __obj = js.Dynamic.literal(consumed = consumed.asInstanceOf[js.Any])
    __obj.asInstanceOf[UrlMatchResult]
  }
  @scala.inline
  implicit class UrlMatchResultOps[Self <: UrlMatchResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConsumed(value: js.Array[UrlSegment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consumed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPosParams(value: StringDictionary[UrlSegment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("posParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("posParams")(js.undefined)
        ret
    }
  }
  
}

