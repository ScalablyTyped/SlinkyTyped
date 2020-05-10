package typingsSlinky.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A type of analysis that can be done for a resource.
  */
@js.native
trait SchemaNote extends js.Object {
  /**
    * A note describing a package hosted by various package managers.
    */
  @JSName("package")
  var _package: js.UndefOr[SchemaPackage] = js.native
  /**
    * A note describing an attestation role.
    */
  var attestationAuthority: js.UndefOr[SchemaAuthority] = js.native
  /**
    * A note describing a base image.
    */
  var baseImage: js.UndefOr[SchemaBasis] = js.native
  /**
    * A note describing build provenance for a verifiable build.
    */
  var build: js.UndefOr[SchemaBuild] = js.native
  /**
    * Output only. The time this note was created. This field can be used as a
    * filter in list requests.
    */
  var createTime: js.UndefOr[String] = js.native
  /**
    * A note describing something that can be deployed.
    */
  var deployable: js.UndefOr[SchemaDeployable] = js.native
  /**
    * A note describing the initial analysis of a resource.
    */
  var discovery: js.UndefOr[SchemaDiscovery] = js.native
  /**
    * Time of expiration for this note. Empty if note does not expire.
    */
  var expirationTime: js.UndefOr[String] = js.native
  /**
    * Output only. The type of analysis. This field can be used as a filter in
    * list requests.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * A detailed description of this note.
    */
  var longDescription: js.UndefOr[String] = js.native
  /**
    * Output only. The name of the note in the form of
    * `projects/[PROVIDER_ID]/notes/[NOTE_ID]`.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Other notes related to this note.
    */
  var relatedNoteNames: js.UndefOr[js.Array[String]] = js.native
  /**
    * URLs associated with this note.
    */
  var relatedUrl: js.UndefOr[js.Array[SchemaRelatedUrl]] = js.native
  /**
    * A one sentence description of this note.
    */
  var shortDescription: js.UndefOr[String] = js.native
  /**
    * Output only. The time this note was last updated. This field can be used
    * as a filter in list requests.
    */
  var updateTime: js.UndefOr[String] = js.native
  /**
    * A note describing a package vulnerability.
    */
  var vulnerability: js.UndefOr[SchemaVulnerability] = js.native
}

object SchemaNote {
  @scala.inline
  def apply(): SchemaNote = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNote]
  }
  @scala.inline
  implicit class SchemaNoteOps[Self <: SchemaNote] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_package(value: SchemaPackage): Self = {
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
    def withAttestationAuthority(value: SchemaAuthority): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attestationAuthority")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttestationAuthority: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attestationAuthority")(js.undefined)
        ret
    }
    @scala.inline
    def withBaseImage(value: SchemaBasis): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseImage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseImage")(js.undefined)
        ret
    }
    @scala.inline
    def withBuild(value: SchemaBuild): Self = {
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
    def withDeployable(value: SchemaDeployable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deployable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeployable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deployable")(js.undefined)
        ret
    }
    @scala.inline
    def withDiscovery(value: SchemaDiscovery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("discovery")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDiscovery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("discovery")(js.undefined)
        ret
    }
    @scala.inline
    def withExpirationTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expirationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpirationTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expirationTime")(js.undefined)
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
    def withLongDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLongDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longDescription")(js.undefined)
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
    def withRelatedNoteNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relatedNoteNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelatedNoteNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relatedNoteNames")(js.undefined)
        ret
    }
    @scala.inline
    def withRelatedUrl(value: js.Array[SchemaRelatedUrl]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relatedUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelatedUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relatedUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withShortDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShortDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortDescription")(js.undefined)
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
    def withVulnerability(value: SchemaVulnerability): Self = {
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

