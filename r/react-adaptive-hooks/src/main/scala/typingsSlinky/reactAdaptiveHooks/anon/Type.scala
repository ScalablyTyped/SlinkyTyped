package typingsSlinky.reactAdaptiveHooks.anon

import typingsSlinky.reactAdaptiveHooks.reactAdaptiveHooksStrings.`media-source`
import typingsSlinky.reactAdaptiveHooks.reactAdaptiveHooksStrings.file
import typingsSlinky.reactAdaptiveHooks.reactAdaptiveHooksStrings.record
import typingsSlinky.reactAdaptiveHooks.reactAdaptiveHooksStrings.transmission
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Type extends js.Object {
  var `type`: file | record | transmission | `media-source` = js.native
}

object Type {
  @scala.inline
  def apply(`type`: file | record | transmission | `media-source`): Type = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
  @scala.inline
  implicit class TypeOps[Self <: Type] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: file | record | transmission | `media-source`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

