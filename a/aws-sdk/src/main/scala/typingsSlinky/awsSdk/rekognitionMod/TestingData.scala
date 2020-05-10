package typingsSlinky.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestingData extends js.Object {
  /**
    * The assets used for testing.
    */
  var Assets: js.UndefOr[typingsSlinky.awsSdk.rekognitionMod.Assets] = js.native
  /**
    * If specified, Amazon Rekognition Custom Labels creates a testing dataset with an 80/20 split of the training dataset.
    */
  var AutoCreate: js.UndefOr[Boolean] = js.native
}

object TestingData {
  @scala.inline
  def apply(): TestingData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestingData]
  }
  @scala.inline
  implicit class TestingDataOps[Self <: TestingData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssets(value: Assets): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Assets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Assets")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoCreate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoCreate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoCreate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoCreate")(js.undefined)
        ret
    }
  }
  
}

