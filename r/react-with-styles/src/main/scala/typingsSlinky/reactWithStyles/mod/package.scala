package typingsSlinky.reactWithStyles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ComponentClassProps[C] = js.Any
  type ElementConfig[C] = typingsSlinky.react.mod._Global_.JSX.LibraryManagedAttributes[C, typingsSlinky.reactWithStyles.mod.ElementProps[C]]
  type ElementProps[C] = typingsSlinky.reactWithStyles.mod.SFCProps[C] | typingsSlinky.reactWithStyles.mod.ComponentClassProps[C]
  type Nullable[T] = js.UndefOr[T | scala.Null]
  type Omit[T, K] = typingsSlinky.std.Pick[T, typingsSlinky.std.Exclude[java.lang.String, K]]
  type SFCProps[C] = js.Any
  type Styles = org.scalablytyped.runtime.StringDictionary[
    typingsSlinky.reactWithStyles.mod.Nullable[typingsSlinky.reactWithStyles.CSSPropertiespseudoSelect]
  ]
  type Theme = org.scalablytyped.runtime.StringDictionary[js.Any]
}
