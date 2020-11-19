package typingsSlinky.reactRouterNavigationCore.mod

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CardStackProps extends js.Object {
  
  var children: js.UndefOr[js.Array[ReactElement]] = js.native
  
  def render(props: CardsRendererProps): ReactElement = js.native
}
object CardStackProps {
  
  @scala.inline
  def apply(render: CardsRendererProps => ReactElement): CardStackProps = {
    val __obj = js.Dynamic.literal(render = js.Any.fromFunction1(render))
    __obj.asInstanceOf[CardStackProps]
  }
  
  @scala.inline
  implicit class CardStackPropsOps[Self <: CardStackProps] (val x: Self) extends AnyVal {
    
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
    def setRender(value: CardsRendererProps => ReactElement): Self = this.set("render", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChildrenVarargs(value: ReactElement*): Self = this.set("children", js.Array(value :_*))
    
    @scala.inline
    def setChildren(value: js.Array[ReactElement]): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
  }
}
