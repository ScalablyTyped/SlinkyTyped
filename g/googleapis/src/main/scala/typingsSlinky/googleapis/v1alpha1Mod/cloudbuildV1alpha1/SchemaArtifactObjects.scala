package typingsSlinky.googleapis.v1alpha1Mod.cloudbuildV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Files in the workspace to upload to Cloud Storage upon successful
  * completion of all build steps.
  */
@js.native
trait SchemaArtifactObjects extends js.Object {
  /**
    * Cloud Storage bucket and optional object path, in the form
    * &quot;gs://bucket/path/to/somewhere/&quot;. (see [Bucket Name
    * Requirements](https://cloud.google.com/storage/docs/bucket-naming#requirements)).
    * Files in the workspace matching any path pattern will be uploaded to
    * Cloud Storage with this location as a prefix.
    */
  var location: js.UndefOr[String] = js.native
  /**
    * Path globs used to match files in the build&#39;s workspace.
    */
  var paths: js.UndefOr[js.Array[String]] = js.native
  /**
    * Output only. Stores timing information for pushing all artifact objects.
    */
  var timing: js.UndefOr[SchemaTimeSpan] = js.native
}

object SchemaArtifactObjects {
  @scala.inline
  def apply(): SchemaArtifactObjects = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaArtifactObjects]
  }
  @scala.inline
  implicit class SchemaArtifactObjectsOps[Self <: SchemaArtifactObjects] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLocation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(js.undefined)
        ret
    }
    @scala.inline
    def withPaths(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaths: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paths")(js.undefined)
        ret
    }
    @scala.inline
    def withTiming(value: SchemaTimeSpan): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTiming: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timing")(js.undefined)
        ret
    }
  }
  
}

