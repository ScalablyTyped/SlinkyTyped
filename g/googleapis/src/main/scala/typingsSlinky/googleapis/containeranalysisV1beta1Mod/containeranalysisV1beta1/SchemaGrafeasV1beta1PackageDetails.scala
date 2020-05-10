package typingsSlinky.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Details of a package occurrence.
  */
@js.native
trait SchemaGrafeasV1beta1PackageDetails extends js.Object {
  /**
    * Required. Where the package was installed.
    */
  var installation: js.UndefOr[SchemaInstallation] = js.native
}

object SchemaGrafeasV1beta1PackageDetails {
  @scala.inline
  def apply(): SchemaGrafeasV1beta1PackageDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGrafeasV1beta1PackageDetails]
  }
  @scala.inline
  implicit class SchemaGrafeasV1beta1PackageDetailsOps[Self <: SchemaGrafeasV1beta1PackageDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInstallation(value: SchemaInstallation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("installation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstallation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("installation")(js.undefined)
        ret
    }
  }
  
}

