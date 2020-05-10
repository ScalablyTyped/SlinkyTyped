package typingsSlinky.morrisJs.morris

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBarOptions extends IGridChartOptions {
  /** Array containing colors for the series bars. */
  var barColors: js.UndefOr[js.Array[String]] = js.native
  /** Provide a function on this option to generate custom hover legends. */
  var hoverCallback: js.UndefOr[
    js.Function4[
      /* index */ Double, 
      /* options */ IBarOptions, 
      /* content */ String, 
      /* row */ js.Any, 
      String
    ]
  ] = js.native
  /** Set to true to draw bars stacked vertically. */
  var stacked: js.UndefOr[Boolean] = js.native
}

object IBarOptions {
  @scala.inline
  def apply(
    data: js.Array[_],
    element: js.Any,
    labels: js.Array[String],
    xkey: String,
    ykeys: js.Array[String]
  ): IBarOptions = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], xkey = xkey.asInstanceOf[js.Any], ykeys = ykeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBarOptions]
  }
  @scala.inline
  implicit class IBarOptionsOps[Self <: IBarOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBarColors(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barColors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBarColors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barColors")(js.undefined)
        ret
    }
    @scala.inline
    def withHoverCallback(
      value: (/* index */ Double, /* options */ IBarOptions, /* content */ String, /* row */ js.Any) => String
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverCallback")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutHoverCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverCallback")(js.undefined)
        ret
    }
    @scala.inline
    def withStacked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stacked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStacked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stacked")(js.undefined)
        ret
    }
  }
  
}

