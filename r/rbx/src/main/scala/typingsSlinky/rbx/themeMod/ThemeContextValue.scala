package typingsSlinky.rbx.themeMod

import typingsSlinky.rbx.anon.ClassName
import typingsSlinky.rbx.factoryMod.TransformFunction
import typingsSlinky.rbx.factoryMod.ValidatingTransformFunction
import typingsSlinky.std.Partial
import typingsSlinky.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThemeContextValue[TTransformProps /* <: js.Object */, TNewProps /* <: js.Object */] extends js.Object {
  var transform: ValidatingTransformFunction[TTransformProps, TNewProps] = js.native
}

object ThemeContextValue {
  @scala.inline
  def apply[TTransformProps, TNewProps](
    transform: (/* props */ ClassName with Partial[TTransformProps], /* componentName */ String, /* location */ js.UndefOr[String]) => ReturnType[TransformFunction[TTransformProps, TNewProps]]
  ): ThemeContextValue[TTransformProps, TNewProps] = {
    val __obj = js.Dynamic.literal(transform = js.Any.fromFunction3(transform))
    __obj.asInstanceOf[ThemeContextValue[TTransformProps, TNewProps]]
  }
  @scala.inline
  implicit class ThemeContextValueOps[Self[ttransformprops, tnewprops] <: ThemeContextValue[ttransformprops, tnewprops], TTransformProps, TNewProps] (val x: Self[TTransformProps, TNewProps]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TTransformProps, TNewProps] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TTransformProps, TNewProps]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TTransformProps, TNewProps]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TTransformProps, TNewProps]) with Other]
    @scala.inline
    def withTransform(
      value: (/* props */ ClassName with Partial[TTransformProps], /* componentName */ String, /* location */ js.UndefOr[String]) => ReturnType[TransformFunction[TTransformProps, TNewProps]]
    ): Self[TTransformProps, TNewProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(js.Any.fromFunction3(value))
        ret
    }
  }
  
}

