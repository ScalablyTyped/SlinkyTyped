package typingsSlinky.reactJoyride.components

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactJoyride.mod.BeaconRenderProps
import typingsSlinky.reactJoyride.mod.CallBackProps
import typingsSlinky.reactJoyride.mod.FloaterProps
import typingsSlinky.reactJoyride.mod.Locale
import typingsSlinky.reactJoyride.mod.Props
import typingsSlinky.reactJoyride.mod.Step
import typingsSlinky.reactJoyride.mod.StoreHelpers
import typingsSlinky.reactJoyride.mod.Styles
import typingsSlinky.reactJoyride.mod.TooltipRenderProps
import typingsSlinky.reactJoyride.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactJoyride {
  @JSImport("react-joyride", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def beaconComponentFunctionComponent(value: ReactComponentClass[BeaconRenderProps]): this.type = set("beaconComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def beaconComponentComponentClass(value: ReactComponentClass[BeaconRenderProps]): this.type = set("beaconComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def beaconComponent(value: ReactElement): this.type = set("beaconComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def callback(value: /* data */ CallBackProps => Unit): this.type = set("callback", js.Any.fromFunction1(value))
    @scala.inline
    def continuous(value: Boolean): this.type = set("continuous", value.asInstanceOf[js.Any])
    @scala.inline
    def debug(value: Boolean): this.type = set("debug", value.asInstanceOf[js.Any])
    @scala.inline
    def disableCloseOnEsc(value: Boolean): this.type = set("disableCloseOnEsc", value.asInstanceOf[js.Any])
    @scala.inline
    def disableOverlay(value: Boolean): this.type = set("disableOverlay", value.asInstanceOf[js.Any])
    @scala.inline
    def disableOverlayClose(value: Boolean): this.type = set("disableOverlayClose", value.asInstanceOf[js.Any])
    @scala.inline
    def disableScrollParentFix(value: Boolean): this.type = set("disableScrollParentFix", value.asInstanceOf[js.Any])
    @scala.inline
    def disableScrolling(value: Boolean): this.type = set("disableScrolling", value.asInstanceOf[js.Any])
    @scala.inline
    def floaterProps(value: FloaterProps): this.type = set("floaterProps", value.asInstanceOf[js.Any])
    @scala.inline
    def getHelpers(value: /* helpers */ StoreHelpers => _): this.type = set("getHelpers", js.Any.fromFunction1(value))
    @scala.inline
    def hideBackButton(value: Boolean): this.type = set("hideBackButton", value.asInstanceOf[js.Any])
    @scala.inline
    def locale(value: Locale): this.type = set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def run(value: Boolean): this.type = set("run", value.asInstanceOf[js.Any])
    @scala.inline
    def scrollOffset(value: Double): this.type = set("scrollOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def scrollToFirstStep(value: Boolean): this.type = set("scrollToFirstStep", value.asInstanceOf[js.Any])
    @scala.inline
    def showProgress(value: Boolean): this.type = set("showProgress", value.asInstanceOf[js.Any])
    @scala.inline
    def showSkipButton(value: Boolean): this.type = set("showSkipButton", value.asInstanceOf[js.Any])
    @scala.inline
    def spotlightClicks(value: Boolean): this.type = set("spotlightClicks", value.asInstanceOf[js.Any])
    @scala.inline
    def spotlightPadding(value: Double): this.type = set("spotlightPadding", value.asInstanceOf[js.Any])
    @scala.inline
    def stepIndex(value: Double): this.type = set("stepIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def styles(value: Styles): this.type = set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def tooltipComponentFunctionComponent(value: ReactComponentClass[TooltipRenderProps]): this.type = set("tooltipComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def tooltipComponentComponentClass(value: ReactComponentClass[TooltipRenderProps]): this.type = set("tooltipComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def tooltipComponent(value: ReactElement): this.type = set("tooltipComponent", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(steps: js.Array[Step]): Builder = {
    val __props = js.Dynamic.literal(steps = steps.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[Props]))
  }
}

