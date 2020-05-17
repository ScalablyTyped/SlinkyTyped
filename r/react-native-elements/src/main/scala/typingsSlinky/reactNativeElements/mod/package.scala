package typingsSlinky.reactNativeElements

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type DividerProps = typingsSlinky.reactNative.mod.ViewProperties
  type RecursivePartial[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias react-native-elements.react-native-elements.RecursivePartial<T[P]> * / object}
    */ typingsSlinky.reactNativeElements.reactNativeElementsStrings.RecursivePartial with org.scalablytyped.runtime.TopLevel[js.Any]
  type ReplaceTheme = js.Function1[
    /* updates */ typingsSlinky.reactNativeElements.anon.RecursivePartialFullTheme, 
    scala.Unit
  ]
  type SearchBarProps = typingsSlinky.reactNativeElements.mod.SearchBarWrapper with typingsSlinky.reactNativeElements.mod.SearchBarBase with typingsSlinky.reactNativeElements.mod.SearchBarPlatform with typingsSlinky.reactNativeElements.mod.SearchBarDefault with typingsSlinky.reactNativeElements.mod.SearchBarIOS with typingsSlinky.reactNativeElements.mod.SearchBarAndroid
  type Theme[T] = typingsSlinky.reactNativeElements.anon.PartialFullTheme with T
  type UpdateTheme = js.Function1[
    /* updates */ typingsSlinky.reactNativeElements.anon.RecursivePartialFullTheme, 
    scala.Unit
  ]
}
