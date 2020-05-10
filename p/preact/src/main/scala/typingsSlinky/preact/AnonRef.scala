package typingsSlinky.preact

import typingsSlinky.preact.mod.ComponentChildren
import typingsSlinky.preact.mod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonRef[RefType] extends js.Object {
  var children: js.UndefOr[ComponentChildren] = js.native
  var ref: js.UndefOr[Ref[RefType]] = js.native
}

object AnonRef {
  @scala.inline
  def apply[RefType](): AnonRef[RefType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonRef[RefType]]
  }
  @scala.inline
  implicit class AnonRefOps[Self[reftype] <: AnonRef[reftype], RefType] (val x: Self[RefType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[RefType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[RefType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[RefType] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[RefType] with Other]
    @scala.inline
    def withChildren(value: ComponentChildren): Self[RefType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildren: Self[RefType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
    @scala.inline
    def withChildrenNull: Self[RefType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(null)
        ret
    }
    @scala.inline
    def withRefFunction1(value: /* instance */ RefType | Null => Unit): Self[RefType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ref")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRef(value: Ref[RefType]): Self[RefType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ref")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRef: Self[RefType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ref")(js.undefined)
        ret
    }
  }
  
}

