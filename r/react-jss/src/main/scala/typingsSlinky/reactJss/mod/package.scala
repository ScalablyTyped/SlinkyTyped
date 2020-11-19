package typingsSlinky.reactJss

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Managers = org.scalablytyped.runtime.NumberDictionary[org.scalajs.dom.raw.StyleSheet]
  
  type Omit[T, K] = typingsSlinky.std.Pick[T, typingsSlinky.std.Exclude[/* keyof T */ java.lang.String, K]]
  
  /**
    * @deprecated Please use `WithStylesProps` instead
    */
  type WithStyles[S /* <: typingsSlinky.jss.mod.Styles[java.lang.String] | (js.Function1[/* theme */ js.Any, typingsSlinky.jss.mod.Styles[java.lang.String]]) */] = typingsSlinky.reactJss.mod.WithStylesProps[S]
}
