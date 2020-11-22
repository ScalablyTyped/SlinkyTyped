package typingsSlinky.emotionReact.emotionReactMod

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClassNamesProps extends js.Object {
  
  def children(content: ClassNamesContent): ReactElement = js.native
}
object ClassNamesProps {
  
  @scala.inline
  def apply(children: ClassNamesContent => ReactElement): ClassNamesProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    __obj.asInstanceOf[ClassNamesProps]
  }
  
  @scala.inline
  implicit class ClassNamesPropsOps[Self <: ClassNamesProps] (val x: Self) extends AnyVal {
    
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
    def setChildren(value: ClassNamesContent => ReactElement): Self = this.set("children", js.Any.fromFunction1(value))
  }
}
