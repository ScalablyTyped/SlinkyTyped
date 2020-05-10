package typingsSlinky.ddTrace.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @hidden */
@js.native
trait Analyzable extends js.Object {
  /**
    * Whether to enable App Analytics. Can also be set to a number instead to
    * control the sample rate.
    */
  var analytics: js.UndefOr[Boolean | Double] = js.native
}

object Analyzable {
  @scala.inline
  def apply(): Analyzable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Analyzable]
  }
  @scala.inline
  implicit class AnalyzableOps[Self <: Analyzable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnalytics(value: Boolean | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("analytics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnalytics: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("analytics")(js.undefined)
        ret
    }
  }
  
}

