package typingsSlinky.activexInfopath

import typingsSlinky.activexInfopath.InfoPath.Application
import typingsSlinky.activexInfopath.InfoPath.ExternalApplication
import typingsSlinky.activexInfopath.InfoPath.InfoPathEditorObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActiveXObjectNameMap extends StObject {
  
  @JSName("InfoPath.Application")
  var InfoPathDotApplication: Application = js.native
  
  @JSName("InfoPath.Editor")
  var InfoPathDotEditor: InfoPathEditorObject = js.native
  
  @JSName("InfoPath.ExternalApplication")
  var InfoPathDotExternalApplication: ExternalApplication = js.native
}
object ActiveXObjectNameMap {
  
  @scala.inline
  def apply(
    InfoPathDotApplication: Application,
    InfoPathDotEditor: InfoPathEditorObject,
    InfoPathDotExternalApplication: ExternalApplication
  ): ActiveXObjectNameMap = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("InfoPath.Application")(InfoPathDotApplication.asInstanceOf[js.Any])
    __obj.updateDynamic("InfoPath.Editor")(InfoPathDotEditor.asInstanceOf[js.Any])
    __obj.updateDynamic("InfoPath.ExternalApplication")(InfoPathDotExternalApplication.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveXObjectNameMap]
  }
  
  @scala.inline
  implicit class ActiveXObjectNameMapMutableBuilder[Self <: ActiveXObjectNameMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInfoPathDotApplication(value: Application): Self = StObject.set(x, "InfoPath.Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfoPathDotEditor(value: InfoPathEditorObject): Self = StObject.set(x, "InfoPath.Editor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfoPathDotExternalApplication(value: ExternalApplication): Self = StObject.set(x, "InfoPath.ExternalApplication", value.asInstanceOf[js.Any])
  }
}
