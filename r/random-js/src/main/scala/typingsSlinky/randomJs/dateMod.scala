package typingsSlinky.randomJs

import typingsSlinky.randomJs.typesMod.Distribution
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("random-js/dist/distribution/date", JSImport.Namespace)
@js.native
object dateMod extends js.Object {
  def date(start: js.Date, end: js.Date): Distribution[js.Date] = js.native
}

