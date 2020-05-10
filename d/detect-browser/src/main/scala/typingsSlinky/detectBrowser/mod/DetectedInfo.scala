package typingsSlinky.detectBrowser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DetectedInfo[N /* <: String */, O, V] extends js.Object {
  val name: N = js.native
  val os: O = js.native
  val version: V = js.native
}

object DetectedInfo {
  @scala.inline
  def apply[N, O, V](name: N, os: O, version: V): DetectedInfo[N, O, V] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], os = os.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetectedInfo[N, O, V]]
  }
  @scala.inline
  implicit class DetectedInfoOps[Self[n, o, v] <: DetectedInfo[n, o, v], N, O, V] (val x: Self[N, O, V]) extends AnyVal {
    @scala.inline
    def duplicate: Self[N, O, V] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[N, O, V]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[N, O, V]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[N, O, V]) with Other]
    @scala.inline
    def withName(value: N): Self[N, O, V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOs(value: O): Self[N, O, V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("os")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: V): Self[N, O, V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

