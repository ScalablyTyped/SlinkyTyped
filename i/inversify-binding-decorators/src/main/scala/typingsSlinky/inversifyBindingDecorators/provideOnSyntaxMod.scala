package typingsSlinky.inversifyBindingDecorators

import typingsSlinky.inversify.interfacesMod.interfaces.Bind
import typingsSlinky.inversify.interfacesMod.interfaces.BindingOnSyntax
import typingsSlinky.inversifyBindingDecorators.interfacesMod.interfaces.ProvideDoneSyntax
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object provideOnSyntaxMod {
  
  @JSImport("inversify-binding-decorators/dts/syntax/provide_on_syntax", JSImport.Default)
  @js.native
  class default[T] protected () extends ProvideOnSyntax[T] {
    def this(
      bindingOnSyntax: js.Function2[/* bind */ Bind, /* target */ js.Any, BindingOnSyntax[T]],
      provideDoneSyntax: ProvideDoneSyntax
    ) = this()
  }
  
  @js.native
  trait ProvideOnSyntax[T]
    extends typingsSlinky.inversifyBindingDecorators.interfacesMod.interfaces.ProvideOnSyntax[T] {
    
    var _bindingOnSyntax: js.Any = js.native
    
    var _provideDoneSyntax: js.Any = js.native
  }
}
