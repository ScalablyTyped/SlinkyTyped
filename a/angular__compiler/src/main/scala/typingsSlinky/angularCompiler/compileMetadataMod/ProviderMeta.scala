package typingsSlinky.angularCompiler.compileMetadataMod

import typingsSlinky.angularCompiler.anon.Deps
import typingsSlinky.angularCompiler.coreMod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/compile_metadata", "ProviderMeta")
@js.native
class ProviderMeta protected () extends StObject {
  def this(token: js.Any, hasUseClassUseValueUseExistingUseFactoryDepsMulti: Deps) = this()
  
  var dependencies: js.Array[js.Object] | Null = js.native
  
  var multi: Boolean = js.native
  
  var token: js.Any = js.native
  
  var useClass: Type | Null = js.native
  
  var useExisting: js.Any = js.native
  
  var useFactory: js.Function | Null = js.native
  
  var useValue: js.Any = js.native
}
