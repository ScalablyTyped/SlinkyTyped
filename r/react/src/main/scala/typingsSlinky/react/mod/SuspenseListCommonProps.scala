package typingsSlinky.react.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SuspenseListCommonProps extends js.Object {
  
  /**
    * Note that SuspenseList require more than one child;
    * it is a runtime warning to provide only a single child.
    *
    * It does, however, allow those children to be wrapped inside a single
    * level of `<React.Fragment>`.
    */
  var children: slinky.core.facade.ReactElement | js.Iterable[slinky.core.facade.ReactElement] = js.native
}
object SuspenseListCommonProps {
  
  @scala.inline
  def apply(children: slinky.core.facade.ReactElement | js.Iterable[slinky.core.facade.ReactElement]): SuspenseListCommonProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuspenseListCommonProps]
  }
  
  @scala.inline
  implicit class SuspenseListCommonPropsOps[Self <: SuspenseListCommonProps] (val x: Self) extends AnyVal {
    
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
    def setChildrenReactElement(value: slinky.core.facade.ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenIterable(value: js.Iterable[slinky.core.facade.ReactElement]): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildren(value: slinky.core.facade.ReactElement | js.Iterable[slinky.core.facade.ReactElement]): Self = this.set("children", value.asInstanceOf[js.Any])
  }
}
