package typingsSlinky.googleapis.fusiontablesV1Mod.fusiontablesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a polygon object.
  */
@js.native
trait SchemaPolygon extends js.Object {
  /**
    * The coordinates that define the polygon.
    */
  var coordinates: js.UndefOr[js.Array[js.Array[js.Array[Double]]]] = js.native
  /**
    * Type: A polygon geometry.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaPolygon {
  @scala.inline
  def apply(): SchemaPolygon = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPolygon]
  }
  @scala.inline
  implicit class SchemaPolygonOps[Self <: SchemaPolygon] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCoordinates(value: js.Array[js.Array[js.Array[Double]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coordinates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCoordinates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coordinates")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

