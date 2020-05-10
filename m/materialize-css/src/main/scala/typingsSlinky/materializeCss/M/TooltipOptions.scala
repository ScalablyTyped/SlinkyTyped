package typingsSlinky.materializeCss.M

import typingsSlinky.materializeCss.materializeCssStrings.bottom
import typingsSlinky.materializeCss.materializeCssStrings.left
import typingsSlinky.materializeCss.materializeCssStrings.right
import typingsSlinky.materializeCss.materializeCssStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TooltipOptions extends js.Object {
  /**
    * Delay time before tooltip appears.
    * @default 200
    */
  var enterDelay: Double = js.native
  /**
    * Delay time before tooltip disappears.
    * @default 0
    */
  var exitDelay: Double = js.native
  /**
    * Can take regular text or HTML strings.
    * @default null
    */
  var html: String = js.native
  /**
    * Enter transition duration.
    * @default 300
    */
  var inDuration: Double = js.native
  /**
    * Set distance tooltip appears away from its activator excluding transitionMovement.
    * @default 5
    */
  var margin: Double = js.native
  /**
    * Exit transition duration.
    * @default 250
    */
  var outDuration: Double = js.native
  /**
    * Set the direction of the tooltip.
    * @default 'bottom'
    */
  var position: top | right | bottom | left = js.native
  /**
    * Amount in px that the tooltip moves during its transition.
    * @default 10
    */
  var transitionMovement: Double = js.native
}

object TooltipOptions {
  @scala.inline
  def apply(
    enterDelay: Double,
    exitDelay: Double,
    html: String,
    inDuration: Double,
    margin: Double,
    outDuration: Double,
    position: top | right | bottom | left,
    transitionMovement: Double
  ): TooltipOptions = {
    val __obj = js.Dynamic.literal(enterDelay = enterDelay.asInstanceOf[js.Any], exitDelay = exitDelay.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], inDuration = inDuration.asInstanceOf[js.Any], margin = margin.asInstanceOf[js.Any], outDuration = outDuration.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], transitionMovement = transitionMovement.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipOptions]
  }
  @scala.inline
  implicit class TooltipOptionsOps[Self <: TooltipOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnterDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enterDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExitDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exitDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHtml(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMargin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPosition(value: top | right | bottom | left): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransitionMovement(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionMovement")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

