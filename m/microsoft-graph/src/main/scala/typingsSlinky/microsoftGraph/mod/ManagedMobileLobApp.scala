package typingsSlinky.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ManagedMobileLobApp extends ManagedApp {
  
  // The internal committed content version.
  var committedContentVersion: js.UndefOr[NullableOption[String]] = js.native
  
  // The list of content versions for this app.
  var contentVersions: js.UndefOr[NullableOption[js.Array[MobileAppContent]]] = js.native
  
  // The name of the main Lob application file.
  var fileName: js.UndefOr[NullableOption[String]] = js.native
  
  // The total size, including all uploaded files.
  var size: js.UndefOr[Double] = js.native
}
object ManagedMobileLobApp {
  
  @scala.inline
  def apply(): ManagedMobileLobApp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedMobileLobApp]
  }
  
  @scala.inline
  implicit class ManagedMobileLobAppMutableBuilder[Self <: ManagedMobileLobApp] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommittedContentVersion(value: NullableOption[String]): Self = StObject.set(x, "committedContentVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommittedContentVersionNull: Self = StObject.set(x, "committedContentVersion", null)
    
    @scala.inline
    def setCommittedContentVersionUndefined: Self = StObject.set(x, "committedContentVersion", js.undefined)
    
    @scala.inline
    def setContentVersions(value: NullableOption[js.Array[MobileAppContent]]): Self = StObject.set(x, "contentVersions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentVersionsNull: Self = StObject.set(x, "contentVersions", null)
    
    @scala.inline
    def setContentVersionsUndefined: Self = StObject.set(x, "contentVersions", js.undefined)
    
    @scala.inline
    def setContentVersionsVarargs(value: MobileAppContent*): Self = StObject.set(x, "contentVersions", js.Array(value :_*))
    
    @scala.inline
    def setFileName(value: NullableOption[String]): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileNameNull: Self = StObject.set(x, "fileName", null)
    
    @scala.inline
    def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
