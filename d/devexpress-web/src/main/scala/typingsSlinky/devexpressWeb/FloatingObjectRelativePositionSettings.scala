package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains relative position settings for floating objects.
  */
@js.native
trait FloatingObjectRelativePositionSettings extends js.Object {
  /**
    * Gets or sets a value specifying to what element the horizontal position of a floating object is relative.
    */
  var horizontalPositionType: FloatingObjectHorizontalPositionType = js.native
  /**
    * Gets or sets the horizontal distance between the edge of a floating object and the element specified by the FloatingObjectRelativePositionSettings.horizontalRelativePosition property
    */
  var horizontalRelativePosition: Double = js.native
  /**
    * Gets or sets a value specifying to what element the vertical position of a floating object is relative.
    */
  var verticalPositionType: FloatingObjectVerticalPositionType = js.native
  /**
    * Gets or sets the horizontal distance between the edge of a floating object and the element specified by the FloatingObjectRelativePositionSettings.verticalRelativePosition property
    */
  var verticalRelativePosition: Double = js.native
}

object FloatingObjectRelativePositionSettings {
  @scala.inline
  def apply(
    horizontalPositionType: FloatingObjectHorizontalPositionType,
    horizontalRelativePosition: Double,
    verticalPositionType: FloatingObjectVerticalPositionType,
    verticalRelativePosition: Double
  ): FloatingObjectRelativePositionSettings = {
    val __obj = js.Dynamic.literal(horizontalPositionType = horizontalPositionType.asInstanceOf[js.Any], horizontalRelativePosition = horizontalRelativePosition.asInstanceOf[js.Any], verticalPositionType = verticalPositionType.asInstanceOf[js.Any], verticalRelativePosition = verticalRelativePosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[FloatingObjectRelativePositionSettings]
  }
  @scala.inline
  implicit class FloatingObjectRelativePositionSettingsOps[Self <: FloatingObjectRelativePositionSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHorizontalPositionType(value: FloatingObjectHorizontalPositionType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalPositionType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHorizontalRelativePosition(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalRelativePosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVerticalPositionType(value: FloatingObjectVerticalPositionType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalPositionType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVerticalRelativePosition(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalRelativePosition")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

