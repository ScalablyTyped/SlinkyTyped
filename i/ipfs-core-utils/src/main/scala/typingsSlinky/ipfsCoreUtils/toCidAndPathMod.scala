package typingsSlinky.ipfsCoreUtils

import typingsSlinky.cids.mod.^
import typingsSlinky.ipfsCoreUtils.anon.Cid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ipfs-core-utils/dist/src/to-cid-and-path", JSImport.Namespace)
@js.native
object toCidAndPathMod extends js.Object {
  
  /**
    * @param {string|Uint8Array|CID} string
    * @returns {{cid:CID, path?:string}}
    */
  def apply(string: String): Cid = js.native
  def apply(string: ^): Cid = js.native
  def apply(string: js.typedarray.Uint8Array): Cid = js.native
}
