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
}
