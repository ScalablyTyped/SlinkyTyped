package typingsSlinky.reactNavigationStack

import org.scalablytyped.runtime.Instantiable0
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.ComponentPropsWithRef
import typingsSlinky.reactNative.mod.Animated.AnimatedProps
import typingsSlinky.reactNative.mod.Animated.ComponentProps
import typingsSlinky.reactNative.mod.Text
import typingsSlinky.reactNavigationStack.anon.Children
import typingsSlinky.reactNavigationStack.reactNavigationStackStrings.key
import typingsSlinky.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-navigation-stack/lib/typescript/src/vendor/views/Header/HeaderTitle", JSImport.Namespace)
@js.native
object headerTitleMod extends js.Object {
  def default(hasTintColorStyleRest: Props): ReactElement = js.native
  type Props = (Omit[
    typingsSlinky.react.mod.ComponentProps[
      ReactComponentClass[
        ComponentProps[Instantiable0[Text]] | AnimatedProps[ComponentPropsWithRef[Instantiable0[Text]]]
      ]
    ], 
    key
  ]) with Children
}

