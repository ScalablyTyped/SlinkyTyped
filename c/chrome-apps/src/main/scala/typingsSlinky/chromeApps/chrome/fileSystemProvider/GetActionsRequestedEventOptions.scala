package typingsSlinky.chromeApps.chrome.fileSystemProvider

import typingsSlinky.chromeApps.chrome.fileSystemProvider.internal.RequestedEventOptions
import typingsSlinky.chromeApps.chrome.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetActionsRequestedEventOptions extends RequestedEventOptions {
  
  /** The path of the entry to which this operation is related to. */
  var entryPaths: js.Array[String] = js.native
}
object GetActionsRequestedEventOptions {
  
  @scala.inline
  def apply(entryPaths: js.Array[String], fileSystemId: String, requestId: integer): GetActionsRequestedEventOptions = {
    val __obj = js.Dynamic.literal(entryPaths = entryPaths.asInstanceOf[js.Any], fileSystemId = fileSystemId.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetActionsRequestedEventOptions]
  }
  
  @scala.inline
  implicit class GetActionsRequestedEventOptionsMutableBuilder[Self <: GetActionsRequestedEventOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntryPaths(value: js.Array[String]): Self = StObject.set(x, "entryPaths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntryPathsVarargs(value: String*): Self = StObject.set(x, "entryPaths", js.Array(value :_*))
  }
}
