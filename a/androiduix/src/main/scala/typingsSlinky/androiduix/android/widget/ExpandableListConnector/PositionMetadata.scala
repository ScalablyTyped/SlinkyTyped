package typingsSlinky.androiduix.android.widget.ExpandableListConnector

import typingsSlinky.androiduix.android.widget.ExpandableListPosition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PositionMetadata extends js.Object {
  var groupInsertIndex: Double = js.native
  var groupMetadata: GroupMetadata = js.native
  var position: ExpandableListPosition = js.native
  def isExpanded(): Boolean = js.native
  def recycle(): Unit = js.native
  /* private */ def resetState(): js.Any = js.native
}

object PositionMetadata {
  @scala.inline
  def apply(
    groupInsertIndex: Double,
    groupMetadata: GroupMetadata,
    isExpanded: () => Boolean,
    position: ExpandableListPosition,
    recycle: () => Unit,
    resetState: () => js.Any
  ): PositionMetadata = {
    val __obj = js.Dynamic.literal(groupInsertIndex = groupInsertIndex.asInstanceOf[js.Any], groupMetadata = groupMetadata.asInstanceOf[js.Any], isExpanded = js.Any.fromFunction0(isExpanded), position = position.asInstanceOf[js.Any], recycle = js.Any.fromFunction0(recycle), resetState = js.Any.fromFunction0(resetState))
    __obj.asInstanceOf[PositionMetadata]
  }
  @scala.inline
  implicit class PositionMetadataOps[Self <: PositionMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGroupInsertIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupInsertIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGroupMetadata(value: GroupMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsExpanded(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isExpanded")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPosition(value: ExpandableListPosition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRecycle(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recycle")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withResetState(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetState")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

