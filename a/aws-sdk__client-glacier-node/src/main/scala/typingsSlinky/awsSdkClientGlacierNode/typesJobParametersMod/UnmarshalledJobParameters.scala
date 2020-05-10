package typingsSlinky.awsSdkClientGlacierNode.typesJobParametersMod

import typingsSlinky.awsSdkClientGlacierNode.typesInventoryRetrievalJobInputMod.UnmarshalledInventoryRetrievalJobInput
import typingsSlinky.awsSdkClientGlacierNode.typesOutputLocationMod.UnmarshalledOutputLocation
import typingsSlinky.awsSdkClientGlacierNode.typesSelectParametersMod.UnmarshalledSelectParameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledJobParameters extends JobParameters {
  /**
    * <p>Input parameters used for range inventory retrieval.</p>
    */
  @JSName("InventoryRetrievalParameters")
  var InventoryRetrievalParameters_UnmarshalledJobParameters: js.UndefOr[UnmarshalledInventoryRetrievalJobInput] = js.native
  /**
    * <p>Contains information about the location where the select job results are stored.</p>
    */
  @JSName("OutputLocation")
  var OutputLocation_UnmarshalledJobParameters: js.UndefOr[UnmarshalledOutputLocation] = js.native
  /**
    * <p>Contains the parameters that define a job.</p>
    */
  @JSName("SelectParameters")
  var SelectParameters_UnmarshalledJobParameters: js.UndefOr[UnmarshalledSelectParameters] = js.native
}

object UnmarshalledJobParameters {
  @scala.inline
  def apply(): UnmarshalledJobParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledJobParameters]
  }
  @scala.inline
  implicit class UnmarshalledJobParametersOps[Self <: UnmarshalledJobParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInventoryRetrievalParameters(value: UnmarshalledInventoryRetrievalJobInput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InventoryRetrievalParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInventoryRetrievalParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InventoryRetrievalParameters")(js.undefined)
        ret
    }
    @scala.inline
    def withOutputLocation(value: UnmarshalledOutputLocation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutputLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutputLocation")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectParameters(value: UnmarshalledSelectParameters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SelectParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SelectParameters")(js.undefined)
        ret
    }
  }
  
}

