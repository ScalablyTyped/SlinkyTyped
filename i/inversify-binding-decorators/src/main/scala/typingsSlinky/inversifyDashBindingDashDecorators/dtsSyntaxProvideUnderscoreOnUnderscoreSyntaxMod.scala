package typingsSlinky.inversifyDashBindingDashDecorators

import typingsSlinky.inversify.dtsInterfacesInterfacesMod.interfaces.Bind
import typingsSlinky.inversify.dtsInterfacesInterfacesMod.interfaces.BindingOnSyntax
import typingsSlinky.inversifyDashBindingDashDecorators.dtsInterfacesInterfacesMod.interfaces.ProvideDoneSyntax
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inversify-binding-decorators/dts/syntax/provide_on_syntax", JSImport.Namespace)
@js.native
object dtsSyntaxProvideUnderscoreOnUnderscoreSyntaxMod extends js.Object {
  @js.native
  trait ProvideOnSyntax[T]
    extends typingsSlinky.inversifyDashBindingDashDecorators.dtsInterfacesInterfacesMod.interfaces.ProvideOnSyntax[T] {
    var _bindingOnSyntax: js.Any = js.native
    var _provideDoneSyntax: js.Any = js.native
  }
  
  @js.native
  class default[T] protected () extends ProvideOnSyntax[T] {
    def this(
      bindingOnSyntax: js.Function2[/* bind */ Bind, /* target */ js.Any, BindingOnSyntax[T]],
      provideDoneSyntax: ProvideDoneSyntax
    ) = this()
  }
  
}

