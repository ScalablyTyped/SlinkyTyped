package typingsSlinky.materialUiCore.withStylesMod

import slinky.core.facade.ReactRef
import typingsSlinky.react.mod.Ref
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StyledComponentProps[ClassKey /* <: String */] extends js.Object {
  var classes: js.UndefOr[Partial[ClassNameMap[ClassKey]]] = js.native
  var innerRef: js.UndefOr[Ref[_] | ReactRef[_]] = js.native
}

object StyledComponentProps {
  @scala.inline
  def apply[ClassKey](): StyledComponentProps[ClassKey] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StyledComponentProps[ClassKey]]
  }
  @scala.inline
  implicit class StyledComponentPropsOps[Self[classkey] <: StyledComponentProps[classkey], ClassKey] (val x: Self[ClassKey]) extends AnyVal {
    @scala.inline
    def duplicate: Self[ClassKey] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[ClassKey]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[ClassKey] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[ClassKey] with Other]
    @scala.inline
    def withClasses(value: Partial[ClassNameMap[ClassKey]]): Self[ClassKey] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClasses: Self[ClassKey] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classes")(js.undefined)
        ret
    }
    @scala.inline
    def withInnerRefRefObject(value: ReactRef[_]): Self[ClassKey] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInnerRefFunction1(value: /* instance */ _ | Null => Unit): Self[ClassKey] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerRef")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInnerRef(value: Ref[_] | ReactRef[_]): Self[ClassKey] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInnerRef: Self[ClassKey] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerRef")(js.undefined)
        ret
    }
    @scala.inline
    def withInnerRefNull: Self[ClassKey] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerRef")(null)
        ret
    }
  }
  
}

