package typingsSlinky.awsDashSdk.clientsCloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefineSuggesterRequest extends js.Object {
  var DomainName: typingsSlinky.awsDashSdk.clientsCloudsearchMod.DomainName = js.native
  var Suggester: typingsSlinky.awsDashSdk.clientsCloudsearchMod.Suggester = js.native
}

object DefineSuggesterRequest {
  @scala.inline
  def apply(DomainName: DomainName, Suggester: Suggester): DefineSuggesterRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any], Suggester = Suggester.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DefineSuggesterRequest]
  }
}

