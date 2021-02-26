package typingsSlinky.contentfulManagement.anon

import typingsSlinky.axios.mod.AxiosInstance
import typingsSlinky.contentfulManagement.editorInterfaceMod.EditorInterface
import typingsSlinky.contentfulManagement.editorInterfaceMod.EditorInterfaceProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofeditorInterface extends StObject {
  
  def wrapEditorInterface(http: AxiosInstance, data: EditorInterfaceProps): EditorInterface = js.native
}
object TypeofeditorInterface {
  
  @scala.inline
  def apply(wrapEditorInterface: (AxiosInstance, EditorInterfaceProps) => EditorInterface): TypeofeditorInterface = {
    val __obj = js.Dynamic.literal(wrapEditorInterface = js.Any.fromFunction2(wrapEditorInterface))
    __obj.asInstanceOf[TypeofeditorInterface]
  }
  
  @scala.inline
  implicit class TypeofeditorInterfaceMutableBuilder[Self <: TypeofeditorInterface] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWrapEditorInterface(value: (AxiosInstance, EditorInterfaceProps) => EditorInterface): Self = StObject.set(x, "wrapEditorInterface", js.Any.fromFunction2(value))
  }
}
