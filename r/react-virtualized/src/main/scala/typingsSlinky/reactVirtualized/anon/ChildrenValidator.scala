package typingsSlinky.reactVirtualized.anon

import slinky.core.TagMod
import typingsSlinky.react.mod.Validator
import typingsSlinky.reactVirtualized.esScrollSyncMod.ScrollSyncChildProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChildrenValidator extends js.Object {
  var children: Validator[js.Function1[/* props */ ScrollSyncChildProps, TagMod[Any]]] = js.native
}

object ChildrenValidator {
  @scala.inline
  def apply(children: Validator[js.Function1[/* props */ ScrollSyncChildProps, TagMod[Any]]]): ChildrenValidator = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChildrenValidator]
  }
  @scala.inline
  implicit class ChildrenValidatorOps[Self <: ChildrenValidator] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildren(value: Validator[js.Function1[/* props */ ScrollSyncChildProps, TagMod[Any]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

