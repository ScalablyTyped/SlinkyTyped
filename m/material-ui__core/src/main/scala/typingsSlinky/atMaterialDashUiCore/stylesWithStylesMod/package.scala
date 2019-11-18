package typingsSlinky.atMaterialDashUiCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object stylesWithStylesMod {
  import typingsSlinky.atMaterialDashUiCore.stylesCreateMuiThemeMod.Theme
  import typingsSlinky.std.Record

  type ClassNameMap[ClassKey /* <: String */] = Record[ClassKey, String]
  type StyleRules[ClassKey /* <: String */] = Record[ClassKey, CSSProperties]
  type StyleRulesCallback[ClassKey /* <: String */] = js.Function1[/* theme */ Theme, StyleRules[ClassKey]]
}
