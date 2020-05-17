package typingsSlinky.reactNativeMaterialUi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Labels extends js.Object {
  var icon: String = js.native
  var labels: js.Array[String] = js.native
}

object Labels {
  @scala.inline
  def apply(icon: String, labels: js.Array[String]): Labels = {
    val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any])
    __obj.asInstanceOf[Labels]
  }
  @scala.inline
  implicit class LabelsOps[Self <: Labels] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIcon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabels(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

