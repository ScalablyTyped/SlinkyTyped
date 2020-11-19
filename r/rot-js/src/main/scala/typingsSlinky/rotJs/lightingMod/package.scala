package typingsSlinky.rotJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object lightingMod {
  
  type LightColor = js.Tuple3[scala.Double, scala.Double, scala.Double]
  
  /** Will be called for every lit cell */
  type LightingCallback = js.Function3[
    /* x */ scala.Double, 
    /* y */ scala.Double, 
    /* color */ typingsSlinky.rotJs.lightingMod.LightColor, 
    scala.Unit
  ]
  
  /** Callback to retrieve cell reflectivity (0..1) */
  type ReflectivityCallback = js.Function2[/* x */ scala.Double, /* y */ scala.Double, scala.Double]
}
