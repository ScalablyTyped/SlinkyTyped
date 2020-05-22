package typingsSlinky.postmanCollection.anon

import typingsSlinky.postmanCollection.mod.VariableList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Variables extends js.Object {
  var variables: VariableList
}

object Variables {
  @scala.inline
  def apply(variables: VariableList): Variables = {
    val __obj = js.Dynamic.literal(variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[Variables]
  }
}

