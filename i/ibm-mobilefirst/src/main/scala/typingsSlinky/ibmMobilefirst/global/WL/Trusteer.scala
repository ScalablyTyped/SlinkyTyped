package typingsSlinky.ibmMobilefirst.global.WL

import typingsSlinky.ibmMobilefirst.WL.ResponseHandler
import typingsSlinky.ibmMobilefirst.WL.Trusteer.AssetmentRisks
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WL.Trusteer")
@js.native
object Trusteer extends js.Object {
  def getRiskAssessment(
    onSuccess: ResponseHandler[typingsSlinky.ibmMobilefirst.WL.Response],
    onFailure: ResponseHandler[typingsSlinky.ibmMobilefirst.WL.FailureResponse]
  ): AssetmentRisks = js.native
}

