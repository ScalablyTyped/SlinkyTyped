package typingsSlinky.novaEditorNode.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/// https://novadocs.panic.com/api-reference/issue-collection/
@JSGlobal("IssueCollection")
@js.native
class IssueCollection ()
  extends typingsSlinky.novaEditorNode.IssueCollection {
  def this(name: String) = this()
  /* CompleteClass */
  override var name: String = js.native
  /* CompleteClass */
  override def append(uri: String, issues: js.Array[typingsSlinky.novaEditorNode.Issue]): Unit = js.native
  /* CompleteClass */
  override def clear(): Unit = js.native
  /* CompleteClass */
  override def dispose(): Unit = js.native
  /* CompleteClass */
  override def get(uri: String): Unit = js.native
  /* CompleteClass */
  override def has(uri: String): Unit = js.native
  /* CompleteClass */
  override def remove(uri: String): Unit = js.native
  /* CompleteClass */
  override def set(uri: String, issues: js.Array[typingsSlinky.novaEditorNode.Issue]): Unit = js.native
}

