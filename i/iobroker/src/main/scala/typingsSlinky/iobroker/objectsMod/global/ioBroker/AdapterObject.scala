package typingsSlinky.iobroker.objectsMod.global.ioBroker

import typingsSlinky.iobroker.iobrokerStrings.adapter
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdapterObject
  extends BaseObject
     with AnyObject {
  
  @JSName("common")
  var common_AdapterObject: AdapterCommon = js.native
  
  /** Like protectedNative, but the properties are also encrypted and decrypted automatically */
  var encryptedNative: js.UndefOr[js.Array[String]] = js.native
  
  /** An array of `native` properties which cannot be accessed from outside the defining adapter */
  var protectedNative: js.UndefOr[js.Array[String]] = js.native
  
  @JSName("type")
  var type_AdapterObject: adapter = js.native
}
object AdapterObject {
  
  @scala.inline
  def apply(_id: String, common: AdapterCommon, native: Record[String, _], `type`: adapter): AdapterObject = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], common = common.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdapterObject]
  }
  
  @scala.inline
  implicit class AdapterObjectMutableBuilder[Self <: AdapterObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommon(value: AdapterCommon): Self = StObject.set(x, "common", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptedNative(value: js.Array[String]): Self = StObject.set(x, "encryptedNative", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptedNativeUndefined: Self = StObject.set(x, "encryptedNative", js.undefined)
    
    @scala.inline
    def setEncryptedNativeVarargs(value: String*): Self = StObject.set(x, "encryptedNative", js.Array(value :_*))
    
    @scala.inline
    def setProtectedNative(value: js.Array[String]): Self = StObject.set(x, "protectedNative", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtectedNativeUndefined: Self = StObject.set(x, "protectedNative", js.undefined)
    
    @scala.inline
    def setProtectedNativeVarargs(value: String*): Self = StObject.set(x, "protectedNative", js.Array(value :_*))
    
    @scala.inline
    def setType(value: adapter): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
