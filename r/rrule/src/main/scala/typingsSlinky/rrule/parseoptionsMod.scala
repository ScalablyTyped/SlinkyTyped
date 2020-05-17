package typingsSlinky.rrule

import typingsSlinky.rrule.anon.Byeaster
import typingsSlinky.rrule.anon.PartialOptions
import typingsSlinky.rrule.datetimeMod.Time
import typingsSlinky.rrule.typesMod.ParsedOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rrule/dist/esm/src/parseoptions", JSImport.Namespace)
@js.native
object parseoptionsMod extends js.Object {
  def buildTimeset(opts: ParsedOptions): js.Array[Time] = js.native
  def initializeOptions(options: PartialOptions): Byeaster = js.native
  def parseOptions(options: PartialOptions): typingsSlinky.rrule.anon.ParsedOptions = js.native
}

