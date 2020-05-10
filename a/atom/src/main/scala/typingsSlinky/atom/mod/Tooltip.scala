package typingsSlinky.atom.mod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.atom.atomStrings.in
import typingsSlinky.atom.atomStrings.out
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tooltip extends js.Object {
  val element: HTMLElement = js.native
  val enabled: Boolean = js.native
  val hoverState: in | out | Null = js.native
  val options: TooltipOptions = js.native
  val timeout: Double = js.native
  def disable(): Unit = js.native
  def enable(): Unit = js.native
  def getArrowElement(): HTMLElement = js.native
  def getTitle(): String = js.native
  def getTooltipElement(): HTMLElement = js.native
  def recalculatePosition(): Unit = js.native
  def toggle(): Unit = js.native
  def toggleEnabled(): Unit = js.native
}

object Tooltip {
  @scala.inline
  def apply(
    disable: () => Unit,
    element: HTMLElement,
    enable: () => Unit,
    enabled: Boolean,
    getArrowElement: () => HTMLElement,
    getTitle: () => String,
    getTooltipElement: () => HTMLElement,
    options: TooltipOptions,
    recalculatePosition: () => Unit,
    timeout: Double,
    toggle: () => Unit,
    toggleEnabled: () => Unit
  ): Tooltip = {
    val __obj = js.Dynamic.literal(disable = js.Any.fromFunction0(disable), element = element.asInstanceOf[js.Any], enable = js.Any.fromFunction0(enable), enabled = enabled.asInstanceOf[js.Any], getArrowElement = js.Any.fromFunction0(getArrowElement), getTitle = js.Any.fromFunction0(getTitle), getTooltipElement = js.Any.fromFunction0(getTooltipElement), options = options.asInstanceOf[js.Any], recalculatePosition = js.Any.fromFunction0(recalculatePosition), timeout = timeout.asInstanceOf[js.Any], toggle = js.Any.fromFunction0(toggle), toggleEnabled = js.Any.fromFunction0(toggleEnabled))
    __obj.asInstanceOf[Tooltip]
  }
  @scala.inline
  implicit class TooltipOps[Self <: Tooltip] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisable(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disable")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withElement(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("element")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnable(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enable")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetArrowElement(value: () => HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getArrowElement")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetTitle(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTitle")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetTooltipElement(value: () => HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTooltipElement")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOptions(value: TooltipOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRecalculatePosition(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recalculatePosition")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToggle(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggle")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withToggleEnabled(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleEnabled")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHoverState(value: in | out): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHoverStateNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverState")(null)
        ret
    }
  }
  
}

