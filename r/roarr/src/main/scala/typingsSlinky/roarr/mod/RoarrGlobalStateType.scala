package typingsSlinky.roarr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RoarrGlobalStateType extends WriterType {
  var sequence: Double = js.native
  var versions: js.Array[String] = js.native
}

object RoarrGlobalStateType {
  @scala.inline
  def apply(sequence: Double, versions: js.Array[String], write: String => Unit): RoarrGlobalStateType = {
    val __obj = js.Dynamic.literal(sequence = sequence.asInstanceOf[js.Any], versions = versions.asInstanceOf[js.Any], write = js.Any.fromFunction1(write))
    __obj.asInstanceOf[RoarrGlobalStateType]
  }
  @scala.inline
  implicit class RoarrGlobalStateTypeOps[Self <: RoarrGlobalStateType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSequence(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sequence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersions(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versions")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

