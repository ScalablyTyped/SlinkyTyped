package typingsSlinky.firefoxWebextBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAppend extends js.Object {
  /** Whether to move the tabs before (false) or after (true) tabId in the succession. Defaults to false. */
  var append: js.UndefOr[Boolean] = js.native
  /**
    * Whether to link up the current predecessors or successor (depending on options.append) of tabId to the other
    * side of the chain after it is prepended or appended. If true, one of the following happens: if
    * options.append is false, the first tab in the array is set as the successor of any current predecessors of
    * tabId; if options.append is true, the current successor of tabId is set as the successor of the last tab in
    * the array. Defaults to false.
    */
  var insert: js.UndefOr[Boolean] = js.native
}

object AnonAppend {
  @scala.inline
  def apply(): AnonAppend = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonAppend]
  }
  @scala.inline
  implicit class AnonAppendOps[Self <: AnonAppend] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppend(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("append")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("append")(js.undefined)
        ret
    }
    @scala.inline
    def withInsert(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInsert: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.undefined)
        ret
    }
  }
  
}

