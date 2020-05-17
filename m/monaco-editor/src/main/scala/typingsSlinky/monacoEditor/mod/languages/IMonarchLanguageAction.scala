package typingsSlinky.monacoEditor.mod.languages

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.monacoEditor.mod.languages.IShortMonarchLanguageAction
  - typingsSlinky.monacoEditor.mod.languages.IExpandedMonarchLanguageAction
  - js.Array[
typingsSlinky.monacoEditor.mod.languages.IExpandedMonarchLanguageAction | typingsSlinky.monacoEditor.mod.languages.IShortMonarchLanguageAction]
*/
trait IMonarchLanguageAction extends js.Object

object IMonarchLanguageAction {
  @scala.inline
  implicit def apply(value: js.Array[IExpandedMonarchLanguageAction | IShortMonarchLanguageAction]): IMonarchLanguageAction = value.asInstanceOf[IMonarchLanguageAction]
  @scala.inline
  implicit def apply(value: IExpandedMonarchLanguageAction): IMonarchLanguageAction = value.asInstanceOf[IMonarchLanguageAction]
  @scala.inline
  implicit def apply(value: IShortMonarchLanguageAction): IMonarchLanguageAction = value.asInstanceOf[IMonarchLanguageAction]
}

