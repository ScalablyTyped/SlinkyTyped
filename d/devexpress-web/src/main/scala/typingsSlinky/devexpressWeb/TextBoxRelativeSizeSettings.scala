package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains relative size settings for floating objects.
  */
@js.native
trait TextBoxRelativeSizeSettings extends js.Object {
  /**
    * Gets or sets the percentage specifying a floating object's height relative to the element defined by the TextBoxRelativeSizeSettings.relativeHeightType property.
    */
  var relativeHeight: Double = js.native
  /**
    * Gets or sets a value specifying to what element the floating object height is relative.
    */
  var relativeHeightType: FloatingObjectRelativeHeightType = js.native
  /**
    * Gets or sets the percentage specifying a floating object's width relative to the element defined by the TextBoxRelativeSizeSettings.relativeWidthType property.
    */
  var relativeWidth: Double = js.native
  /**
    * Gets or sets a value specifying to what element the floating object width is relative.
    */
  var relativeWidthType: FloatingObjectRelativeWidthType = js.native
}

object TextBoxRelativeSizeSettings {
  @scala.inline
  def apply(
    relativeHeight: Double,
    relativeHeightType: FloatingObjectRelativeHeightType,
    relativeWidth: Double,
    relativeWidthType: FloatingObjectRelativeWidthType
  ): TextBoxRelativeSizeSettings = {
    val __obj = js.Dynamic.literal(relativeHeight = relativeHeight.asInstanceOf[js.Any], relativeHeightType = relativeHeightType.asInstanceOf[js.Any], relativeWidth = relativeWidth.asInstanceOf[js.Any], relativeWidthType = relativeWidthType.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextBoxRelativeSizeSettings]
  }
  @scala.inline
  implicit class TextBoxRelativeSizeSettingsOps[Self <: TextBoxRelativeSizeSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRelativeHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relativeHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRelativeHeightType(value: FloatingObjectRelativeHeightType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relativeHeightType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRelativeWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relativeWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRelativeWidthType(value: FloatingObjectRelativeWidthType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relativeWidthType")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

