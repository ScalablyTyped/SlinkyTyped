package typingsSlinky.asn1js.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JsonLocalBaseBlock extends StObject {
  
  var blockLength: Double = js.native
  
  var blockName: String = js.native
  
  var error: String = js.native
  
  var valueBeforeDecode: js.typedarray.ArrayBuffer = js.native
  
  var warnings: js.Array[String] = js.native
}
object JsonLocalBaseBlock {
  
  @scala.inline
  def apply(
    blockLength: Double,
    blockName: String,
    error: String,
    valueBeforeDecode: js.typedarray.ArrayBuffer,
    warnings: js.Array[String]
  ): JsonLocalBaseBlock = {
    val __obj = js.Dynamic.literal(blockLength = blockLength.asInstanceOf[js.Any], blockName = blockName.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], valueBeforeDecode = valueBeforeDecode.asInstanceOf[js.Any], warnings = warnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsonLocalBaseBlock]
  }
  
  @scala.inline
  implicit class JsonLocalBaseBlockMutableBuilder[Self <: JsonLocalBaseBlock] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlockLength(value: Double): Self = StObject.set(x, "blockLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockName(value: String): Self = StObject.set(x, "blockName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueBeforeDecode(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "valueBeforeDecode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarnings(value: js.Array[String]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarningsVarargs(value: String*): Self = StObject.set(x, "warnings", js.Array(value :_*))
  }
}
