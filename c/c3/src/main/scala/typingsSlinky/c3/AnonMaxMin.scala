package typingsSlinky.c3

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonMaxMin extends js.Object {
  var max: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in c3.c3.AxisName ]: number}
    */ typingsSlinky.c3.c3Strings.AnonMaxMin with TopLevel[js.Any] = js.native
  var min: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in c3.c3.AxisName ]: number}
    */ typingsSlinky.c3.c3Strings.AnonMaxMin with TopLevel[js.Any] = js.native
}

object AnonMaxMin {
  @scala.inline
  def apply(
    max: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in c3.c3.AxisName ]: number}
    */ typingsSlinky.c3.c3Strings.AnonMaxMin with TopLevel[js.Any],
    min: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in c3.c3.AxisName ]: number}
    */ typingsSlinky.c3.c3Strings.AnonMaxMin with TopLevel[js.Any]
  ): AnonMaxMin = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMaxMin]
  }
  @scala.inline
  implicit class AnonMaxMinOps[Self <: AnonMaxMin] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMax(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ key in c3.c3.AxisName ]: number}
      */ typingsSlinky.c3.c3Strings.AnonMaxMin with TopLevel[js.Any]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMin(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ key in c3.c3.AxisName ]: number}
      */ typingsSlinky.c3.c3Strings.AnonMaxMin with TopLevel[js.Any]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

