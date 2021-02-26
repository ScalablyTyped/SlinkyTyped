package typingsSlinky.jestSourceMap

import typingsSlinky.callsites.mod.CallSite
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@jest/source-map", "getCallsite")
  @js.native
  def getCallsite(level: Double): CallSite = js.native
  @JSImport("@jest/source-map", "getCallsite")
  @js.native
  def getCallsite(level: Double, sourceMaps: Record[String, String]): CallSite = js.native
}
