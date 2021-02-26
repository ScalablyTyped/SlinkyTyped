package typingsSlinky.pgPromise.mod

import typingsSlinky.spex.mod.ISpexBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Additional methods available inside tasks + transactions;
// API: http://vitaly-t.github.io/pg-promise/Task.html
@js.native
trait ITask[Ext]
  extends IBaseProtocol[Ext]
     with ISpexBase {
  
  val ctx: ITaskContext = js.native
}
