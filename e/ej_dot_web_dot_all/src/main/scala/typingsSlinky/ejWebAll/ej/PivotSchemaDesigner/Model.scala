package typingsSlinky.ejWebAll.ej.PivotSchemaDesigner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Model extends js.Object {
  /** Triggers when it reaches client-side after any AJAX request.
    */
  var afterServiceInvoke: js.UndefOr[js.Function1[/* e */ AfterServiceInvokeEventArgs, Unit]] = js.native
  /** Triggers before any AJAX request is passed from PivotSchemaDesigner to service methods.
    */
  var beforeServiceInvoke: js.UndefOr[js.Function1[/* e */ BeforeServiceInvokeEventArgs, Unit]] = js.native
  /** Specifies the CSS class to PivotSchemaDesigner to achieve custom theme.
    * @Default {â€œâ€}
    */
  var cssClass: js.UndefOr[String] = js.native
  /** Object utilized to pass additional information between client-end and service-end.
    * @Default {{}}
    */
  var customObject: js.UndefOr[js.Any] = js.native
  /** Triggers when we start dragging any field from PivotSchemaDesigner.
    */
  var dragMove: js.UndefOr[js.Function1[/* e */ DragMoveEventArgs, Unit]] = js.native
  /** Allows the user to enable/disable drag and drop operations within the PivotTable Field List.
    * @Default {true}
    */
  var enableDragDrop: js.UndefOr[Boolean] = js.native
  /** Allows the user to view PivotTable Field List from right to left.
    * @Default {false}
    */
  var enableRTL: js.UndefOr[Boolean] = js.native
  /** For ASP.NET and MVC Wrapper, PivotSchemaDesigner will be initialized and rendered empty initially. Once the connected pivot control widget is rendered completely,
    * PivotSchemaDesigner will just be populated with data source by setting this property to â€œtrueâ€.
    * @Default {false}
    */
  var enableWrapper: js.UndefOr[Boolean] = js.native
  /** Sets the height for PivotSchemaDesigner.
    * @Default {â€œâ€}
    */
  var height: js.UndefOr[String] = js.native
  /** Sets the layout for PivotSchemaDesigner.
    * @Default {ej.PivotSchemaDesigner.Layouts.Excel}
    */
  var layout: js.UndefOr[Layouts | String] = js.native
  /** Triggers when PivotSchemaDesigner loading is initiated.
    */
  var load: js.UndefOr[js.Function1[/* e */ LoadEventArgs, Unit]] = js.native
  /** Allows the user to set the localized language for the widget.
    * @Default {en-US}
    */
  var locale: js.UndefOr[String] = js.native
  /** Sets the visibility of OLAP elements in PivotTable Field List. This is only applicable for OLAP datasource.
    * @Default {null}
    */
  var olap: js.UndefOr[Olap] = js.native
  /** Sets the Pivot control bound with this PivotSchemaDesigner.
    * @Default {null}
    */
  var pivotControl: js.UndefOr[js.Any] = js.native
  /** Allows the user to set custom name for the methods at service-end, communicated during AJAX post.
    * @Default {{}}
    */
  var serviceMethods: js.UndefOr[js.Any] = js.native
  /** Connects the service using the specified URL for any server updates.
    * @Default {â€œâ€}
    */
  var url: js.UndefOr[String] = js.native
  /** Sets the width for PivotSchemaDesigner.
    * @Default {â€œâ€}
    */
  var width: js.UndefOr[String] = js.native
}

object Model {
  @scala.inline
  def apply(): Model = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Model]
  }
  @scala.inline
  implicit class ModelOps[Self <: Model] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfterServiceInvoke(value: /* e */ AfterServiceInvokeEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterServiceInvoke")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAfterServiceInvoke: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterServiceInvoke")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeServiceInvoke(value: /* e */ BeforeServiceInvokeEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeServiceInvoke")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBeforeServiceInvoke: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeServiceInvoke")(js.undefined)
        ret
    }
    @scala.inline
    def withCssClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCssClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssClass")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomObject(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customObject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomObject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customObject")(js.undefined)
        ret
    }
    @scala.inline
    def withDragMove(value: /* e */ DragMoveEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragMove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDragMove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragMove")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableDragDrop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableDragDrop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableDragDrop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableDragDrop")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableRTL(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableRTL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableRTL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableRTL")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableWrapper(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableWrapper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableWrapper: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableWrapper")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withLayout(value: Layouts | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(js.undefined)
        ret
    }
    @scala.inline
    def withLoad(value: /* e */ LoadEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("load")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("load")(js.undefined)
        ret
    }
    @scala.inline
    def withLocale(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(js.undefined)
        ret
    }
    @scala.inline
    def withOlap(value: Olap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("olap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOlap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("olap")(js.undefined)
        ret
    }
    @scala.inline
    def withPivotControl(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pivotControl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPivotControl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pivotControl")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceMethods(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceMethods")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceMethods: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceMethods")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

