package typingsSlinky.blueprintjsCore.propsMod

import typingsSlinky.blueprintjsCore.intentMod.Intent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IIntentProps extends js.Object {
  /** Visual intent color to apply to element. */
  var intent: js.UndefOr[Intent] = js.native
}

object IIntentProps {
  @scala.inline
  def apply(): IIntentProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IIntentProps]
  }
  @scala.inline
  implicit class IIntentPropsOps[Self <: IIntentProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIntent(value: Intent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIntent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intent")(js.undefined)
        ret
    }
  }
  
}

