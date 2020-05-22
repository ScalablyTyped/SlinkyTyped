package typingsSlinky.ecmarkup.anon

import typingsSlinky.grammarkdown.mod.OneOfList
import typingsSlinky.grammarkdown.mod.RightHandSide
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Production extends js.Object {
  var production: typingsSlinky.grammarkdown.mod.Production
  var rhses: js.Array[RightHandSide | OneOfList]
}

object Production {
  @scala.inline
  def apply(production: typingsSlinky.grammarkdown.mod.Production, rhses: js.Array[RightHandSide | OneOfList]): Production = {
    val __obj = js.Dynamic.literal(production = production.asInstanceOf[js.Any], rhses = rhses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Production]
  }
}

