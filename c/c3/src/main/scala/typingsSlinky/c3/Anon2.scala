package typingsSlinky.c3

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon2 extends js.Object {
  var max: js.UndefOr[
    Double | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in c3.c3.AxisName ]:? number}
    */ typingsSlinky.c3.c3Strings.Anon2 with TopLevel[js.Any])
  ] = js.native
  var min: js.UndefOr[
    Double | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in c3.c3.AxisName ]:? number}
    */ typingsSlinky.c3.c3Strings.Anon2 with TopLevel[js.Any])
  ] = js.native
}

object Anon2 {
  @scala.inline
  def apply(): Anon2 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Anon2]
  }
  @scala.inline
  implicit class Anon2Ops[Self <: Anon2] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMax(
      value: Double | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ key in c3.c3.AxisName ]:? number}
      */ typingsSlinky.c3.c3Strings.Anon2 with TopLevel[js.Any])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(js.undefined)
        ret
    }
    @scala.inline
    def withMin(
      value: Double | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ key in c3.c3.AxisName ]:? number}
      */ typingsSlinky.c3.c3Strings.Anon2 with TopLevel[js.Any])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(js.undefined)
        ret
    }
  }
  
}

