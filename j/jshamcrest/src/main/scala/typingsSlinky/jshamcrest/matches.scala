package typingsSlinky.jshamcrest

import typingsSlinky.jshamcrest.JsHamcrest.SimpleMatcher
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("matches")
@js.native
object matches extends js.Object {
  /**
    * The actual string must match regex.
    *
    * @param regex String
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  def apply(regex: js.RegExp): SimpleMatcher = js.native
}

