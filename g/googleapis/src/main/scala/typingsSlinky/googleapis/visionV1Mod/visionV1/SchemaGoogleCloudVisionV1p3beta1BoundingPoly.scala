package typingsSlinky.googleapis.visionV1Mod.visionV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A bounding polygon for the detected image annotation.
  */
@js.native
trait SchemaGoogleCloudVisionV1p3beta1BoundingPoly extends js.Object {
  /**
    * The bounding polygon normalized vertices.
    */
  var normalizedVertices: js.UndefOr[js.Array[SchemaGoogleCloudVisionV1p3beta1NormalizedVertex]] = js.native
  /**
    * The bounding polygon vertices.
    */
  var vertices: js.UndefOr[js.Array[SchemaGoogleCloudVisionV1p3beta1Vertex]] = js.native
}

object SchemaGoogleCloudVisionV1p3beta1BoundingPoly {
  @scala.inline
  def apply(): SchemaGoogleCloudVisionV1p3beta1BoundingPoly = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p3beta1BoundingPoly]
  }
  @scala.inline
  implicit class SchemaGoogleCloudVisionV1p3beta1BoundingPolyOps[Self <: SchemaGoogleCloudVisionV1p3beta1BoundingPoly] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNormalizedVertices(value: js.Array[SchemaGoogleCloudVisionV1p3beta1NormalizedVertex]): Self = {
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
    def withVertices(value: js.Array[SchemaGoogleCloudVisionV1p3beta1Vertex]): Self = {
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

