package typingsSlinky.kendoUi

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.kendoUi.kendo.ui.editor.Toolbar
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofeditor extends js.Object {
  var Toolbar: Instantiable0[typingsSlinky.kendoUi.kendo.ui.editor.Toolbar] = js.native
}

object Typeofeditor {
  @scala.inline
  def apply(Toolbar: Instantiable0[Toolbar]): Typeofeditor = {
    val __obj = js.Dynamic.literal(Toolbar = Toolbar.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofeditor]
  }
  @scala.inline
  implicit class TypeofeditorOps[Self <: Typeofeditor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withToolbar(value: Instantiable0[Toolbar]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Toolbar")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

