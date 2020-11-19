package typingsSlinky.reactFloater.mod

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PropsWithComponent extends Props {
  
  /**
    * A React component or function to as a custom UI for the Floater.
    * The prop closeFloater will be available in your component.
    */
  def component(renderProps: RenderProps): ReactElement = js.native
}
object PropsWithComponent {
  
  @scala.inline
  def apply(component: RenderProps => ReactElement): PropsWithComponent = {
    val __obj = js.Dynamic.literal(component = js.Any.fromFunction1(component))
    __obj.asInstanceOf[PropsWithComponent]
  }
  
  @scala.inline
  implicit class PropsWithComponentOps[Self <: PropsWithComponent] (val x: Self) extends AnyVal {
    
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
    def setComponent(value: RenderProps => ReactElement): Self = this.set("component", js.Any.fromFunction1(value))
  }
}
