package typingsSlinky.materialUiStyles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object withStylesWithStylesMod {
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
  type ThemeOfStyles[StylesType] = js.Object
  type WithStyles[StylesType /* <: typingsSlinky.materialUiStyles.withStylesWithStylesMod.ClassKeyInferable[_, _] */, IncludeTheme /* <: js.UndefOr[scala.Boolean] */] = (js.Object | typingsSlinky.materialUiStyles.anon.Theme[StylesType]) with typingsSlinky.materialUiStyles.anon.Classes[StylesType] with typingsSlinky.materialUiStyles.withStylesWithStylesMod.PropsOfStyles[StylesType]
}
