package typingsSlinky.officeUiFabricReact.marqueeSelectionTypesMod

import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.MouseEvent
import slinky.core.facade.ReactRef
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.std.Partial
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunction
import typingsSlinky.uifabricStyling.ithemeMod.ITheme
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import typingsSlinky.uifabricUtilities.selectionTypesMod.IObjectWithKey
import typingsSlinky.uifabricUtilities.selectionTypesMod.ISelection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMarqueeSelectionProps extends HTMLAttributes[HTMLDivElement] {
  /**
    * Optional callback to access the IMarqueeSelection interface. Use this instead of ref for accessing
    * the public methods and properties of the component.
    */
  var componentRef: js.UndefOr[IRefObject[IMarqueeSelection]] = js.native
  /**
    * Optional flag to restrict the drag rect to the root element, instead of allowing the drag
    * rect to start outside of the root element boundaries.
    * @defaultvalue false
    */
  var isDraggingConstrainedToRoot: js.UndefOr[Boolean] = js.native
  /**
    * Optional flag to control the enabled state of marquee selection. This allows you to render
    * it and have events all ready to go, but conditionally disable it. That way transitioning
    * between enabled/disabled generate no difference in the DOM.
    * @defaultvalue true
    */
  var isEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Optional callback that is called, when the mouse down event occurs, in order to determine
    * if we should start a marquee selection. If true is returned, we will cancel the mousedown
    * event to prevent upstream mousedown handlers from executing.
    */
  var onShouldStartSelection: js.UndefOr[js.Function1[/* ev */ MouseEvent, Boolean]] = js.native
  /**
    * Optional props to mix into the root DIV element.
    */
  var rootProps: js.UndefOr[HTMLAttributes[HTMLDivElement]] = js.native
  /**
    * The selection object to interact with when updating selection changes.
    */
  var selection: ISelection[IObjectWithKey] = js.native
  /**
    * Call to provide customized styling that will layer on top of the variant rules.
    */
  var styles: js.UndefOr[IStyleFunction[IMarqueeSelectionStyleProps, IMarqueeSelectionStyles]] = js.native
  /**
    * Theme (provided through customization.)
    */
  var theme: js.UndefOr[ITheme] = js.native
}

object IMarqueeSelectionProps {
  @scala.inline
  def apply(selection: ISelection[IObjectWithKey]): IMarqueeSelectionProps = {
    val __obj = js.Dynamic.literal(selection = selection.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMarqueeSelectionProps]
  }
  @scala.inline
  implicit class IMarqueeSelectionPropsOps[Self <: IMarqueeSelectionProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSelection(value: ISelection[IObjectWithKey]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComponentRefFunction1(value: /* ref */ IMarqueeSelection | Null => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withComponentRefRefObject(value: ReactRef[IMarqueeSelection]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComponentRef(value: IRefObject[IMarqueeSelection]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComponentRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(js.undefined)
        ret
    }
    @scala.inline
    def withIsDraggingConstrainedToRoot(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDraggingConstrainedToRoot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsDraggingConstrainedToRoot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDraggingConstrainedToRoot")(js.undefined)
        ret
    }
    @scala.inline
    def withIsEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withOnShouldStartSelection(value: /* ev */ MouseEvent => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShouldStartSelection")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnShouldStartSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShouldStartSelection")(js.undefined)
        ret
    }
    @scala.inline
    def withRootProps(value: HTMLAttributes[HTMLDivElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRootProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootProps")(js.undefined)
        ret
    }
    @scala.inline
    def withStyles(value: IMarqueeSelectionStyleProps => Partial[IMarqueeSelectionStyles]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(js.undefined)
        ret
    }
    @scala.inline
    def withTheme(value: ITheme): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(js.undefined)
        ret
    }
  }
  
}

