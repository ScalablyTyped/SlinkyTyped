package typingsSlinky.angularCompiler.anon

import typingsSlinky.angularCompiler.aotCompilerMod.NgAnalyzedFileWithInjectables
import typingsSlinky.angularCompiler.aotCompilerMod.NgAnalyzedModules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnalyzedInjectables extends StObject {
  
  var analyzedInjectables: js.Array[NgAnalyzedFileWithInjectables] = js.native
  
  var analyzedModules: NgAnalyzedModules = js.native
}
object AnalyzedInjectables {
  
  @scala.inline
  def apply(analyzedInjectables: js.Array[NgAnalyzedFileWithInjectables], analyzedModules: NgAnalyzedModules): AnalyzedInjectables = {
    val __obj = js.Dynamic.literal(analyzedInjectables = analyzedInjectables.asInstanceOf[js.Any], analyzedModules = analyzedModules.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyzedInjectables]
  }
  
  @scala.inline
  implicit class AnalyzedInjectablesMutableBuilder[Self <: AnalyzedInjectables] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnalyzedInjectables(value: js.Array[NgAnalyzedFileWithInjectables]): Self = StObject.set(x, "analyzedInjectables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnalyzedInjectablesVarargs(value: NgAnalyzedFileWithInjectables*): Self = StObject.set(x, "analyzedInjectables", js.Array(value :_*))
    
    @scala.inline
    def setAnalyzedModules(value: NgAnalyzedModules): Self = StObject.set(x, "analyzedModules", value.asInstanceOf[js.Any])
  }
}
