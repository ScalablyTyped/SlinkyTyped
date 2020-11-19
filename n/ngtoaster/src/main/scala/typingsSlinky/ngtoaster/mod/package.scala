package typingsSlinky.ngtoaster

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type IToastCallback = js.Function1[/* toast */ typingsSlinky.ngtoaster.mod.IToast, scala.Unit]
  
  type IToastEventListener = js.Function3[
    /* event */ org.scalajs.dom.raw.Event, 
    /* toasterId */ scala.Double, 
    /* toastId */ java.lang.String | scala.Double, 
    scala.Unit
  ]
}
