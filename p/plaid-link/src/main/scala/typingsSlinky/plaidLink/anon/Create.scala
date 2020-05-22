package typingsSlinky.plaidLink.anon

import typingsSlinky.plaidLink.mod.Plaid.CreateConfig
import typingsSlinky.plaidLink.mod.Plaid.LinkHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Create extends js.Object {
  var version: String
  def create(params: CreateConfig): LinkHandler
}

object Create {
  @scala.inline
  def apply(create: CreateConfig => LinkHandler, version: String): Create = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Create]
  }
}

