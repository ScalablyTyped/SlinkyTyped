package typingsSlinky.phaser.Phaser.Tilemaps

import typingsSlinky.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An Image Collection is a special Tile Set containing multiple images, with no slicing into each image.
  * 
  * Image Collections are normally created automatically when Tiled data is loaded.
  */
@js.native
trait ImageCollection extends js.Object {
  /**
    * The Tiled firstgid value.
    * This is the starting index of the first image index this Image Collection contains.
    */
  var firstgid: integer = js.native
  /**
    * The height of the tallest image (in pixels).
    */
  val imageHeight: integer = js.native
  /**
    * The margin around the images in the collection (in pixels).
    * Use `setSpacing` to change.
    */
  val imageMarge: integer = js.native
  /**
    * The spacing between each image in the collection (in pixels).
    * Use `setSpacing` to change.
    */
  val imageSpacing: integer = js.native
  /**
    * The width of the widest image (in pixels).
    */
  val imageWidth: integer = js.native
  /**
    * The cached images that are a part of this collection.
    */
  val images: js.Array[_] = js.native
  /**
    * The name of the Image Collection.
    */
  var name: String = js.native
  /**
    * Image Collection-specific properties that are typically defined in the Tiled editor.
    */
  var properties: js.Object = js.native
  /**
    * The total number of images in the image collection.
    */
  val total: integer = js.native
  /**
    * Add an image to this Image Collection.
    * @param gid The gid of the image in the Image Collection.
    * @param image The the key of the image in the Image Collection and in the cache.
    */
  def addImage(gid: integer, image: String): ImageCollection = js.native
  /**
    * Returns true if and only if this image collection contains the given image index.
    * @param imageIndex The image index to search for.
    */
  def containsImageIndex(imageIndex: integer): Boolean = js.native
}

object ImageCollection {
  @scala.inline
  def apply(
    addImage: (integer, String) => ImageCollection,
    containsImageIndex: integer => Boolean,
    firstgid: integer,
    imageHeight: integer,
    imageMarge: integer,
    imageSpacing: integer,
    imageWidth: integer,
    images: js.Array[_],
    name: String,
    properties: js.Object,
    total: integer
  ): ImageCollection = {
    val __obj = js.Dynamic.literal(addImage = js.Any.fromFunction2(addImage), containsImageIndex = js.Any.fromFunction1(containsImageIndex), firstgid = firstgid.asInstanceOf[js.Any], imageHeight = imageHeight.asInstanceOf[js.Any], imageMarge = imageMarge.asInstanceOf[js.Any], imageSpacing = imageSpacing.asInstanceOf[js.Any], imageWidth = imageWidth.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageCollection]
  }
  @scala.inline
  implicit class ImageCollectionOps[Self <: ImageCollection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddImage(value: (integer, String) => ImageCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addImage")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withContainsImageIndex(value: integer => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containsImageIndex")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFirstgid(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstgid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImageHeight(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImageMarge(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageMarge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImageSpacing(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageSpacing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImageWidth(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImages(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("images")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProperties(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotal(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

