package typingsSlinky.oracleOraclejet.ojtrainMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.oracleOraclejet.ojtrainMod.ojTrain.Step
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojtrain.ojTrainSettableProperties> */
@js.native
trait ojTrainSettablePropertiesLenient
  extends /* key */ StringDictionary[js.Any] {
  var selectedStep: js.UndefOr[String] = js.native
  var steps: js.UndefOr[js.Array[Step]] = js.native
  var translations: js.UndefOr[js.Object] = js.native
}

object ojTrainSettablePropertiesLenient {
  @scala.inline
  def apply(): ojTrainSettablePropertiesLenient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ojTrainSettablePropertiesLenient]
  }
  @scala.inline
  implicit class ojTrainSettablePropertiesLenientOps[Self <: ojTrainSettablePropertiesLenient] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSelectedStep(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedStep")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedStep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedStep")(js.undefined)
        ret
    }
    @scala.inline
    def withSteps(value: js.Array[Step]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("steps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSteps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("steps")(js.undefined)
        ret
    }
    @scala.inline
    def withTranslations(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTranslations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translations")(js.undefined)
        ret
    }
  }
  
}

