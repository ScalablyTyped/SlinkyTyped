package typingsSlinky.breeze.breeze

import typingsSlinky.breeze.breeze.core.EnumSymbol
import typingsSlinky.breeze.breeze.core.IEnum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FetchStrategySymbol extends EnumSymbol {
  var foo: js.Any
}

object FetchStrategySymbol {
  @scala.inline
  def apply(foo: js.Any, getName: () => String, parentEnum: IEnum): FetchStrategySymbol = {
    val __obj = js.Dynamic.literal(foo = foo.asInstanceOf[js.Any], getName = js.Any.fromFunction0(getName), parentEnum = parentEnum.asInstanceOf[js.Any])
    __obj.asInstanceOf[FetchStrategySymbol]
  }
}

