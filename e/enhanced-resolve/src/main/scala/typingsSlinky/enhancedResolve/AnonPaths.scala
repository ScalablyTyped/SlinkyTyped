package typingsSlinky.enhancedResolve

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPaths extends js.Object {
  var paths: js.Array[String] = js.native
  var seqments: js.Array[String] = js.native
}

object AnonPaths {
  @scala.inline
  def apply(paths: js.Array[String], seqments: js.Array[String]): AnonPaths = {
    val __obj = js.Dynamic.literal(paths = paths.asInstanceOf[js.Any], seqments = seqments.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPaths]
  }
  @scala.inline
  implicit class AnonPathsOps[Self <: AnonPaths] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPaths(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSeqments(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seqments")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

