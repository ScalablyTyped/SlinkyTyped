package typingsSlinky.hapiJoi.mod

import typingsSlinky.hapiJoi.hapiJoiBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HierarchySeparatorOptions extends js.Object {
  /**
    * overrides the default `.` hierarchy separator. Set to false to treat the key as a literal value.
    *
    * @default '.'
    */
  var separator: js.UndefOr[String | `false`] = js.native
}

object HierarchySeparatorOptions {
  @scala.inline
  def apply(): HierarchySeparatorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HierarchySeparatorOptions]
  }
  @scala.inline
  implicit class HierarchySeparatorOptionsOps[Self <: HierarchySeparatorOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSeparator(value: String | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("separator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeparator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("separator")(js.undefined)
        ret
    }
  }
  
}

