package typingsSlinky.mangopay2NodejsSdk.anon

import typingsSlinky.mangopay2NodejsSdk.typesMod.DeepPartial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/types.DeepPartial<{  timeout :number}> */
@js.native
trait DeepPartialtimeoutnumber extends StObject {
  
  var timeout: js.UndefOr[DeepPartial[Double]] = js.native
}
object DeepPartialtimeoutnumber {
  
  @scala.inline
  def apply(): DeepPartialtimeoutnumber = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeepPartialtimeoutnumber]
  }
  
  @scala.inline
  implicit class DeepPartialtimeoutnumberMutableBuilder[Self <: DeepPartialtimeoutnumber] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTimeout(value: DeepPartial[Double]): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
