package typingsSlinky.flot.jquery.flot

import org.scalajs.dom.raw.CanvasRenderingContext2D
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.jquery.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait hooks extends js.Object {
  var bindEvents: js.UndefOr[
    js.Array[js.Function2[/* plot */ plot, /* eventHolder */ JQuery[HTMLElement], Unit]]
  ] = js.native
  var draw: js.UndefOr[
    js.Array[js.Function2[/* plot */ plot, /* context */ CanvasRenderingContext2D, Unit]]
  ] = js.native
  var drawBackground: js.UndefOr[
    js.Array[js.Function2[/* plot */ plot, /* context */ CanvasRenderingContext2D, Unit]]
  ] = js.native
  var drawOverlay: js.UndefOr[
    js.Array[js.Function2[/* plot */ plot, /* context */ CanvasRenderingContext2D, Unit]]
  ] = js.native
  var drawSeries: js.UndefOr[
    js.Array[
      js.Function3[/* plot */ plot, /* context */ CanvasRenderingContext2D, /* series */ dataSeries, Unit]
    ]
  ] = js.native
  var processDatapoints: js.UndefOr[
    js.Array[
      js.Function3[/* plot */ plot, /* series */ dataSeries, /* datapoints */ datapoints, Unit]
    ]
  ] = js.native
  var processOffset: js.UndefOr[js.Array[js.Function2[/* plot */ plot, /* offset */ canvasPoint, Unit]]] = js.native
  var processOptions: js.UndefOr[js.Array[js.Function2[/* plot */ plot, /* options */ plotOptions, Unit]]] = js.native
  var processRawData: js.UndefOr[
    js.Array[
      js.Function4[
        /* plot */ plot, 
        /* series */ dataSeries, 
        /* data */ js.Array[_], 
        /* datapoints */ datapoints, 
        Unit
      ]
    ]
  ] = js.native
  var shutdown: js.UndefOr[
    js.Array[js.Function2[/* plot */ plot, /* eventHolder */ JQuery[HTMLElement], Unit]]
  ] = js.native
}

object hooks {
  @scala.inline
  def apply(): hooks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[hooks]
  }
  @scala.inline
  implicit class hooksOps[Self <: hooks] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBindEvents(value: js.Array[js.Function2[/* plot */ plot, /* eventHolder */ JQuery[HTMLElement], Unit]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBindEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindEvents")(js.undefined)
        ret
    }
    @scala.inline
    def withDraw(value: js.Array[js.Function2[/* plot */ plot, /* context */ CanvasRenderingContext2D, Unit]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draw")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDraw: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draw")(js.undefined)
        ret
    }
    @scala.inline
    def withDrawBackground(value: js.Array[js.Function2[/* plot */ plot, /* context */ CanvasRenderingContext2D, Unit]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawBackground")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrawBackground: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawBackground")(js.undefined)
        ret
    }
    @scala.inline
    def withDrawOverlay(value: js.Array[js.Function2[/* plot */ plot, /* context */ CanvasRenderingContext2D, Unit]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawOverlay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrawOverlay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawOverlay")(js.undefined)
        ret
    }
    @scala.inline
    def withDrawSeries(
      value: js.Array[
          js.Function3[/* plot */ plot, /* context */ CanvasRenderingContext2D, /* series */ dataSeries, Unit]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawSeries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrawSeries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawSeries")(js.undefined)
        ret
    }
    @scala.inline
    def withProcessDatapoints(
      value: js.Array[
          js.Function3[/* plot */ plot, /* series */ dataSeries, /* datapoints */ datapoints, Unit]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processDatapoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProcessDatapoints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processDatapoints")(js.undefined)
        ret
    }
    @scala.inline
    def withProcessOffset(value: js.Array[js.Function2[/* plot */ plot, /* offset */ canvasPoint, Unit]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProcessOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withProcessOptions(value: js.Array[js.Function2[/* plot */ plot, /* options */ plotOptions, Unit]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProcessOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withProcessRawData(
      value: js.Array[
          js.Function4[
            /* plot */ plot, 
            /* series */ dataSeries, 
            /* data */ js.Array[_], 
            /* datapoints */ datapoints, 
            Unit
          ]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processRawData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProcessRawData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processRawData")(js.undefined)
        ret
    }
    @scala.inline
    def withShutdown(value: js.Array[js.Function2[/* plot */ plot, /* eventHolder */ JQuery[HTMLElement], Unit]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shutdown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShutdown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shutdown")(js.undefined)
        ret
    }
  }
  
}

