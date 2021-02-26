package typingsSlinky.awsSdk.storagegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateTapeWithBarcodeOutput extends StObject {
  
  /**
    * A unique Amazon Resource Name (ARN) that represents the virtual tape that was created.
    */
  var TapeARN: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.TapeARN] = js.native
}
object CreateTapeWithBarcodeOutput {
  
  @scala.inline
  def apply(): CreateTapeWithBarcodeOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateTapeWithBarcodeOutput]
  }
  
  @scala.inline
  implicit class CreateTapeWithBarcodeOutputMutableBuilder[Self <: CreateTapeWithBarcodeOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTapeARN(value: TapeARN): Self = StObject.set(x, "TapeARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTapeARNUndefined: Self = StObject.set(x, "TapeARN", js.undefined)
  }
}
