package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains settings of a tab stop.
  */
@js.native
trait TabSettings extends js.Object {
  /**
    * Specifies the tab alignment type.
    */
  var alignment: TabAlign = js.native
  /**
    * Specifies whether the individual tab stop is in effect.
    */
  var deleted: Boolean = js.native
  /**
    * Specifies the tab leader symbol.
    */
  var leader: TabLeaderType = js.native
  /**
    * Specifies the position of the tab stop.
    */
  var position: Double = js.native
}

object TabSettings {
  @scala.inline
  def apply(alignment: TabAlign, deleted: Boolean, leader: TabLeaderType, position: Double): TabSettings = {
    val __obj = js.Dynamic.literal(alignment = alignment.asInstanceOf[js.Any], deleted = deleted.asInstanceOf[js.Any], leader = leader.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabSettings]
  }
  @scala.inline
  implicit class TabSettingsOps[Self <: TabSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlignment(value: TabAlign): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeleted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLeader(value: TabLeaderType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPosition(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

