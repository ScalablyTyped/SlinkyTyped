package typingsSlinky.inkGradient

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.TopLevel
import typingsSlinky.inkGradient.anon.Children
import typingsSlinky.inkGradient.inkGradientStrings.atlas
import typingsSlinky.inkGradient.inkGradientStrings.cristal
import typingsSlinky.inkGradient.inkGradientStrings.fruit
import typingsSlinky.inkGradient.inkGradientStrings.instagram
import typingsSlinky.inkGradient.inkGradientStrings.mind
import typingsSlinky.inkGradient.inkGradientStrings.morning
import typingsSlinky.inkGradient.inkGradientStrings.passion
import typingsSlinky.inkGradient.inkGradientStrings.pastel
import typingsSlinky.inkGradient.inkGradientStrings.rainbow
import typingsSlinky.inkGradient.inkGradientStrings.retro
import typingsSlinky.inkGradient.inkGradientStrings.summer
import typingsSlinky.inkGradient.inkGradientStrings.teen
import typingsSlinky.inkGradient.inkGradientStrings.vice
import typingsSlinky.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("ink-gradient", JSImport.Namespace)
  @js.native
  val ^ : FC[GradientProps] = js.native
  
  type GradientProps = (XOR[PropsName, PropsColor]) with Children
  
  // note, object[] in this case refers to objects interpretable by tinycolor2
  @js.native
  trait PropsColor extends StObject {
    
    var colors: js.Array[js.Object | String] = js.native
  }
  object PropsColor {
    
    @scala.inline
    def apply(colors: js.Array[js.Object | String]): PropsColor = {
      val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any])
      __obj.asInstanceOf[PropsColor]
    }
    
    @scala.inline
    implicit class PropsColorMutableBuilder[Self <: PropsColor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColors(value: js.Array[js.Object | String]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorsVarargs(value: (js.Object | String)*): Self = StObject.set(x, "colors", js.Array(value :_*))
    }
  }
  
  @js.native
  trait PropsName extends StObject {
    
    var name: cristal | teen | mind | morning | vice | passion | fruit | instagram | atlas | retro | summer | pastel | rainbow = js.native
  }
  object PropsName {
    
    @scala.inline
    def apply(
      name: cristal | teen | mind | morning | vice | passion | fruit | instagram | atlas | retro | summer | pastel | rainbow
    ): PropsName = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[PropsName]
    }
    
    @scala.inline
    implicit class PropsNameMutableBuilder[Self <: PropsName] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(
        value: cristal | teen | mind | morning | vice | passion | fruit | instagram | atlas | retro | summer | pastel | rainbow
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  // This needs to be updated when TypeScript enhances their support for mutual
  // exclusivity in properties. This edit I made will now throw errors when
  // a user gives both of the mutually exclusive props.
  type Without[T, U] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in std.Exclude<keyof T, keyof U> ]:? never}
    */ typingsSlinky.inkGradient.inkGradientStrings.Without with TopLevel[js.Any]
  
  type XOR[T, U] = T | U | ((Without[T, U]) with U) | ((Without[U, T]) with T)
  
  type _To = FC[GradientProps]
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: FC[GradientProps] = ^
}
