package typingsSlinky.ipp.mod

import typingsSlinky.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PrintJobRequest extends StObject {
  
  var data: Buffer = js.native
  
  var `job-attributes-tag`: js.UndefOr[JobTemplateAttributes] = js.native
  
  var `operation-attributes-tag`: typingsSlinky.ipp.anon.Compression = js.native
}
object PrintJobRequest {
  
  @scala.inline
  def apply(data: Buffer, `operation-attributes-tag`: typingsSlinky.ipp.anon.Compression): PrintJobRequest = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.updateDynamic("operation-attributes-tag")(`operation-attributes-tag`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrintJobRequest]
  }
  
  @scala.inline
  implicit class PrintJobRequestMutableBuilder[Self <: PrintJobRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: Buffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setJob-attributes-tag`(value: JobTemplateAttributes): Self = StObject.set(x, "job-attributes-tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setJob-attributes-tagUndefined`: Self = StObject.set(x, "job-attributes-tag", js.undefined)
    
    @scala.inline
    def `setOperation-attributes-tag`(value: typingsSlinky.ipp.anon.Compression): Self = StObject.set(x, "operation-attributes-tag", value.asInstanceOf[js.Any])
  }
}
