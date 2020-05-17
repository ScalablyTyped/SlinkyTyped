package typingsSlinky.forms.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined forms.forms.WidgetParameters & {  rows ? :number,   cols ? :number} */
@js.native
trait WidgetParametersrowsnumbe extends js.Object {
  /** Custom classes to add to the rendered widget. */
  var classes: js.UndefOr[js.Array[String]] = js.native
  var cols: js.UndefOr[Double] = js.native
  /** Custom classes to add to the choices label when applicable (multipleRadio and multipleCheckbox) */
  var labelClasses: js.UndefOr[js.Array[String]] = js.native
  var rows: js.UndefOr[Double] = js.native
  /** A string representing the widget type, e.g. 'text' or 'checkbox' */
  var `type`: js.UndefOr[String] = js.native
}

object WidgetParametersrowsnumbe {
  @scala.inline
  def apply(): WidgetParametersrowsnumbe = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WidgetParametersrowsnumbe]
  }
  @scala.inline
  implicit class WidgetParametersrowsnumbeOps[Self <: WidgetParametersrowsnumbe] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClasses(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClasses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classes")(js.undefined)
        ret
    }
    @scala.inline
    def withCols(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cols")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCols: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cols")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelClasses(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelClasses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelClasses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelClasses")(js.undefined)
        ret
    }
    @scala.inline
    def withRows(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rows")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
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
  }
  
}

