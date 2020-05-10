package typingsSlinky.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An instance of an analysis type that has been found on a resource.
  */
@js.native
trait SchemaOccurrence extends js.Object {
  /**
    * Describes an attestation of an artifact.
    */
  var attestation: js.UndefOr[SchemaDetails] = js.native
  /**
    * Describes a verifiable build.
    */
  var build: js.UndefOr[SchemaGrafeasV1beta1BuildDetails] = js.native
  /**
    * Output only. The time this occurrence was created.
    */
  var createTime: js.UndefOr[String] = js.native
  /**
    * Describes the deployment of an artifact on a runtime.
    */
  var deployment: js.UndefOr[SchemaGrafeasV1beta1DeploymentDetails] = js.native
  /**
    * Describes how this resource derives from the basis in the associated
    * note.
    */
  var derivedImage: js.UndefOr[SchemaGrafeasV1beta1ImageDetails] = js.native
  /**
    * Describes when a resource was discovered.
    */
  var discovered: js.UndefOr[SchemaGrafeasV1beta1DiscoveryDetails] = js.native
  /**
    * Describes the installation of a package on the linked resource.
    */
  var installation: js.UndefOr[SchemaGrafeasV1beta1PackageDetails] = js.native
  /**
    * Output only. This explicitly denotes which of the occurrence details are
    * specified. This field can be used as a filter in list requests.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Output only. The name of the occurrence in the form of
    * `projects/[PROJECT_ID]/occurrences/[OCCURRENCE_ID]`.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Required. Immutable. The analysis note associated with this occurrence,
    * in the form of `projects/[PROVIDER_ID]/notes/[NOTE_ID]`. This field can
    * be used as a filter in list requests.
    */
  var noteName: js.UndefOr[String] = js.native
  /**
    * A description of actions that can be taken to remedy the note.
    */
  var remediation: js.UndefOr[String] = js.native
  /**
    * Required. Immutable. The resource for which the occurrence applies.
    */
  var resource: js.UndefOr[SchemaResource] = js.native
  /**
    * Output only. The time this occurrence was last updated.
    */
  var updateTime: js.UndefOr[String] = js.native
  /**
    * Describes a security vulnerability.
    */
  var vulnerability: js.UndefOr[SchemaGrafeasV1beta1VulnerabilityDetails] = js.native
}

object SchemaOccurrence {
  @scala.inline
  def apply(): SchemaOccurrence = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOccurrence]
  }
  @scala.inline
  implicit class SchemaOccurrenceOps[Self <: SchemaOccurrence] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttestation(value: SchemaDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attestation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttestation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attestation")(js.undefined)
        ret
    }
    @scala.inline
    def withBuild(value: SchemaGrafeasV1beta1BuildDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("build")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBuild: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("build")(js.undefined)
        ret
    }
    @scala.inline
    def withCreateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createTime")(js.undefined)
        ret
    }
    @scala.inline
    def withDeployment(value: SchemaGrafeasV1beta1DeploymentDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deployment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeployment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deployment")(js.undefined)
        ret
    }
    @scala.inline
    def withDerivedImage(value: SchemaGrafeasV1beta1ImageDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("derivedImage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDerivedImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("derivedImage")(js.undefined)
        ret
    }
    @scala.inline
    def withDiscovered(value: SchemaGrafeasV1beta1DiscoveryDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("discovered")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDiscovered: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("discovered")(js.undefined)
        ret
    }
    @scala.inline
    def withInstallation(value: SchemaGrafeasV1beta1PackageDetails): Self = {
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
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
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
    def withNoteName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noteName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoteName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noteName")(js.undefined)
        ret
    }
    @scala.inline
    def withRemediation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remediation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemediation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remediation")(js.undefined)
        ret
    }
    @scala.inline
    def withResource(value: SchemaResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resource")(js.undefined)
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
    def withVulnerability(value: SchemaGrafeasV1beta1VulnerabilityDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vulnerability")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVulnerability: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vulnerability")(js.undefined)
        ret
    }
  }
  
}

