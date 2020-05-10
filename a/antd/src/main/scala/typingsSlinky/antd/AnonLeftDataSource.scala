package typingsSlinky.antd

import typingsSlinky.antd.transferMod.TransferItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonLeftDataSource extends js.Object {
  var leftDataSource: js.Array[TransferItem] = js.native
  var rightDataSource: js.Array[TransferItem] = js.native
}

object AnonLeftDataSource {
  @scala.inline
  def apply(leftDataSource: js.Array[TransferItem], rightDataSource: js.Array[TransferItem]): AnonLeftDataSource = {
    val __obj = js.Dynamic.literal(leftDataSource = leftDataSource.asInstanceOf[js.Any], rightDataSource = rightDataSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLeftDataSource]
  }
  @scala.inline
  implicit class AnonLeftDataSourceOps[Self <: AnonLeftDataSource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLeftDataSource(value: js.Array[TransferItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftDataSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRightDataSource(value: js.Array[TransferItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightDataSource")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

