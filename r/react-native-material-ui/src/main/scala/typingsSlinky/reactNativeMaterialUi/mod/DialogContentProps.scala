package typingsSlinky.reactNativeMaterialUi.mod

import slinky.core.facade.ReactElement
import typingsSlinky.reactNativeMaterialUi.anon.ContentContainer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DialogContentProps extends StObject {
  
  var children: ReactElement = js.native
  
  var style: js.UndefOr[ContentContainer] = js.native
}
object DialogContentProps {
  
  @scala.inline
  def apply(children: ReactElement): DialogContentProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogContentProps]
  }
  
  @scala.inline
  implicit class DialogContentPropsMutableBuilder[Self <: DialogContentProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyle(value: ContentContainer): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
