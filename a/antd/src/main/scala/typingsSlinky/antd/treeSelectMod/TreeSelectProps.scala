package typingsSlinky.antd.treeSelectMod

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import typingsSlinky.antd.sizeContextMod.SizeType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RcTreeSelectProps<T> * / any, 'showTreeIcon' | 'treeMotion' | 'inputIcon' | 'mode' | 'getInputElement' | 'backfill'> ]: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RcTreeSelectProps<T> * / any[P]} */ @js.native
trait TreeSelectProps[T] extends js.Object {
  var bordered: js.UndefOr[Boolean] = js.native
  var size: js.UndefOr[SizeType] = js.native
  var suffixIcon: js.UndefOr[TagMod[Any]] = js.native
}

object TreeSelectProps {
  @scala.inline
  def apply[T](): TreeSelectProps[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TreeSelectProps[T]]
  }
  @scala.inline
  implicit class TreeSelectPropsOps[Self[t] <: TreeSelectProps[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withBordered(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bordered")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBordered: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bordered")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: SizeType): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
    @scala.inline
    def withSuffixIconReactElement(value: ReactElement): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suffixIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuffixIcon(value: TagMod[Any]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suffixIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuffixIcon: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suffixIcon")(js.undefined)
        ret
    }
  }
  
}

