package typingsSlinky.googleapis.anon

import typingsSlinky.googleapis.v3Mod.analyticsV3.SchemaAccountRef
import typingsSlinky.googleapis.v3Mod.analyticsV3.SchemaProfileRef
import typingsSlinky.googleapis.v3Mod.analyticsV3.SchemaWebPropertyRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountRef extends StObject {
  
  var accountRef: js.UndefOr[SchemaAccountRef] = js.native
  
  var profileRef: js.UndefOr[SchemaProfileRef] = js.native
  
  var webPropertyRef: js.UndefOr[SchemaWebPropertyRef] = js.native
}
object AccountRef {
  
  @scala.inline
  def apply(): AccountRef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountRef]
  }
  
  @scala.inline
  implicit class AccountRefMutableBuilder[Self <: AccountRef] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountRef(value: SchemaAccountRef): Self = StObject.set(x, "accountRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountRefUndefined: Self = StObject.set(x, "accountRef", js.undefined)
    
    @scala.inline
    def setProfileRef(value: SchemaProfileRef): Self = StObject.set(x, "profileRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfileRefUndefined: Self = StObject.set(x, "profileRef", js.undefined)
    
    @scala.inline
    def setWebPropertyRef(value: SchemaWebPropertyRef): Self = StObject.set(x, "webPropertyRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebPropertyRefUndefined: Self = StObject.set(x, "webPropertyRef", js.undefined)
  }
}
