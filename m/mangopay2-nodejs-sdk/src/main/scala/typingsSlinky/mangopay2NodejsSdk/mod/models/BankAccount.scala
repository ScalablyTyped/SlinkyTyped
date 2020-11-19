package typingsSlinky.mangopay2NodejsSdk.mod.models

import typingsSlinky.mangopay2NodejsSdk.mod.bankAccount.BaseData
import typingsSlinky.mangopay2NodejsSdk.mod.bankAccount.CreationDetails
import typingsSlinky.mangopay2NodejsSdk.mod.bankAccount.DataIntersection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mangopay2-nodejs-sdk", "models.BankAccount")
@js.native
class BankAccount protected ()
  extends EntityBase[BaseData]
     with DataIntersection {
  def this(data: CreationDetails) = this()
}
