package typingsSlinky.ipfsCore.mod

import typingsSlinky.ipfsCore.anon.DnsInit
import typingsSlinky.ipfsCore.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ipfs-core/dist/src", "create")
@js.native
object create extends js.Object {
  
  def apply[Init /* <: Boolean | typingsSlinky.ipfsCore.initMod.InitOptions */, Start /* <: Boolean */](): js.Promise[typingsSlinky.ipfsCore.anon.Init | Key | DnsInit] = js.native
  def apply[Init /* <: Boolean | typingsSlinky.ipfsCore.initMod.InitOptions */, Start /* <: Boolean */](options: CreateOptions[Init, Start]): js.Promise[typingsSlinky.ipfsCore.anon.Init | Key | DnsInit] = js.native
}
