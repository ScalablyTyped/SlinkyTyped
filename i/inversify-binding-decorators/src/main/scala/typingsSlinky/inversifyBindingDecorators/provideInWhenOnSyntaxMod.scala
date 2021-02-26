package typingsSlinky.inversifyBindingDecorators

import typingsSlinky.inversifyBindingDecorators.interfacesMod.interfaces.ProvideInSyntax
import typingsSlinky.inversifyBindingDecorators.interfacesMod.interfaces.ProvideOnSyntax
import typingsSlinky.inversifyBindingDecorators.interfacesMod.interfaces.ProvideWhenSyntax
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object provideInWhenOnSyntaxMod {
  
  @JSImport("inversify-binding-decorators/dts/syntax/provide_in_when_on_syntax", JSImport.Default)
  @js.native
  class default[T] protected () extends ProvideInWhenOnSyntax[T] {
    def this(
      provideInSyntax: ProvideInSyntax[T],
      provideWhenSyntax: ProvideWhenSyntax[T],
      provideOnSyntax: ProvideOnSyntax[T]
    ) = this()
  }
  
  @js.native
  trait ProvideInWhenOnSyntax[T]
    extends typingsSlinky.inversifyBindingDecorators.interfacesMod.interfaces.ProvideInWhenOnSyntax[T] {
    
    var _provideInSyntax: js.Any = js.native
    
    var _provideOnSyntax: js.Any = js.native
    
    var _provideWhenSyntax: js.Any = js.native
  }
}
