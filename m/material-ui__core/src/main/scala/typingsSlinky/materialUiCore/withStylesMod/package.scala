package typingsSlinky.materialUiCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object withStylesMod {
  type ClassNameMap[ClassKey /* <: java.lang.String */] = typingsSlinky.std.Record[ClassKey, java.lang.String]
  type StyleRules[ClassKey /* <: java.lang.String */] = typingsSlinky.std.Record[ClassKey, typingsSlinky.materialUiCore.withStylesMod.CSSProperties]
  type StyleRulesCallback[ClassKey /* <: java.lang.String */] = js.Function1[
    /* theme */ typingsSlinky.materialUiCore.createMuiThemeMod.Theme, 
    typingsSlinky.materialUiCore.withStylesMod.StyleRules[ClassKey]
  ]
  type WithStyles[T /* <: java.lang.String | typingsSlinky.materialUiCore.withStylesMod.StyleRules[java.lang.String] | typingsSlinky.materialUiCore.withStylesMod.StyleRulesCallback[java.lang.String] */, IncludeTheme /* <: js.UndefOr[scala.Boolean] */] = (js.Object | typingsSlinky.materialUiCore.AnonTheme) with typingsSlinky.materialUiCore.AnonClasses[T]
}
