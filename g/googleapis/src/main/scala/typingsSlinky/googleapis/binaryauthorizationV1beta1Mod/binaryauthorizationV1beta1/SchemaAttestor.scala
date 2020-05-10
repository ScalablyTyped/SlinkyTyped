package typingsSlinky.googleapis.binaryauthorizationV1beta1Mod.binaryauthorizationV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An attestor that attests to container image artifacts. An existing attestor
  * cannot be modified except where indicated.
  */
@js.native
trait SchemaAttestor extends js.Object {
  /**
    * Optional. A descriptive comment.  This field may be updated. The field
    * may be displayed in chooser dialogs.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Required. The resource name, in the format: `projects/x/attestors/x. This
    * field may not be updated.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Output only. Time when the attestor was last updated.
    */
  var updateTime: js.UndefOr[String] = js.native
  /**
    * A Drydock ATTESTATION_AUTHORITY Note, created by the user.
    */
  var userOwnedDrydockNote: js.UndefOr[SchemaUserOwnedDrydockNote] = js.native
}

object SchemaAttestor {
  @scala.inline
  def apply(): SchemaAttestor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAttestor]
  }
  @scala.inline
  implicit class SchemaAttestorOps[Self <: SchemaAttestor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withUserOwnedDrydockNote(value: SchemaUserOwnedDrydockNote): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userOwnedDrydockNote")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserOwnedDrydockNote: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userOwnedDrydockNote")(js.undefined)
        ret
    }
  }
  
}

