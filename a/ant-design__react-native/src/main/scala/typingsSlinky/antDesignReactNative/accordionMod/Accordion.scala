package typingsSlinky.antDesignReactNative.accordionMod

import slinky.core.facade.ReactElement
import typingsSlinky.antDesignReactNative.anon.Arrow
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Accordion[T /* <: AccordionHeader */]
  extends Component[AccordionNativeProps[T], js.Any, js.Any] {
  def renderContent(styles: Arrow): js.Function1[/* section */ T, ReactElement] = js.native
  def renderHeader(styles: Arrow): js.Function3[/* section */ T, /* _ */ Double, /* isActive */ Boolean, ReactElement] = js.native
}

