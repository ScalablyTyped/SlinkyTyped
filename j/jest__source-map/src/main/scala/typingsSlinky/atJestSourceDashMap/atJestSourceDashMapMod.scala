package typingsSlinky.atJestSourceDashMap

import typingsSlinky.callsites.callsitesMod.CallSite
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jest/source-map", JSImport.Namespace)
@js.native
object atJestSourceDashMapMod extends js.Object {
  def getCallsite(level: Double): CallSite = js.native
  def getCallsite(level: Double, sourceMaps: Record[String, String]): CallSite = js.native
}

