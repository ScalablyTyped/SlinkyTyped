package typingsSlinky.rcDrawer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object idrawerproptypesMod {
  
  type ILevelMove = scala.Double | (js.Tuple2[scala.Double, scala.Double])
  
  type IStringOrHtmlElement = java.lang.String | org.scalajs.dom.raw.HTMLElement
  
  type Omit[T, K /* <: /* keyof T */ java.lang.String */] = typingsSlinky.std.Pick[T, typingsSlinky.std.Exclude[/* keyof T */ java.lang.String, K]]
}
