package typingsSlinky.mnemonist.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.mnemonist.symspellMod.SymSpellOptions
import typingsSlinky.mnemonist.symspellMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mnemonist", "SymSpell")
@js.native
// Constructor
class SymSpell () extends default {
  def this(options: SymSpellOptions) = this()
}

/* static members */
@JSImport("mnemonist", "SymSpell")
@js.native
object SymSpell extends js.Object {
  def from(strings: StringDictionary[String]): typingsSlinky.mnemonist.symspellMod.SymSpell = js.native
  def from(strings: StringDictionary[String], options: SymSpellOptions): typingsSlinky.mnemonist.symspellMod.SymSpell = js.native
  // Statics
  def from(strings: js.Iterable[String]): typingsSlinky.mnemonist.symspellMod.SymSpell = js.native
  def from(strings: js.Iterable[String], options: SymSpellOptions): typingsSlinky.mnemonist.symspellMod.SymSpell = js.native
}

