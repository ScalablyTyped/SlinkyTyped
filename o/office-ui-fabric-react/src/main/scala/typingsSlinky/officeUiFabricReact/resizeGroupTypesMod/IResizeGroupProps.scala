package typingsSlinky.officeUiFabricReact.resizeGroupTypesMod

import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import typingsSlinky.officeUiFabricReact.resizeGroupBaseMod.ResizeGroupBase
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.std.Partial
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsSlinky.uifabricStyling.ithemeMod.ITheme
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IResizeGroupProps extends HTMLAttributes[ResizeGroupBase | HTMLElement] {
  /**
    * Optional callback to access the IResizeGroup interface. Use this instead of ref for accessing
    * the public methods and properties of the component.
    */
  var componentRef: js.UndefOr[IRefObject[IResizeGroup]] = js.native
  /**
    * Initial data to be passed to the `onRenderData` function. When there is no `onGrowData` provided, this data should
    * represent what should be passed to the render function when the parent container of the ResizeGroup is at its
    * maximum supported width. A `cacheKey` property may optionally be included as part of the data. Two data objects
    * with the same `cacheKey` will be assumed to take up the same width and will prevent measurements.
    * The type of `cacheKey` is a string.
    */
  var data: js.Any = js.native
  /**
    * Function to be called every time data is rendered. It provides the data that was actually rendered.
    * A use case would be adding telemetry when a particular control is shown in an overflow well or
    * dropped as a result of onReduceData or to count the number of renders that an implementation of
    * onReduceData triggers.
    */
  var dataDidRender: js.UndefOr[js.Function1[/* renderedData */ js.Any, Unit]] = js.native
  /**
    * Direction of this resize group, vertical or horizontal
    * @defaultvalue ResizeGroupDirection.horizontal
    */
  var direction: js.UndefOr[ResizeGroupDirection] = js.native
  /**
    * Function to be performed on the data in order to increase its width. It is called in scenarios where the
    * container has more room than the previous render and we may be able to fit more content. If there are no more
    * scaling operations to perform on teh data, it should return undefined to prevent an infinite render loop.
    */
  var onGrowData: js.UndefOr[js.Function1[/* prevData */ js.Any, _]] = js.native
  /**
    * Call to provide customized styling that will layer on top of the variant rules
    * @deprecated Removed to reduce bundle size.  Please use `className` and add css rules to `className` instead.
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[IResizeGroupStyleProps, IResizeGroupStyles]] = js.native
  /**
    * Theme provided by HOC.
    */
  var theme: js.UndefOr[ITheme] = js.native
  /**
    * Function to be performed on the data in order to reduce its width and make it fit into the given space.
    * If there are no more scaling steps to apply, it should return undefined to prevent
    * an infinite render loop.
    */
  def onReduceData(prevData: js.Any): js.Any = js.native
  /**
    * Function to render the data. Called when rendering the contents to the screen and when
    * rendering in a hidden div to measure the size of the contents.
    */
  def onRenderData(data: js.Any): ReactElement = js.native
}

object IResizeGroupProps {
  @scala.inline
  def apply(data: js.Any, onReduceData: js.Any => js.Any, onRenderData: js.Any => ReactElement): IResizeGroupProps = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], onReduceData = js.Any.fromFunction1(onReduceData), onRenderData = js.Any.fromFunction1(onRenderData))
    __obj.asInstanceOf[IResizeGroupProps]
  }
  @scala.inline
  implicit class IResizeGroupPropsOps[Self <: IResizeGroupProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnReduceData(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onReduceData")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnRenderData(value: js.Any => ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderData")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withComponentRefFunction1(value: /* ref */ IResizeGroup | Null => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withComponentRefRefObject(value: ReactRef[IResizeGroup]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComponentRef(value: IRefObject[IResizeGroup]): Self = {
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
    def withDataDidRender(value: /* renderedData */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataDidRender")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDataDidRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataDidRender")(js.undefined)
        ret
    }
    @scala.inline
    def withDirection(value: ResizeGroupDirection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(js.undefined)
        ret
    }
    @scala.inline
    def withOnGrowData(value: /* prevData */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onGrowData")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnGrowData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onGrowData")(js.undefined)
        ret
    }
    @scala.inline
    def withStylesFunction1(value: IResizeGroupStyleProps => Partial[IResizeGroupStyles]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStyles(value: IStyleFunctionOrObject[IResizeGroupStyleProps, IResizeGroupStyles]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(value.asInstanceOf[js.Any])
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

