package typingsSlinky.rbx

import typingsSlinky.rbx.anon.ClassName
import typingsSlinky.rbx.anon.PreferHelpersPropsOverrid
import typingsSlinky.rbx.factoryMod.TransformFunction
import typingsSlinky.rbx.factoryMod.ValidatingTransformFunction
import typingsSlinky.rbx.helpersMod.HelpersProps
import typingsSlinky.react.mod.Context
import typingsSlinky.std.Partial
import typingsSlinky.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object themeMod {
  
  @JSImport("rbx/base/theme", "ThemeContext")
  @js.native
  val ThemeContext: Context[ThemeContextValue[PreferHelpersPropsOverrid, js.Object]] = js.native
  
  @JSImport("rbx/base/theme", "initialValue")
  @js.native
  val initialValue: ThemeContextValue[HelpersProps, js.Object] = js.native
  
  @js.native
  trait ThemeContextValue[TTransformProps /* <: js.Object */, TNewProps /* <: js.Object */] extends StObject {
    
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
    implicit class ThemeContextValueMutableBuilder[Self <: ThemeContextValue[_, _], TTransformProps /* <: js.Object */, TNewProps /* <: js.Object */] (val x: Self with (ThemeContextValue[TTransformProps, TNewProps])) extends AnyVal {
      
      @scala.inline
      def setTransform(
        value: (/* props */ ClassName with Partial[TTransformProps], /* componentName */ String, /* location */ js.UndefOr[String]) => ReturnType[TransformFunction[TTransformProps, TNewProps]]
      ): Self = StObject.set(x, "transform", js.Any.fromFunction3(value))
    }
  }
}
