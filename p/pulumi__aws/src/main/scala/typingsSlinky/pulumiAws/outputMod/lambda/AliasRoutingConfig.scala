package typingsSlinky.pulumiAws.outputMod.lambda

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AliasRoutingConfig extends js.Object {
  /**
    * A map that defines the proportion of events that should be sent to different versions of a lambda function.
    */
  var additionalVersionWeights: js.UndefOr[StringDictionary[Double]] = js.native
}

object AliasRoutingConfig {
  @scala.inline
  def apply(): AliasRoutingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AliasRoutingConfig]
  }
  @scala.inline
  implicit class AliasRoutingConfigOps[Self <: AliasRoutingConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdditionalVersionWeights(value: StringDictionary[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalVersionWeights")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdditionalVersionWeights: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalVersionWeights")(js.undefined)
        ret
    }
  }
  
}

