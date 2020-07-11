package typingsSlinky.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TouchBarScrubberConstructorOptions extends js.Object {
  /**
    * Defaults to true.
    */
  var continuous: Boolean
  /**
    * An array of items to place in this scrubber.
    */
  var items: js.Array[ScrubberItem]
  /**
    * Defaults to free.
    */
  var mode: String
  /**
    * Selected overlay item style. Defaults to null.
    */
  var overlayStyle: String
  /**
    * Selected item style. Defaults to null.
    */
  var selectedStyle: String
  /**
    * Defaults to false.
    */
  var showArrowButtons: Boolean
  /**
    * Called when the user taps any item.
    */
  def highlight(highlightedIndex: Double): Unit
  /**
    * Called when the user taps an item that was not the last tapped item.
    */
  def select(selectedIndex: Double): Unit
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
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setContinuous(value: Boolean): Self = this.set("continuous", value.asInstanceOf[js.Any])
    @scala.inline
    def setHighlight(value: Double => Unit): Self = this.set("highlight", js.Any.fromFunction1(value))
    @scala.inline
    def setItemsVarargs(value: ScrubberItem*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[ScrubberItem]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def setMode(value: String): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def setOverlayStyle(value: String): Self = this.set("overlayStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelect(value: Double => Unit): Self = this.set("select", js.Any.fromFunction1(value))
    @scala.inline
    def setSelectedStyle(value: String): Self = this.set("selectedStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def setShowArrowButtons(value: Boolean): Self = this.set("showArrowButtons", value.asInstanceOf[js.Any])
  }
  
}

