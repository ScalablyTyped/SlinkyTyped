package typingsSlinky.antDesignReactNative.accordionMod

import slinky.core.facade.ReactElement
import typingsSlinky.antDesignReactNative.AnonArrow
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Accordion[T /* <: AccordionHeader */]
  extends Component[AccordionNativeProps[T], js.Any, js.Any] {
  def renderContent(styles: AnonArrow): js.Function1[/* section */ T, ReactElement] = js.native
  def renderHeader(styles: AnonArrow): js.Function3[/* section */ T, /* _ */ Double, /* isActive */ Boolean, ReactElement] = js.native
}

