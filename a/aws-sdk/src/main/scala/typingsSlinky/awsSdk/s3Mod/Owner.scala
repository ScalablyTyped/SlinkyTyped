package typingsSlinky.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Owner extends StObject {
  
  /**
    * Container for the display name of the owner.
    */
  var DisplayName: js.UndefOr[typingsSlinky.awsSdk.s3Mod.DisplayName] = js.native
  
  /**
    * Container for the ID of the owner.
    */
  var ID: js.UndefOr[typingsSlinky.awsSdk.s3Mod.ID] = js.native
}
object Owner {
  
  @scala.inline
  def apply(): Owner = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Owner]
  }
  
  @scala.inline
  implicit class OwnerMutableBuilder[Self <: Owner] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: DisplayName): Self = StObject.set(x, "DisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "DisplayName", js.undefined)
    
    @scala.inline
    def setID(value: ID): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIDUndefined: Self = StObject.set(x, "ID", js.undefined)
  }
}
