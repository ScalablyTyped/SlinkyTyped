package typingsSlinky.rax

import typingsSlinky.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonRefExclude extends js.Object {
  var ref: js.UndefOr[Exclude[_, String]] = js.native
}

object AnonRefExclude {
  @scala.inline
  def apply(): AnonRefExclude = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonRefExclude]
  }
  @scala.inline
  implicit class AnonRefExcludeOps[Self <: AnonRefExclude] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRef(value: Exclude[_, String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ref")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ref")(js.undefined)
        ret
    }
  }
  
}

