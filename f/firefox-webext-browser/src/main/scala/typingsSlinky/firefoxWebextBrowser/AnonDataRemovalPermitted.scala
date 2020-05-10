package typingsSlinky.firefoxWebextBrowser

import typingsSlinky.firefoxWebextBrowser.browser.browsingData.DataTypeSet
import typingsSlinky.firefoxWebextBrowser.browser.browsingData.RemovalOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDataRemovalPermitted extends js.Object {
  /**
    * All of the types will be present in the result, with values of `true` if they are permitted to be removed
    * (e.g., by enterprise policy) and `false` if not.
    */
  var dataRemovalPermitted: DataTypeSet = js.native
  /**
    * All of the types will be present in the result, with values of `true` if they are both selected to be
    * removed and permitted to be removed, otherwise `false`.
    */
  var dataToRemove: DataTypeSet = js.native
  var options: RemovalOptions = js.native
}

object AnonDataRemovalPermitted {
  @scala.inline
  def apply(dataRemovalPermitted: DataTypeSet, dataToRemove: DataTypeSet, options: RemovalOptions): AnonDataRemovalPermitted = {
    val __obj = js.Dynamic.literal(dataRemovalPermitted = dataRemovalPermitted.asInstanceOf[js.Any], dataToRemove = dataToRemove.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDataRemovalPermitted]
  }
  @scala.inline
  implicit class AnonDataRemovalPermittedOps[Self <: AnonDataRemovalPermitted] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataRemovalPermitted(value: DataTypeSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataRemovalPermitted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataToRemove(value: DataTypeSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataToRemove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptions(value: RemovalOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

