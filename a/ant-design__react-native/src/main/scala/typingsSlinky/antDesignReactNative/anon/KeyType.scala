package typingsSlinky.antDesignReactNative.anon

import slinky.core.facade.ReactElement
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.update
import typingsSlinky.antDesignReactNative.portalHostMod.Operation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyType extends Operation {
  
  var children: ReactElement = js.native
  
  var key: Double = js.native
  
  var `type`: update = js.native
}
object KeyType {
  
  @scala.inline
  def apply(key: Double, `type`: update): KeyType = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyType]
  }
  
  @scala.inline
  implicit class KeyTypeMutableBuilder[Self <: KeyType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setKey(value: Double): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: update): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
