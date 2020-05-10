package typingsSlinky.pulumiAws.getImageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetImageResult extends js.Object {
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  val imageDigest: String = js.native
  /**
    * The date and time, expressed as a unix timestamp, at which the current image was pushed to the repository.
    */
  val imagePushedAt: Double = js.native
  /**
    * The size, in bytes, of the image in the repository.
    */
  val imageSizeInBytes: Double = js.native
  val imageTag: js.UndefOr[String] = js.native
  /**
    * The list of tags associated with this image.
    */
  val imageTags: js.Array[String] = js.native
  val registryId: String = js.native
  val repositoryName: String = js.native
}

object GetImageResult {
  @scala.inline
  def apply(
    id: String,
    imageDigest: String,
    imagePushedAt: Double,
    imageSizeInBytes: Double,
    imageTags: js.Array[String],
    registryId: String,
    repositoryName: String
  ): GetImageResult = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], imageDigest = imageDigest.asInstanceOf[js.Any], imagePushedAt = imagePushedAt.asInstanceOf[js.Any], imageSizeInBytes = imageSizeInBytes.asInstanceOf[js.Any], imageTags = imageTags.asInstanceOf[js.Any], registryId = registryId.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetImageResult]
  }
  @scala.inline
  implicit class GetImageResultOps[Self <: GetImageResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImageDigest(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageDigest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImagePushedAt(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imagePushedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImageSizeInBytes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageSizeInBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImageTags(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageTags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRegistryId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registryId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRepositoryName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repositoryName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImageTag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageTag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageTag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageTag")(js.undefined)
        ret
    }
  }
  
}

