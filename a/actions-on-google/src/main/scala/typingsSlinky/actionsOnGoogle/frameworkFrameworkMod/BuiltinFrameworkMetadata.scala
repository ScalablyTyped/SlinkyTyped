package typingsSlinky.actionsOnGoogle.frameworkFrameworkMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.actionsOnGoogle.expressMod.ExpressMetadata
import typingsSlinky.actionsOnGoogle.lambdaMod.LambdaMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuiltinFrameworkMetadata extends FrameworkMetadata {
  /** @public */
  var express: js.UndefOr[ExpressMetadata] = js.undefined
  /** @public */
  var lambda: js.UndefOr[LambdaMetadata] = js.undefined
}

object BuiltinFrameworkMetadata {
  @scala.inline
  def apply(
    StringDictionary: /** @public */
  StringDictionary[js.Any] = null,
    express: ExpressMetadata = null,
    lambda: LambdaMetadata = null
  ): BuiltinFrameworkMetadata = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (express != null) __obj.updateDynamic("express")(express.asInstanceOf[js.Any])
    if (lambda != null) __obj.updateDynamic("lambda")(lambda.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuiltinFrameworkMetadata]
  }
}

