package typingsSlinky.chartJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartTooltipCallback extends js.Object {
  var afterBody: js.UndefOr[
    js.Function2[
      /* item */ js.Array[ChartTooltipItem], 
      /* data */ ChartData, 
      String | js.Array[String]
    ]
  ] = js.native
  var afterFooter: js.UndefOr[
    js.Function2[
      /* item */ js.Array[ChartTooltipItem], 
      /* data */ ChartData, 
      String | js.Array[String]
    ]
  ] = js.native
  var afterLabel: js.UndefOr[
    js.Function2[/* tooltipItem */ ChartTooltipItem, /* data */ ChartData, String | js.Array[String]]
  ] = js.native
  var afterTitle: js.UndefOr[
    js.Function2[
      /* item */ js.Array[ChartTooltipItem], 
      /* data */ ChartData, 
      String | js.Array[String]
    ]
  ] = js.native
  var beforeBody: js.UndefOr[
    js.Function2[
      /* item */ js.Array[ChartTooltipItem], 
      /* data */ ChartData, 
      String | js.Array[String]
    ]
  ] = js.native
  var beforeFooter: js.UndefOr[
    js.Function2[
      /* item */ js.Array[ChartTooltipItem], 
      /* data */ ChartData, 
      String | js.Array[String]
    ]
  ] = js.native
  var beforeLabel: js.UndefOr[
    js.Function2[/* tooltipItem */ ChartTooltipItem, /* data */ ChartData, String | js.Array[String]]
  ] = js.native
  var beforeTitle: js.UndefOr[
    js.Function2[
      /* item */ js.Array[ChartTooltipItem], 
      /* data */ ChartData, 
      String | js.Array[String]
    ]
  ] = js.native
  var footer: js.UndefOr[
    js.Function2[
      /* item */ js.Array[ChartTooltipItem], 
      /* data */ ChartData, 
      String | js.Array[String]
    ]
  ] = js.native
  var label: js.UndefOr[
    js.Function2[/* tooltipItem */ ChartTooltipItem, /* data */ ChartData, String | js.Array[String]]
  ] = js.native
  var labelColor: js.UndefOr[
    js.Function2[/* tooltipItem */ ChartTooltipItem, /* chart */ Chart, ChartTooltipLabelColor]
  ] = js.native
  var labelTextColor: js.UndefOr[js.Function2[/* tooltipItem */ ChartTooltipItem, /* chart */ Chart, String]] = js.native
  var title: js.UndefOr[
    js.Function2[
      /* item */ js.Array[ChartTooltipItem], 
      /* data */ ChartData, 
      String | js.Array[String]
    ]
  ] = js.native
}

object ChartTooltipCallback {
  @scala.inline
  def apply(): ChartTooltipCallback = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartTooltipCallback]
  }
  @scala.inline
  implicit class ChartTooltipCallbackOps[Self <: ChartTooltipCallback] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfterBody(value: (/* item */ js.Array[ChartTooltipItem], /* data */ ChartData) => String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterBody")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutAfterBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterBody")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterFooter(value: (/* item */ js.Array[ChartTooltipItem], /* data */ ChartData) => String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterFooter")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutAfterFooter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterFooter")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterLabel(value: (/* tooltipItem */ ChartTooltipItem, /* data */ ChartData) => String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterLabel")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutAfterLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterTitle(value: (/* item */ js.Array[ChartTooltipItem], /* data */ ChartData) => String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterTitle")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutAfterTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeBody(value: (/* item */ js.Array[ChartTooltipItem], /* data */ ChartData) => String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeBody")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutBeforeBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeBody")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeFooter(value: (/* item */ js.Array[ChartTooltipItem], /* data */ ChartData) => String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeFooter")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutBeforeFooter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeFooter")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeLabel(value: (/* tooltipItem */ ChartTooltipItem, /* data */ ChartData) => String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeLabel")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutBeforeLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeTitle(value: (/* item */ js.Array[ChartTooltipItem], /* data */ ChartData) => String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeTitle")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutBeforeTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withFooter(value: (/* item */ js.Array[ChartTooltipItem], /* data */ ChartData) => String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footer")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutFooter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footer")(js.undefined)
        ret
    }
    @scala.inline
    def withLabel(value: (/* tooltipItem */ ChartTooltipItem, /* data */ ChartData) => String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelColor(value: (/* tooltipItem */ ChartTooltipItem, /* chart */ Chart) => ChartTooltipLabelColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelColor")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutLabelColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelColor")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelTextColor(value: (/* tooltipItem */ ChartTooltipItem, /* chart */ Chart) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelTextColor")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutLabelTextColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelTextColor")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: (/* item */ js.Array[ChartTooltipItem], /* data */ ChartData) => String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
  }
  
}

