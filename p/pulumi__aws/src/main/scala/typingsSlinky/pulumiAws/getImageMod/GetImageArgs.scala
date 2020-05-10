package typingsSlinky.pulumiAws.getImageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetImageArgs extends js.Object {
  /**
    * The sha256 digest of the image manifest. At least one of `imageDigest` or `imageTag` must be specified.
    */
  val imageDigest: js.UndefOr[String] = js.native
  /**
    * The tag associated with this image. At least one of `imageDigest` or `imageTag` must be specified.
    */
  val imageTag: js.UndefOr[String] = js.native
  /**
    * The ID of the Registry where the repository resides.
    */
  val registryId: js.UndefOr[String] = js.native
  /**
    * The name of the ECR Repository.
    */
  val repositoryName: String = js.native
}

object GetImageArgs {
  @scala.inline
  def apply(repositoryName: String): GetImageArgs = {
    val __obj = js.Dynamic.literal(repositoryName = repositoryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetImageArgs]
  }
  @scala.inline
  implicit class GetImageArgsOps[Self <: GetImageArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRepositoryName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repositoryName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImageDigest(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageDigest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageDigest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageDigest")(js.undefined)
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
    @scala.inline
    def withRegistryId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registryId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegistryId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registryId")(js.undefined)
        ret
    }
  }
  
}

