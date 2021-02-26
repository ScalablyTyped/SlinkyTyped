package typingsSlinky.googleapis.classroomV1Mod.classroomV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A set of materials that appears on the &quot;About&quot; page of the
  * course. These materials might include a syllabus, schedule, or other
  * background information relating to the course as a whole.
  */
@js.native
trait SchemaCourseMaterialSet extends StObject {
  
  /**
    * Materials attached to this set.
    */
  var materials: js.UndefOr[js.Array[SchemaCourseMaterial]] = js.native
  
  /**
    * Title for this set.
    */
  var title: js.UndefOr[String] = js.native
}
object SchemaCourseMaterialSet {
  
  @scala.inline
  def apply(): SchemaCourseMaterialSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCourseMaterialSet]
  }
  
  @scala.inline
  implicit class SchemaCourseMaterialSetMutableBuilder[Self <: SchemaCourseMaterialSet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaterials(value: js.Array[SchemaCourseMaterial]): Self = StObject.set(x, "materials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaterialsUndefined: Self = StObject.set(x, "materials", js.undefined)
    
    @scala.inline
    def setMaterialsVarargs(value: SchemaCourseMaterial*): Self = StObject.set(x, "materials", js.Array(value :_*))
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
