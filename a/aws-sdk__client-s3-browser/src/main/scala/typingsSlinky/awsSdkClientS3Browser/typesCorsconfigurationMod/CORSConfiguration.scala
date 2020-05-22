package typingsSlinky.awsSdkClientS3Browser.typesCorsconfigurationMod

import typingsSlinky.awsSdkClientS3Browser.typesCorsruleMod.CORSRule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CORSConfiguration extends js.Object {
  /**
    * _CORSRules shape
    */
  var CORSRules: js.Array[CORSRule] | js.Iterable[CORSRule]
}

object CORSConfiguration {
  @scala.inline
  def apply(CORSRules: js.Array[CORSRule] | js.Iterable[CORSRule]): CORSConfiguration = {
    val __obj = js.Dynamic.literal(CORSRules = CORSRules.asInstanceOf[js.Any])
    __obj.asInstanceOf[CORSConfiguration]
  }
}

