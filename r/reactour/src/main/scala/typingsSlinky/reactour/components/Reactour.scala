package typingsSlinky.reactour.components

import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import slinky.web.html.div.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactour.mod.ReactourProps
import typingsSlinky.reactour.mod.ReactourStep
import typingsSlinky.reactour.mod.default
import typingsSlinky.reactour.reactourStrings.esc
import typingsSlinky.reactour.reactourStrings.left
import typingsSlinky.reactour.reactourStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Reactour {
  @JSImport("reactour", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def accentColor(value: String): this.type = set("accentColor", value.asInstanceOf[js.Any])
    @scala.inline
    def badgeContent(value: (/* current */ Double, /* total */ Double) => TagMod[Any]): this.type = set("badgeContent", js.Any.fromFunction2(value))
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def closeWithMask(value: Boolean): this.type = set("closeWithMask", value.asInstanceOf[js.Any])
    @scala.inline
    def disableDotsNavigation(value: Boolean): this.type = set("disableDotsNavigation", value.asInstanceOf[js.Any])
    @scala.inline
    def disableInteraction(value: Boolean): this.type = set("disableInteraction", value.asInstanceOf[js.Any])
    @scala.inline
    def disableKeyboardNavigation(value: Boolean | (js.Array[esc | right | left])): this.type = set("disableKeyboardNavigation", value.asInstanceOf[js.Any])
    @scala.inline
    def getCurrentStep(value: /* currentStep */ Double => Unit): this.type = set("getCurrentStep", js.Any.fromFunction1(value))
    @scala.inline
    def goToStep(value: Double): this.type = set("goToStep", value.asInstanceOf[js.Any])
    @scala.inline
    def highlightedMaskClassName(value: String): this.type = set("highlightedMaskClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def inViewThreshold(value: Double): this.type = set("inViewThreshold", value.asInstanceOf[js.Any])
    @scala.inline
    def lastStepNextButtonReactElement(value: ReactElement): this.type = set("lastStepNextButton", value.asInstanceOf[js.Any])
    @scala.inline
    def lastStepNextButton(value: TagMod[Any]): this.type = set("lastStepNextButton", value.asInstanceOf[js.Any])
    @scala.inline
    def maskClassName(value: String): this.type = set("maskClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def maskSpace(value: Double): this.type = set("maskSpace", value.asInstanceOf[js.Any])
    @scala.inline
    def nextButtonReactElement(value: ReactElement): this.type = set("nextButton", value.asInstanceOf[js.Any])
    @scala.inline
    def nextButton(value: TagMod[Any]): this.type = set("nextButton", value.asInstanceOf[js.Any])
    @scala.inline
    def nextStep(value: () => Unit): this.type = set("nextStep", js.Any.fromFunction0(value))
    @scala.inline
    def onAfterOpen(value: /* target */ HTMLDivElement => Unit): this.type = set("onAfterOpen", js.Any.fromFunction1(value))
    @scala.inline
    def onBeforeClose(value: /* target */ HTMLDivElement => Unit): this.type = set("onBeforeClose", js.Any.fromFunction1(value))
    @scala.inline
    def prevButtonReactElement(value: ReactElement): this.type = set("prevButton", value.asInstanceOf[js.Any])
    @scala.inline
    def prevButton(value: TagMod[Any]): this.type = set("prevButton", value.asInstanceOf[js.Any])
    @scala.inline
    def prevStep(value: () => Unit): this.type = set("prevStep", js.Any.fromFunction0(value))
    @scala.inline
    def rounded(value: Double): this.type = set("rounded", value.asInstanceOf[js.Any])
    @scala.inline
    def scrollDuration(value: Double): this.type = set("scrollDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def scrollOffset(value: Double): this.type = set("scrollOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def showButtons(value: Boolean): this.type = set("showButtons", value.asInstanceOf[js.Any])
    @scala.inline
    def showCloseButton(value: Boolean): this.type = set("showCloseButton", value.asInstanceOf[js.Any])
    @scala.inline
    def showNavigation(value: Boolean): this.type = set("showNavigation", value.asInstanceOf[js.Any])
    @scala.inline
    def showNavigationNumber(value: Boolean): this.type = set("showNavigationNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def showNumber(value: Boolean): this.type = set("showNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def startAt(value: Double): this.type = set("startAt", value.asInstanceOf[js.Any])
    @scala.inline
    def update(value: String): this.type = set("update", value.asInstanceOf[js.Any])
    @scala.inline
    def updateDelay(value: Double): this.type = set("updateDelay", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ReactourProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(
    isOpen: Boolean,
    onRequestClose: SyntheticMouseEvent[HTMLDivElement] => Unit,
    steps: js.Array[ReactourStep]
  ): Builder = {
    val __props = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any], onRequestClose = js.Any.fromFunction1(onRequestClose), steps = steps.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ReactourProps]))
  }
}

