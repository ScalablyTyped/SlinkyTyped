package typingsSlinky.awsSdk.translateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TerminologyDataLocation extends js.Object {
  /**
    * The location of the custom terminology data.
    */
  var Location: String = js.native
  /**
    * The repository type for the custom terminology data.
    */
  var RepositoryType: String = js.native
}

object TerminologyDataLocation {
  @scala.inline
  def apply(Location: String, RepositoryType: String): TerminologyDataLocation = {
    val __obj = js.Dynamic.literal(Location = Location.asInstanceOf[js.Any], RepositoryType = RepositoryType.asInstanceOf[js.Any])
    __obj.asInstanceOf[TerminologyDataLocation]
  }
  @scala.inline
  implicit class TerminologyDataLocationOps[Self <: TerminologyDataLocation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLocation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRepositoryType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RepositoryType")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

