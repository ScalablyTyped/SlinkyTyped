package typingsSlinky.antDesignReactNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAssetType extends js.Object {
  var assetType: String = js.native
  var backgroundColor: String = js.native
  var first: Double = js.native
  var groupTypes: String = js.native
  var imageMargin: Double = js.native
  var imagesPerRow: Double = js.native
  var maximum: Double = js.native
  var selectSingleItem: Boolean = js.native
  var selected: js.Array[scala.Nothing] = js.native
  def callback(selectedImages: js.Any, currentImage: js.Any): Unit = js.native
}

object AnonAssetType {
  @scala.inline
  def apply(
    assetType: String,
    backgroundColor: String,
    callback: (js.Any, js.Any) => Unit,
    first: Double,
    groupTypes: String,
    imageMargin: Double,
    imagesPerRow: Double,
    maximum: Double,
    selectSingleItem: Boolean,
    selected: js.Array[scala.Nothing]
  ): AnonAssetType = {
    val __obj = js.Dynamic.literal(assetType = assetType.asInstanceOf[js.Any], backgroundColor = backgroundColor.asInstanceOf[js.Any], callback = js.Any.fromFunction2(callback), first = first.asInstanceOf[js.Any], groupTypes = groupTypes.asInstanceOf[js.Any], imageMargin = imageMargin.asInstanceOf[js.Any], imagesPerRow = imagesPerRow.asInstanceOf[js.Any], maximum = maximum.asInstanceOf[js.Any], selectSingleItem = selectSingleItem.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAssetType]
  }
  @scala.inline
  implicit class AnonAssetTypeOps[Self <: AnonAssetType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssetType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assetType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBackgroundColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCallback(value: (js.Any, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withFirst(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("first")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGroupTypes(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImageMargin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImagesPerRow(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imagesPerRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaximum(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectSingleItem(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectSingleItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelected(value: js.Array[scala.Nothing]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selected")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

