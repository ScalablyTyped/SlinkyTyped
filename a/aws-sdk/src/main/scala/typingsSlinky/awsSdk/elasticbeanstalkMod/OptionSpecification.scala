package typingsSlinky.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionSpecification extends js.Object {
  /**
    * A unique namespace identifying the option's associated AWS resource.
    */
  var Namespace: js.UndefOr[OptionNamespace] = js.native
  /**
    * The name of the configuration option.
    */
  var OptionName: js.UndefOr[ConfigurationOptionName] = js.native
  /**
    * A unique resource name for a time-based scaling configuration option.
    */
  var ResourceName: js.UndefOr[typingsSlinky.awsSdk.elasticbeanstalkMod.ResourceName] = js.native
}

object OptionSpecification {
  @scala.inline
  def apply(): OptionSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionSpecification]
  }
  @scala.inline
  implicit class OptionSpecificationOps[Self <: OptionSpecification] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNamespace(value: OptionNamespace): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Namespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNamespace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Namespace")(js.undefined)
        ret
    }
    @scala.inline
    def withOptionName(value: ConfigurationOptionName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OptionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptionName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OptionName")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceName(value: ResourceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceName")(js.undefined)
        ret
    }
  }
  
}

