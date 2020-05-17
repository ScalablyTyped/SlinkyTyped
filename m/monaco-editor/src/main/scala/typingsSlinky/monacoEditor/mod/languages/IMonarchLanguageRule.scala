package typingsSlinky.monacoEditor.mod.languages

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.monacoEditor.mod.languages.IShortMonarchLanguageRule1
  - typingsSlinky.monacoEditor.mod.languages.IShortMonarchLanguageRule2
  - typingsSlinky.monacoEditor.mod.languages.IExpandedMonarchLanguageRule
*/
trait IMonarchLanguageRule extends js.Object

object IMonarchLanguageRule {
  @scala.inline
  implicit def apply(value: IExpandedMonarchLanguageRule): IMonarchLanguageRule = value.asInstanceOf[IMonarchLanguageRule]
  @scala.inline
  implicit def apply(value: IShortMonarchLanguageRule1): IMonarchLanguageRule = value.asInstanceOf[IMonarchLanguageRule]
  @scala.inline
  implicit def apply(value: IShortMonarchLanguageRule2): IMonarchLanguageRule = value.asInstanceOf[IMonarchLanguageRule]
}

