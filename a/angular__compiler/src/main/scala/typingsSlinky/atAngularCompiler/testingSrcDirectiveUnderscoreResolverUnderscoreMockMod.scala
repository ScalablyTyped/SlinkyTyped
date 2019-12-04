package typingsSlinky.atAngularCompiler

import typingsSlinky.atAngularCompiler.atAngularCompilerMod.CompileReflector
import typingsSlinky.atAngularCompiler.atAngularCompilerMod.DirectiveResolver
import typingsSlinky.atAngularCompiler.srcCoreMod.Directive
import typingsSlinky.atAngularCompiler.srcCoreMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/testing/src/directive_resolver_mock", JSImport.Namespace)
@js.native
object testingSrcDirectiveUnderscoreResolverUnderscoreMockMod extends js.Object {
  @js.native
  class MockDirectiveResolver protected () extends DirectiveResolver {
    def this(reflector: CompileReflector) = this()
    var _directives: js.Any = js.native
    /**
      * Overrides the {@link core.Directive} for a directive.
      */
    def setDirective(`type`: Type, metadata: Directive): Unit = js.native
  }
  
}

