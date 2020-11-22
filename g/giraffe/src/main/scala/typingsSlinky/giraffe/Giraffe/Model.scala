package typingsSlinky.giraffe.Giraffe

import typingsSlinky.backbone.mod.ModelSetOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.giraffe.Giraffe.GiraffeObject because var conflicts: initialize. Inlined app, appEvents, dataEvents, defaultOptions, beforeInitialize, afterInitialize, dispose, beforeDispose, afterDispose */ @js.native
trait Model
  extends typingsSlinky.backbone.mod.Model[js.Any, ModelSetOptions, js.Object] {
  
  var afterDispose: js.UndefOr[js.Function0[js.Any]] = js.native
  
  var afterInitialize: js.UndefOr[js.Function0[js.Any]] = js.native
  
  var app: App = js.native
  
  var appEvents: js.UndefOr[StringMap] = js.native
  
  var beforeDispose: js.UndefOr[js.Function0[js.Any]] = js.native
  
  var beforeInitialize: js.UndefOr[js.Function0[js.Any]] = js.native
  
  var dataEvents: js.UndefOr[StringMap] = js.native
  
  var defaultOptions: js.UndefOr[DefaultOptions] = js.native
  
  var dispose: js.UndefOr[js.Function0[js.Any]] = js.native
}
