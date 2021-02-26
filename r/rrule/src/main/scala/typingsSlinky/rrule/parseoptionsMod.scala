package typingsSlinky.rrule

import typingsSlinky.rrule.anon.Byeaster
import typingsSlinky.rrule.anon.PartialOptions
import typingsSlinky.rrule.datetimeMod.Time
import typingsSlinky.rrule.typesMod.ParsedOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parseoptionsMod {
  
  @JSImport("rrule/dist/esm/src/parseoptions", "buildTimeset")
  @js.native
  def buildTimeset(opts: ParsedOptions): js.Array[Time] = js.native
  
  @JSImport("rrule/dist/esm/src/parseoptions", "initializeOptions")
  @js.native
  def initializeOptions(options: PartialOptions): Byeaster = js.native
  
  @JSImport("rrule/dist/esm/src/parseoptions", "parseOptions")
  @js.native
  def parseOptions(options: PartialOptions): typingsSlinky.rrule.anon.ParsedOptions = js.native
}
