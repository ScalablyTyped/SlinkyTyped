package typingsSlinky.cac

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type CommandExample = (js.Function1[/* bin */ java.lang.String, java.lang.String]) | java.lang.String
  
  type GlobalCommand = typingsSlinky.cac.mod.Command
  
  type HelpCallback = js.Function1[
    /* sections */ js.Array[typingsSlinky.cac.mod.HelpSection], 
    scala.Unit | js.Array[typingsSlinky.cac.mod.HelpSection]
  ]
}
