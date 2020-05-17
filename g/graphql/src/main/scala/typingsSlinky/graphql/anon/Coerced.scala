package typingsSlinky.graphql.anon

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.graphql.valuesMod.CoercedVariableValues
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Coerced extends CoercedVariableValues {
  var coerced: StringDictionary[js.Any] = js.native
}

object Coerced {
  @scala.inline
  def apply(coerced: StringDictionary[js.Any]): Coerced = {
    val __obj = js.Dynamic.literal(coerced = coerced.asInstanceOf[js.Any])
    __obj.asInstanceOf[Coerced]
  }
  @scala.inline
  implicit class CoercedOps[Self <: Coerced] (val x: Self) extends AnyVal {
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

