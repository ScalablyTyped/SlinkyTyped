package typingsSlinky.inversifyBindingDecorators

import typingsSlinky.inversifyBindingDecorators.interfacesMod.interfaces.ProvideOnSyntax
import typingsSlinky.inversifyBindingDecorators.interfacesMod.interfaces.ProvideWhenSyntax
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object provideWhenOnSyntaxMod {
  
  @JSImport("inversify-binding-decorators/dts/syntax/provide_when_on_syntax", JSImport.Default)
  @js.native
  class default[T] protected () extends ProvideWhenOnSyntax[T] {
    def this(provideWhenSyntax: ProvideWhenSyntax[T], provideOnSyntax: ProvideOnSyntax[T]) = this()
  }
  
  @js.native
  trait ProvideWhenOnSyntax[T]
    extends typingsSlinky.inversifyBindingDecorators.interfacesMod.interfaces.ProvideWhenOnSyntax[T] {
    
    var _provideOnSyntax: js.Any = js.native
    
    var _provideWhenSyntax: js.Any = js.native
  }
}
