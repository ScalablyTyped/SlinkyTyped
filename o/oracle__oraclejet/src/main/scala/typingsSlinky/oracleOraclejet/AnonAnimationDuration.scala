package typingsSlinky.oracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAnimationDuration extends js.Object {
  var animationDuration: Double = js.native
  var hoverBehaviorDelay: Double = js.native
  var linkDefaults: AnonEndConnectorType = js.native
  var nodeDefaults: AnonIcon = js.native
  var promotedLink: AnonStartConnectorType = js.native
}

object AnonAnimationDuration {
  @scala.inline
  def apply(
    animationDuration: Double,
    hoverBehaviorDelay: Double,
    linkDefaults: AnonEndConnectorType,
    nodeDefaults: AnonIcon,
    promotedLink: AnonStartConnectorType
  ): AnonAnimationDuration = {
    val __obj = js.Dynamic.literal(animationDuration = animationDuration.asInstanceOf[js.Any], hoverBehaviorDelay = hoverBehaviorDelay.asInstanceOf[js.Any], linkDefaults = linkDefaults.asInstanceOf[js.Any], nodeDefaults = nodeDefaults.asInstanceOf[js.Any], promotedLink = promotedLink.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAnimationDuration]
  }
  @scala.inline
  implicit class AnonAnimationDurationOps[Self <: AnonAnimationDuration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimationDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHoverBehaviorDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverBehaviorDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLinkDefaults(value: AnonEndConnectorType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkDefaults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNodeDefaults(value: AnonIcon): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeDefaults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPromotedLink(value: AnonStartConnectorType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promotedLink")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

