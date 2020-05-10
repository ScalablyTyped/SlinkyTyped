package typingsSlinky.gapiClientTesting.gapi.client.testing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RoboDirective extends js.Object {
  /**
    * The type of action that Robo should perform on the specified element.
    * Required.
    */
  var actionType: js.UndefOr[String] = js.native
  /**
    * The text that Robo is directed to set. If left empty, the directive will be
    * treated as a CLICK on the element matching the resource_name.
    * Optional
    */
  var inputText: js.UndefOr[String] = js.native
  /**
    * The android resource name of the target UI element
    * For example,
    * in Java: R.string.foo
    * in xml: @string/foo
    * Only the “foo” part is needed.
    * Reference doc:
    * https://developer.android.com/guide/topics/resources/accessing-resources.html
    * Required
    */
  var resourceName: js.UndefOr[String] = js.native
}

object RoboDirective {
  @scala.inline
  def apply(): RoboDirective = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RoboDirective]
  }
  @scala.inline
  implicit class RoboDirectiveOps[Self <: RoboDirective] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActionType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActionType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionType")(js.undefined)
        ret
    }
    @scala.inline
    def withInputText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputText")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceName")(js.undefined)
        ret
    }
  }
  
}

