package typingsSlinky.gun.anon

import typingsSlinky.gun.gunBooleans.`false`
import typingsSlinky.gun.mod.Gun.ArrayAsRecord
import typingsSlinky.gun.mod.Gun.ChainReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Gun[DataType, ReferenceKey] extends StObject {
  
  var gun: ChainReference[DataType, ReferenceKey, `false`] = js.native
  
  var key: ReferenceKey = js.native
  
  var put: ArrayAsRecord[DataType] = js.native
}
object Gun {
  
  @scala.inline
  def apply[DataType, ReferenceKey](
    gun: ChainReference[DataType, ReferenceKey, `false`],
    key: ReferenceKey,
    put: ArrayAsRecord[DataType]
  ): Gun[DataType, ReferenceKey] = {
    val __obj = js.Dynamic.literal(gun = gun.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[Gun[DataType, ReferenceKey]]
  }
  
  @scala.inline
  implicit class GunMutableBuilder[Self <: Gun[_, _], DataType, ReferenceKey] (val x: Self with (Gun[DataType, ReferenceKey])) extends AnyVal {
    
    @scala.inline
    def setGun(value: ChainReference[DataType, ReferenceKey, `false`]): Self = StObject.set(x, "gun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: ReferenceKey): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPut(value: ArrayAsRecord[DataType]): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
