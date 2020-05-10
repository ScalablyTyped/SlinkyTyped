package typingsSlinky.cypress.cypressMod

import typingsSlinky.cypress.cypressStrings.after
import typingsSlinky.cypress.cypressStrings.afterEach
import typingsSlinky.cypress.cypressStrings.before
import typingsSlinky.cypress.cypressStrings.beforeEach
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about a single "before", "beforeEach", "afterEach" and "after" hook.
  */
@js.native
trait HookInformation extends js.Object {
  var body: String = js.native
  var hookId: typingsSlinky.cypress.cypressMod.hookId = js.native
  var hookName: before | beforeEach | afterEach | after = js.native
  var title: js.Array[String] = js.native
}

object HookInformation {
  @scala.inline
  def apply(
    body: String,
    hookId: hookId,
    hookName: before | beforeEach | afterEach | after,
    title: js.Array[String]
  ): HookInformation = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], hookId = hookId.asInstanceOf[js.Any], hookName = hookName.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[HookInformation]
  }
  @scala.inline
  implicit class HookInformationOps[Self <: HookInformation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBody(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHookId(value: hookId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hookId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHookName(value: before | beforeEach | afterEach | after): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hookName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

