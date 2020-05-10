package typingsSlinky.dockerode.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageInfo extends js.Object {
  var Created: Double = js.native
  var Id: String = js.native
  var Labels: StringDictionary[String] = js.native
  var ParentId: String = js.native
  var RepoDigests: js.UndefOr[js.Array[String]] = js.native
  var RepoTags: js.Array[String] = js.native
  var Size: Double = js.native
  var VirtualSize: Double = js.native
}

object ImageInfo {
  @scala.inline
  def apply(
    Created: Double,
    Id: String,
    Labels: StringDictionary[String],
    ParentId: String,
    RepoTags: js.Array[String],
    Size: Double,
    VirtualSize: Double
  ): ImageInfo = {
    val __obj = js.Dynamic.literal(Created = Created.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Labels = Labels.asInstanceOf[js.Any], ParentId = ParentId.asInstanceOf[js.Any], RepoTags = RepoTags.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], VirtualSize = VirtualSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageInfo]
  }
  @scala.inline
  implicit class ImageInfoOps[Self <: ImageInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreated(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Created")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabels(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Labels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParentId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParentId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRepoTags(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RepoTags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVirtualSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VirtualSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRepoDigests(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RepoDigests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRepoDigests: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RepoDigests")(js.undefined)
        ret
    }
  }
  
}

