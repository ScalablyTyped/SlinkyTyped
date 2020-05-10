package typingsSlinky.falcorJsonGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An envelope that wraps a {@link JSONGraph} fragment.
  **/
@js.native
trait JSONGraphEnvelope extends js.Object {
  var invalidate: js.UndefOr[js.Array[PathSet]] = js.native
  var jsonGraph: JSONGraph = js.native
  var paths: js.UndefOr[js.Array[PathSet]] = js.native
}

object JSONGraphEnvelope {
  @scala.inline
  def apply(jsonGraph: JSONGraph): JSONGraphEnvelope = {
    val __obj = js.Dynamic.literal(jsonGraph = jsonGraph.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSONGraphEnvelope]
  }
  @scala.inline
  implicit class JSONGraphEnvelopeOps[Self <: JSONGraphEnvelope] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withJsonGraph(value: JSONGraph): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsonGraph")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInvalidate(value: js.Array[PathSet]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalidate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvalidate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalidate")(js.undefined)
        ret
    }
    @scala.inline
    def withPaths(value: js.Array[PathSet]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaths: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paths")(js.undefined)
        ret
    }
  }
  
}

