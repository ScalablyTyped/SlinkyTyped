package typingsSlinky.awsSdk.directoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectDirectoryResult extends StObject {
  
  /**
    * The identifier of the new directory.
    */
  var DirectoryId: js.UndefOr[typingsSlinky.awsSdk.directoryserviceMod.DirectoryId] = js.native
}
object ConnectDirectoryResult {
  
  @scala.inline
  def apply(): ConnectDirectoryResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectDirectoryResult]
  }
  
  @scala.inline
  implicit class ConnectDirectoryResultMutableBuilder[Self <: ConnectDirectoryResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirectoryId(value: DirectoryId): Self = StObject.set(x, "DirectoryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectoryIdUndefined: Self = StObject.set(x, "DirectoryId", js.undefined)
  }
}
