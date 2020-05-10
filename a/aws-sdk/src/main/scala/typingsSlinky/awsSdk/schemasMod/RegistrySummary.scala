package typingsSlinky.awsSdk.schemasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegistrySummary extends js.Object {
  /**
    * The ARN of the registry.
    */
  var RegistryArn: js.UndefOr[string] = js.native
  /**
    * The name of the registry.
    */
  var RegistryName: js.UndefOr[string] = js.native
  /**
    * Tags associated with the registry.
    */
  var Tags: js.UndefOr[typingsSlinky.awsSdk.schemasMod.Tags] = js.native
}

object RegistrySummary {
  @scala.inline
  def apply(): RegistrySummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegistrySummary]
  }
  @scala.inline
  implicit class RegistrySummaryOps[Self <: RegistrySummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRegistryArn(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RegistryArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegistryArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RegistryArn")(js.undefined)
        ret
    }
    @scala.inline
    def withRegistryName(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RegistryName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegistryName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RegistryName")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: Tags): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(js.undefined)
        ret
    }
  }
  
}

