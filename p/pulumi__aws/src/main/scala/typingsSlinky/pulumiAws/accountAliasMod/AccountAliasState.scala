package typingsSlinky.pulumiAws.accountAliasMod

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountAliasState extends js.Object {
  /**
    * The account alias
    */
  val accountAlias: js.UndefOr[Input[String]] = js.native
}

object AccountAliasState {
  @scala.inline
  def apply(): AccountAliasState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountAliasState]
  }
  @scala.inline
  implicit class AccountAliasStateOps[Self <: AccountAliasState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccountAlias(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountAlias")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccountAlias: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountAlias")(js.undefined)
        ret
    }
  }
  
}

