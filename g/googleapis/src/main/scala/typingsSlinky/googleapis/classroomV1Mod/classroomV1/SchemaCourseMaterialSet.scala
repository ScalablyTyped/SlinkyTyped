package typingsSlinky.googleapis.classroomV1Mod.classroomV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A set of materials that appears on the &quot;About&quot; page of the
  * course. These materials might include a syllabus, schedule, or other
  * background information relating to the course as a whole.
  */
@js.native
trait SchemaCourseMaterialSet extends js.Object {
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
  implicit class SchemaCourseMaterialSetOps[Self <: SchemaCourseMaterialSet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaterials(value: js.Array[SchemaCourseMaterial]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("materials")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaterials: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("materials")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
  }
  
}

