package typingsSlinky.rcTree.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Key extends StObject {
  
  var key: typingsSlinky.rcTree.interfaceMod.Key = js.native
}
object Key {
  
  @scala.inline
  def apply(key: typingsSlinky.rcTree.interfaceMod.Key): Key = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[Key]
  }
  
  @scala.inline
  implicit class KeyMutableBuilder[Self <: Key] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: typingsSlinky.rcTree.interfaceMod.Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
  }
}
