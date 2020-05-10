package typingsSlinky.mapboxMapboxSdk.matrixMod

import typingsSlinky.mapboxMapboxSdk.directionsMod.DirectionsAnnotation
import typingsSlinky.mapboxMapboxSdk.directionsMod.DirectionsProfile
import typingsSlinky.mapboxMapboxSdk.mapMatchingMod.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MatrixRequest extends js.Object {
  var annotations: js.UndefOr[DirectionsAnnotation] = js.native
  var destinations: js.UndefOr[js.Array[Double]] = js.native
  var points: js.Array[Point] = js.native
  var profile: js.UndefOr[DirectionsProfile] = js.native
  var sources: js.UndefOr[js.Array[Double]] = js.native
}

object MatrixRequest {
  @scala.inline
  def apply(points: js.Array[Point]): MatrixRequest = {
    val __obj = js.Dynamic.literal(points = points.asInstanceOf[js.Any])
    __obj.asInstanceOf[MatrixRequest]
  }
  @scala.inline
  implicit class MatrixRequestOps[Self <: MatrixRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPoints(value: js.Array[Point]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("points")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnnotations(value: DirectionsAnnotation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnnotations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotations")(js.undefined)
        ret
    }
    @scala.inline
    def withDestinations(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestinations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinations")(js.undefined)
        ret
    }
    @scala.inline
    def withProfile(value: DirectionsProfile): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProfile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profile")(js.undefined)
        ret
    }
    @scala.inline
    def withSources(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSources: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sources")(js.undefined)
        ret
    }
  }
  
}

