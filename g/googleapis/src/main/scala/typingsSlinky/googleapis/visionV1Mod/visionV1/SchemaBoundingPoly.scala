package typingsSlinky.googleapis.visionV1Mod.visionV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A bounding polygon for the detected image annotation.
  */
@js.native
trait SchemaBoundingPoly extends js.Object {
  /**
    * The bounding polygon normalized vertices.
    */
  var normalizedVertices: js.UndefOr[js.Array[SchemaNormalizedVertex]] = js.native
  /**
    * The bounding polygon vertices.
    */
  var vertices: js.UndefOr[js.Array[SchemaVertex]] = js.native
}

object SchemaBoundingPoly {
  @scala.inline
  def apply(): SchemaBoundingPoly = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBoundingPoly]
  }
  @scala.inline
  implicit class SchemaBoundingPolyOps[Self <: SchemaBoundingPoly] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNormalizedVertices(value: js.Array[SchemaNormalizedVertex]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalizedVertices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNormalizedVertices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalizedVertices")(js.undefined)
        ret
    }
    @scala.inline
    def withVertices(value: js.Array[SchemaVertex]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVertices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertices")(js.undefined)
        ret
    }
  }
  
}

