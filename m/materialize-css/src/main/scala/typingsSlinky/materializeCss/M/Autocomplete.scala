package typingsSlinky.materializeCss.M

import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Autocomplete
  extends Component[AutocompleteOptions]
     with Openable {
  /**
    * Index of the current selected option.
    */
  var activeIndex: Double = js.native
  /**
    * Number of matching autocomplete options.
    */
  var count: Double = js.native
  /**
    * Select a specific autocomplete options.
    * @param el Element of the autocomplete option.
    */
  def selectOption(el: Element): Unit = js.native
  /**
    * Update autocomplete options data.
    * @param data Autocomplete options data object.
    */
  def updateData(data: AutocompleteData): Unit = js.native
}

object Autocomplete {
  @scala.inline
  def apply(
    activeIndex: Double,
    close: () => Unit,
    count: Double,
    destroy: () => Unit,
    el: Element,
    isOpen: Boolean,
    open: () => Unit,
    options: AutocompleteOptions,
    selectOption: Element => Unit,
    updateData: AutocompleteData => Unit
  ): Autocomplete = {
    val __obj = js.Dynamic.literal(activeIndex = activeIndex.asInstanceOf[js.Any], close = js.Any.fromFunction0(close), count = count.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), el = el.asInstanceOf[js.Any], isOpen = isOpen.asInstanceOf[js.Any], open = js.Any.fromFunction0(open), options = options.asInstanceOf[js.Any], selectOption = js.Any.fromFunction1(selectOption), updateData = js.Any.fromFunction1(updateData))
    __obj.asInstanceOf[Autocomplete]
  }
  @scala.inline
  implicit class AutocompleteOps[Self <: Autocomplete] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActiveIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectOption(value: Element => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectOption")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdateData(value: AutocompleteData => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateData")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

