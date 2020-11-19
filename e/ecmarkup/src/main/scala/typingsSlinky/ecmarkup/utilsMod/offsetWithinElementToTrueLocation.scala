package typingsSlinky.ecmarkup.utilsMod

import org.scalajs.dom.raw.Element
import typingsSlinky.ecmarkup.anon.Column
import typingsSlinky.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ecmarkup/lib/lint/utils", "offsetWithinElementToTrueLocation")
@js.native
object offsetWithinElementToTrueLocation extends js.Object {
  
  def apply(
    elementLoc: ReturnType[js.Function2[/* dom */ _, /* node */ Element, ElementLocation]],
    string: String,
    offset: Double
  ): Column = js.native
}
