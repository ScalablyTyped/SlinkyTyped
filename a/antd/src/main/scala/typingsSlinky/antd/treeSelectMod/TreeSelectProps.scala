package typingsSlinky.antd.treeSelectMod

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import typingsSlinky.antd.sizeContextMod.SizeType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RcTreeSelectProps<T> * / any, 'showTreeIcon' | 'treeMotion' | 'inputIcon' | 'mode' | 'getInputElement' | 'backfill'> ]: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RcTreeSelectProps<T> * / any[P]} */ trait TreeSelectProps[T] extends js.Object {
  var bordered: js.UndefOr[Boolean] = js.undefined
  var size: js.UndefOr[SizeType] = js.undefined
  var suffixIcon: js.UndefOr[TagMod[Any]] = js.undefined
}

object TreeSelectProps {
  @scala.inline
  def apply[T](): TreeSelectProps[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TreeSelectProps[T]]
  }
  @scala.inline
  implicit class TreeSelectPropsOps[Self <: TreeSelectProps[_], T] (val x: Self with TreeSelectProps[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBordered(value: Boolean): Self = this.set("bordered", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBordered: Self = this.set("bordered", js.undefined)
    @scala.inline
    def setSize(value: SizeType): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setSuffixIconReactElement(value: ReactElement): Self = this.set("suffixIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def setSuffixIcon(value: TagMod[Any]): Self = this.set("suffixIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuffixIcon: Self = this.set("suffixIcon", js.undefined)
  }
  
}

