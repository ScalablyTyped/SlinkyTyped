package typingsSlinky.reactNavigationStack.createPointerEventsContainerMod

import slinky.core.ReactComponentClass
import typingsSlinky.reactNavigationStack.reactNavigationStackStrings.onComponentRef
import typingsSlinky.reactNavigationStack.reactNavigationStackStrings.pointerEvents
import typingsSlinky.std.Exclude
import typingsSlinky.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-navigation-stack/lib/typescript/views/StackView/createPointerEventsContainer", JSImport.Default)
@js.native
object default extends js.Object {
  def apply[Props /* <: InjectedProps with InputProps */](Component: ReactComponentClass[Props]): ReactComponentClass[
    Pick[
      Props, 
      Exclude[
        /* keyof Props */ String, 
        /* keyof react-navigation-stack.react-navigation-stack/lib/typescript/views/StackView/createPointerEventsContainer.InjectedProps */ pointerEvents | onComponentRef
      ]
    ]
  ] = js.native
}

