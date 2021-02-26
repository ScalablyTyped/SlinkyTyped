package typingsSlinky.postmanCollection.anon

import typingsSlinky.postmanCollection.mod.PropertyBaseDefinition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Info extends StObject {
  
  var info: PropertyBaseDefinition = js.native
}
object Info {
  
  @scala.inline
  def apply(info: PropertyBaseDefinition): Info = {
    val __obj = js.Dynamic.literal(info = info.asInstanceOf[js.Any])
    __obj.asInstanceOf[Info]
  }
  
  @scala.inline
  implicit class InfoMutableBuilder[Self <: Info] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInfo(value: PropertyBaseDefinition): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
  }
}
