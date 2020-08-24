package typingsSlinky.mnemonist.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.mnemonist.fuzzyMultiMapMod.FuzzyMultiMapContainer
import typingsSlinky.mnemonist.fuzzyMultiMapMod.HashFunction
import typingsSlinky.mnemonist.fuzzyMultiMapMod.HashFunctionsTuple
import typingsSlinky.mnemonist.fuzzyMultiMapMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mnemonist", "FuzzyMultiMap")
@js.native
class FuzzyMultiMap[K, V] protected () extends default[K, V] {
  def this(hashFunctions: HashFunctionsTuple[K]) = this()
  // Constructor
  def this(hashFunction: HashFunction[K]) = this()
  def this(hashFunctions: HashFunctionsTuple[K], Container: FuzzyMultiMapContainer) = this()
  def this(hashFunction: HashFunction[K], Container: FuzzyMultiMapContainer) = this()
}

/* static members */
@JSImport("mnemonist", "FuzzyMultiMap")
@js.native
object FuzzyMultiMap extends js.Object {
  def from[I, J](iterable: StringDictionary[J], hashFunction: HashFunction[I]): typingsSlinky.mnemonist.fuzzyMultiMapMod.FuzzyMultiMap[I, J] = js.native
  def from[I, J](iterable: StringDictionary[J], hashFunction: HashFunction[I], Container: FuzzyMultiMapContainer): typingsSlinky.mnemonist.fuzzyMultiMapMod.FuzzyMultiMap[I, J] = js.native
  def from[I, J](iterable: StringDictionary[J], hashFunction: HashFunctionsTuple[I]): typingsSlinky.mnemonist.fuzzyMultiMapMod.FuzzyMultiMap[I, J] = js.native
  def from[I, J](
    iterable: StringDictionary[J],
    hashFunction: HashFunctionsTuple[I],
    Container: FuzzyMultiMapContainer
  ): typingsSlinky.mnemonist.fuzzyMultiMapMod.FuzzyMultiMap[I, J] = js.native
  // Statics
  def from[I, J](iterable: js.Iterable[js.Tuple2[I, J]], hashFunction: HashFunction[I]): typingsSlinky.mnemonist.fuzzyMultiMapMod.FuzzyMultiMap[I, J] = js.native
  def from[I, J](
    iterable: js.Iterable[js.Tuple2[I, J]],
    hashFunction: HashFunction[I],
    Container: FuzzyMultiMapContainer
  ): typingsSlinky.mnemonist.fuzzyMultiMapMod.FuzzyMultiMap[I, J] = js.native
  def from[I, J](iterable: js.Iterable[js.Tuple2[I, J]], hashFunction: HashFunctionsTuple[I]): typingsSlinky.mnemonist.fuzzyMultiMapMod.FuzzyMultiMap[I, J] = js.native
  def from[I, J](
    iterable: js.Iterable[js.Tuple2[I, J]],
    hashFunction: HashFunctionsTuple[I],
    Container: FuzzyMultiMapContainer
  ): typingsSlinky.mnemonist.fuzzyMultiMapMod.FuzzyMultiMap[I, J] = js.native
}

