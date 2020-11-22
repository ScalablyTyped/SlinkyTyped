package typingsSlinky.ipfsCore.anon

import typingsSlinky.ipfsCore.componentsMod.Pin_
import typingsSlinky.ipfsCore.componentsMod.RWLock
import typingsSlinky.std.AsyncGenerator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Refs extends js.Object {
  
  var gcLock: RWLock = js.native
  
  var pin: Pin_ = js.native
  
  def refs(): AsyncGenerator[Ref, Unit, _] = js.native
  def refs(ipfsPath: js.UndefOr[scala.Nothing], options: js.Any): AsyncGenerator[Ref, Unit, _] = js.native
  def refs(ipfsPath: js.Any): AsyncGenerator[Ref, Unit, _] = js.native
  def refs(ipfsPath: js.Any, options: js.Any): AsyncGenerator[Ref, Unit, _] = js.native
  
  var repo: js.Any = js.native
}
