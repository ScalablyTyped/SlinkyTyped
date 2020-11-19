package typingsSlinky.domhandler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Callback = js.Function2[
    /* error */ js.Error | scala.Null, 
    /* dom */ js.Array[typingsSlinky.domhandler.nodeMod.Node], 
    scala.Unit
  ]
  
  type ElementCallback = js.Function1[/* element */ typingsSlinky.domhandler.nodeMod.Element, scala.Unit]
}
