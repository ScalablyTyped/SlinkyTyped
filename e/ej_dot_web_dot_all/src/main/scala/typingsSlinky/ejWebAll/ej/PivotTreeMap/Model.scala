package typingsSlinky.ejWebAll.ej.PivotTreeMap

import typingsSlinky.ejWebAll.ej.Pivot.OperationalMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Model extends js.Object {
  /** Triggers when it reaches client-side after any AJAX request.
    */
  var afterServiceInvoke: js.UndefOr[js.Function1[/* e */ AfterServiceInvokeEventArgs, Unit]] = js.native
  /** Triggers before any AJAX request is passed from PivotTreeMap to service methods.
    */
  var beforeServiceInvoke: js.UndefOr[js.Function1[/* e */ BeforeServiceInvokeEventArgs, Unit]] = js.native
  /** Specifies the CSS class to PivotTreeMap to achieve custom theme.
    * @Default {â€œâ€}
    */
  var cssClass: js.UndefOr[String] = js.native
  /** Object utilized to pass additional information between client-end and service-end.
    * @Default {{}}
    */
  var customObject: js.UndefOr[js.Any] = js.native
  /** Initializes the data source for the PivotTreeMap widget, when it functions completely on client-side.
    * @Default {{}}
    */
  var dataSource: js.UndefOr[DataSource] = js.native
  /** Triggers when drill up/down happens in PivotTreeMap control. And it returns the outer HTML of PivotTreeMap control.
    */
  var drillSuccess: js.UndefOr[js.Function1[/* e */ DrillSuccessEventArgs, Unit]] = js.native
  /** Allows you to enable &quot;withCredentials&quot; property inside XMLHttpRequest object for CORS(Cross-Origin Resource Sharing) request.
    * @Default {false}
    */
  var enableXHRCredentials: js.UndefOr[Boolean] = js.native
  /** Allows the user to enable PivotTreeMapâ€™s responsiveness in the browser layout.
    * @Default {false}
    */
  var isResponsive: js.UndefOr[Boolean] = js.native
  /** Triggers when PivotTreeMap starts to render.
    */
  var load: js.UndefOr[js.Function1[/* e */ LoadEventArgs, Unit]] = js.native
  /** Allows the user to set the localized language for the widget.
    * @Default {en-US}
    */
  var locale: js.UndefOr[String] = js.native
  /** Sets the mode for the PivotTreeMap widget for binding data source either in server-side or client-side.
    * @Default {ej.Pivot.OperationalMode.ClientMode}
    */
  var operationalMode: js.UndefOr[OperationalMode | String] = js.native
  /** Triggers when PivotTreeMap widget completes all operations at client-side after any AJAX request.
    */
  var renderComplete: js.UndefOr[js.Function1[/* e */ RenderCompleteEventArgs, Unit]] = js.native
  /** Triggers when any error occurred during AJAX request.
    */
  var renderFailure: js.UndefOr[js.Function1[/* e */ RenderFailureEventArgs, Unit]] = js.native
  /** Triggers when PivotTreeMap successfully reaches client-side after any AJAX request.
    */
  var renderSuccess: js.UndefOr[js.Function1[/* e */ RenderSuccessEventArgs, Unit]] = js.native
  /** Allows the user to set custom name for the methods at service-end, communicated on AJAX post.
    * @Default {{}}
    */
  var serviceMethodSettings: js.UndefOr[ServiceMethodSettings] = js.native
  /** Connects the service using the specified URL for any server updates.
    * @Default {â€œâ€}
    */
  var url: js.UndefOr[String] = js.native
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
    def withDataSource(value: DataSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSource")(js.undefined)
        ret
    }
    @scala.inline
    def withDrillSuccess(value: /* e */ DrillSuccessEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drillSuccess")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDrillSuccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drillSuccess")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableXHRCredentials(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableXHRCredentials")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableXHRCredentials: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableXHRCredentials")(js.undefined)
        ret
    }
    @scala.inline
    def withIsResponsive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isResponsive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsResponsive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isResponsive")(js.undefined)
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
    def withOperationalMode(value: OperationalMode | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operationalMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOperationalMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operationalMode")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderComplete(value: /* e */ RenderCompleteEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderComplete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRenderComplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderComplete")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderFailure(value: /* e */ RenderFailureEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderFailure")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRenderFailure: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderFailure")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderSuccess(value: /* e */ RenderSuccessEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderSuccess")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRenderSuccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderSuccess")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceMethodSettings(value: ServiceMethodSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceMethodSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceMethodSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceMethodSettings")(js.undefined)
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
  }
  
}

