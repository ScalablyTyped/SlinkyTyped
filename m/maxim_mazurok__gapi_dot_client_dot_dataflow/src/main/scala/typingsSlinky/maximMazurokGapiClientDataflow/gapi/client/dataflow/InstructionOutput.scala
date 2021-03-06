package typingsSlinky.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstructionOutput extends StObject {
  
  /** The codec to use to encode data being written via this output. */
  var codec: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: any}
    */ typingsSlinky.maximMazurokGapiClientDataflow.maximMazurokGapiClientDataflowStrings.InstructionOutput with TopLevel[js.Any]
  ] = js.native
  
  /** The user-provided name of this output. */
  var name: js.UndefOr[String] = js.native
  
  /** For system-generated byte and mean byte metrics, certain instructions should only report the key size. */
  var onlyCountKeyBytes: js.UndefOr[Boolean] = js.native
  
  /** For system-generated byte and mean byte metrics, certain instructions should only report the value size. */
  var onlyCountValueBytes: js.UndefOr[Boolean] = js.native
  
  /** System-defined name for this output in the original workflow graph. Outputs that do not contribute to an original instruction do not set this. */
  var originalName: js.UndefOr[String] = js.native
  
  /** System-defined name of this output. Unique across the workflow. */
  var systemName: js.UndefOr[String] = js.native
}
object InstructionOutput {
  
  @scala.inline
  def apply(): InstructionOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstructionOutput]
  }
  
  @scala.inline
  implicit class InstructionOutputMutableBuilder[Self <: InstructionOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCodec(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typingsSlinky.maximMazurokGapiClientDataflow.maximMazurokGapiClientDataflowStrings.InstructionOutput with TopLevel[js.Any]
    ): Self = StObject.set(x, "codec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodecUndefined: Self = StObject.set(x, "codec", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOnlyCountKeyBytes(value: Boolean): Self = StObject.set(x, "onlyCountKeyBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnlyCountKeyBytesUndefined: Self = StObject.set(x, "onlyCountKeyBytes", js.undefined)
    
    @scala.inline
    def setOnlyCountValueBytes(value: Boolean): Self = StObject.set(x, "onlyCountValueBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnlyCountValueBytesUndefined: Self = StObject.set(x, "onlyCountValueBytes", js.undefined)
    
    @scala.inline
    def setOriginalName(value: String): Self = StObject.set(x, "originalName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalNameUndefined: Self = StObject.set(x, "originalName", js.undefined)
    
    @scala.inline
    def setSystemName(value: String): Self = StObject.set(x, "systemName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystemNameUndefined: Self = StObject.set(x, "systemName", js.undefined)
  }
}
