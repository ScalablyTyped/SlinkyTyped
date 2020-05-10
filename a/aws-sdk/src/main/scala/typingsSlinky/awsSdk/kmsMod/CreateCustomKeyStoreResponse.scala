package typingsSlinky.awsSdk.kmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateCustomKeyStoreResponse extends js.Object {
  /**
    * A unique identifier for the new custom key store.
    */
  var CustomKeyStoreId: js.UndefOr[CustomKeyStoreIdType] = js.native
}

object CreateCustomKeyStoreResponse {
  @scala.inline
  def apply(): CreateCustomKeyStoreResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateCustomKeyStoreResponse]
  }
  @scala.inline
  implicit class CreateCustomKeyStoreResponseOps[Self <: CreateCustomKeyStoreResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomKeyStoreId(value: CustomKeyStoreIdType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustomKeyStoreId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomKeyStoreId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustomKeyStoreId")(js.undefined)
        ret
    }
  }
  
}

