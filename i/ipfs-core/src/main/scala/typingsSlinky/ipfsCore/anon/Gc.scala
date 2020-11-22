package typingsSlinky.ipfsCore.anon

import typingsSlinky.ipfsCore.gcMod.BlockID
import typingsSlinky.ipfsCore.gcMod.Err
import typingsSlinky.ipfsCore.srcUtilsMod.AbortOptions
import typingsSlinky.std.AsyncIterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Gc extends js.Object {
  
  def gc(): AsyncIterable[Err | BlockID] = js.native
  def gc(_options: AbortOptions): AsyncIterable[Err | BlockID] = js.native
  
  def stat(): js.Promise[NumObjects] = js.native
  def stat(options: js.Any): js.Promise[NumObjects] = js.native
  
  def version(): js.Promise[_] = js.native
  def version(options: js.Any): js.Promise[_] = js.native
}
