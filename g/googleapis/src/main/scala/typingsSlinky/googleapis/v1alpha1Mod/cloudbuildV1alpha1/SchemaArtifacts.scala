package typingsSlinky.googleapis.v1alpha1Mod.cloudbuildV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Artifacts produced by a build that should be uploaded upon successful
  * completion of all build steps.
  */
@js.native
trait SchemaArtifacts extends js.Object {
  /**
    * A list of images to be pushed upon the successful completion of all build
    * steps.  The images will be pushed using the builder service account&#39;s
    * credentials.  The digests of the pushed images will be stored in the
    * Build resource&#39;s results field.  If any of the images fail to be
    * pushed, the build is marked FAILURE.
    */
  var images: js.UndefOr[js.Array[String]] = js.native
  /**
    * A list of objects to be uploaded to Cloud Storage upon successful
    * completion of all build steps.  Files in the workspace matching specified
    * paths globs will be uploaded to the specified Cloud Storage location
    * using the builder service account&#39;s credentials.  The location and
    * generation of the uploaded objects will be stored in the Build
    * resource&#39;s results field.  If any objects fail to be pushed, the
    * build is marked FAILURE.
    */
  var objects: js.UndefOr[SchemaArtifactObjects] = js.native
}

object SchemaArtifacts {
  @scala.inline
  def apply(): SchemaArtifacts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaArtifacts]
  }
  @scala.inline
  implicit class SchemaArtifactsOps[Self <: SchemaArtifacts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withImages(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("images")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("images")(js.undefined)
        ret
    }
    @scala.inline
    def withObjects(value: SchemaArtifactObjects): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjects: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objects")(js.undefined)
        ret
    }
  }
  
}

