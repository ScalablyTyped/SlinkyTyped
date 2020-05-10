package typingsSlinky.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * `Occurrence` includes information about analysis occurrences for an image.
  */
@js.native
trait SchemaOccurrence extends js.Object {
  /**
    * Describes an attestation of an artifact.
    */
  var attestation: js.UndefOr[SchemaAttestation] = js.native
  /**
    * Build details for a verifiable build.
    */
  var buildDetails: js.UndefOr[SchemaBuildDetails] = js.native
  /**
    * Output only. The time this `Occurrence` was created.
    */
  var createTime: js.UndefOr[String] = js.native
  /**
    * Describes the deployment of an artifact on a runtime.
    */
  var deployment: js.UndefOr[SchemaDeployment] = js.native
  /**
    * Describes how this resource derives from the basis in the associated
    * note.
    */
  var derivedImage: js.UndefOr[SchemaDerived] = js.native
  /**
    * Describes the initial scan status for this resource.
    */
  var discovered: js.UndefOr[SchemaDiscovered] = js.native
  /**
    * Describes the installation of a package on the linked resource.
    */
  var installation: js.UndefOr[SchemaInstallation] = js.native
  /**
    * Output only. This explicitly denotes which of the `Occurrence` details
    * are specified. This field can be used as a filter in list requests.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Output only. The name of the `Occurrence` in the form
    * &quot;projects/{project_id}/occurrences/{OCCURRENCE_ID}&quot;
    */
  var name: js.UndefOr[String] = js.native
  /**
    * An analysis note associated with this image, in the form
    * &quot;providers/{provider_id}/notes/{NOTE_ID}&quot; This field can be
    * used as a filter in list requests.
    */
  var noteName: js.UndefOr[String] = js.native
  /**
    * A description of actions that can be taken to remedy the `Note`
    */
  var remediation: js.UndefOr[String] = js.native
  /**
    * The resource for which the `Occurrence` applies.
    */
  var resource: js.UndefOr[SchemaResource] = js.native
  /**
    * The unique URL of the image or the container for which the `Occurrence`
    * applies. For example, https://gcr.io/project/image@sha256:foo This field
    * can be used as a filter in list requests.
    */
  var resourceUrl: js.UndefOr[String] = js.native
  /**
    * Output only. The time this `Occurrence` was last updated.
    */
  var updateTime: js.UndefOr[String] = js.native
  /**
    * Details of a security vulnerability note.
    */
  var vulnerabilityDetails: js.UndefOr[SchemaVulnerabilityDetails] = js.native
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
    def withAttestation(value: SchemaAttestation): Self = {
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
    def withBuildDetails(value: SchemaBuildDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBuildDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildDetails")(js.undefined)
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
    def withDeployment(value: SchemaDeployment): Self = {
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
    def withDerivedImage(value: SchemaDerived): Self = {
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
    def withDiscovered(value: SchemaDiscovered): Self = {
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
    def withResourceUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceUrl")(js.undefined)
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
    def withVulnerabilityDetails(value: SchemaVulnerabilityDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vulnerabilityDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVulnerabilityDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vulnerabilityDetails")(js.undefined)
        ret
    }
  }
  
}

