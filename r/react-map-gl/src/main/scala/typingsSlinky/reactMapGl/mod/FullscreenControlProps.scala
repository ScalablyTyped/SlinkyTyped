package typingsSlinky.reactMapGl.mod

import org.scalajs.dom.raw.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FullscreenControlProps extends BaseControlProps {
  
  var className: js.UndefOr[String] = js.native
  
  var container: js.UndefOr[HTMLElement | Null] = js.native
}
object FullscreenControlProps {
  
  @scala.inline
  def apply(): FullscreenControlProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FullscreenControlProps]
  }
  
  @scala.inline
  implicit class FullscreenControlPropsMutableBuilder[Self <: FullscreenControlProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setContainer(value: HTMLElement): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerNull: Self = StObject.set(x, "container", null)
    
    @scala.inline
    def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
  }
}
