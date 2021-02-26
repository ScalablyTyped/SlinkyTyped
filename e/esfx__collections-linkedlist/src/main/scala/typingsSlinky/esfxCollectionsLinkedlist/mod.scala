package typingsSlinky.esfxCollectionsLinkedlist

import typingsSlinky.esfxEquatable.distMod.Equaler
import typingsSlinky.esfxEquatable.distMod.EqualityComparison
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@esfx/collections-linkedlist", "LinkedList")
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
  
  @JSImport("@esfx/collections-linkedlist", "LinkedListNode")
  @js.native
  class LinkedListNode[T] protected ()
    extends typingsSlinky.esfxCollectionsLinkedlist.distMod.LinkedListNode[T] {
    def this(value: T) = this()
  }
}
