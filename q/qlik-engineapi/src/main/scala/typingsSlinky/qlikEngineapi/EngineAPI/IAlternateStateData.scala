package typingsSlinky.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * AlternateStateData...
  */
@js.native
trait IAlternateStateData extends js.Object {
  /**
    * List of the selections <Array of BookmarkFieldItem>
    */
  var qFieldItems: js.Array[IBookmarkFieldItem] = js.native
  /**
    * Name of the alternate state.
    * Default is current selections: $
    */
  var qStateName: String = js.native
}

object IAlternateStateData {
  @scala.inline
  def apply(qFieldItems: js.Array[IBookmarkFieldItem], qStateName: String): IAlternateStateData = {
    val __obj = js.Dynamic.literal(qFieldItems = qFieldItems.asInstanceOf[js.Any], qStateName = qStateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAlternateStateData]
  }
  @scala.inline
  implicit class IAlternateStateDataOps[Self <: IAlternateStateData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQFieldItems(value: js.Array[IBookmarkFieldItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qFieldItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQStateName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qStateName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

