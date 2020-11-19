package typingsSlinky.mnemonist.symspellMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mnemonist/symspell", JSImport.Default)
@js.native
// Constructor
class default () extends SymSpell {
  def this(options: SymSpellOptions) = this()
}
/* static members */
@JSImport("mnemonist/symspell", JSImport.Default)
@js.native
object default extends js.Object {
  
  def from(strings: StringDictionary[String]): SymSpell = js.native
  def from(strings: StringDictionary[String], options: SymSpellOptions): SymSpell = js.native
  // Statics
  def from(strings: js.Iterable[String]): SymSpell = js.native
  def from(strings: js.Iterable[String], options: SymSpellOptions): SymSpell = js.native
}
