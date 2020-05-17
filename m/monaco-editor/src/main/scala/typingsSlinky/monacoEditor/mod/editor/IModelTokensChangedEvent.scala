package typingsSlinky.monacoEditor.mod.editor

import typingsSlinky.monacoEditor.anon.FromLineNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IModelTokensChangedEvent extends js.Object {
  val ranges: js.Array[FromLineNumber] = js.native
  val tokenizationSupportChanged: Boolean = js.native
}

object IModelTokensChangedEvent {
  @scala.inline
  def apply(ranges: js.Array[FromLineNumber], tokenizationSupportChanged: Boolean): IModelTokensChangedEvent = {
    val __obj = js.Dynamic.literal(ranges = ranges.asInstanceOf[js.Any], tokenizationSupportChanged = tokenizationSupportChanged.asInstanceOf[js.Any])
    __obj.asInstanceOf[IModelTokensChangedEvent]
  }
  @scala.inline
  implicit class IModelTokensChangedEventOps[Self <: IModelTokensChangedEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRanges(value: js.Array[FromLineNumber]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ranges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTokenizationSupportChanged(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokenizationSupportChanged")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

