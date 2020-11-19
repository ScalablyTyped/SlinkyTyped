package typingsSlinky.amplitudeJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Callback = js.Function3[
    /* responseCode */ scala.Double, 
    /* responseBody */ java.lang.String, 
    /* details */ js.UndefOr[typingsSlinky.amplitudeJs.anon.Reason], 
    scala.Unit
  ]
  
  type LogReturn = js.UndefOr[scala.Double]
}
