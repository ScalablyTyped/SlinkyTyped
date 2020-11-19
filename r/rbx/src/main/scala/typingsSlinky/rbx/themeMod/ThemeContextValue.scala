package typingsSlinky.rbx.themeMod

import typingsSlinky.rbx.anon.ClassName
import typingsSlinky.rbx.factoryMod.TransformFunction
import typingsSlinky.rbx.factoryMod.ValidatingTransformFunction
import typingsSlinky.std.Partial
import typingsSlinky.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThemeContextValue[TTransformProps /* <: js.Object */, TNewProps /* <: js.Object */] extends js.Object {
  
  var transform: ValidatingTransformFunction[TTransformProps, TNewProps] = js.native
}
object ThemeContextValue {
  
  @scala.inline
  def apply[TTransformProps /* <: js.Object */, TNewProps /* <: js.Object */](
    transform: (/* props */ ClassName with Partial[TTransformProps], /* componentName */ String, /* location */ js.UndefOr[String]) => ReturnType[TransformFunction[TTransformProps, TNewProps]]
  ): ThemeContextValue[TTransformProps, TNewProps] = {
    val __obj = js.Dynamic.literal(transform = js.Any.fromFunction3(transform))
    __obj.asInstanceOf[ThemeContextValue[TTransformProps, TNewProps]]
  }
  
  @scala.inline
  implicit class ThemeContextValueOps[Self <: ThemeContextValue[_, _], TTransformProps /* <: js.Object */, TNewProps /* <: js.Object */] (val x: Self with (ThemeContextValue[TTransformProps, TNewProps])) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setTransform(
      value: (/* props */ ClassName with Partial[TTransformProps], /* componentName */ String, /* location */ js.UndefOr[String]) => ReturnType[TransformFunction[TTransformProps, TNewProps]]
    ): Self = this.set("transform", js.Any.fromFunction3(value))
  }
}
