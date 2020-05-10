package typingsSlinky.documentdbServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Options associated with a replace operation. */
@js.native
trait IReplaceOptions extends js.Object {
  /**
  	 * The entity tag associated with the resource.
  	 * This is matched with the persisted resource before deletion.
  	 */
  var etag: js.UndefOr[String] = js.native
  /** Specifies indexing directives. */
  var indexAction: js.UndefOr[String] = js.native
}

object IReplaceOptions {
  @scala.inline
  def apply(): IReplaceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IReplaceOptions]
  }
  @scala.inline
  implicit class IReplaceOptionsOps[Self <: IReplaceOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEtag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("etag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEtag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("etag")(js.undefined)
        ret
    }
    @scala.inline
    def withIndexAction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndexAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexAction")(js.undefined)
        ret
    }
  }
  
}

