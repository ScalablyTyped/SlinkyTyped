package typingsSlinky.maximMazurokGapiClientServiceusage.gapi.client.serviceusage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Mixin extends StObject {
  
  /** The fully qualified name of the interface which is included. */
  var name: js.UndefOr[String] = js.native
  
  /** If non-empty specifies a path under which inherited HTTP paths are rooted. */
  var root: js.UndefOr[String] = js.native
}
object Mixin {
  
  @scala.inline
  def apply(): Mixin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Mixin]
  }
  
  @scala.inline
  implicit class MixinMutableBuilder[Self <: Mixin] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
