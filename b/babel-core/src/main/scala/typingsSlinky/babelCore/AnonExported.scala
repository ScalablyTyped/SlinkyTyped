package typingsSlinky.babelCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonExported extends js.Object {
  var exported: js.Array[js.Object] = js.native
  var specifiers: js.Array[js.Object] = js.native
}

object AnonExported {
  @scala.inline
  def apply(exported: js.Array[js.Object], specifiers: js.Array[js.Object]): AnonExported = {
    val __obj = js.Dynamic.literal(exported = exported.asInstanceOf[js.Any], specifiers = specifiers.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonExported]
  }
  @scala.inline
  implicit class AnonExportedOps[Self <: AnonExported] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExported(value: js.Array[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exported")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpecifiers(value: js.Array[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("specifiers")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

