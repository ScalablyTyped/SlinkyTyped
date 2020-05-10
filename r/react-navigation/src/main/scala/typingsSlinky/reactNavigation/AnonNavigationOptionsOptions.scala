package typingsSlinky.reactNavigation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonNavigationOptionsOptions[Options] extends js.Object {
  var navigationOptions: Options = js.native
}

object AnonNavigationOptionsOptions {
  @scala.inline
  def apply[Options](navigationOptions: Options): AnonNavigationOptionsOptions[Options] = {
    val __obj = js.Dynamic.literal(navigationOptions = navigationOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNavigationOptionsOptions[Options]]
  }
  @scala.inline
  implicit class AnonNavigationOptionsOptionsOps[Self[options] <: AnonNavigationOptionsOptions[options], Options] (val x: Self[Options]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Options] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Options]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[Options] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[Options] with Other]
    @scala.inline
    def withNavigationOptions(value: Options): Self[Options] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigationOptions")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

