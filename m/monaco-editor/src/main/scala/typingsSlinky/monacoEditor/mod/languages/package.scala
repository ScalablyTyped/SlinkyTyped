package typingsSlinky.monacoEditor.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object languages {
  type CharacterPair = js.Tuple2[java.lang.String, java.lang.String]
  type IShortMonarchLanguageAction = java.lang.String
  type IShortMonarchLanguageRule1 = js.Tuple2[js.RegExp, typingsSlinky.monacoEditor.mod.languages.IMonarchLanguageAction]
  type IShortMonarchLanguageRule2 = js.Tuple3[
    js.RegExp, 
    typingsSlinky.monacoEditor.mod.languages.IMonarchLanguageAction, 
    java.lang.String
  ]
}
