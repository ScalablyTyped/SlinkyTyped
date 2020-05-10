package typingsSlinky.awsSdk.imagebuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateImageRecipeRequest extends js.Object {
  /**
    *  The block device mappings of the image recipe. 
    */
  var blockDeviceMappings: js.UndefOr[InstanceBlockDeviceMappings] = js.native
  /**
    *  The idempotency token used to make this request idempotent. 
    */
  var clientToken: ClientToken = js.native
  /**
    *  The components of the image recipe. 
    */
  var components: ComponentConfigurationList = js.native
  /**
    *  The description of the image recipe. 
    */
  var description: js.UndefOr[NonEmptyString] = js.native
  /**
    *  The name of the image recipe. 
    */
  var name: ResourceName = js.native
  /**
    *  The parent image of the image recipe. 
    */
  var parentImage: NonEmptyString = js.native
  /**
    *  The semantic version of the image recipe. 
    */
  var semanticVersion: VersionNumber = js.native
  /**
    *  The tags of the image recipe. 
    */
  var tags: js.UndefOr[TagMap] = js.native
}

object CreateImageRecipeRequest {
  @scala.inline
  def apply(
    clientToken: ClientToken,
    components: ComponentConfigurationList,
    name: ResourceName,
    parentImage: NonEmptyString,
    semanticVersion: VersionNumber
  ): CreateImageRecipeRequest = {
    val __obj = js.Dynamic.literal(clientToken = clientToken.asInstanceOf[js.Any], components = components.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parentImage = parentImage.asInstanceOf[js.Any], semanticVersion = semanticVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateImageRecipeRequest]
  }
  @scala.inline
  implicit class CreateImageRecipeRequestOps[Self <: CreateImageRecipeRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClientToken(value: ClientToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComponents(value: ComponentConfigurationList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("components")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: ResourceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParentImage(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentImage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSemanticVersion(value: VersionNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("semanticVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBlockDeviceMappings(value: InstanceBlockDeviceMappings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockDeviceMappings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlockDeviceMappings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockDeviceMappings")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: TagMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
  }
  
}

