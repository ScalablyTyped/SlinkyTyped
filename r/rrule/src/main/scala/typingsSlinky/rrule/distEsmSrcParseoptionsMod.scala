package typingsSlinky.rrule

import typingsSlinky.rrule.distEsmSrcDatetimeMod.Time
import typingsSlinky.rrule.distEsmSrcTypesMod.Options
import typingsSlinky.rrule.distEsmSrcTypesMod.ParsedOptions
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rrule/dist/esm/src/parseoptions", JSImport.Namespace)
@js.native
object distEsmSrcParseoptionsMod extends js.Object {
  def buildTimeset(opts: ParsedOptions): js.Array[Time] = js.native
  def initializeOptions(options: Partial[Options]): Anon_Byeaster = js.native
  def parseOptions(options: Partial[Options]): Anon_ParsedOptions = js.native
}

