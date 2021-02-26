package typingsSlinky.ionicCliFramework.definitionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NamespaceLocateOptions extends StObject {
  
  var useAliases: js.UndefOr[Boolean] = js.native
}
object NamespaceLocateOptions {
  
  @scala.inline
  def apply(): NamespaceLocateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NamespaceLocateOptions]
  }
  
  @scala.inline
  implicit class NamespaceLocateOptionsMutableBuilder[Self <: NamespaceLocateOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUseAliases(value: Boolean): Self = StObject.set(x, "useAliases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseAliasesUndefined: Self = StObject.set(x, "useAliases", js.undefined)
  }
}
