package typingsSlinky.angularAgility.aa

import typingsSlinky.angular.mod.IAugmentedJQueryStatic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IValidIconStrategy extends js.Object {
  var invalidIcon: String = js.native
  var validIcon: String = js.native
  def getContainer(element: IAugmentedJQueryStatic): Unit = js.native
}

object IValidIconStrategy {
  @scala.inline
  def apply(getContainer: IAugmentedJQueryStatic => Unit, invalidIcon: String, validIcon: String): IValidIconStrategy = {
    val __obj = js.Dynamic.literal(getContainer = js.Any.fromFunction1(getContainer), invalidIcon = invalidIcon.asInstanceOf[js.Any], validIcon = validIcon.asInstanceOf[js.Any])
    __obj.asInstanceOf[IValidIconStrategy]
  }
  @scala.inline
  implicit class IValidIconStrategyOps[Self <: IValidIconStrategy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetContainer(value: IAugmentedJQueryStatic => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getContainer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInvalidIcon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalidIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValidIcon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validIcon")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

