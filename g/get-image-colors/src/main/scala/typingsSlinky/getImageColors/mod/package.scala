package typingsSlinky.getImageColors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  /**
    * If you don't like promises, you can use node-style callbacks too
    */
  type Callback = js.Function2[
    /* error */ js.Error | scala.Null, 
    /* colors */ js.Array[typingsSlinky.chromaJs.mod.Color], 
    scala.Unit
  ]
}
