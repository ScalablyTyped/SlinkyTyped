package typingsSlinky.reactCopyWrite.mod

import slinky.core.facade.ReactElement
import typingsSlinky.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConsumerPropsExplicitRender[T]
  extends ConsumerPropsBase[T]
     with ConsumerProps[T] {
  
  var render: js.UndefOr[RenderFn[T]] = js.native
}
object ConsumerPropsExplicitRender {
  
  @scala.inline
  def apply[T](): ConsumerPropsExplicitRender[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConsumerPropsExplicitRender[T]]
  }
  
  @scala.inline
  implicit class ConsumerPropsExplicitRenderOps[Self <: ConsumerPropsExplicitRender[_], T] (val x: Self with ConsumerPropsExplicitRender[T]) extends AnyVal {
    
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
    def setRender(value: /* repeated */ ReturnType[SelectorFn[T]] => ReactElement | js.Array[ReactElement] | Null): Self = this.set("render", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRender: Self = this.set("render", js.undefined)
  }
}
