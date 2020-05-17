package typingsSlinky.googleCloudPubsub.protosMod.google.api

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a ResourceReference. */
@js.native
trait IResourceReference extends js.Object {
  /** ResourceReference childType */
  var childType: js.UndefOr[String | Null] = js.native
  /** ResourceReference type */
  var `type`: js.UndefOr[String | Null] = js.native
}

object IResourceReference {
  @scala.inline
  def apply(): IResourceReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IResourceReference]
  }
  @scala.inline
  implicit class IResourceReferenceOps[Self <: IResourceReference] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childType")(js.undefined)
        ret
    }
    @scala.inline
    def withChildTypeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childType")(null)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withTypeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(null)
        ret
    }
  }
  
}

