package typingsSlinky.awsSdk.translateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TerminologyData extends StObject {
  
  /**
    * The file containing the custom terminology data. Your version of the AWS SDK performs a Base64-encoding on this field before sending a request to the AWS service. Users of the SDK should not perform Base64-encoding themselves.
    */
  var File: TerminologyFile = js.native
  
  /**
    * The data format of the custom terminology. Either CSV or TMX.
    */
  var Format: TerminologyDataFormat = js.native
}
object TerminologyData {
  
  @scala.inline
  def apply(File: TerminologyFile, Format: TerminologyDataFormat): TerminologyData = {
    val __obj = js.Dynamic.literal(File = File.asInstanceOf[js.Any], Format = Format.asInstanceOf[js.Any])
    __obj.asInstanceOf[TerminologyData]
  }
  
  @scala.inline
  implicit class TerminologyDataMutableBuilder[Self <: TerminologyData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFile(value: TerminologyFile): Self = StObject.set(x, "File", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileUint8Array(value: js.typedarray.Uint8Array): Self = StObject.set(x, "File", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormat(value: TerminologyDataFormat): Self = StObject.set(x, "Format", value.asInstanceOf[js.Any])
  }
}
