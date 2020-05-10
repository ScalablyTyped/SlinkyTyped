package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ZoombarProviderDefaultSettings
  extends /**
	 * Option for JSONPDataSourceSettings
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Contains the target component's instance
  	 */
  var targetObject: js.UndefOr[js.Any] = js.native
  /**
  	 * Expects two parameters
  	 * a jQuery Event to pass as original for Zoombar's own zoomChanged event
  	 * an object with the following structure:
  	 * {
  	 * oldLeft: number,
  	 * oldWidth: number,
  	 * newLeft: number,
  	 * newWdith: number
  	 * }
  	 * The values should represent the fractions of the total width of the zoomed component in a number ranging from 0 to 1
  	 */
  var zoomChangedCallback: js.UndefOr[js.Any] = js.native
}

object ZoombarProviderDefaultSettings {
  @scala.inline
  def apply(): ZoombarProviderDefaultSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ZoombarProviderDefaultSettings]
  }
  @scala.inline
  implicit class ZoombarProviderDefaultSettingsOps[Self <: ZoombarProviderDefaultSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTargetObject(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetObject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetObject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetObject")(js.undefined)
        ret
    }
    @scala.inline
    def withZoomChangedCallback(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomChangedCallback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomChangedCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomChangedCallback")(js.undefined)
        ret
    }
  }
  
}

