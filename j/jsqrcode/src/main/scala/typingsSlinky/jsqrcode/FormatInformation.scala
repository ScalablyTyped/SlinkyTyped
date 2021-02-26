package typingsSlinky.jsqrcode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FormatInformation extends StObject {
  
  val DataMask: Double = js.native
  
  def Equals(other: FormatInformation): Boolean = js.native
  
  val ErrorCorrectionLevel: typingsSlinky.jsqrcode.ErrorCorrectionLevel = js.native
  
  def GetHashCode(): Double = js.native
  
  var dataMask: Double = js.native
  
  var errorCorrectionLevel: typingsSlinky.jsqrcode.ErrorCorrectionLevel = js.native
}
object FormatInformation {
  
  @scala.inline
  def apply(
    DataMask: Double,
    Equals: FormatInformation => Boolean,
    ErrorCorrectionLevel: ErrorCorrectionLevel,
    GetHashCode: () => Double,
    dataMask: Double,
    errorCorrectionLevel: ErrorCorrectionLevel
  ): FormatInformation = {
    val __obj = js.Dynamic.literal(DataMask = DataMask.asInstanceOf[js.Any], Equals = js.Any.fromFunction1(Equals), ErrorCorrectionLevel = ErrorCorrectionLevel.asInstanceOf[js.Any], GetHashCode = js.Any.fromFunction0(GetHashCode), dataMask = dataMask.asInstanceOf[js.Any], errorCorrectionLevel = errorCorrectionLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormatInformation]
  }
  
  @scala.inline
  implicit class FormatInformationMutableBuilder[Self <: FormatInformation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataMask(value: Double): Self = StObject.set(x, "DataMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEquals(value: FormatInformation => Boolean): Self = StObject.set(x, "Equals", js.Any.fromFunction1(value))
    
    @scala.inline
    def setErrorCorrectionLevel(value: ErrorCorrectionLevel): Self = StObject.set(x, "ErrorCorrectionLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetHashCode(value: () => Double): Self = StObject.set(x, "GetHashCode", js.Any.fromFunction0(value))
  }
}
