package typingsSlinky.apolloClient

import typingsSlinky.apolloUtilities.getFromASTMod.FragmentMap
import typingsSlinky.graphql.astMod.FieldNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonField extends js.Object {
  var field: FieldNode
  var fragmentMap: FragmentMap
}

object AnonField {
  @scala.inline
  def apply(field: FieldNode, fragmentMap: FragmentMap): AnonField = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], fragmentMap = fragmentMap.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonField]
  }
}

