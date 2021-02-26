package typingsSlinky.colorNamer

import typingsSlinky.colorNamer.anon.Omit
import typingsSlinky.colorNamer.anon.Pick
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("color-namer", JSImport.Namespace)
  @js.native
  def apply[T /* <: Palette */](color: String): Colors[T] = js.native
  @JSImport("color-namer", JSImport.Namespace)
  @js.native
  def apply[T /* <: Palette */](color: String, options: Omit[T]): Colors[Diff[Palette, T]] = js.native
  @JSImport("color-namer", JSImport.Namespace)
  @js.native
  def apply[T /* <: Palette */](color: String, options: Pick[T]): Colors[T] = js.native
  
  @js.native
  trait Color extends StObject {
    
    var distance: Double = js.native
    
    var hex: String = js.native
    
    var name: String = js.native
  }
  object Color {
    
    @scala.inline
    def apply(distance: Double, hex: String, name: String): Color = {
      val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], hex = hex.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Color]
    }
    
    @scala.inline
    implicit class ColorMutableBuilder[Self <: Color] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHex(value: String): Self = StObject.set(x, "hex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  type Colors[T /* <: Palette */] = Record[T, js.Array[Color]]
  
  type Diff[T /* <: String */, U /* <: String */] = /* import warning: importer.ImportType#apply Failed type conversion: {[ P in T ]: P} & {[ P in U ]: never} & {[x: string] : never}[T] */ js.Any
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.colorNamer.colorNamerStrings.roygbiv
    - typingsSlinky.colorNamer.colorNamerStrings.basic
    - typingsSlinky.colorNamer.colorNamerStrings.html
    - typingsSlinky.colorNamer.colorNamerStrings.x11
    - typingsSlinky.colorNamer.colorNamerStrings.pantone
    - typingsSlinky.colorNamer.colorNamerStrings.ntc
  */
  trait Palette extends StObject
  object Palette {
    
    @scala.inline
    def basic: typingsSlinky.colorNamer.colorNamerStrings.basic = "basic".asInstanceOf[typingsSlinky.colorNamer.colorNamerStrings.basic]
    
    @scala.inline
    def html: typingsSlinky.colorNamer.colorNamerStrings.html = "html".asInstanceOf[typingsSlinky.colorNamer.colorNamerStrings.html]
    
    @scala.inline
    def ntc: typingsSlinky.colorNamer.colorNamerStrings.ntc = "ntc".asInstanceOf[typingsSlinky.colorNamer.colorNamerStrings.ntc]
    
    @scala.inline
    def pantone: typingsSlinky.colorNamer.colorNamerStrings.pantone = "pantone".asInstanceOf[typingsSlinky.colorNamer.colorNamerStrings.pantone]
    
    @scala.inline
    def roygbiv: typingsSlinky.colorNamer.colorNamerStrings.roygbiv = "roygbiv".asInstanceOf[typingsSlinky.colorNamer.colorNamerStrings.roygbiv]
    
    @scala.inline
    def x11: typingsSlinky.colorNamer.colorNamerStrings.x11 = "x11".asInstanceOf[typingsSlinky.colorNamer.colorNamerStrings.x11]
  }
}
