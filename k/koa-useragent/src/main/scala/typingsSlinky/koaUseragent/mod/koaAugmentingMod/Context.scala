package typingsSlinky.koaUseragent.mod.koaAugmentingMod

import typingsSlinky.koaUseragent.useragentMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Context extends js.Object {
  var userAgent: default
}

object Context {
  @scala.inline
  def apply(userAgent: default): Context = {
    val __obj = js.Dynamic.literal(userAgent = userAgent.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Context]
  }
}

