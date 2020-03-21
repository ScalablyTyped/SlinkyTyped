package typingsSlinky.dotenvFlow.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DotenvLoadOutput extends js.Object {
  var error: js.UndefOr[js.Error] = js.undefined
  var parsed: js.UndefOr[DotenvParseOutput] = js.undefined
}

object DotenvLoadOutput {
  @scala.inline
  def apply(error: js.Error = null, parsed: DotenvParseOutput = null): DotenvLoadOutput = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (parsed != null) __obj.updateDynamic("parsed")(parsed.asInstanceOf[js.Any])
    __obj.asInstanceOf[DotenvLoadOutput]
  }
}

