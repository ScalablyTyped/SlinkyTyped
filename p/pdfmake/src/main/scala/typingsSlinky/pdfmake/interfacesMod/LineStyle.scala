package typingsSlinky.pdfmake.interfacesMod

import typingsSlinky.pdfmake.anon.Length
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineStyle extends js.Object {
  var dash: js.UndefOr[Length] = js.undefined
}

object LineStyle {
  @scala.inline
  def apply(dash: Length = null): LineStyle = {
    val __obj = js.Dynamic.literal()
    if (dash != null) __obj.updateDynamic("dash")(dash.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineStyle]
  }
}

