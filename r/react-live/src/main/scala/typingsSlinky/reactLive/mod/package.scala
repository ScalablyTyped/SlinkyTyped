package typingsSlinky.reactLive

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  // React Element Props
  type DivProps = typingsSlinky.react.mod.HTMLProps[org.scalajs.dom.raw.HTMLDivElement]
  
  // Helper types
  type Omit[T, K /* <: /* keyof T */ java.lang.String */] = typingsSlinky.std.Pick[T, typingsSlinky.std.Exclude[/* keyof T */ java.lang.String, K]]
  
  type PreProps = typingsSlinky.react.mod.HTMLProps[org.scalajs.dom.raw.HTMLPreElement]
}
