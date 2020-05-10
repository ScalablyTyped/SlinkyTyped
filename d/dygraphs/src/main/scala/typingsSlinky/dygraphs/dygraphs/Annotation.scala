package typingsSlinky.dygraphs.dygraphs

import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.MouseEvent
import typingsSlinky.dygraphs.Dygraph
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Annotation extends js.Object {
  /**	If true, attach annotations to the x-axis, rather than to actual points. */
  var attachAtBottom: js.UndefOr[Boolean] = js.native
  /** This function is called whenever the user clicks on this annotation. */
  var clickHandler: js.UndefOr[
    js.Function4[
      /* annotation */ Annotation, 
      /* point */ Point, 
      /* dygraph */ Dygraph, 
      /* event */ MouseEvent, 
      _
    ]
  ] = js.native
  /**	CSS class to use for styling the annotation. */
  var cssClass: js.UndefOr[String] = js.native
  /** this function is called whenever the user double-clicks on this annotation. */
  var dblClickHandler: js.UndefOr[
    js.Function4[
      /* annotation */ Annotation, 
      /* point */ Point, 
      /* dygraph */ Dygraph, 
      /* event */ MouseEvent, 
      _
    ]
  ] = js.native
  var div: js.UndefOr[HTMLDivElement] = js.native
  /** Height (in pixels) of the annotation flag or icon. */
  var height: js.UndefOr[Double] = js.native
  /**
    * Specify in place of shortText to mark the annotation with an image rather than text.
    * If you specify this, you must specify width and height.
    */
  var icon: js.UndefOr[String] = js.native
  /** This function is called whenever the user mouses out of this annotation. */
  var mouseOutHandler: js.UndefOr[
    js.Function4[
      /* annotation */ Annotation, 
      /* point */ Point, 
      /* dygraph */ Dygraph, 
      /* event */ MouseEvent, 
      _
    ]
  ] = js.native
  /** This function is called whenever the user mouses over this annotation. */
  var mouseOverHandler: js.UndefOr[
    js.Function4[
      /* annotation */ Annotation, 
      /* point */ Point, 
      /* dygraph */ Dygraph, 
      /* event */ MouseEvent, 
      _
    ]
  ] = js.native
  /** The name of the series to which the annotated point belongs. */
  var series: String = js.native
  /**	Text that will appear on the annotation's flag. */
  var shortText: js.UndefOr[String] = js.native
  /** A longer description of the annotation which will appear when the user hovers over it. */
  var text: js.UndefOr[String] = js.native
  /**	Height of the tick mark (in pixels) connecting the point to its flag or icon. */
  var tickHeight: js.UndefOr[Double] = js.native
  /**	Width (in pixels) of the annotation flag or icon. */
  var width: js.UndefOr[Double] = js.native
  /**
    * The x value of the point. This should be the same as the value
    * you specified in your CSV file, e.g. "2010-09-13".
    * You must set either x or xval.
    */
  var x: js.UndefOr[Double | String] = js.native
  /**
    * numeric value of the point, or millis since epoch.
    */
  var xval: js.UndefOr[Double] = js.native
}

object Annotation {
  @scala.inline
  def apply(series: String): Annotation = {
    val __obj = js.Dynamic.literal(series = series.asInstanceOf[js.Any])
    __obj.asInstanceOf[Annotation]
  }
  @scala.inline
  implicit class AnnotationOps[Self <: Annotation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSeries(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("series")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAttachAtBottom(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachAtBottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttachAtBottom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachAtBottom")(js.undefined)
        ret
    }
    @scala.inline
    def withClickHandler(
      value: (/* annotation */ Annotation, /* point */ Point, /* dygraph */ Dygraph, /* event */ MouseEvent) => _
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickHandler")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutClickHandler: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickHandler")(js.undefined)
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
    def withDblClickHandler(
      value: (/* annotation */ Annotation, /* point */ Point, /* dygraph */ Dygraph, /* event */ MouseEvent) => _
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dblClickHandler")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutDblClickHandler: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dblClickHandler")(js.undefined)
        ret
    }
    @scala.inline
    def withDiv(value: HTMLDivElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("div")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDiv: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("div")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
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
    def withIcon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(js.undefined)
        ret
    }
    @scala.inline
    def withMouseOutHandler(
      value: (/* annotation */ Annotation, /* point */ Point, /* dygraph */ Dygraph, /* event */ MouseEvent) => _
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseOutHandler")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutMouseOutHandler: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseOutHandler")(js.undefined)
        ret
    }
    @scala.inline
    def withMouseOverHandler(
      value: (/* annotation */ Annotation, /* point */ Point, /* dygraph */ Dygraph, /* event */ MouseEvent) => _
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseOverHandler")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutMouseOverHandler: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseOverHandler")(js.undefined)
        ret
    }
    @scala.inline
    def withShortText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShortText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortText")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
    @scala.inline
    def withTickHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTickHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
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
    @scala.inline
    def withX(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(js.undefined)
        ret
    }
    @scala.inline
    def withXval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xval")(js.undefined)
        ret
    }
  }
  
}

