package typingsSlinky.ipfsCore.anon

import typingsSlinky.ipfsCore.componentsMod.GCLock
import typingsSlinky.ipfsCore.componentsMod.IPFSRepo
import typingsSlinky.ipfsCore.componentsMod.Pin_
import typingsSlinky.ipfsCore.componentsMod.Refs_
import typingsSlinky.std.AsyncGenerator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GcLockPin extends js.Object {
  
  var gcLock: GCLock = js.native
  
  var pin: Pin_ = js.native
  
  def refs(): AsyncGenerator[Ref, Unit, _] = js.native
  def refs(ipfsPath: js.UndefOr[scala.Nothing], options: js.Any): AsyncGenerator[Ref, Unit, _] = js.native
  def refs(ipfsPath: js.Any): AsyncGenerator[Ref, Unit, _] = js.native
  def refs(ipfsPath: js.Any, options: js.Any): AsyncGenerator[Ref, Unit, _] = js.native
  @JSName("refs")
  var refs_Original: Refs_ = js.native
  
  var repo: IPFSRepo = js.native
}
