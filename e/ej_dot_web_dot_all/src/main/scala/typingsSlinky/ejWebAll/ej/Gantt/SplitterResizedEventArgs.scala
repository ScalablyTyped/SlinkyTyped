package typingsSlinky.ejWebAll.ej.Gantt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SplitterResizedEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.native
  /** Returns the value based on current splitter position.
    */
  var currentSplitterPosition: js.UndefOr[String] = js.native
  /** To set custom position for splitter after resize action.
    */
  var customSplitterPosition: js.UndefOr[String] = js.native
  /** Returns the value to differentiate whether splitter resizing is performed either by manual resizing or by method
    */
  var isOnResize: js.UndefOr[Boolean] = js.native
  /** To differentiate `customSplitterPosition` value was index or position.
    */
  var isSplitterIndex: js.UndefOr[Boolean] = js.native
  /** Returns the previous splitter position
    */
  var prevSplitterPosition: js.UndefOr[String] = js.native
}

object SplitterResizedEventArgs {
  @scala.inline
  def apply(): SplitterResizedEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SplitterResizedEventArgs]
  }
  @scala.inline
  implicit class SplitterResizedEventArgsOps[Self <: SplitterResizedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCancel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCancel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrentSplitterPosition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentSplitterPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentSplitterPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentSplitterPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomSplitterPosition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customSplitterPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomSplitterPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customSplitterPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withIsOnResize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOnResize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsOnResize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOnResize")(js.undefined)
        ret
    }
    @scala.inline
    def withIsSplitterIndex(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSplitterIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsSplitterIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSplitterIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withPrevSplitterPosition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevSplitterPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrevSplitterPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevSplitterPosition")(js.undefined)
        ret
    }
  }
  
}

