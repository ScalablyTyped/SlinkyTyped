package typingsSlinky.maxmind

import typingsSlinky.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ipMod {
  
  object default {
    
    @JSImport("maxmind/lib/ip", "default.bitAt")
    @js.native
    def bitAt(rawAddress: js.Array[Double], idx: Double): Double = js.native
    @JSImport("maxmind/lib/ip", "default.bitAt")
    @js.native
    def bitAt(rawAddress: Buffer, idx: Double): Double = js.native
    
    @JSImport("maxmind/lib/ip", "default.parse")
    @js.native
    def parse(ip: String): js.Array[Double] = js.native
    
    @JSImport("maxmind/lib/ip", "default.validate")
    @js.native
    def validate(ip: String): Boolean = js.native
  }
}
