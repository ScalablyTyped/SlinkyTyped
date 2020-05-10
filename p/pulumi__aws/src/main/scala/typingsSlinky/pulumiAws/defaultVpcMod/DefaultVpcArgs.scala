package typingsSlinky.pulumiAws.defaultVpcMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultVpcArgs extends js.Object {
  /**
    * A boolean flag to enable/disable ClassicLink
    * for the VPC. Only valid in regions and accounts that support EC2 Classic.
    * See the [ClassicLink documentation][1] for more information. Defaults false.
    */
  val enableClassiclink: js.UndefOr[Input[Boolean]] = js.native
  val enableClassiclinkDnsSupport: js.UndefOr[Input[Boolean]] = js.native
  /**
    * A boolean flag to enable/disable DNS hostnames in the VPC. Defaults false.
    */
  val enableDnsHostnames: js.UndefOr[Input[Boolean]] = js.native
  /**
    * A boolean flag to enable/disable DNS support in the VPC. Defaults true.
    */
  val enableDnsSupport: js.UndefOr[Input[Boolean]] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
}

object DefaultVpcArgs {
  @scala.inline
  def apply(): DefaultVpcArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultVpcArgs]
  }
  @scala.inline
  implicit class DefaultVpcArgsOps[Self <: DefaultVpcArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnableClassiclink(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableClassiclink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableClassiclink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableClassiclink")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableClassiclinkDnsSupport(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableClassiclinkDnsSupport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableClassiclinkDnsSupport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableClassiclinkDnsSupport")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableDnsHostnames(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableDnsHostnames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableDnsHostnames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableDnsHostnames")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableDnsSupport(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableDnsSupport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableDnsSupport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableDnsSupport")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: Input[StringDictionary[_]]): Self = {
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

