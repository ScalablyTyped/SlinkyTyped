package typingsSlinky.gulpHelp.mod

import typingsSlinky.gulp.mod.DestMethod
import typingsSlinky.gulp.mod.SrcMethod
import typingsSlinky.gulp.mod.WatchMethod
import typingsSlinky.orchestrator.mod.Orchestrator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GulpHelp extends Orchestrator {
  
  var dest: DestMethod = js.native
  
  var src: SrcMethod = js.native
  
  var task: TaskMethod = js.native
  
  var watch: WatchMethod = js.native
}
