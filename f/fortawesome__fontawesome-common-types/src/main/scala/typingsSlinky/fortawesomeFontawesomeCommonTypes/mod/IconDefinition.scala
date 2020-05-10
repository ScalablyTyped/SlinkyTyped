package typingsSlinky.fortawesomeFontawesomeCommonTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IconDefinition extends IconLookup {
  var icon: js.Tuple5[Double, Double, js.Array[String], String, IconPathData] = js.native
}

object IconDefinition {
  @scala.inline
  implicit class IconDefinitionOps[Self <: IconDefinition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIcon(value: js.Tuple5[Double, Double, js.Array[String], String, IconPathData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

