package typingsSlinky.randomJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object typesMod {
  
  type Distribution[T] = js.Function1[/* engine */ typingsSlinky.randomJs.typesMod.Engine, T]
  
  type StringDistribution = js.Function2[
    /* engine */ typingsSlinky.randomJs.typesMod.Engine, 
    /* length */ scala.Double, 
    java.lang.String
  ]
}
