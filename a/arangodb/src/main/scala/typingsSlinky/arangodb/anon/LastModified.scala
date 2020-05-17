package typingsSlinky.arangodb.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LastModified extends js.Object {
  var lastModified: Boolean = js.native
}

object LastModified {
  @scala.inline
  def apply(lastModified: Boolean): LastModified = {
    val __obj = js.Dynamic.literal(lastModified = lastModified.asInstanceOf[js.Any])
    __obj.asInstanceOf[LastModified]
  }
  @scala.inline
  implicit class LastModifiedOps[Self <: LastModified] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLastModified(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastModified")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

