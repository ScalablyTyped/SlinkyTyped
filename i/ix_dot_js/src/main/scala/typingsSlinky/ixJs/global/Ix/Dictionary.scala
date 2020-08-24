package typingsSlinky.ixJs.global.Ix

import typingsSlinky.ixJs.Ix.EqualityComparer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Ix.Dictionary")
@js.native
class Dictionary[TKey, TValue] ()
  extends typingsSlinky.ixJs.Ix.Dictionary[TKey, TValue] {
  def this(capacity: Double) = this()
  def this(capacity: js.UndefOr[scala.Nothing], comparer: EqualityComparer[TKey, TKey]) = this()
  def this(capacity: Double, comparer: EqualityComparer[TKey, TKey]) = this()
}

