package typingsSlinky.connectAzuretables.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AzureTableStoreFactory extends js.Object {
  def create(options: AzureTableStoreOptions): AzureTableStore = js.native
}

object AzureTableStoreFactory {
  @scala.inline
  def apply(create: AzureTableStoreOptions => AzureTableStore): AzureTableStoreFactory = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create))
    __obj.asInstanceOf[AzureTableStoreFactory]
  }
  @scala.inline
  implicit class AzureTableStoreFactoryOps[Self <: AzureTableStoreFactory] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreate(value: AzureTableStoreOptions => AzureTableStore): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

