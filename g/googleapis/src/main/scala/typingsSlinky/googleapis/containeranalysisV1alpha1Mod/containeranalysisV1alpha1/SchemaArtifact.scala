package typingsSlinky.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Artifact describes a build product.
  */
@js.native
trait SchemaArtifact extends js.Object {
  /**
    * Hash or checksum value of a binary, or Docker Registry 2.0 digest of a
    * container.
    */
  var checksum: js.UndefOr[String] = js.native
  /**
    * Artifact ID, if any; for container images, this will be a URL by digest
    * like gcr.io/projectID/imagename@sha256:123456
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Name of the artifact. This may be the path to a binary or jar file, or in
    * the case of a container build, the name used to push the container image
    * to Google Container Registry, as presented to `docker push`.  This field
    * is deprecated in favor of the plural `names` field; it continues to exist
    * here to allow existing BuildProvenance serialized to json in
    * google.devtools.containeranalysis.v1alpha1.BuildDetails.provenance_bytes
    * to deserialize back into proto.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Related artifact names. This may be the path to a binary or jar file, or
    * in the case of a container build, the name used to push the container
    * image to Google Container Registry, as presented to `docker push`. Note
    * that a single Artifact ID can have multiple names, for example if two
    * tags are applied to one image.
    */
  var names: js.UndefOr[js.Array[String]] = js.native
}

object SchemaArtifact {
  @scala.inline
  def apply(): SchemaArtifact = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaArtifact]
  }
  @scala.inline
  implicit class SchemaArtifactOps[Self <: SchemaArtifact] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChecksum(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checksum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChecksum: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checksum")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
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
    def withNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("names")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("names")(js.undefined)
        ret
    }
  }
  
}

