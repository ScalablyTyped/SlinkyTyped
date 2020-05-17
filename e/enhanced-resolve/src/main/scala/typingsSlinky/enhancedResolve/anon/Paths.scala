package typingsSlinky.enhancedResolve.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Paths extends js.Object {
  var paths: js.Array[String] = js.native
  var seqments: js.Array[String] = js.native
}

object Paths {
  @scala.inline
  def apply(paths: js.Array[String], seqments: js.Array[String]): Paths = {
    val __obj = js.Dynamic.literal(paths = paths.asInstanceOf[js.Any], seqments = seqments.asInstanceOf[js.Any])
    __obj.asInstanceOf[Paths]
  }
  @scala.inline
  implicit class PathsOps[Self <: Paths] (val x: Self) extends AnyVal {
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

