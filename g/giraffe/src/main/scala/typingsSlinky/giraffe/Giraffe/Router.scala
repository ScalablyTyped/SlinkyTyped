package typingsSlinky.giraffe.Giraffe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.giraffe.Giraffe.GiraffeObject because var conflicts: initialize. Inlined app, appEvents, dataEvents, defaultOptions, beforeInitialize, afterInitialize, dispose, beforeDispose, afterDispose */ @js.native
trait Router
  extends typingsSlinky.backbone.mod.Router {
  
  var afterDispose: js.UndefOr[js.Function0[js.Any]] = js.native
  
  var afterInitialize: js.UndefOr[js.Function0[js.Any]] = js.native
  
  var app: App = js.native
  
  var appEvents: js.UndefOr[StringMap] = js.native
  
  var beforeDispose: js.UndefOr[js.Function0[js.Any]] = js.native
  
  var beforeInitialize: js.UndefOr[js.Function0[js.Any]] = js.native
  
  def cause(appEvent: String, args: js.Any*): js.Any = js.native
  
  var dataEvents: js.UndefOr[StringMap] = js.native
  
  var defaultOptions: js.UndefOr[DefaultOptions] = js.native
  
  var dispose: js.UndefOr[js.Function0[js.Any]] = js.native
  
  def getRoute(appEvent: String, args: js.Any*): String = js.native
  
  def isCaused(appEvent: String, args: js.Any*): Boolean = js.native
  
  var namespace: String = js.native
  
  def reload(url: String): js.Any = js.native
  
  var triggers: StringMap = js.native
}
