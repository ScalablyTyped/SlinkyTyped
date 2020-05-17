package typingsSlinky.devextreme.anon

import typingsSlinky.devextreme.devextremeStrings.arrowBottom
import typingsSlinky.devextreme.devextremeStrings.arrowEastWest
import typingsSlinky.devextreme.devextremeStrings.arrowLeft
import typingsSlinky.devextreme.devextremeStrings.arrowNorthSouth
import typingsSlinky.devextreme.devextremeStrings.arrowRight
import typingsSlinky.devextreme.devextremeStrings.arrowTop
import typingsSlinky.devextreme.devextremeStrings.cardWithImageOnLeft
import typingsSlinky.devextreme.devextremeStrings.cardWithImageOnRight
import typingsSlinky.devextreme.devextremeStrings.cardWithImageOnTop
import typingsSlinky.devextreme.devextremeStrings.cross
import typingsSlinky.devextreme.devextremeStrings.data
import typingsSlinky.devextreme.devextremeStrings.database
import typingsSlinky.devextreme.devextremeStrings.decision
import typingsSlinky.devextreme.devextremeStrings.delay
import typingsSlinky.devextreme.devextremeStrings.diamond
import typingsSlinky.devextreme.devextremeStrings.display
import typingsSlinky.devextreme.devextremeStrings.document
import typingsSlinky.devextreme.devextremeStrings.ellipse
import typingsSlinky.devextreme.devextremeStrings.hardDisk
import typingsSlinky.devextreme.devextremeStrings.heart
import typingsSlinky.devextreme.devextremeStrings.horizontalContainer
import typingsSlinky.devextreme.devextremeStrings.internalStorage
import typingsSlinky.devextreme.devextremeStrings.manualInput
import typingsSlinky.devextreme.devextremeStrings.manualOperation
import typingsSlinky.devextreme.devextremeStrings.merge
import typingsSlinky.devextreme.devextremeStrings.multipleDocuments
import typingsSlinky.devextreme.devextremeStrings.octagon
import typingsSlinky.devextreme.devextremeStrings.or
import typingsSlinky.devextreme.devextremeStrings.paperTape
import typingsSlinky.devextreme.devextremeStrings.pentagon
import typingsSlinky.devextreme.devextremeStrings.predefinedProcess
import typingsSlinky.devextreme.devextremeStrings.preparation
import typingsSlinky.devextreme.devextremeStrings.process
import typingsSlinky.devextreme.devextremeStrings.rectangle
import typingsSlinky.devextreme.devextremeStrings.star
import typingsSlinky.devextreme.devextremeStrings.storedData
import typingsSlinky.devextreme.devextremeStrings.summingJunction
import typingsSlinky.devextreme.devextremeStrings.terminator
import typingsSlinky.devextreme.devextremeStrings.text
import typingsSlinky.devextreme.devextremeStrings.triangle
import typingsSlinky.devextreme.devextremeStrings.verticalContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AllowEditImage extends js.Object {
  var allowEditImage: js.UndefOr[Boolean] = js.native
  var allowEditText: js.UndefOr[Boolean] = js.native
  var backgroundImageHeight: js.UndefOr[Double] = js.native
  var backgroundImageLeft: js.UndefOr[Double] = js.native
  var backgroundImageTop: js.UndefOr[Double] = js.native
  var backgroundImageUrl: js.UndefOr[String] = js.native
  var backgroundImageWidth: js.UndefOr[Double] = js.native
  var baseType: js.UndefOr[
    text | rectangle | ellipse | cross | triangle | diamond | heart | pentagon | octagon | star | arrowLeft | arrowTop | arrowRight | arrowBottom | arrowNorthSouth | arrowEastWest | process | decision | terminator | predefinedProcess | document | multipleDocuments | manualInput | preparation | data | database | hardDisk | internalStorage | paperTape | manualOperation | delay | storedData | display | merge | or | summingJunction | verticalContainer | horizontalContainer | cardWithImageOnLeft | cardWithImageOnTop | cardWithImageOnRight | String
  ] = js.native
  var category: js.UndefOr[String] = js.native
  var connectionPoints: js.UndefOr[js.Array[Y]] = js.native
  var defaultHeight: js.UndefOr[Double] = js.native
  var defaultImageUrl: js.UndefOr[String] = js.native
  var defaultText: js.UndefOr[String] = js.native
  var defaultWidth: js.UndefOr[Double] = js.native
  var imageHeight: js.UndefOr[Double] = js.native
  var imageLeft: js.UndefOr[Double] = js.native
  var imageTop: js.UndefOr[Double] = js.native
  var imageWidth: js.UndefOr[Double] = js.native
  var textHeight: js.UndefOr[Double] = js.native
  var textLeft: js.UndefOr[Double] = js.native
  var textTop: js.UndefOr[Double] = js.native
  var textWidth: js.UndefOr[Double] = js.native
  var title: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[String] = js.native
}

object AllowEditImage {
  @scala.inline
  def apply(): AllowEditImage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllowEditImage]
  }
  @scala.inline
  implicit class AllowEditImageOps[Self <: AllowEditImage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowEditImage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowEditImage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowEditImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowEditImage")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowEditText(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowEditText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowEditText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowEditText")(js.undefined)
        ret
    }
    @scala.inline
    def withBackgroundImageHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundImageHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundImageHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundImageHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withBackgroundImageLeft(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundImageLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundImageLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundImageLeft")(js.undefined)
        ret
    }
    @scala.inline
    def withBackgroundImageTop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundImageTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundImageTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundImageTop")(js.undefined)
        ret
    }
    @scala.inline
    def withBackgroundImageUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundImageUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundImageUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundImageUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withBackgroundImageWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundImageWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundImageWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundImageWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withBaseType(
      value: text | rectangle | ellipse | cross | triangle | diamond | heart | pentagon | octagon | star | arrowLeft | arrowTop | arrowRight | arrowBottom | arrowNorthSouth | arrowEastWest | process | decision | terminator | predefinedProcess | document | multipleDocuments | manualInput | preparation | data | database | hardDisk | internalStorage | paperTape | manualOperation | delay | storedData | display | merge | or | summingJunction | verticalContainer | horizontalContainer | cardWithImageOnLeft | cardWithImageOnTop | cardWithImageOnRight | String
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseType")(js.undefined)
        ret
    }
    @scala.inline
    def withCategory(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("category")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCategory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("category")(js.undefined)
        ret
    }
    @scala.inline
    def withConnectionPoints(value: js.Array[Y]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionPoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectionPoints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionPoints")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultImageUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultImageUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultImageUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultImageUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultText")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withImageHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withImageLeft(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageLeft")(js.undefined)
        ret
    }
    @scala.inline
    def withImageTop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageTop")(js.undefined)
        ret
    }
    @scala.inline
    def withImageWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withTextHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withTextLeft(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textLeft")(js.undefined)
        ret
    }
    @scala.inline
    def withTextTop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textTop")(js.undefined)
        ret
    }
    @scala.inline
    def withTextWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

