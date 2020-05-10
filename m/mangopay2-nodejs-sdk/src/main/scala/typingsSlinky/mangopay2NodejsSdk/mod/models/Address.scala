package typingsSlinky.mangopay2NodejsSdk.mod.models

import typingsSlinky.mangopay2NodejsSdk.PartialAddressData
import typingsSlinky.mangopay2NodejsSdk.mod.address.AddressData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.mangopay2NodejsSdk.mod.address._AddressType because Already inherited */ @JSImport("mangopay2-nodejs-sdk", "models.Address")
@js.native
class Address protected ()
  extends EntityBase[AddressData]
     with AddressData {
  def this(data: PartialAddressData) = this()
}

