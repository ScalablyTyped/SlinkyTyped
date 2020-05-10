package typingsSlinky.remotedevSerialize

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.immutable.Immutable.Seq
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofSeq extends js.Object {
  /**
    * `Seq` which represents an ordered indexed list of values.
    */
  val Indexed: TypeofIndexedOf = js.native
  val Keyed: TypeofKeyed0 = js.native
  val Set: TypeofSetOf = js.native
  def apply(): Seq[_, _] = js.native
  def apply[T](collection: typingsSlinky.immutable.Immutable.Collection.Indexed[T]): typingsSlinky.immutable.Immutable.Seq.Indexed[T] = js.native
  def apply[T](collection: typingsSlinky.immutable.Immutable.Collection.Set[T]): typingsSlinky.immutable.Immutable.Seq.Set[T] = js.native
  def apply[T](collection: js.Iterable[T]): typingsSlinky.immutable.Immutable.Seq.Indexed[T] = js.native
  def apply[V](obj: StringDictionary[V]): typingsSlinky.immutable.Immutable.Seq.Keyed[String, V] = js.native
  def apply[S /* <: Seq[_, _] */](seq: S): S = js.native
  def apply[K, V](collection: typingsSlinky.immutable.Immutable.Collection.Keyed[K, V]): typingsSlinky.immutable.Immutable.Seq.Keyed[K, V] = js.native
  /**
    * True if `maybeSeq` is a Seq, it is not backed by a concrete
    * structure such as Map, List, or Set.
    */
  def isSeq(maybeSeq: js.Any): Boolean = js.native
}

