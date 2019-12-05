package typingsSlinky.reactDashNativeDashSafeDashArea.reactDashNativeDashSafeDashAreaMod

import slinky.core.ReactComponentClass
import typingsSlinky.reactDashNativeDashSafeDashArea.reactDashNativeDashSafeDashAreaStrings.padding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-safe-area", "withSafeArea")
@js.native
object withSafeArea_padding extends js.Object {
  def apply[P](
    WrappedComponent: ReactComponentClass[P],
    /**
    * @default 'margin'
    */
  applyTo: padding,
    /**
    * @default 'all'
    */
  direction: Direction
  ): ReactComponentClass[P] = js.native
}

