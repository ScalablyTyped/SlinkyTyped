package typingsSlinky.mnemonist.bloomFilterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BloomFilter extends js.Object {
  
  def add(string: String): this.type = js.native
  
  // Members
  var capacity: Double = js.native
  
  // Methods
  def clear(): Unit = js.native
  
  var errorRate: Double = js.native
  
  // Statics
  def from(iterable: js.Iterable[String]): BloomFilter = js.native
  def from(iterable: js.Iterable[String], options: Double): BloomFilter = js.native
  def from(iterable: js.Iterable[String], options: BloomFilterOptions): BloomFilter = js.native
  
  var hashFunctions: Double = js.native
  
  def test(string: String): Boolean = js.native
  
  def toJSON(): js.typedarray.Uint8Array = js.native
}
