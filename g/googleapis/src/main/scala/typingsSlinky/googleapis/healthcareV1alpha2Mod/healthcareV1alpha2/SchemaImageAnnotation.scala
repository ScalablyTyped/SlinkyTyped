package typingsSlinky.googleapis.healthcareV1alpha2Mod.healthcareV1alpha2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Image annotation.
  */
@js.native
trait SchemaImageAnnotation extends js.Object {
  /**
    * The list of polygons outlining the sensitive regions in the image.
    */
  var boundingPolys: js.UndefOr[js.Array[SchemaBoundingPoly]] = js.native
}

object SchemaImageAnnotation {
  @scala.inline
  def apply(): SchemaImageAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaImageAnnotation]
  }
  @scala.inline
  implicit class SchemaImageAnnotationOps[Self <: SchemaImageAnnotation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBoundingPolys(value: js.Array[SchemaBoundingPoly]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boundingPolys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBoundingPolys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boundingPolys")(js.undefined)
        ret
    }
  }
  
}

