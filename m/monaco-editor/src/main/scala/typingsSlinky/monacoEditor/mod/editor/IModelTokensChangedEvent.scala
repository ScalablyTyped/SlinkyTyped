package typingsSlinky.monacoEditor.mod.editor

import typingsSlinky.monacoEditor.anon.FromLineNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IModelTokensChangedEvent extends js.Object {
  val ranges: js.Array[FromLineNumber]
  val tokenizationSupportChanged: Boolean
}

object IModelTokensChangedEvent {
  @scala.inline
  def apply(ranges: js.Array[FromLineNumber], tokenizationSupportChanged: Boolean): IModelTokensChangedEvent = {
    val __obj = js.Dynamic.literal(ranges = ranges.asInstanceOf[js.Any], tokenizationSupportChanged = tokenizationSupportChanged.asInstanceOf[js.Any])
    __obj.asInstanceOf[IModelTokensChangedEvent]
  }
}

