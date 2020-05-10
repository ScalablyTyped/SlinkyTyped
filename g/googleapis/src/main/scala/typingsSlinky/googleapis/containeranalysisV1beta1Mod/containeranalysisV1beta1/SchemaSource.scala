package typingsSlinky.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1

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
  var additionalContexts: js.UndefOr[js.Array[SchemaSourceContext]] = js.native
  /**
    * If provided, the input binary artifacts for the build came from this
    * location.
    */
  var artifactStorageSourceUri: js.UndefOr[String] = js.native
  /**
    * If provided, the source code used for the build came from this location.
    */
  var context: js.UndefOr[SchemaSourceContext] = js.native
  /**
    * Hash(es) of the build source, which can be used to verify that the
    * original source integrity was maintained in the build.  The keys to this
    * map are file paths used as build source and the values contain the hash
    * values for those files.  If the build source came in a single package
    * such as a gzipped tarfile (.tar.gz), the FileHash will be for the single
    * path to that file.
    */
  var fileHashes: js.UndefOr[StringDictionary[SchemaFileHashes]] = js.native
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
    def withAdditionalContexts(value: js.Array[SchemaSourceContext]): Self = {
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
    def withArtifactStorageSourceUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("artifactStorageSourceUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArtifactStorageSourceUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("artifactStorageSourceUri")(js.undefined)
        ret
    }
    @scala.inline
    def withContext(value: SchemaSourceContext): Self = {
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
  }
  
}

