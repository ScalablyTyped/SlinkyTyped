package typingsSlinky.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TemplateAlias extends js.Object {
  /**
    * The display name of the template alias.
    */
  var AliasName: js.UndefOr[typingsSlinky.awsSdk.quicksightMod.AliasName] = js.native
  /**
    * The Amazon Resource Name (ARN) of the template alias.
    */
  var Arn: js.UndefOr[typingsSlinky.awsSdk.quicksightMod.Arn] = js.native
  /**
    * The version number of the template alias.
    */
  var TemplateVersionNumber: js.UndefOr[VersionNumber] = js.native
}

object TemplateAlias {
  @scala.inline
  def apply(): TemplateAlias = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TemplateAlias]
  }
  @scala.inline
  implicit class TemplateAliasOps[Self <: TemplateAlias] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAliasName(value: AliasName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AliasName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAliasName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AliasName")(js.undefined)
        ret
    }
    @scala.inline
    def withArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Arn")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplateVersionNumber(value: VersionNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TemplateVersionNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplateVersionNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TemplateVersionNumber")(js.undefined)
        ret
    }
  }
  
}

