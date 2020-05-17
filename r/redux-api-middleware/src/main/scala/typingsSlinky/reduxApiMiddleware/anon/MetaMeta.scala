package typingsSlinky.reduxApiMiddleware.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MetaMeta[Meta] extends js.Object {
  var meta: Meta = js.native
}

object MetaMeta {
  @scala.inline
  def apply[Meta](meta: Meta): MetaMeta[Meta] = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetaMeta[Meta]]
  }
  @scala.inline
  implicit class MetaMetaOps[Self[meta] <: MetaMeta[meta], Meta] (val x: Self[Meta]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Meta] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Meta]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[Meta] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[Meta] with Other]
    @scala.inline
    def withMeta(value: Meta): Self[Meta] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meta")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

