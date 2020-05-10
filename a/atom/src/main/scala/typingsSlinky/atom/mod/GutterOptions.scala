package typingsSlinky.atom.mod

import typingsSlinky.atom.atomStrings.`line-number`
import typingsSlinky.atom.atomStrings.decorated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GutterOptions extends js.Object {
  /** String added to the CSS classnames of the gutter's root DOM element. */
  var `class`: js.UndefOr[String] = js.native
  /**
    * Function called by a 'line-number' gutter to generate the label for each
    * line number element. Should return a String that will be used to label the
    * corresponding line.
    */
  var labelFn: js.UndefOr[js.Function1[/* lineData */ LineDataExtended, String]] = js.native
  /** (required) A unique String to identify this gutter. */
  var name: String = js.native
  /**
    * Function to be called when a mousedown event is received by a line-number
    * element within this type: 'line-number' Gutter. If unspecified, the default
    * behavior is to select the clicked buffer row.
    */
  var onMouseDown: js.UndefOr[js.Function1[/* lineData */ LineData, Unit]] = js.native
  /**
    * Function to be called when a mousemove event occurs on a line-number
    * element within within this type: 'line-number' Gutter.
    */
  var onMouseMove: js.UndefOr[js.Function1[/* lineData */ LineData, Unit]] = js.native
  /**
    * A Number that determines stacking order between gutters.
    * Lower priority items are forced closer to the edges of the window. (default: -100)
    */
  var priority: js.UndefOr[Double] = js.native
  /**
    * String specifying the type of gutter to create.
    * 'decorated' gutters are useful as a destination for decorations created with
    * Gutter::decorateMarker.
    * 'line-number' gutters.
    */
  var `type`: js.UndefOr[decorated | `line-number`] = js.native
  /**
    * Boolean specifying whether the gutter is visible initially after being created.
    * (default: true)
    */
  var visible: js.UndefOr[Boolean] = js.native
}

object GutterOptions {
  @scala.inline
  def apply(name: String): GutterOptions = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GutterOptions]
  }
  @scala.inline
  implicit class GutterOptionsOps[Self <: GutterOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("class")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("class")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelFn(value: /* lineData */ LineDataExtended => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelFn")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutLabelFn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelFn")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseDown(value: /* lineData */ LineData => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseDown")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMouseDown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseDown")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseMove(value: /* lineData */ LineData => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseMove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMouseMove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseMove")(js.undefined)
        ret
    }
    @scala.inline
    def withPriority(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priority")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPriority: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priority")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: decorated | `line-number`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(js.undefined)
        ret
    }
  }
  
}

