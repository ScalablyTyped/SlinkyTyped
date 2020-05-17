package typingsSlinky.c3.mod

import org.scalajs.dom.raw.SVGElement
import typingsSlinky.c3.anon.Left
import typingsSlinky.c3.anon.Name
import typingsSlinky.c3.anon.PositionShow
import typingsSlinky.c3.c3Strings.asc
import typingsSlinky.c3.c3Strings.desc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TooltipOptions extends js.Object {
  /**
    * Set custom HTML for the tooltip.
    * @param data If `tooltip.grouped` is true, data includes multiple data points.
    */
  var contents: js.UndefOr[
    js.ThisFunction4[
      /* this */ ChartInternal, 
      /* data */ js.Array[DataPoint], 
      /* defaultTitleFormat */ js.Function1[/* repeated */ js.Any, _], 
      /* defaultValueFormat */ js.Function1[/* repeated */ js.Any, _], 
      /* color */ js.Function1[/* repeated */ js.Any, _], 
      String
    ]
  ] = js.native
  var format: js.UndefOr[Name] = js.native
  /**
    * Set if tooltip is grouped or not for the data points.
    * Defaults to `true`.
    */
  var grouped: js.UndefOr[Boolean] = js.native
  /** Show the tooltips based on the horizontal position of the mouse. */
  var horizontal: js.UndefOr[Boolean] = js.native
  var init: js.UndefOr[PositionShow] = js.native
  /**
    * Set tooltip values order.
    */
  var order: js.UndefOr[
    desc | asc | js.Array[_] | (js.Function2[/* data1 */ js.Any, /* data2 */ js.Any, Double]) | Null
  ] = js.native
  /**
    * Set custom position for the tooltip. This option can be used to modify the tooltip position by returning object that has top and left.
    */
  var position: js.UndefOr[
    js.ThisFunction4[
      /* this */ ChartInternal, 
      /* data */ Primitive, 
      /* width */ Double, 
      /* height */ Double, 
      /* element */ SVGElement, 
      Left
    ]
  ] = js.native
  /**
    * Show or hide tooltip.
    * Defaults to `true`.
    */
  var show: js.UndefOr[Boolean] = js.native
}

object TooltipOptions {
  @scala.inline
  def apply(): TooltipOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TooltipOptions]
  }
  @scala.inline
  implicit class TooltipOptionsOps[Self <: TooltipOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContents(
      value: js.ThisFunction4[
          /* this */ ChartInternal, 
          /* data */ js.Array[DataPoint], 
          /* defaultTitleFormat */ js.Function1[/* repeated */ js.Any, _], 
          /* defaultValueFormat */ js.Function1[/* repeated */ js.Any, _], 
          /* color */ js.Function1[/* repeated */ js.Any, _], 
          String
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contents")(js.undefined)
        ret
    }
    @scala.inline
    def withFormat(value: Name): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
    @scala.inline
    def withGrouped(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grouped")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrouped: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grouped")(js.undefined)
        ret
    }
    @scala.inline
    def withHorizontal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHorizontal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontal")(js.undefined)
        ret
    }
    @scala.inline
    def withInit(value: PositionShow): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init")(js.undefined)
        ret
    }
    @scala.inline
    def withOrderFunction2(value: (/* data1 */ js.Any, /* data2 */ js.Any) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withOrder(value: desc | asc | js.Array[_] | (js.Function2[/* data1 */ js.Any, /* data2 */ js.Any, Double])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order")(js.undefined)
        ret
    }
    @scala.inline
    def withOrderNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order")(null)
        ret
    }
    @scala.inline
    def withPosition(
      value: js.ThisFunction4[
          /* this */ ChartInternal, 
          /* data */ Primitive, 
          /* width */ Double, 
          /* height */ Double, 
          /* element */ SVGElement, 
          Left
        ]
    ): Self = {
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
    def withShow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(js.undefined)
        ret
    }
  }
  
}

