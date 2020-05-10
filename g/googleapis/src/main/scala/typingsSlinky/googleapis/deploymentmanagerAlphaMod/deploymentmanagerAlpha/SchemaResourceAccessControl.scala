package typingsSlinky.googleapis.deploymentmanagerAlphaMod.deploymentmanagerAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The access controls set on the resource.
  */
@js.native
trait SchemaResourceAccessControl extends js.Object {
  /**
    * The GCP IAM Policy to set on the resource.
    */
  var gcpIamPolicy: js.UndefOr[String] = js.native
}

object SchemaResourceAccessControl {
  @scala.inline
  def apply(): SchemaResourceAccessControl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResourceAccessControl]
  }
  @scala.inline
  implicit class SchemaResourceAccessControlOps[Self <: SchemaResourceAccessControl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGcpIamPolicy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gcpIamPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGcpIamPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gcpIamPolicy")(js.undefined)
        ret
    }
  }
  
}

