package typingsSlinky.jestSourceMap

import typingsSlinky.callsites.mod.CallSite
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jest/source-map", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def getCallsite(level: Double): CallSite = js.native
  def getCallsite(level: Double, sourceMaps: Record[String, String]): CallSite = js.native
}
