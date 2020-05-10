package typingsSlinky.reactGtmModule.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataLayerArgs extends js.Object {
  /**
    * Object that contains all of the information that you want to pass to Google Tag Manager.
    */
  var dataLayer: js.UndefOr[js.Object] = js.native
  /**
    * Custom name for dataLayer object.
    */
  var dataLayerName: js.UndefOr[String] = js.native
}

object DataLayerArgs {
  @scala.inline
  def apply(): DataLayerArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataLayerArgs]
  }
  @scala.inline
  implicit class DataLayerArgsOps[Self <: DataLayerArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataLayer(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataLayer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataLayer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataLayer")(js.undefined)
        ret
    }
    @scala.inline
    def withDataLayerName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataLayerName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataLayerName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataLayerName")(js.undefined)
        ret
    }
  }
  
}

