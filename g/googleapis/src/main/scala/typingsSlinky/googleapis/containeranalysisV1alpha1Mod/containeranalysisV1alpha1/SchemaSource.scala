package typingsSlinky.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Source describes the location of the source used for the build.
  */
@js.native
trait SchemaSource extends js.Object {
  /**
    * If provided, some of the source code used for the build may be found in
    * these locations, in the case where the source repository had multiple
    * remotes or submodules. This list will not include the context specified
    * in the context field.
    */
  var additionalContexts: js.UndefOr[js.Array[SchemaGoogleDevtoolsContaineranalysisV1alpha1SourceContext]] = js.native
  /**
    * If provided, the input binary artifacts for the build came from this
    * location.
    */
  var artifactStorageSource: js.UndefOr[SchemaStorageSource] = js.native
  /**
    * If provided, the source code used for the build came from this location.
    */
  var context: js.UndefOr[SchemaGoogleDevtoolsContaineranalysisV1alpha1SourceContext] = js.native
  /**
    * Hash(es) of the build source, which can be used to verify that the
    * original source integrity was maintained in the build.  The keys to this
    * map are file paths used as build source and the values contain the hash
    * values for those files.  If the build source came in a single package
    * such as a gzipped tarfile (.tar.gz), the FileHash will be for the single
    * path to that file.
    */
  var fileHashes: js.UndefOr[StringDictionary[SchemaFileHashes]] = js.native
  /**
    * If provided, get source from this location in a Cloud Repo.
    */
  var repoSource: js.UndefOr[SchemaRepoSource] = js.native
  /**
    * If provided, get the source from this location in in Google Cloud
    * Storage.
    */
  var storageSource: js.UndefOr[SchemaStorageSource] = js.native
}

object SchemaSource {
  @scala.inline
  def apply(): SchemaSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSource]
  }
  @scala.inline
  implicit class SchemaSourceOps[Self <: SchemaSource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdditionalContexts(value: js.Array[SchemaGoogleDevtoolsContaineranalysisV1alpha1SourceContext]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalContexts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdditionalContexts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalContexts")(js.undefined)
        ret
    }
    @scala.inline
    def withArtifactStorageSource(value: SchemaStorageSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("artifactStorageSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArtifactStorageSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("artifactStorageSource")(js.undefined)
        ret
    }
    @scala.inline
    def withContext(value: SchemaGoogleDevtoolsContaineranalysisV1alpha1SourceContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(js.undefined)
        ret
    }
    @scala.inline
    def withFileHashes(value: StringDictionary[SchemaFileHashes]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileHashes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileHashes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileHashes")(js.undefined)
        ret
    }
    @scala.inline
    def withRepoSource(value: SchemaRepoSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repoSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRepoSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repoSource")(js.undefined)
        ret
    }
    @scala.inline
    def withStorageSource(value: SchemaStorageSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storageSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStorageSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storageSource")(js.undefined)
        ret
    }
  }
  
}

