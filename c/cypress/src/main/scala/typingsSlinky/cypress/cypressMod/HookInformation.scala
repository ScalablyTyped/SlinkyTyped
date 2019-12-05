package typingsSlinky.cypress.cypressMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about a single "before", "beforeEach", "afterEach" and "after" hook.
  */
trait HookInformation extends js.Object {
  var body: String
  var hookId: typingsSlinky.cypress.cypressMod.hookId
  var hookName: typingsSlinky.cypress.cypressStrings.before | typingsSlinky.cypress.cypressStrings.beforeEach | typingsSlinky.cypress.cypressStrings.afterEach | typingsSlinky.cypress.cypressStrings.after
  var title: js.Array[String]
}

object HookInformation {
  @scala.inline
  def apply(
    body: String,
    hookId: hookId,
    hookName: typingsSlinky.cypress.cypressStrings.before | typingsSlinky.cypress.cypressStrings.beforeEach | typingsSlinky.cypress.cypressStrings.afterEach | typingsSlinky.cypress.cypressStrings.after,
    title: js.Array[String]
  ): HookInformation = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], hookId = hookId.asInstanceOf[js.Any], hookName = hookName.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HookInformation]
  }
}

