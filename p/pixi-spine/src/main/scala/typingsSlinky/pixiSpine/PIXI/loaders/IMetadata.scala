package typingsSlinky.pixiSpine.PIXI.loaders

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMetadata extends js.Object {
  var atlasRawData: js.UndefOr[String] = js.native
  var image: js.UndefOr[js.Any] = js.native
  var imageLoader: js.UndefOr[js.Any] = js.native
  var imageMetadata: js.UndefOr[js.Any] = js.native
  var imageNamePrefix: js.UndefOr[String] = js.native
  var images: js.UndefOr[js.Any] = js.native
  var spineAtlas: js.UndefOr[js.Any] = js.native
  var spineAtlasFile: js.UndefOr[String] = js.native
  var spineAtlasSuffix: js.UndefOr[String] = js.native
  var spineMetadata: js.UndefOr[js.Any] = js.native
  var spineSkeletonScale: js.UndefOr[Double] = js.native
}

object IMetadata {
  @scala.inline
  def apply(): IMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMetadata]
  }
  @scala.inline
  implicit class IMetadataOps[Self <: IMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAtlasRawData(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("atlasRawData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAtlasRawData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("atlasRawData")(js.undefined)
        ret
    }
    @scala.inline
    def withImage(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(js.undefined)
        ret
    }
    @scala.inline
    def withImageLoader(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageLoader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageLoader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageLoader")(js.undefined)
        ret
    }
    @scala.inline
    def withImageMetadata(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageMetadata")(js.undefined)
        ret
    }
    @scala.inline
    def withImageNamePrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageNamePrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageNamePrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageNamePrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withImages(value: js.Any): Self = {
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
    def withSpineAtlas(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spineAtlas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpineAtlas: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spineAtlas")(js.undefined)
        ret
    }
    @scala.inline
    def withSpineAtlasFile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spineAtlasFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpineAtlasFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spineAtlasFile")(js.undefined)
        ret
    }
    @scala.inline
    def withSpineAtlasSuffix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spineAtlasSuffix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpineAtlasSuffix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spineAtlasSuffix")(js.undefined)
        ret
    }
    @scala.inline
    def withSpineMetadata(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spineMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpineMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spineMetadata")(js.undefined)
        ret
    }
    @scala.inline
    def withSpineSkeletonScale(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spineSkeletonScale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpineSkeletonScale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spineSkeletonScale")(js.undefined)
        ret
    }
  }
  
}

