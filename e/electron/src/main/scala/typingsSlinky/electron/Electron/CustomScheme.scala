package typingsSlinky.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomScheme extends StObject {
  
  // Docs: https://electronjs.org/docs/api/structures/custom-scheme
  var privileges: js.UndefOr[Privileges] = js.native
  
  /**
    * Custom schemes to be registered with options.
    */
  var scheme: String = js.native
}
object CustomScheme {
  
  @scala.inline
  def apply(scheme: String): CustomScheme = {
    val __obj = js.Dynamic.literal(scheme = scheme.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomScheme]
  }
  
  @scala.inline
  implicit class CustomSchemeMutableBuilder[Self <: CustomScheme] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPrivileges(value: Privileges): Self = StObject.set(x, "privileges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivilegesUndefined: Self = StObject.set(x, "privileges", js.undefined)
    
    @scala.inline
    def setScheme(value: String): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
  }
}
