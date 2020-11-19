package typingsSlinky.go.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This holds TreeLayout-specific information about Links.*/
@JSImport("go", "TreeEdge")
@js.native
class TreeEdge () extends LayoutEdge {
  
  /**Gets or sets a Point, relative to the parent node, that may be useful in routing this link.*/
  var relativePoint: Point = js.native
}
