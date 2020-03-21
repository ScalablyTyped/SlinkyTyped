package typingsSlinky.materialUiStyles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object withStylesWithStylesMod {
  type ClassKeyInferable[Theme, Props /* <: js.Object */] = java.lang.String | (typingsSlinky.materialUiStyles.withStylesWithStylesMod.Styles[Theme, Props, java.lang.String])
  type ClassKeyOfStyles[StylesOrClassKey] = js.Any | StylesOrClassKey
  type ClassNameMap[ClassKey /* <: java.lang.String */] = typingsSlinky.std.Record[ClassKey, java.lang.String]
  type PropsOfStyles[StylesType] = js.Object
  type StyleRules[Props /* <: js.Object */, ClassKey /* <: java.lang.String */] = typingsSlinky.std.Record[
    ClassKey, 
    typingsSlinky.materialUiStyles.withStylesWithStylesMod.CSSProperties | typingsSlinky.materialUiStyles.withStylesWithStylesMod.CreateCSSProperties[Props] | (js.Function1[
      /* props */ Props, 
      typingsSlinky.materialUiStyles.withStylesWithStylesMod.CreateCSSProperties[Props]
    ])
  ]
  type StyleRulesCallback[Theme, Props /* <: js.Object */, ClassKey /* <: java.lang.String */] = js.Function1[
    /* theme */ Theme, 
    typingsSlinky.materialUiStyles.withStylesWithStylesMod.StyleRules[Props, ClassKey]
  ]
  type Styles[Theme, Props /* <: js.Object */, ClassKey /* <: java.lang.String */] = (typingsSlinky.materialUiStyles.withStylesWithStylesMod.StyleRules[Props, ClassKey]) | (typingsSlinky.materialUiStyles.withStylesWithStylesMod.StyleRulesCallback[Theme, Props, ClassKey])
  type ThemeOfStyles[StylesType] = js.Object
}
