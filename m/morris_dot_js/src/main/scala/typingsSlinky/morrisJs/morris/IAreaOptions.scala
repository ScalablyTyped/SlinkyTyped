package typingsSlinky.morrisJs.morris

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAreaOptions extends ILineOptions {
  /**  Set to true to overlay the areas on top of each other instead of stacking them.  */
  var behaveLikeLine: js.UndefOr[Boolean] = js.native
}

object IAreaOptions {
  @scala.inline
  def apply(
    data: js.Array[_],
    element: js.Any,
    labels: js.Array[String],
    xkey: String,
    ykeys: js.Array[String]
  ): IAreaOptions = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], xkey = xkey.asInstanceOf[js.Any], ykeys = ykeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAreaOptions]
  }
  @scala.inline
  implicit class IAreaOptionsOps[Self <: IAreaOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBehaveLikeLine(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("behaveLikeLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBehaveLikeLine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("behaveLikeLine")(js.undefined)
        ret
    }
  }
  
}

