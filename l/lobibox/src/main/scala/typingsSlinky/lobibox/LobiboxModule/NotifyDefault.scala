package typingsSlinky.lobibox.LobiboxModule

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotifyDefault extends js.Object {
                    // Image source string
  var closable: js.UndefOr[Boolean] = js.native
         // Show timer indicator
  var closeOnClick: js.UndefOr[Boolean] = js.native
    // Set this to true if you want notification not to be shown until previous notification is closed. This is useful for notification queues
  var continueDelayOnInactiveTab: js.UndefOr[Boolean] = js.native
               // Make notifications closable
  var delay: js.UndefOr[Double] = js.native
                  // Hide notification after this time (in miliseconds)
  var delayIndicator: js.UndefOr[Boolean] = js.native
          // Show animation class.
  var hideClass: js.UndefOr[String] = js.native
         // Hide animation class.
  var icon: js.UndefOr[Boolean] = js.native
                      // Message of notification
  var img: js.UndefOr[String] = js.native
                   // Icon of notification. Leave as is for default icon or set custom string
  var msg: js.UndefOr[String] = js.native
   // Continue delay when browser tab is inactive
  // Events
  var onClick: js.UndefOr[js.Function] = js.native
      // Place to show notification. Available options: "top left", "top right", "bottom left", "bottom right"
  var onClickUrl: js.UndefOr[String] = js.native
                  // Sound of notification. Set this false to disable sound. Leave as is for default sound or set custom soud path
  var position: js.UndefOr[String] = js.native
            // The url which will be opened when notification is clicked
  var showAfterPrevious: js.UndefOr[Boolean] = js.native
             // Default extension for all sounds
  var showClass: js.UndefOr[String] = js.native
                  // Title of notification. If you do not include the title in options it will automatically takes its value
  //from Lobibox.notify.OPTIONS object depending of the type of the notifications or set custom string. Set this false to disable title
  var size: js.UndefOr[String] = js.native
                   // Width of notification box
  var sound: js.UndefOr[Boolean] = js.native
     // The folder path where sounds are located
  var soundExt: js.UndefOr[String] = js.native
               // normal, mini, large
  var soundPath: js.UndefOr[String] = js.native
  var title: js.UndefOr[String | Boolean] = js.native
           // Close notifications by clicking on them
  var width: js.UndefOr[Double] = js.native
}

object NotifyDefault {
  @scala.inline
  def apply(): NotifyDefault = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotifyDefault]
  }
  @scala.inline
  implicit class NotifyDefaultOps[Self <: NotifyDefault] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClosable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClosable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closable")(js.undefined)
        ret
    }
    @scala.inline
    def withCloseOnClick(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeOnClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloseOnClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeOnClick")(js.undefined)
        ret
    }
    @scala.inline
    def withContinueDelayOnInactiveTab(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("continueDelayOnInactiveTab")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContinueDelayOnInactiveTab: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("continueDelayOnInactiveTab")(js.undefined)
        ret
    }
    @scala.inline
    def withDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(js.undefined)
        ret
    }
    @scala.inline
    def withDelayIndicator(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delayIndicator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelayIndicator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delayIndicator")(js.undefined)
        ret
    }
    @scala.inline
    def withHideClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideClass")(js.undefined)
        ret
    }
    @scala.inline
    def withIcon(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(js.undefined)
        ret
    }
    @scala.inline
    def withImg(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("img")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImg: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("img")(js.undefined)
        ret
    }
    @scala.inline
    def withMsg(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("msg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMsg: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("msg")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClick(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClickUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClickUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnClickUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClickUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
    @scala.inline
    def withShowAfterPrevious(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showAfterPrevious")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowAfterPrevious: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showAfterPrevious")(js.undefined)
        ret
    }
    @scala.inline
    def withShowClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showClass")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
    @scala.inline
    def withSound(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sound")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSound: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sound")(js.undefined)
        ret
    }
    @scala.inline
    def withSoundExt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("soundExt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSoundExt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("soundExt")(js.undefined)
        ret
    }
    @scala.inline
    def withSoundPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("soundPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSoundPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("soundPath")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String | Boolean): Self = {
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
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

