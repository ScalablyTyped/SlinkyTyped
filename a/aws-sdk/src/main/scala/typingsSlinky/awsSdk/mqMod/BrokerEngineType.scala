package typingsSlinky.awsSdk.mqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BrokerEngineType extends js.Object {
  /**
    * The type of broker engine.
    */
  var EngineType: js.UndefOr[typingsSlinky.awsSdk.mqMod.EngineType] = js.native
  /**
    * The list of engine versions.
    */
  var EngineVersions: js.UndefOr[listOfEngineVersion] = js.native
}

object BrokerEngineType {
  @scala.inline
  def apply(): BrokerEngineType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BrokerEngineType]
  }
  @scala.inline
  implicit class BrokerEngineTypeOps[Self <: BrokerEngineType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEngineType(value: EngineType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EngineType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEngineType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EngineType")(js.undefined)
        ret
    }
    @scala.inline
    def withEngineVersions(value: listOfEngineVersion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EngineVersions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEngineVersions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EngineVersions")(js.undefined)
        ret
    }
  }
  
}

