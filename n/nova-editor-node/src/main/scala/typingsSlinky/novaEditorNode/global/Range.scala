package typingsSlinky.novaEditorNode.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/// https://novadocs.panic.com/api-reference/range/
@JSGlobal("Range")
@js.native
class Range protected ()
  extends typingsSlinky.novaEditorNode.Range {
  def this(start: Double, end: Double) = this()
  /* CompleteClass */
  override var empty: Boolean = js.native
  /* CompleteClass */
  override var end: Double = js.native
  /* CompleteClass */
  override var length: Double = js.native
  /* CompleteClass */
  override var start: Double = js.native
  /* CompleteClass */
  override def compare(other: typingsSlinky.novaEditorNode.Range): Double = js.native
  /* CompleteClass */
  override def containsIndex(index: Double): Boolean = js.native
  /* CompleteClass */
  override def containsRange(other: typingsSlinky.novaEditorNode.Range): Boolean = js.native
  /* CompleteClass */
  override def intersection(other: typingsSlinky.novaEditorNode.Range): typingsSlinky.novaEditorNode.Range = js.native
  /* CompleteClass */
  override def intersectsRange(other: typingsSlinky.novaEditorNode.Range): Boolean = js.native
  /* CompleteClass */
  override def isEqual(other: typingsSlinky.novaEditorNode.Range): Boolean = js.native
  /* CompleteClass */
  override def union(other: typingsSlinky.novaEditorNode.Range): typingsSlinky.novaEditorNode.Range = js.native
}

