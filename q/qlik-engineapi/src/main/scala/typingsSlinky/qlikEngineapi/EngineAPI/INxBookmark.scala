package typingsSlinky.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NxBookmark...
  */
@js.native
trait INxBookmark extends js.Object {
  /**
    * List of selections for each state.
    */
  var qStateData: js.Array[IAlternateStateData] = js.native
  /**
    * Time when the bookmark was created.
    */
  var qUtcModifyTime: Double = js.native
  /**
    * List of the variables in the app at the time the bookmark was created.
    */
  var qVariableItems: js.Array[IBookmarkVariableItem] = js.native
}

object INxBookmark {
  @scala.inline
  def apply(
    qStateData: js.Array[IAlternateStateData],
    qUtcModifyTime: Double,
    qVariableItems: js.Array[IBookmarkVariableItem]
  ): INxBookmark = {
    val __obj = js.Dynamic.literal(qStateData = qStateData.asInstanceOf[js.Any], qUtcModifyTime = qUtcModifyTime.asInstanceOf[js.Any], qVariableItems = qVariableItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxBookmark]
  }
  @scala.inline
  implicit class INxBookmarkOps[Self <: INxBookmark] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQStateData(value: js.Array[IAlternateStateData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qStateData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQUtcModifyTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qUtcModifyTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQVariableItems(value: js.Array[IBookmarkVariableItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qVariableItems")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

