package typingsSlinky.reactUserTour.mod

import slinky.core.facade.ReactElement
import typingsSlinky.reactUserTour.reactUserTourStrings.bottom
import typingsSlinky.reactUserTour.reactUserTourStrings.bottomLeft
import typingsSlinky.reactUserTour.reactUserTourStrings.left
import typingsSlinky.reactUserTour.reactUserTourStrings.right
import typingsSlinky.reactUserTour.reactUserTourStrings.top
import typingsSlinky.reactUserTour.reactUserTourStrings.topLeft
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TourStep extends js.Object {
  /**
    a react element representing the main body message of the tour step
    */
  var body: String | ReactElement = js.native
  /**
    Optional properties horizontalOffset and verticalOffset values allow to move tooltip around pointed element.
    */
  var horizontalOffset: js.UndefOr[Double] = js.native
  /**
    Each step can also take an optional argument, position which will override the position of the tour component in relation to the selector that is determined by the application.
    */
  var position: js.UndefOr[left | right | top | topLeft | bottom | bottomLeft] = js.native
  /**
    CSS selector to be passed to document.querySelector()
    */
  var selector: String = js.native
  /**
    Index number of the step in the tour
    */
  var step: Double = js.native
  /**
    a react element representing the header of the current step
    */
  var title: String | ReactElement = js.native
  /**
    Optional properties horizontalOffset and verticalOffset values allow to move tooltip around pointed element.
    */
  var verticalOffset: js.UndefOr[Double] = js.native
}

object TourStep {
  @scala.inline
  def apply(body: String | ReactElement, selector: String, step: Double, title: String | ReactElement): TourStep = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[TourStep]
  }
  @scala.inline
  implicit class TourStepOps[Self <: TourStep] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBodyReactElement(value: ReactElement): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def setBody(value: String | ReactElement): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelector(value: String): Self = this.set("selector", value.asInstanceOf[js.Any])
    @scala.inline
    def setStep(value: Double): Self = this.set("step", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitleReactElement(value: ReactElement): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String | ReactElement): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def setHorizontalOffset(value: Double): Self = this.set("horizontalOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHorizontalOffset: Self = this.set("horizontalOffset", js.undefined)
    @scala.inline
    def setPosition(value: left | right | top | topLeft | bottom | bottomLeft): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setVerticalOffset(value: Double): Self = this.set("verticalOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerticalOffset: Self = this.set("verticalOffset", js.undefined)
  }
  
}

