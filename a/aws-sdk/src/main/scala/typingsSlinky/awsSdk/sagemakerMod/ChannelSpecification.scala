package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChannelSpecification extends js.Object {
  /**
    * A brief description of the channel.
    */
  var Description: js.UndefOr[EntityDescription] = js.native
  /**
    * Indicates whether the channel is required by the algorithm.
    */
  var IsRequired: js.UndefOr[Boolean] = js.native
  /**
    * The name of the channel.
    */
  var Name: ChannelName = js.native
  /**
    * The allowed compression types, if data compression is used.
    */
  var SupportedCompressionTypes: js.UndefOr[CompressionTypes] = js.native
  /**
    * The supported MIME types for the data.
    */
  var SupportedContentTypes: ContentTypes = js.native
  /**
    * The allowed input mode, either FILE or PIPE. In FILE mode, Amazon SageMaker copies the data from the input source onto the local Amazon Elastic Block Store (Amazon EBS) volumes before starting your training algorithm. This is the most commonly used input mode. In PIPE mode, Amazon SageMaker streams input data from the source directly to your algorithm without using the EBS volume.
    */
  var SupportedInputModes: InputModes = js.native
}

object ChannelSpecification {
  @scala.inline
  def apply(Name: ChannelName, SupportedContentTypes: ContentTypes, SupportedInputModes: InputModes): ChannelSpecification = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], SupportedContentTypes = SupportedContentTypes.asInstanceOf[js.Any], SupportedInputModes = SupportedInputModes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelSpecification]
  }
  @scala.inline
  implicit class ChannelSpecificationOps[Self <: ChannelSpecification] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: ChannelName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSupportedContentTypes(value: ContentTypes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SupportedContentTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSupportedInputModes(value: InputModes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SupportedInputModes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: EntityDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(js.undefined)
        ret
    }
    @scala.inline
    def withIsRequired(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsRequired")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsRequired: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsRequired")(js.undefined)
        ret
    }
    @scala.inline
    def withSupportedCompressionTypes(value: CompressionTypes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SupportedCompressionTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupportedCompressionTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SupportedCompressionTypes")(js.undefined)
        ret
    }
  }
  
}

