package typingsSlinky.monacoEditor.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object languages {
  type CharacterPair = js.Tuple2[java.lang.String, java.lang.String]
  type Definition = typingsSlinky.monacoEditor.mod.languages.Location | (js.Array[
    typingsSlinky.monacoEditor.mod.languages.Location | typingsSlinky.monacoEditor.mod.languages.LocationLink
  ])
  type IMonarchLanguageAction = typingsSlinky.monacoEditor.mod.languages.IShortMonarchLanguageAction | typingsSlinky.monacoEditor.mod.languages.IExpandedMonarchLanguageAction | (js.Array[
    typingsSlinky.monacoEditor.mod.languages.IExpandedMonarchLanguageAction | typingsSlinky.monacoEditor.mod.languages.IShortMonarchLanguageAction
  ])
  type IMonarchLanguageRule = typingsSlinky.monacoEditor.mod.languages.IShortMonarchLanguageRule1 | typingsSlinky.monacoEditor.mod.languages.IShortMonarchLanguageRule2 | typingsSlinky.monacoEditor.mod.languages.IExpandedMonarchLanguageRule
  type IShortMonarchLanguageAction = java.lang.String
  type IShortMonarchLanguageRule1 = js.Tuple2[js.RegExp, typingsSlinky.monacoEditor.mod.languages.IMonarchLanguageAction]
  type IShortMonarchLanguageRule2 = js.Tuple3[
    js.RegExp, 
    typingsSlinky.monacoEditor.mod.languages.IMonarchLanguageAction, 
    java.lang.String
  ]
  type ProviderResult[T] = js.UndefOr[
    T | scala.Null | (typingsSlinky.monacoEditor.mod.Thenable[js.UndefOr[T | scala.Null]])
  ]
}
