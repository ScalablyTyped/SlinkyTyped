package typingsSlinky.rbx.fieldMod

import typingsSlinky.rbx.rbxStrings.addons
import typingsSlinky.rbx.rbxStrings.centered
import typingsSlinky.rbx.rbxStrings.group
import typingsSlinky.rbx.rbxStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FieldVariablesDefaults extends js.Object {
  var alignments: centered | right = js.native
  var kinds: addons | group = js.native
}

object FieldVariablesDefaults {
  @scala.inline
  def apply(alignments: centered | right, kinds: addons | group): FieldVariablesDefaults = {
    val __obj = js.Dynamic.literal(alignments = alignments.asInstanceOf[js.Any], kinds = kinds.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldVariablesDefaults]
  }
  @scala.inline
  implicit class FieldVariablesDefaultsOps[Self <: FieldVariablesDefaults] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlignments(value: centered | right): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKinds(value: addons | group): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kinds")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

