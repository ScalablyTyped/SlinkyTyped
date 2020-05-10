package typingsSlinky.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TouchBarScrubberConstructorOptions extends js.Object {
  /**
    * Defaults to true.
    */
  var continuous: Boolean = js.native
  /**
    * An array of items to place in this scrubber.
    */
  var items: js.Array[ScrubberItem] = js.native
  /**
    * Defaults to free.
    */
  var mode: String = js.native
  /**
    * Selected overlay item style. Defaults to null.
    */
  var overlayStyle: String = js.native
  /**
    * Selected item style. Defaults to null.
    */
  var selectedStyle: String = js.native
  /**
    * Defaults to false.
    */
  var showArrowButtons: Boolean = js.native
  /**
    * Called when the user taps any item.
    */
  def highlight(highlightedIndex: Double): Unit = js.native
  /**
    * Called when the user taps an item that was not the last tapped item.
    */
  def select(selectedIndex: Double): Unit = js.native
}

object TouchBarScrubberConstructorOptions {
  @scala.inline
  def apply(
    continuous: Boolean,
    highlight: Double => Unit,
    items: js.Array[ScrubberItem],
    mode: String,
    overlayStyle: String,
    select: Double => Unit,
    selectedStyle: String,
    showArrowButtons: Boolean
  ): TouchBarScrubberConstructorOptions = {
    val __obj = js.Dynamic.literal(continuous = continuous.asInstanceOf[js.Any], highlight = js.Any.fromFunction1(highlight), items = items.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], overlayStyle = overlayStyle.asInstanceOf[js.Any], select = js.Any.fromFunction1(select), selectedStyle = selectedStyle.asInstanceOf[js.Any], showArrowButtons = showArrowButtons.asInstanceOf[js.Any])
    __obj.asInstanceOf[TouchBarScrubberConstructorOptions]
  }
  @scala.inline
  implicit class TouchBarScrubberConstructorOptionsOps[Self <: TouchBarScrubberConstructorOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContinuous(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("continuous")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHighlight(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlight")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withItems(value: js.Array[ScrubberItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOverlayStyle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlayStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelect(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("select")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSelectedStyle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowArrowButtons(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showArrowButtons")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

