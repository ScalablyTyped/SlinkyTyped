package typingsSlinky.jjve

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Env = js.Function3[
    /* schema */ js.Object, 
    /* data */ js.Any, 
    /* errors */ typingsSlinky.jjv.mod.Errors, 
    js.Array[typingsSlinky.jjve.mod.Issue]
  ]
}
