package typingsSlinky.octokitTypes.endpointsMod

import typingsSlinky.octokitTypes.octokitTypesStrings.failure
import typingsSlinky.octokitTypes.octokitTypesStrings.notice
import typingsSlinky.octokitTypes.octokitTypesStrings.warning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChecksCreateParamsOutputAnnotations extends StObject {
  
  var annotation_level: notice | warning | failure = js.native
  
  var end_column: js.UndefOr[Double] = js.native
  
  var end_line: Double = js.native
  
  var message: String = js.native
  
  var path: String = js.native
  
  var raw_details: js.UndefOr[String] = js.native
  
  var start_column: js.UndefOr[Double] = js.native
  
  var start_line: Double = js.native
  
  var title: js.UndefOr[String] = js.native
}
object ChecksCreateParamsOutputAnnotations {
  
  @scala.inline
  def apply(
    annotation_level: notice | warning | failure,
    end_line: Double,
    message: String,
    path: String,
    start_line: Double
  ): ChecksCreateParamsOutputAnnotations = {
    val __obj = js.Dynamic.literal(annotation_level = annotation_level.asInstanceOf[js.Any], end_line = end_line.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], start_line = start_line.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChecksCreateParamsOutputAnnotations]
  }
  
  @scala.inline
  implicit class ChecksCreateParamsOutputAnnotationsMutableBuilder[Self <: ChecksCreateParamsOutputAnnotations] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnnotation_level(value: notice | warning | failure): Self = StObject.set(x, "annotation_level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnd_column(value: Double): Self = StObject.set(x, "end_column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnd_columnUndefined: Self = StObject.set(x, "end_column", js.undefined)
    
    @scala.inline
    def setEnd_line(value: Double): Self = StObject.set(x, "end_line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRaw_details(value: String): Self = StObject.set(x, "raw_details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRaw_detailsUndefined: Self = StObject.set(x, "raw_details", js.undefined)
    
    @scala.inline
    def setStart_column(value: Double): Self = StObject.set(x, "start_column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart_columnUndefined: Self = StObject.set(x, "start_column", js.undefined)
    
    @scala.inline
    def setStart_line(value: Double): Self = StObject.set(x, "start_line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
