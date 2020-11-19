package typingsSlinky.mdastUtilToHast

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Handler = js.Function2[
    /* h */ typingsSlinky.mdastUtilToHast.mod.H, 
    /* node */ typingsSlinky.unist.mod.Node, 
    js.Any
  ]
  
  type Handlers = org.scalablytyped.runtime.StringDictionary[typingsSlinky.mdastUtilToHast.mod.Handler]
}
