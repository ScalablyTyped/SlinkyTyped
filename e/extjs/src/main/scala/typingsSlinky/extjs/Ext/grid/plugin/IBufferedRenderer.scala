package typingsSlinky.extjs.Ext.grid.plugin

import typingsSlinky.extjs.Ext.IAbstractPlugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBufferedRenderer extends IAbstractPlugin {
  /** [Method] Initialize this as a plugin
  		* @param grid Object
  		*/
  @JSName("init")
  var init_IBufferedRenderer: js.UndefOr[js.Function1[/* grid */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Config Option] (Number) */
  var leadingBufferZone: js.UndefOr[Double] = js.native
  /** [Config Option] (Number) */
  var numFromEdge: js.UndefOr[Double] = js.native
  /** [Config Option] (Number) */
  var percentageFromEdge: js.UndefOr[Double] = js.native
  /** [Property] (Number) */
  var position: js.UndefOr[Double] = js.native
  /** [Method] Scrolls to and optionlly selects the specified row index in the total dataset
  		* @param recordIdx Number The zero-based position in the dataset to scroll to.
  		* @param doSelect Boolean Pass as true to select the specified row.
  		* @param callback Function A function to call when the row has been scrolled to.
  		* @param scope Object The scope (this reference) in which to execute the callback. Defaults to this BufferedRenderer.
  		*/
  var scrollTo: js.UndefOr[
    js.Function4[
      /* recordIdx */ js.UndefOr[Double], 
      /* doSelect */ js.UndefOr[Boolean], 
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  /** [Config Option] (Number) */
  var scrollToLoadBuffer: js.UndefOr[Double] = js.native
  /** [Config Option] (Boolean) */
  var synchronousRender: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Number) */
  var trailingBufferZone: js.UndefOr[Double] = js.native
  /** [Config Option] (Boolean) */
  var variableRowHeight: js.UndefOr[Boolean] = js.native
}

object IBufferedRenderer {
  @scala.inline
  def apply(): IBufferedRenderer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBufferedRenderer]
  }
  @scala.inline
  implicit class IBufferedRendererOps[Self <: IBufferedRenderer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInit(value: /* grid */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutInit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init")(js.undefined)
        ret
    }
    @scala.inline
    def withLeadingBufferZone(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leadingBufferZone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeadingBufferZone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leadingBufferZone")(js.undefined)
        ret
    }
    @scala.inline
    def withNumFromEdge(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numFromEdge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumFromEdge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numFromEdge")(js.undefined)
        ret
    }
    @scala.inline
    def withPercentageFromEdge(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("percentageFromEdge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPercentageFromEdge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("percentageFromEdge")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollTo(
      value: (/* recordIdx */ js.UndefOr[Double], /* doSelect */ js.UndefOr[Boolean], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollTo")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutScrollTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollTo")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollToLoadBuffer(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollToLoadBuffer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollToLoadBuffer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollToLoadBuffer")(js.undefined)
        ret
    }
    @scala.inline
    def withSynchronousRender(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("synchronousRender")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSynchronousRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("synchronousRender")(js.undefined)
        ret
    }
    @scala.inline
    def withTrailingBufferZone(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trailingBufferZone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrailingBufferZone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trailingBufferZone")(js.undefined)
        ret
    }
    @scala.inline
    def withVariableRowHeight(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variableRowHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVariableRowHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variableRowHeight")(js.undefined)
        ret
    }
  }
  
}

