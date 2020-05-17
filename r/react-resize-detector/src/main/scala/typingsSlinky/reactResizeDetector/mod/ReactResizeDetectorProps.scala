package typingsSlinky.reactResizeDetector.mod

import org.scalajs.dom.raw.HTMLElement
import slinky.core.TagMod
import typingsSlinky.react.mod.Props
import typingsSlinky.reactResizeDetector.anon.Leading
import typingsSlinky.reactResizeDetector.reactResizeDetectorStrings.debounce
import typingsSlinky.reactResizeDetector.reactResizeDetectorStrings.throttle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactResizeDetectorProps extends Props[ReactResizeDetector] {
  /**
    * Trigger onResize on height change.
    * Default: false
    */
  var handleHeight: js.UndefOr[Boolean] = js.native
  /**
    * Trigger onResize on width change.
    * Default: false
    */
  var handleWidth: js.UndefOr[Boolean] = js.native
  /**
    * Valid only for a callback-pattern.
    * Ignored for other render types.
    * Set resize-detector's node type.
    * You can pass any valid React node: string with node's name or element.
    * Can be useful when you need to handle table's or paragraph's resizes.
    * Default: "div"
    */
  var nodeType: js.UndefOr[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 117 */ js.Any
  ] = js.native
  /**
    * Function that will be invoked with width and height arguments.
    * Default: undefined
    */
  var onResize: js.UndefOr[js.Function2[/* width */ Double, /* height */ Double, Unit]] = js.native
  /**
    * A selector of an element to observe.
    * You can use this property to attach resize-observer to any DOM element.
    * Please refer to the querySelector docs.
    * Default: undefined
    */
  var querySelector: js.UndefOr[String] = js.native
  /**
    * Possible values: "throttle" and "debounce".
    * See lodash docs for more information.
    * undefined - callback will be fired for every frame.
    * Default: undefined
    */
  var refreshMode: js.UndefOr[throttle | debounce] = js.native
  /**
    * Use this in conjunction with refreshMode. An object in shape of { leading: bool, trailing: bool }.
    * Please refer to lodash's docs for more info.
    * Default: undefined
    */
  var refreshOptions: js.UndefOr[Leading] = js.native
  /**
    * Use this in conjunction with refreshMode.
    * Important! It's a numeric prop so set it accordingly, e.g. refreshRate={500}.
    * efault: 1000.
    */
  var refreshRate: js.UndefOr[Double] = js.native
  var render: js.UndefOr[js.Function1[/* props */ ReactResizeDetectorDimensions, TagMod[Any]]] = js.native
  /**
    * Do not trigger onResize when a component mounts.
    * Default: false
    */
  var skipOnMount: js.UndefOr[Boolean] = js.native
   // will be passed to React.createElement()
  /**
    * A DOM element to observe.
    * By default it's a parent element in relation to the ReactResizeDetector component.
    * But you can pass any DOM element to observe.
    * This property is omitted when you pass querySelector.
    * Default: undefined
    */
  var targetDomEl: js.UndefOr[HTMLElement] = js.native
}

object ReactResizeDetectorProps {
  @scala.inline
  def apply(): ReactResizeDetectorProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReactResizeDetectorProps]
  }
  @scala.inline
  implicit class ReactResizeDetectorPropsOps[Self <: ReactResizeDetectorProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHandleHeight(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHandleHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withHandleWidth(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHandleWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeType(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 117 */ js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodeType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeType")(js.undefined)
        ret
    }
    @scala.inline
    def withOnResize(value: (/* width */ Double, /* height */ Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResize")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnResize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResize")(js.undefined)
        ret
    }
    @scala.inline
    def withQuerySelector(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("querySelector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuerySelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("querySelector")(js.undefined)
        ret
    }
    @scala.inline
    def withRefreshMode(value: throttle | debounce): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRefreshMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshMode")(js.undefined)
        ret
    }
    @scala.inline
    def withRefreshOptions(value: Leading): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRefreshOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withRefreshRate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshRate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRefreshRate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshRate")(js.undefined)
        ret
    }
    @scala.inline
    def withRender(value: /* props */ ReactResizeDetectorDimensions => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("render")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("render")(js.undefined)
        ret
    }
    @scala.inline
    def withSkipOnMount(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipOnMount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkipOnMount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipOnMount")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetDomEl(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetDomEl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetDomEl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetDomEl")(js.undefined)
        ret
    }
  }
  
}

