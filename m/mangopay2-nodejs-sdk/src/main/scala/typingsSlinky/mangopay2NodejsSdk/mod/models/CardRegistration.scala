package typingsSlinky.mangopay2NodejsSdk.mod.models

import typingsSlinky.mangopay2NodejsSdk.mod.cardRegistration.CardRegistrationData
import typingsSlinky.mangopay2NodejsSdk.mod.cardRegistration.CreateCardRegistration
import typingsSlinky.mangopay2NodejsSdk.mod.cardRegistration.UpdateCardRegistration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mangopay2-nodejs-sdk", "models.CardRegistration")
@js.native
class CardRegistration protected ()
  extends EntityBase[CardRegistrationData]
     with CardRegistrationData {
  def this(data: CreateCardRegistration) = this()
  def this(data: UpdateCardRegistration) = this()
}
