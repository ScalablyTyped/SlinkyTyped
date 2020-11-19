package typingsSlinky.merkle.mod

import typingsSlinky.node.streamMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MerkleStream extends Transform {
  
  def async(leaves: js.Array[_], callback: js.Function2[/* err */ String, /* tree */ MerkleTree, Unit]): Unit = js.native
  
  def json(): MerkleStream = js.native
  
  def sync(leaves: js.Array[_]): MerkleTree = js.native
}
