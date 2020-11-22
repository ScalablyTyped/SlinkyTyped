package typingsSlinky.pgPromise.pgSubsetMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// interface IPool, as per the following implementation:
// https://github.com/brianc/node-postgres/blob/master/packages/pg-pool/index.js#L61
// NOTE: We declare only what can be used from pg-promise
@js.native
trait IPool extends EventEmitter {
  
  def end(): js.Promise[js.UndefOr[scala.Nothing]] = js.native
  def end(cb: js.Function1[/* err */ js.Error, _]): js.Any = js.native
  
   // connection options
  val ended: Boolean = js.native
  
  val ending: Boolean = js.native
  
  val idleCount: Double = js.native
  
  val options: StringDictionary[js.Any] = js.native
  
  val totalCount: Double = js.native
  
  val waitingCount: Double = js.native
}
