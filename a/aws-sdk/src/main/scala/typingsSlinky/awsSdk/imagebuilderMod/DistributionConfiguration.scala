package typingsSlinky.awsSdk.imagebuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DistributionConfiguration extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the distribution configuration.
    */
  var arn: js.UndefOr[ImageBuilderArn] = js.native
  /**
    * The date on which this distribution configuration was created.
    */
  var dateCreated: js.UndefOr[DateTime] = js.native
  /**
    * The date on which this distribution configuration was last updated.
    */
  var dateUpdated: js.UndefOr[DateTime] = js.native
  /**
    * The description of the distribution configuration.
    */
  var description: js.UndefOr[NonEmptyString] = js.native
  /**
    * The distributions of the distribution configuration.
    */
  var distributions: js.UndefOr[DistributionList] = js.native
  /**
    * The name of the distribution configuration.
    */
  var name: js.UndefOr[ResourceName] = js.native
  /**
    * The tags of the distribution configuration.
    */
  var tags: js.UndefOr[TagMap] = js.native
  /**
    * The maximum duration in minutes for this distribution configuration.
    */
  var timeoutMinutes: DistributionTimeoutMinutes = js.native
}

object DistributionConfiguration {
  @scala.inline
  def apply(timeoutMinutes: DistributionTimeoutMinutes): DistributionConfiguration = {
    val __obj = js.Dynamic.literal(timeoutMinutes = timeoutMinutes.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistributionConfiguration]
  }
  @scala.inline
  implicit class DistributionConfigurationOps[Self <: DistributionConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTimeoutMinutes(value: DistributionTimeoutMinutes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeoutMinutes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArn(value: ImageBuilderArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(js.undefined)
        ret
    }
    @scala.inline
    def withDateCreated(value: DateTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateCreated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDateCreated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateCreated")(js.undefined)
        ret
    }
    @scala.inline
    def withDateUpdated(value: DateTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateUpdated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDateUpdated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateUpdated")(js.undefined)
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
    def withDistributions(value: DistributionList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distributions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDistributions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distributions")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: ResourceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
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

