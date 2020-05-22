package typingsSlinky.mangopay2NodejsSdk.mod.client

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlatformCategorization extends js.Object {
  var BusinessType: typingsSlinky.mangopay2NodejsSdk.mod.client.BusinessType
  var Sector: typingsSlinky.mangopay2NodejsSdk.mod.client.Sector
}

object PlatformCategorization {
  @scala.inline
  def apply(BusinessType: BusinessType, Sector: Sector): PlatformCategorization = {
    val __obj = js.Dynamic.literal(BusinessType = BusinessType.asInstanceOf[js.Any], Sector = Sector.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlatformCategorization]
  }
}

