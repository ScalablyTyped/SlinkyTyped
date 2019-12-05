package typingsSlinky.reactour

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactourMod {
  import slinky.core.ReactComponentClass
  import typingsSlinky.react.reactMod.ComponentPropsWithRef
  import typingsSlinky.reactour.reactourStrings.div
  import typingsSlinky.reactour.reactourStrings.nav

  type ControlsProps = ComponentPropsWithRef[div]
  type NavigationProps = ComponentPropsWithRef[nav]
  type Tour = ReactComponentClass[ReactourProps]
}
