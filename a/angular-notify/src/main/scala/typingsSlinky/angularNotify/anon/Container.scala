package typingsSlinky.angularNotify.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Container extends js.Object {
  /**
    * The default element that contains each notification. Defaults to document.body.
    */
  var container: js.UndefOr[js.Any] = js.native
  /**
    * The default duration (in milliseconds) of each message. A duration of 0 will prevent messages from closing automatically.
    */
  var duration: js.UndefOr[Double] = js.native
  /**
    * The maximum number of total notifications that can be visible at one time. Older notifications will be closed when the maximum is reached.
    */
  var maximumOpen: js.UndefOr[Double] = js.native
  /**
    * The default position of each message. Currently only center and right are the supported values.
    */
  var position: js.UndefOr[String] = js.native
  /**
    * The Y pixel value where messages will be shown.
    */
  var startTop: js.UndefOr[Double] = js.native
  /**
    * The default message template.
    */
  var templateUrl: js.UndefOr[String] = js.native
  /**
    * The number of pixels that should be reserved between messages vertically.
    */
  var verticalSpacing: js.UndefOr[Double] = js.native
}

object Container {
  @scala.inline
  def apply(): Container = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Container]
  }
  @scala.inline
  implicit class ContainerOps[Self <: Container] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContainer(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(js.undefined)
        ret
    }
    @scala.inline
    def withDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(js.undefined)
        ret
    }
    @scala.inline
    def withMaximumOpen(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumOpen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximumOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumOpen")(js.undefined)
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
    def withStartTop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTop")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplateUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templateUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplateUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templateUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withVerticalSpacing(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalSpacing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerticalSpacing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalSpacing")(js.undefined)
        ret
    }
  }
  
}

