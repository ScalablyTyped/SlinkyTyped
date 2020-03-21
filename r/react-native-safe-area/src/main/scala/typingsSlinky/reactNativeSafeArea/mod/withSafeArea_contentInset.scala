package typingsSlinky.reactNativeSafeArea.mod

import slinky.core.ReactComponentClass
import typingsSlinky.reactNativeSafeArea.reactNativeSafeAreaStrings.contentInset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-safe-area", "withSafeArea")
@js.native
object withSafeArea_contentInset extends js.Object {
  def apply[P](
    WrappedComponent: ReactComponentClass[P],
    /**
    * @default 'margin'
    */
  applyTo: contentInset,
    /**
    * @default 'all'
    */
  direction: Direction
  ): ReactComponentClass[P] = js.native
}

