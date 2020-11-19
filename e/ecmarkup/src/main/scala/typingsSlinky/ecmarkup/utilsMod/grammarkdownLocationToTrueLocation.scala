package typingsSlinky.ecmarkup.utilsMod

import org.scalajs.dom.raw.Element
import typingsSlinky.ecmarkup.anon.Column
import typingsSlinky.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ecmarkup/lib/lint/utils", "grammarkdownLocationToTrueLocation")
@js.native
object grammarkdownLocationToTrueLocation extends js.Object {
  
  def apply(
    elementLoc: ReturnType[js.Function2[/* dom */ _, /* node */ Element, ElementLocation]],
    gmdLine: Double,
    gmdCharacter: Double
  ): Column = js.native
}
