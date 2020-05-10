package typingsSlinky.gapiDrive.gapi.client.drive

import typingsSlinky.gapiDrive.gapiDriveStrings.driveNumbersignparentReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParentResource extends js.Object {
  var id: String = js.native
  var isRoot: Boolean = js.native
  var kind: driveNumbersignparentReference = js.native
  var parentLink: String = js.native
  var selfLink: String = js.native
}

object ParentResource {
  @scala.inline
  def apply(
    id: String,
    isRoot: Boolean,
    kind: driveNumbersignparentReference,
    parentLink: String,
    selfLink: String
  ): ParentResource = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], isRoot = isRoot.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], parentLink = parentLink.asInstanceOf[js.Any], selfLink = selfLink.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParentResource]
  }
  @scala.inline
  implicit class ParentResourceOps[Self <: ParentResource] (val x: Self) extends AnyVal {
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
    def withIsRoot(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRoot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKind(value: driveNumbersignparentReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParentLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelfLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selfLink")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

