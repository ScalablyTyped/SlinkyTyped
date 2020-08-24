package typingsSlinky.mnemonist.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.mnemonist.fuzzyMapMod.HashFunction
import typingsSlinky.mnemonist.fuzzyMapMod.HashFunctionsTuple
import typingsSlinky.mnemonist.fuzzyMapMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mnemonist", "FuzzyMap")
@js.native
class FuzzyMap[K, V] protected () extends default[K, V] {
  def this(hashFunctionsTuple: HashFunctionsTuple[K]) = this()
  // Constructor
  def this(hashFunction: HashFunction[K]) = this()
}

/* static members */
@JSImport("mnemonist", "FuzzyMap")
@js.native
object FuzzyMap extends js.Object {
  def from[I, J](iterable: StringDictionary[J], hashFunction: HashFunction[I]): typingsSlinky.mnemonist.fuzzyMapMod.FuzzyMap[I, J] = js.native
  def from[I, J](iterable: StringDictionary[J], hashFunction: HashFunctionsTuple[I]): typingsSlinky.mnemonist.fuzzyMapMod.FuzzyMap[I, J] = js.native
  // Statics
  def from[I, J](iterable: js.Iterable[js.Tuple2[I, J]], hashFunction: HashFunction[I]): typingsSlinky.mnemonist.fuzzyMapMod.FuzzyMap[I, J] = js.native
  def from[I, J](iterable: js.Iterable[js.Tuple2[I, J]], hashFunction: HashFunctionsTuple[I]): typingsSlinky.mnemonist.fuzzyMapMod.FuzzyMap[I, J] = js.native
}

