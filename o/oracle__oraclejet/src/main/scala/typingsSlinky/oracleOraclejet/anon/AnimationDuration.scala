package typingsSlinky.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnimationDuration extends js.Object {
  var animationDuration: Double = js.native
  var hoverBehaviorDelay: Double = js.native
  var linkDefaults: EndConnectorType = js.native
  var nodeDefaults: Icon = js.native
  var promotedLink: StartConnectorType = js.native
}

object AnimationDuration {
  @scala.inline
  def apply(
    animationDuration: Double,
    hoverBehaviorDelay: Double,
    linkDefaults: EndConnectorType,
    nodeDefaults: Icon,
    promotedLink: StartConnectorType
  ): AnimationDuration = {
    val __obj = js.Dynamic.literal(animationDuration = animationDuration.asInstanceOf[js.Any], hoverBehaviorDelay = hoverBehaviorDelay.asInstanceOf[js.Any], linkDefaults = linkDefaults.asInstanceOf[js.Any], nodeDefaults = nodeDefaults.asInstanceOf[js.Any], promotedLink = promotedLink.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationDuration]
  }
  @scala.inline
  implicit class AnimationDurationOps[Self <: AnimationDuration] (val x: Self) extends AnyVal {
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
    def withLinkDefaults(value: EndConnectorType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkDefaults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNodeDefaults(value: Icon): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeDefaults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPromotedLink(value: StartConnectorType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promotedLink")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

