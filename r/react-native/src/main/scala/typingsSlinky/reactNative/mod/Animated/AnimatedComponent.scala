package typingsSlinky.reactNative.mod.Animated

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.FunctionComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnimatedComponent[T /* <: ReactComponentClass[ComponentProps[T]] */] extends FunctionComponent[AnimatedProps[ComponentProps[T]]] {
  def getNode(): T = js.native
}

