package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains page margin settings.
  */
@js.native
trait FloatingObjectAbsolutePositionSettings extends js.Object {
  /**
    * Gets or sets a floating object's horizontal position relative to an element specified by the FloatingObjectAbsolutePositionSettings.horizontalPositionType property.
    */
  var horizontalAbsolutePosition: Double = js.native
  /**
    * Gets or sets a value specifying to what element the horizontal position of a floating object is relative.
    */
  var horizontalPositionType: FloatingObjectHorizontalPositionType = js.native
  /**
    * Gets or sets a floating object's vertical position relative to an element specified by the FloatingObjectAbsolutePositionSettings.verticalPositionType property.
    */
  var verticalAbsolutePosition: Double = js.native
  /**
    * Gets or sets a value specifying to what element the vertical position of a floating object is relative.
    */
  var verticalPositionType: FloatingObjectVerticalPositionType = js.native
}

object FloatingObjectAbsolutePositionSettings {
  @scala.inline
  def apply(
    horizontalAbsolutePosition: Double,
    horizontalPositionType: FloatingObjectHorizontalPositionType,
    verticalAbsolutePosition: Double,
    verticalPositionType: FloatingObjectVerticalPositionType
  ): FloatingObjectAbsolutePositionSettings = {
    val __obj = js.Dynamic.literal(horizontalAbsolutePosition = horizontalAbsolutePosition.asInstanceOf[js.Any], horizontalPositionType = horizontalPositionType.asInstanceOf[js.Any], verticalAbsolutePosition = verticalAbsolutePosition.asInstanceOf[js.Any], verticalPositionType = verticalPositionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[FloatingObjectAbsolutePositionSettings]
  }
  @scala.inline
  implicit class FloatingObjectAbsolutePositionSettingsOps[Self <: FloatingObjectAbsolutePositionSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHorizontalAbsolutePosition(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalAbsolutePosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHorizontalPositionType(value: FloatingObjectHorizontalPositionType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalPositionType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVerticalAbsolutePosition(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalAbsolutePosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVerticalPositionType(value: FloatingObjectVerticalPositionType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalPositionType")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

