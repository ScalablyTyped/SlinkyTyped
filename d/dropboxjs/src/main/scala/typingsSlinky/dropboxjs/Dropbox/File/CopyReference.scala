package typingsSlinky.dropboxjs.Dropbox.File

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CopyReference extends js.Object {
  var expiresAt: js.Date = js.native
  var tag: String = js.native
  def toJSON(): js.Object = js.native
}

object CopyReference {
  @scala.inline
  def apply(expiresAt: js.Date, tag: String, toJSON: () => js.Object): CopyReference = {
    val __obj = js.Dynamic.literal(expiresAt = expiresAt.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[CopyReference]
  }
  @scala.inline
  implicit class CopyReferenceOps[Self <: CopyReference] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExpiresAt(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expiresAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToJSON(value: () => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toJSON")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

