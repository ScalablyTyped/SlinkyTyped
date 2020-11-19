package typingsSlinky.figma.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object global {
  
  type MessageEventHandler = js.Function2[
    /* pluginMessage */ js.Any, 
    /* props */ typingsSlinky.figma.mod.global.OnMessageProperties, 
    scala.Unit
  ]
  
  ////////////////////////////////////////////////////////////////////////////////
  // Datatypes
  type Transform = js.Tuple2[
    js.Tuple3[scala.Double, scala.Double, scala.Double], 
    js.Tuple3[scala.Double, scala.Double, scala.Double]
  ]
  
  type VectorPaths = js.Array[typingsSlinky.figma.mod.global.VectorPath]
}
