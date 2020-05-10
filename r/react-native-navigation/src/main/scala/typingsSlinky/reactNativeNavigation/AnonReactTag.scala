package typingsSlinky.reactNativeNavigation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonReactTag extends js.Object {
  var reactTag: Double | Null = js.native
}

object AnonReactTag {
  @scala.inline
  def apply(): AnonReactTag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonReactTag]
  }
  @scala.inline
  implicit class AnonReactTagOps[Self <: AnonReactTag] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReactTag(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reactTag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReactTagNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reactTag")(null)
        ret
    }
  }
  
}

