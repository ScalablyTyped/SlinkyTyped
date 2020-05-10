package typingsSlinky.pulumiAws.inputMod.dms

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EndpointMongodbSettings extends js.Object {
  var authMechanism: js.UndefOr[Input[String]] = js.native
  var authSource: js.UndefOr[Input[String]] = js.native
  var authType: js.UndefOr[Input[String]] = js.native
  var docsToInvestigate: js.UndefOr[Input[String]] = js.native
  var extractDocId: js.UndefOr[Input[String]] = js.native
  var nestingLevel: js.UndefOr[Input[String]] = js.native
}

object EndpointMongodbSettings {
  @scala.inline
  def apply(): EndpointMongodbSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EndpointMongodbSettings]
  }
  @scala.inline
  implicit class EndpointMongodbSettingsOps[Self <: EndpointMongodbSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthMechanism(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authMechanism")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthMechanism: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authMechanism")(js.undefined)
        ret
    }
    @scala.inline
    def withAuthSource(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authSource")(js.undefined)
        ret
    }
    @scala.inline
    def withAuthType(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authType")(js.undefined)
        ret
    }
    @scala.inline
    def withDocsToInvestigate(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("docsToInvestigate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocsToInvestigate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("docsToInvestigate")(js.undefined)
        ret
    }
    @scala.inline
    def withExtractDocId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extractDocId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtractDocId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extractDocId")(js.undefined)
        ret
    }
    @scala.inline
    def withNestingLevel(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nestingLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNestingLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nestingLevel")(js.undefined)
        ret
    }
  }
  
}

