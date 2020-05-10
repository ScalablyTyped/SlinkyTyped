package typingsSlinky.mapsjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonGeometryFieldName extends js.Object {
  var bleedRatio: js.UndefOr[Double] = js.native
  var geometryFieldName: String = js.native
  var valueFieldNames: js.Array[String] = js.native
}

object AnonGeometryFieldName {
  @scala.inline
  def apply(geometryFieldName: String, valueFieldNames: js.Array[String]): AnonGeometryFieldName = {
    val __obj = js.Dynamic.literal(geometryFieldName = geometryFieldName.asInstanceOf[js.Any], valueFieldNames = valueFieldNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonGeometryFieldName]
  }
  @scala.inline
  implicit class AnonGeometryFieldNameOps[Self <: AnonGeometryFieldName] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGeometryFieldName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geometryFieldName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValueFieldNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueFieldNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBleedRatio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bleedRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBleedRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bleedRatio")(js.undefined)
        ret
    }
  }
  
}

