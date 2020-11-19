package typingsSlinky.angularCompiler

import typingsSlinky.angularCompiler.anon.DefaultEncapsulation
import typingsSlinky.angularCompiler.coreMod.MissingTranslationStrategy
import typingsSlinky.angularCompiler.coreMod.ViewEncapsulation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/config", JSImport.Namespace)
@js.native
object configMod extends js.Object {
  
  def preserveWhitespacesDefault(): Boolean = js.native
  def preserveWhitespacesDefault(preserveWhitespacesOption: Boolean): Boolean = js.native
  def preserveWhitespacesDefault(preserveWhitespacesOption: Boolean, defaultSetting: Boolean): Boolean = js.native
  def preserveWhitespacesDefault(preserveWhitespacesOption: Null, defaultSetting: Boolean): Boolean = js.native
  
  @js.native
  class CompilerConfig () extends js.Object {
    def this(hasDefaultEncapsulationUseJitJitDevModeMissingTranslationPreserveWhitespacesStrictInjectionParameters: DefaultEncapsulation) = this()
    
    var defaultEncapsulation: ViewEncapsulation | Null = js.native
    
    var jitDevMode: Boolean = js.native
    
    var missingTranslation: MissingTranslationStrategy | Null = js.native
    
    var preserveWhitespaces: Boolean = js.native
    
    var strictInjectionParameters: Boolean = js.native
    
    var useJit: Boolean = js.native
  }
}
