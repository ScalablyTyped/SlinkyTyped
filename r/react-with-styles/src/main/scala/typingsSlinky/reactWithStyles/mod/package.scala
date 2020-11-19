package typingsSlinky.reactWithStyles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type ComponentClassProps[C] = js.Any
  
  type ElementConfig[C] = typingsSlinky.react.mod.global.JSX.LibraryManagedAttributes[C, typingsSlinky.reactWithStyles.mod.ElementProps[C]]
  
  type ElementProps[C] = typingsSlinky.reactWithStyles.mod.SFCProps[C] | typingsSlinky.reactWithStyles.mod.ComponentClassProps[C]
  
  type Nullable[T] = js.UndefOr[T | scala.Null]
  
  type Omit[T, K] = typingsSlinky.std.Pick[T, typingsSlinky.std.Exclude[/* keyof T */ java.lang.String, K]]
  
  type SFCProps[C] = js.Any
  
  type Styles = org.scalablytyped.runtime.StringDictionary[
    typingsSlinky.reactWithStyles.mod.Nullable[typingsSlinky.reactWithStyles.anon.CSSPropertiespseudoSelect]
  ]
}
