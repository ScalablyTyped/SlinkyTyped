package typingsSlinky.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DynamicTargetingKeysListResponse extends js.Object {
  var dynamicTargetingKeys: js.UndefOr[js.Array[DynamicTargetingKey]] = js.native
  var kind: js.UndefOr[String] = js.native
}

object DynamicTargetingKeysListResponse {
  @scala.inline
  def apply(): DynamicTargetingKeysListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DynamicTargetingKeysListResponse]
  }
  @scala.inline
  implicit class DynamicTargetingKeysListResponseOps[Self <: DynamicTargetingKeysListResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDynamicTargetingKeys(value: js.Array[DynamicTargetingKey]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynamicTargetingKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDynamicTargetingKeys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynamicTargetingKeys")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
  }
  
}

