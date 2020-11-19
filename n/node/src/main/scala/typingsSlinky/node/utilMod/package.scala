package typingsSlinky.node

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object utilMod {
  
  type CustomInspectFunction = js.Function2[
    /* depth */ scala.Double, 
    /* options */ typingsSlinky.node.utilMod.InspectOptionsStylized, 
    java.lang.String
  ]
  
  type InspectOptions = typingsSlinky.node.NodeJS.InspectOptions
}
