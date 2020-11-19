package typingsSlinky.mangopay2NodejsSdk.mod.models

import typingsSlinky.mangopay2NodejsSdk.anon.PartialMandateData
import typingsSlinky.mangopay2NodejsSdk.mod.mandate.MandateData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mangopay2-nodejs-sdk", "models.Mandate")
@js.native
class Mandate ()
  extends EntityBase[MandateData]
     with MandateData {
  def this(data: PartialMandateData) = this()
}
