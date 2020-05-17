package typingsSlinky.gapiClientAnalytics.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InteractionType extends js.Object {
  /** Type of an interaction on conversion path. Such as CLICK, IMPRESSION etc. */
  var interactionType: js.UndefOr[String] = js.native
  /** Node value of an interaction on conversion path. Such as source, medium etc. */
  var nodeValue: js.UndefOr[String] = js.native
}

object InteractionType {
  @scala.inline
  def apply(): InteractionType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InteractionType]
  }
  @scala.inline
  implicit class InteractionTypeOps[Self <: InteractionType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInteractionType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interactionType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInteractionType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interactionType")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodeValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeValue")(js.undefined)
        ret
    }
  }
  
}

