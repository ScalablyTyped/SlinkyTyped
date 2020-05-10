package typingsSlinky.appBuilderLib.linuxOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DebOptions extends LinuxTargetSpecificOptions {
  /**
    * The [Priority](https://www.debian.org/doc/debian-policy/ch-controlfields.html#s-f-Priority) attribute.
    */
  val priority: js.UndefOr[String | Null] = js.native
}

object DebOptions {
  @scala.inline
  def apply(): DebOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DebOptions]
  }
  @scala.inline
  implicit class DebOptionsOps[Self <: DebOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPriority(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priority")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPriority: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priority")(js.undefined)
        ret
    }
    @scala.inline
    def withPriorityNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priority")(null)
        ret
    }
  }
  
}

