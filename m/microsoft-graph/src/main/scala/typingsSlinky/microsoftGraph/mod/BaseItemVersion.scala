package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseItemVersion extends Entity {
  // Identity of the user which last modified the version. Read-only.
  var lastModifiedBy: js.UndefOr[IdentitySet] = js.native
  // Date and time the version was last modified. Read-only.
  var lastModifiedDateTime: js.UndefOr[String] = js.native
  // Indicates the publication status of this particular version. Read-only.
  var publication: js.UndefOr[PublicationFacet] = js.native
}

object BaseItemVersion {
  @scala.inline
  def apply(): BaseItemVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseItemVersion]
  }
  @scala.inline
  implicit class BaseItemVersionOps[Self <: BaseItemVersion] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLastModifiedBy(value: IdentitySet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastModifiedBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastModifiedBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastModifiedBy")(js.undefined)
        ret
    }
    @scala.inline
    def withLastModifiedDateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastModifiedDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastModifiedDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastModifiedDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withPublication(value: PublicationFacet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publication")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublication: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publication")(js.undefined)
        ret
    }
  }
  
}

