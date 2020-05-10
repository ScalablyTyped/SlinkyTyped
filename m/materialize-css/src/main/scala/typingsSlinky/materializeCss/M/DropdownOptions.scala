package typingsSlinky.materializeCss.M

import org.scalajs.dom.raw.Element
import typingsSlinky.materializeCss.materializeCssStrings.left
import typingsSlinky.materializeCss.materializeCssStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DropdownOptions extends js.Object {
  /**
    * Defines the edge the menu is aligned to
    * @default 'left'
    */
  var alignment: left | right = js.native
  /**
    * If true, automatically focus dropdown el for keyboard
    * @default true
    */
  var autoTrigger: Boolean = js.native
  /**
    * If true, close dropdown on item click
    * @default true
    */
  var closeOnClick: Boolean = js.native
  /**
    * If true, constrainWidth to the size of the dropdown activator
    * @default true
    */
  var constrainWidth: Boolean = js.native
  /**
    * Provide an element that will be the bounding container of the dropdown
    * @default null
    */
  var container: Element = js.native
  /**
    * If false, the dropdown will show below the trigger
    * @default true
    */
  var coverTrigger: Boolean = js.native
  /**
    * If true, the dropdown will open on hover
    * @default false
    */
  var hover: Boolean = js.native
  /**
    * The duration of the transition enter in milliseconds
    * @default 150
    */
  var inDuration: Double = js.native
  /**
    * The duration of the transition out in milliseconds
    * @default 250
    */
  var outDuration: Double = js.native
  /**
    * Function called when dropdown finishes exiting
    * @default null
    */
  def onCloseEnd(el: Element): Unit = js.native
  /**
    * Function called when dropdown starts exiting
    * @default null
    */
  def onCloseStart(el: Element): Unit = js.native
  /**
    * Function called when dropdown finishes entering
    * @default null
    */
  def onOpenEnd(el: Element): Unit = js.native
  /**
    * Function called when dropdown starts entering
    * @default null
    */
  def onOpenStart(el: Element): Unit = js.native
}

object DropdownOptions {
  @scala.inline
  def apply(
    alignment: left | right,
    autoTrigger: Boolean,
    closeOnClick: Boolean,
    constrainWidth: Boolean,
    container: Element,
    coverTrigger: Boolean,
    hover: Boolean,
    inDuration: Double,
    onCloseEnd: Element => Unit,
    onCloseStart: Element => Unit,
    onOpenEnd: Element => Unit,
    onOpenStart: Element => Unit,
    outDuration: Double
  ): DropdownOptions = {
    val __obj = js.Dynamic.literal(alignment = alignment.asInstanceOf[js.Any], autoTrigger = autoTrigger.asInstanceOf[js.Any], closeOnClick = closeOnClick.asInstanceOf[js.Any], constrainWidth = constrainWidth.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], coverTrigger = coverTrigger.asInstanceOf[js.Any], hover = hover.asInstanceOf[js.Any], inDuration = inDuration.asInstanceOf[js.Any], onCloseEnd = js.Any.fromFunction1(onCloseEnd), onCloseStart = js.Any.fromFunction1(onCloseStart), onOpenEnd = js.Any.fromFunction1(onOpenEnd), onOpenStart = js.Any.fromFunction1(onOpenStart), outDuration = outDuration.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropdownOptions]
  }
  @scala.inline
  implicit class DropdownOptionsOps[Self <: DropdownOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlignment(value: left | right): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutoTrigger(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoTrigger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCloseOnClick(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeOnClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConstrainWidth(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constrainWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContainer(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCoverTrigger(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coverTrigger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHover(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnCloseEnd(value: Element => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCloseEnd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnCloseStart(value: Element => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCloseStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnOpenEnd(value: Element => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOpenEnd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnOpenStart(value: Element => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOpenStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOutDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outDuration")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

