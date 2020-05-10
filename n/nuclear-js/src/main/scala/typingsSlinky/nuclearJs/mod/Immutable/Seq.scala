package typingsSlinky.nuclearJs.mod.Immutable

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.immutable.Immutable.Collection.Indexed
import typingsSlinky.immutable.Immutable.Collection.Set
import typingsSlinky.immutable.Immutable.Seq.Keyed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nuclear-js", "Immutable.Seq")
@js.native
object Seq extends js.Object {
  def apply(): typingsSlinky.immutable.Immutable.Seq[_, _] = js.native
  def apply[T](collection: Indexed[T]): typingsSlinky.immutable.Immutable.Seq.Indexed[T] = js.native
  def apply[T](collection: Set[T]): typingsSlinky.immutable.Immutable.Seq.Set[T] = js.native
  def apply[T](collection: js.Iterable[T]): typingsSlinky.immutable.Immutable.Seq.Indexed[T] = js.native
  def apply[V](obj: StringDictionary[V]): Keyed[String, V] = js.native
  def apply[S /* <: typingsSlinky.immutable.Immutable.Seq[_, _] */](seq: S): S = js.native
  def apply[K, V](collection: typingsSlinky.immutable.Immutable.Collection.Keyed[K, V]): Keyed[K, V] = js.native
  /**
    * True if `maybeSeq` is a Seq, it is not backed by a concrete
    * structure such as Map, List, or Set.
    */
  def isSeq(maybeSeq: js.Any): Boolean = js.native
  /**
    * `Seq` which represents an ordered indexed list of values.
    */
  @js.native
  object Indexed extends js.Object {
    def apply(): typingsSlinky.immutable.Immutable.Seq.Indexed[_] = js.native
    def apply[T](collection: js.Iterable[T]): typingsSlinky.immutable.Immutable.Seq.Indexed[T] = js.native
    /**
      * Provides an Seq.Indexed of the values provided.
      */
    def of[T](values: T*): typingsSlinky.immutable.Immutable.Seq.Indexed[T] = js.native
  }
  
  @js.native
  object Keyed extends js.Object {
    def apply(): typingsSlinky.immutable.Immutable.Seq.Keyed[_, _] = js.native
    def apply[V](obj: StringDictionary[V]): typingsSlinky.immutable.Immutable.Seq.Keyed[String, V] = js.native
    def apply[K, V](collection: js.Iterable[js.Tuple2[K, V]]): typingsSlinky.immutable.Immutable.Seq.Keyed[K, V] = js.native
  }
  
  @js.native
  object Set extends js.Object {
    def apply(): typingsSlinky.immutable.Immutable.Seq.Set[_] = js.native
    def apply[T](collection: js.Iterable[T]): typingsSlinky.immutable.Immutable.Seq.Set[T] = js.native
    /**
      * Returns a Seq.Set of the provided values
      */
    def of[T](values: T*): typingsSlinky.immutable.Immutable.Seq.Set[T] = js.native
  }
  
}

