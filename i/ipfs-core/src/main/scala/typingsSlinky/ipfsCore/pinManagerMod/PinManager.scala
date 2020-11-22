package typingsSlinky.ipfsCore.pinManagerMod

import typingsSlinky.debug.mod.Debugger
import typingsSlinky.ipfsCore.anon.Metadata
import typingsSlinky.ipfsCore.anon.Parent
import typingsSlinky.ipfsCore.anon.Pinned
import typingsSlinky.ipfsCore.anon.Reason
import typingsSlinky.ipfsCore.anon.`3`
import typingsSlinky.std.AsyncGenerator
import typingsSlinky.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PinManager extends js.Object {
  
  def _walkDag(cid: js.Any, hasPreload: `3`): js.Any = js.native
  
  var dag: js.Any = js.native
  
  def directKeys(): AsyncGenerator[Metadata, Unit, _] = js.native
  
  var directPins: Set[_] = js.native
  
  def fetchCompleteDag(cid: js.Any, options: js.Any): js.Promise[Unit] = js.native
  
  /**
    * @param {Object} options
    * @param {boolean} [options.preload]
    */
  def indirectKeys(hasPreload: `3`): AsyncGenerator[_, Unit, _] = js.native
  
  def isPinnedWithType(cid: js.Any, types: js.Any): js.Promise[Parent | Pinned | Reason] = js.native
  
  def log(formatter: js.Any, args: js.Any*): Unit = js.native
  @JSName("log")
  var log_Original: Debugger = js.native
  
  def pinDirectly(cid: js.Any): js.Promise[_] = js.native
  def pinDirectly(cid: js.Any, options: js.Object): js.Promise[_] = js.native
  
  def pinRecursively(cid: js.Any): js.Promise[Unit] = js.native
  def pinRecursively(cid: js.Any, options: js.Object): js.Promise[Unit] = js.native
  
  def recursiveKeys(): AsyncGenerator[Metadata, Unit, _] = js.native
  
  var recursivePins: Set[_] = js.native
  
  var repo: js.Any = js.native
  
  def unpin(cid: js.Any): js.Promise[_] = js.native
}
