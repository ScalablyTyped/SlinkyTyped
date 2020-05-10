package typingsSlinky.pendoIoBrowser.pendo

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  id ? :string} & pendo-io-browser.pendo.Metadata */
@js.native
trait IdentityMetadata extends /* key */ StringDictionary[String | Double | Boolean] {
  var id: js.UndefOr[String] = js.native
}

object IdentityMetadata {
  @scala.inline
  def apply(): IdentityMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdentityMetadata]
  }
  @scala.inline
  implicit class IdentityMetadataOps[Self <: IdentityMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
  }
  
}

