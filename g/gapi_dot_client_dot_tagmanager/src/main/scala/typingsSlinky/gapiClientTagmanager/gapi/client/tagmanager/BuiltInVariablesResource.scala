package typingsSlinky.gapiClientTagmanager.gapi.client.tagmanager

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientTagmanager.anon.Key
import typingsSlinky.gapiClientTagmanager.anon.Oauthtoken
import typingsSlinky.gapiClientTagmanager.anon.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BuiltInVariablesResource extends js.Object {
  /** Creates one or more GTM Built-In Variables. */
  def create(request: Oauthtoken): Request[CreateBuiltInVariableResponse] = js.native
  /** Deletes one or more GTM Built-In Variables. */
  def delete(request: Path): Request[Unit] = js.native
  /** Lists all the enabled Built-In Variables of a GTM Container. */
  def list(request: Key): Request[ListEnabledBuiltInVariablesResponse] = js.native
  /** Reverts changes to a GTM Built-In Variables in a GTM Workspace. */
  def revert(request: Path): Request[RevertBuiltInVariableResponse] = js.native
}

object BuiltInVariablesResource {
  @scala.inline
  def apply(
    create: Oauthtoken => Request[CreateBuiltInVariableResponse],
    delete: Path => Request[Unit],
    list: Key => Request[ListEnabledBuiltInVariablesResponse],
    revert: Path => Request[RevertBuiltInVariableResponse]
  ): BuiltInVariablesResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), list = js.Any.fromFunction1(list), revert = js.Any.fromFunction1(revert))
    __obj.asInstanceOf[BuiltInVariablesResource]
  }
  @scala.inline
  implicit class BuiltInVariablesResourceOps[Self <: BuiltInVariablesResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreate(value: Oauthtoken => Request[CreateBuiltInVariableResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDelete(value: Path => Request[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: Key => Request[ListEnabledBuiltInVariablesResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRevert(value: Path => Request[RevertBuiltInVariableResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revert")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

