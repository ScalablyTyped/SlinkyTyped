package typingsSlinky.reactNativeElements

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type DividerProps = typingsSlinky.reactNative.mod.ViewProperties
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.react.mod.ReactElement
    - typingsSlinky.reactNativeElements.mod.TextProps
    - typingsSlinky.reactNativeElements.mod.HeaderIcon
  */
  type HeaderSubComponent = typingsSlinky.reactNativeElements.mod._HeaderSubComponent | slinky.core.facade.ReactElement
  type IconNode = scala.Boolean | slinky.core.facade.ReactElement | typingsSlinky.reactNativeElements.mod.IconProps
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.reactNativeElements.reactNativeElementsStrings.material
    - typingsSlinky.reactNativeElements.reactNativeElementsStrings.`material-community`
    - typingsSlinky.reactNativeElements.reactNativeElementsStrings.`simple-line-icon`
    - typingsSlinky.reactNativeElements.reactNativeElementsStrings.zocial
    - typingsSlinky.reactNativeElements.reactNativeElementsStrings.`font-awesome`
    - typingsSlinky.reactNativeElements.reactNativeElementsStrings.octicon
    - typingsSlinky.reactNativeElements.reactNativeElementsStrings.ionicon
    - typingsSlinky.reactNativeElements.reactNativeElementsStrings.foundation
    - typingsSlinky.reactNativeElements.reactNativeElementsStrings.evilicon
    - typingsSlinky.reactNativeElements.reactNativeElementsStrings.entypo
    - typingsSlinky.reactNativeElements.reactNativeElementsStrings.antdesign
    - java.lang.String
  */
  type IconType = typingsSlinky.reactNativeElements.mod._IconType | java.lang.String
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
