package typingsSlinky.rbx.themeMod

import typingsSlinky.rbx.anon.ClassName
import typingsSlinky.rbx.factoryMod.TransformFunction
import typingsSlinky.rbx.factoryMod.ValidatingTransformFunction
import typingsSlinky.std.Partial
import typingsSlinky.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThemeContextValue[TTransformProps /* <: js.Object */, TNewProps /* <: js.Object */] extends js.Object {
  var transform: ValidatingTransformFunction[TTransformProps, TNewProps]
}

object ThemeContextValue {
  @scala.inline
  def apply[TTransformProps, TNewProps](
    transform: (/* props */ ClassName with Partial[TTransformProps], /* componentName */ String, /* location */ js.UndefOr[String]) => ReturnType[TransformFunction[TTransformProps, TNewProps]]
  ): ThemeContextValue[TTransformProps, TNewProps] = {
    val __obj = js.Dynamic.literal(transform = js.Any.fromFunction3(transform))
    __obj.asInstanceOf[ThemeContextValue[TTransformProps, TNewProps]]
  }
}

