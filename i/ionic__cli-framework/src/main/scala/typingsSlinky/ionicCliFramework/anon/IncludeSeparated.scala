package typingsSlinky.ionicCliFramework.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IncludeSeparated extends js.Object {
  var includeSeparated: js.UndefOr[Boolean] = js.native
}

object IncludeSeparated {
  @scala.inline
  def apply(): IncludeSeparated = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IncludeSeparated]
  }
  @scala.inline
  implicit class IncludeSeparatedOps[Self <: IncludeSeparated] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIncludeSeparated(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeSeparated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeSeparated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeSeparated")(js.undefined)
        ret
    }
  }
  
}

