package typingsSlinky.actionsOnGoogle.frameworkFrameworkMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.actionsOnGoogle.expressMod.Express_
import typingsSlinky.actionsOnGoogle.lambdaMod.Lambda_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuiltinFrameworks extends Frameworks {
  /**
    * Plug and play web framework support for express using body-parser
    * @public
    */
  var express: Express_
  /**
    * Plug and play web framework support for lambda API gateway
    * @public
    */
  var lambda: Lambda_
}

object BuiltinFrameworks {
  @scala.inline
  def apply(
    express: Express_,
    lambda: Lambda_,
    StringDictionary: /** @public */
  StringDictionary[Framework[js.Function]] = null
  ): BuiltinFrameworks = {
    val __obj = js.Dynamic.literal(express = express.asInstanceOf[js.Any], lambda = lambda.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[BuiltinFrameworks]
  }
}

