package typingsSlinky.awsSdk.iotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DependencyRevision extends js.Object {
  /**
    * The ID of the workflow or system.
    */
  var id: js.UndefOr[Urn] = js.native
  /**
    * The revision number of the workflow or system.
    */
  var revisionNumber: js.UndefOr[Version] = js.native
}

object DependencyRevision {
  @scala.inline
  def apply(): DependencyRevision = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DependencyRevision]
  }
  @scala.inline
  implicit class DependencyRevisionOps[Self <: DependencyRevision] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: Urn): Self = {
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
    @scala.inline
    def withRevisionNumber(value: Version): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revisionNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRevisionNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revisionNumber")(js.undefined)
        ret
    }
  }
  
}

