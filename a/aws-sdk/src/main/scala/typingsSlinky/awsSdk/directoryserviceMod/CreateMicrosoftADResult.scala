package typingsSlinky.awsSdk.directoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateMicrosoftADResult extends StObject {
  
  /**
    * The identifier of the directory that was created.
    */
  var DirectoryId: js.UndefOr[typingsSlinky.awsSdk.directoryserviceMod.DirectoryId] = js.native
}
object CreateMicrosoftADResult {
  
  @scala.inline
  def apply(): CreateMicrosoftADResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateMicrosoftADResult]
  }
  
  @scala.inline
  implicit class CreateMicrosoftADResultMutableBuilder[Self <: CreateMicrosoftADResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirectoryId(value: DirectoryId): Self = StObject.set(x, "DirectoryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectoryIdUndefined: Self = StObject.set(x, "DirectoryId", js.undefined)
  }
}
