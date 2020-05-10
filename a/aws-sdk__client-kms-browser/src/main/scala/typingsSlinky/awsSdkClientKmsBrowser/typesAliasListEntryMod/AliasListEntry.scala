package typingsSlinky.awsSdkClientKmsBrowser.typesAliasListEntryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AliasListEntry extends js.Object {
  /**
    * <p>String that contains the key ARN.</p>
    */
  var AliasArn: js.UndefOr[String] = js.native
  /**
    * <p>String that contains the alias.</p>
    */
  var AliasName: js.UndefOr[String] = js.native
  /**
    * <p>String that contains the key identifier referred to by the alias.</p>
    */
  var TargetKeyId: js.UndefOr[String] = js.native
}

object AliasListEntry {
  @scala.inline
  def apply(): AliasListEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AliasListEntry]
  }
  @scala.inline
  implicit class AliasListEntryOps[Self <: AliasListEntry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAliasArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AliasArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAliasArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AliasArn")(js.undefined)
        ret
    }
    @scala.inline
    def withAliasName(value: String): Self = {
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
    def withTargetKeyId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetKeyId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetKeyId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetKeyId")(js.undefined)
        ret
    }
  }
  
}

