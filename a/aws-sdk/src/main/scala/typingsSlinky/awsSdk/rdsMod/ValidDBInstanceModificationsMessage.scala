package typingsSlinky.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValidDBInstanceModificationsMessage extends js.Object {
  /**
    * Valid storage options for your DB instance. 
    */
  var Storage: js.UndefOr[ValidStorageOptionsList] = js.native
  /**
    * Valid processor features for your DB instance. 
    */
  var ValidProcessorFeatures: js.UndefOr[AvailableProcessorFeatureList] = js.native
}

object ValidDBInstanceModificationsMessage {
  @scala.inline
  def apply(): ValidDBInstanceModificationsMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValidDBInstanceModificationsMessage]
  }
  @scala.inline
  implicit class ValidDBInstanceModificationsMessageOps[Self <: ValidDBInstanceModificationsMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStorage(value: ValidStorageOptionsList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Storage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStorage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Storage")(js.undefined)
        ret
    }
    @scala.inline
    def withValidProcessorFeatures(value: AvailableProcessorFeatureList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ValidProcessorFeatures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidProcessorFeatures: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ValidProcessorFeatures")(js.undefined)
        ret
    }
  }
  
}

