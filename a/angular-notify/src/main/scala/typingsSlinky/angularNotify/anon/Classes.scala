package typingsSlinky.angularNotify.anon

import typingsSlinky.angular.mod.IScope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Classes extends js.Object {
  /**
    * Optional. A valid Angular scope object. The scope of the template will be created by calling $new() on this scope.
    */
  @JSName("$scope")
  var $scope: js.UndefOr[IScope] = js.native
  /**
    * Optional. A list of custom CSS classes to apply to the message element.
    */
  var classes: js.UndefOr[String] = js.native
  /**
    * Optional. Element that contains each notification. Defaults to document.body.
    */
  var container: js.UndefOr[js.Any] = js.native
  /**
    * Optional. The duration (in milliseconds) of the message. A duration of 0 will prevent the message from closing automatically.
    */
  var duration: js.UndefOr[Double] = js.native
  /**
    * Required. The message to show.
    */
  var message: String = js.native
  /**
    * Optional. A string containing any valid Angular HTML which will be shown instead of the regular message text.
    * The string must contain one root element like all valid Angular HTML templates (so wrap everything in a <span>).
    */
  var messageTemplate: js.UndefOr[String] = js.native
  /**
    * Optional. Currently center and right are the only acceptable values.
    */
  var position: js.UndefOr[String] = js.native
  /**
    * Optional. A custom template for the UI of the message.
    */
  var templateUrl: js.UndefOr[String] = js.native
}

object Classes {
  @scala.inline
  def apply(message: String): Classes = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[Classes]
  }
  @scala.inline
  implicit class ClassesOps[Self <: Classes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with$scope(value: IScope): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$scope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$scope: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$scope")(js.undefined)
        ret
    }
    @scala.inline
    def withClasses(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClasses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classes")(js.undefined)
        ret
    }
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
    def withMessageTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessageTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageTemplate")(js.undefined)
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
  }
  
}

