package typingsSlinky.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Identifies all occurrences of this vulnerability in the package for a
  * specific distro/location For example: glibc in cpe:/o:debian:debian_linux:8
  * for versions 2.1 - 2.2
  */
@js.native
trait SchemaDetail extends js.Object {
  /**
    * The name of the package where the vulnerability was found. This field can
    * be used as a filter in list requests.
    */
  @JSName("package")
  var _package: js.UndefOr[String] = js.native
  /**
    * The cpe_uri in [cpe format] (https://cpe.mitre.org/specification/) in
    * which the vulnerability manifests.  Examples include distro or storage
    * location for vulnerable jar. This field can be used as a filter in list
    * requests.
    */
  var cpeUri: js.UndefOr[String] = js.native
  /**
    * A vendor-specific description of this note.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The fix for this specific package version.
    */
  var fixedLocation: js.UndefOr[SchemaVulnerabilityLocation] = js.native
  /**
    * Whether this Detail is obsolete. Occurrences are expected not to point to
    * obsolete details.
    */
  var isObsolete: js.UndefOr[Boolean] = js.native
  /**
    * The max version of the package in which the vulnerability exists. This
    * field can be used as a filter in list requests.
    */
  var maxAffectedVersion: js.UndefOr[SchemaVersion] = js.native
  /**
    * The min version of the package in which the vulnerability exists.
    */
  var minAffectedVersion: js.UndefOr[SchemaVersion] = js.native
  /**
    * The type of package; whether native or non native(ruby gems, node.js
    * packages etc)
    */
  var packageType: js.UndefOr[String] = js.native
  /**
    * The severity (eg: distro assigned severity) for this vulnerability.
    */
  var severityName: js.UndefOr[String] = js.native
}

object SchemaDetail {
  @scala.inline
  def apply(): SchemaDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDetail]
  }
  @scala.inline
  implicit class SchemaDetailOps[Self <: SchemaDetail] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_package(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("package")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_package: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("package")(js.undefined)
        ret
    }
    @scala.inline
    def withCpeUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cpeUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCpeUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cpeUri")(js.undefined)
        ret
    }
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
    def withFixedLocation(value: SchemaVulnerabilityLocation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixedLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFixedLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixedLocation")(js.undefined)
        ret
    }
    @scala.inline
    def withIsObsolete(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isObsolete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsObsolete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isObsolete")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxAffectedVersion(value: SchemaVersion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAffectedVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxAffectedVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAffectedVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withMinAffectedVersion(value: SchemaVersion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minAffectedVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinAffectedVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minAffectedVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withPackageType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packageType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPackageType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packageType")(js.undefined)
        ret
    }
    @scala.inline
    def withSeverityName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("severityName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeverityName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("severityName")(js.undefined)
        ret
    }
  }
  
}

