package typingsSlinky.nightwatch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Revision extends js.Object {
  var revision: String = js.native
  var time: String = js.native
  var version: String = js.native
}

object Revision {
  @scala.inline
  def apply(revision: String, time: String, version: String): Revision = {
    val __obj = js.Dynamic.literal(revision = revision.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Revision]
  }
  @scala.inline
  implicit class RevisionOps[Self <: Revision] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRevision(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revision")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

