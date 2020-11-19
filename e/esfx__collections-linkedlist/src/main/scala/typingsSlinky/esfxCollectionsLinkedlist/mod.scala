package typingsSlinky.esfxCollectionsLinkedlist

import typingsSlinky.esfxEquatable.distMod.Equaler
import typingsSlinky.esfxEquatable.distMod.EqualityComparison
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@esfx/collections-linkedlist", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  class LinkedList[T] ()
    extends typingsSlinky.esfxCollectionsLinkedlist.distMod.LinkedList[T] {
    def this(equaler: Equaler[T]) = this()
    def this(equaler: EqualityComparison[T]) = this()
    def this(iterable: js.Iterable[T]) = this()
    def this(iterable: js.UndefOr[scala.Nothing], equaler: Equaler[T]) = this()
    def this(iterable: js.UndefOr[scala.Nothing], equaler: EqualityComparison[T]) = this()
    def this(iterable: js.Iterable[T], equaler: Equaler[T]) = this()
    def this(iterable: js.Iterable[T], equaler: EqualityComparison[T]) = this()
  }
  
  @js.native
  class LinkedListNode[T] protected ()
    extends typingsSlinky.esfxCollectionsLinkedlist.distMod.LinkedListNode[T] {
    def this(value: T) = this()
  }
}
