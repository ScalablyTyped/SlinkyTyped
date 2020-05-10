package typingsSlinky.mapboxMapboxSdk.matrixMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MatrixResponse extends js.Object {
  var code: String = js.native
  var destinations: js.Array[Destination] = js.native
  var distances: js.UndefOr[js.Array[js.Array[Double]]] = js.native
  var durations: js.UndefOr[js.Array[js.Array[Double]]] = js.native
  var sources: js.Array[Destination] = js.native
}

object MatrixResponse {
  @scala.inline
  def apply(code: String, destinations: js.Array[Destination], sources: js.Array[Destination]): MatrixResponse = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], destinations = destinations.asInstanceOf[js.Any], sources = sources.asInstanceOf[js.Any])
    __obj.asInstanceOf[MatrixResponse]
  }
  @scala.inline
  implicit class MatrixResponseOps[Self <: MatrixResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDestinations(value: js.Array[Destination]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSources(value: js.Array[Destination]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDistances(value: js.Array[js.Array[Double]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distances")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDistances: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distances")(js.undefined)
        ret
    }
    @scala.inline
    def withDurations(value: js.Array[js.Array[Double]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("durations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDurations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("durations")(js.undefined)
        ret
    }
  }
  
}

