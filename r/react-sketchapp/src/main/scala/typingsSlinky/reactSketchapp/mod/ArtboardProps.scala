package typingsSlinky.reactSketchapp.mod

import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArtboardProps extends StObject {
  
  var children: js.UndefOr[js.Array[ReactElement] | ReactElement] = js.native
  
  /**
    * The name to be displayed in the Sketch Layer List
    */
  var name: js.UndefOr[String] = js.native
  
  var style: js.UndefOr[Style | StyleReference] = js.native
}
object ArtboardProps {
  
  @scala.inline
  def apply(): ArtboardProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArtboardProps]
  }
  
  @scala.inline
  implicit class ArtboardPropsMutableBuilder[Self <: ArtboardProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: js.Array[ReactElement] | ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenReactElement(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setChildrenVarargs(value: ReactElement*): Self = StObject.set(x, "children", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setStyle(value: Style | StyleReference): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
