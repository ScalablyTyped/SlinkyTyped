package typingsSlinky.awsSdkClientGlacierNode.typesGlacierJobDescriptionMod

import typingsSlinky.awsSdkClientGlacierNode.typesInventoryRetrievalJobDescriptionMod.UnmarshalledInventoryRetrievalJobDescription
import typingsSlinky.awsSdkClientGlacierNode.typesOutputLocationMod.UnmarshalledOutputLocation
import typingsSlinky.awsSdkClientGlacierNode.typesSelectParametersMod.UnmarshalledSelectParameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledGlacierJobDescription extends GlacierJobDescription {
  /**
    * <p>Parameters used for range inventory retrieval.</p>
    */
  @JSName("InventoryRetrievalParameters")
  var InventoryRetrievalParameters_UnmarshalledGlacierJobDescription: js.UndefOr[UnmarshalledInventoryRetrievalJobDescription] = js.native
  /**
    * <p>Contains the location where the data from the select job is stored.</p>
    */
  @JSName("OutputLocation")
  var OutputLocation_UnmarshalledGlacierJobDescription: js.UndefOr[UnmarshalledOutputLocation] = js.native
  /**
    * <p>Contains the parameters used for a select.</p>
    */
  @JSName("SelectParameters")
  var SelectParameters_UnmarshalledGlacierJobDescription: js.UndefOr[UnmarshalledSelectParameters] = js.native
}

object UnmarshalledGlacierJobDescription {
  @scala.inline
  def apply(): UnmarshalledGlacierJobDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledGlacierJobDescription]
  }
  @scala.inline
  implicit class UnmarshalledGlacierJobDescriptionOps[Self <: UnmarshalledGlacierJobDescription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInventoryRetrievalParameters(value: UnmarshalledInventoryRetrievalJobDescription): Self = {
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

