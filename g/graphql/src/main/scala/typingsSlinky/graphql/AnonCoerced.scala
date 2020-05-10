package typingsSlinky.graphql

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.graphql.valuesMod.CoercedVariableValues
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCoerced extends CoercedVariableValues {
  var coerced: StringDictionary[js.Any] = js.native
}

object AnonCoerced {
  @scala.inline
  def apply(coerced: StringDictionary[js.Any]): AnonCoerced = {
    val __obj = js.Dynamic.literal(coerced = coerced.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCoerced]
  }
  @scala.inline
  implicit class AnonCoercedOps[Self <: AnonCoerced] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCoerced(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coerced")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

