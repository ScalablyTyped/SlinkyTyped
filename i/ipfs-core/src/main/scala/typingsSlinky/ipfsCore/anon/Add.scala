package typingsSlinky.ipfsCore.anon

import typingsSlinky.ipfsCore.bootstrapUtilsMod.Peers
import typingsSlinky.ipfsCore.srcUtilsMod.AbortOptions
import typingsSlinky.multiaddr.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Add extends js.Object {
  
  def add(multiaddr: ^): js.Promise[Peers] = js.native
  def add(multiaddr: ^, options: AbortOptions): js.Promise[Peers] = js.native
  
  def list(): js.Promise[Peers] = js.native
  def list(options: AbortOptions): js.Promise[Peers] = js.native
  
  def rm(multiaddr: ^): js.Promise[Peers] = js.native
  def rm(multiaddr: ^, options: AbortOptions): js.Promise[Peers] = js.native
}
