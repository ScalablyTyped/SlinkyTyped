package typingsSlinky.reactTable.anon

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.reactTable.mod.HeaderProps
import typingsSlinky.reactTable.mod.IdType
import typingsSlinky.reactTable.mod.Renderer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Id[D /* <: js.Object */] extends StObject {
  
  var Header: Renderer[HeaderProps[D]] = js.native
  
  var id: IdType[D] = js.native
}
object Id {
  
  @scala.inline
  def apply[D /* <: js.Object */](Header: Renderer[HeaderProps[D]], id: IdType[D]): Id[D] = {
    val __obj = js.Dynamic.literal(Header = Header.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Id[D]]
  }
  
  @scala.inline
  implicit class IdMutableBuilder[Self <: Id[_], D /* <: js.Object */] (val x: Self with Id[D]) extends AnyVal {
    
    @scala.inline
    def setHeader(value: Renderer[HeaderProps[D]]): Self = StObject.set(x, "Header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderComponentClass(value: ReactComponentClass[HeaderProps[D]]): Self = StObject.set(x, "Header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderFunctionComponent(value: ReactComponentClass[HeaderProps[D]]): Self = StObject.set(x, "Header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderReactElement(value: ReactElement): Self = StObject.set(x, "Header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: IdType[D]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
