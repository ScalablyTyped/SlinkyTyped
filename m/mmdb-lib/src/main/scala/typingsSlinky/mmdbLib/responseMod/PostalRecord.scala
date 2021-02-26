package typingsSlinky.mmdbLib.responseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PostalRecord extends StObject {
  
  val code: String = js.native
  
  val confidence: js.UndefOr[Double] = js.native
}
object PostalRecord {
  
  @scala.inline
  def apply(code: String): PostalRecord = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostalRecord]
  }
  
  @scala.inline
  implicit class PostalRecordMutableBuilder[Self <: PostalRecord] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfidence(value: Double): Self = StObject.set(x, "confidence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfidenceUndefined: Self = StObject.set(x, "confidence", js.undefined)
  }
}
