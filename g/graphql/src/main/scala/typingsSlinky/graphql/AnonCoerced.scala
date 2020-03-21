package typingsSlinky.graphql

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.graphql.valuesMod.CoercedVariableValues
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCoerced extends CoercedVariableValues {
  var coerced: StringDictionary[js.Any]
}

object AnonCoerced {
  @scala.inline
  def apply(coerced: StringDictionary[js.Any]): AnonCoerced = {
    val __obj = js.Dynamic.literal(coerced = coerced.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCoerced]
  }
}

