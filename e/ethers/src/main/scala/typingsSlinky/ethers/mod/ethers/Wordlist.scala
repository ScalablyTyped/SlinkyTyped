package typingsSlinky.ethers.mod.ethers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ethers", "ethers.Wordlist")
@js.native
abstract class Wordlist protected ()
  extends typingsSlinky.ethers.ethersMod.Wordlist {
  def this(locale: String) = this()
}
/* static members */
@JSImport("ethers", "ethers.Wordlist")
@js.native
object Wordlist extends js.Object {
  
  def check(wordlist: typingsSlinky.ethersprojectWordlists.wordlistMod.Wordlist): String = js.native
  
  def register(lang: typingsSlinky.ethersprojectWordlists.wordlistMod.Wordlist): Unit = js.native
  def register(lang: typingsSlinky.ethersprojectWordlists.wordlistMod.Wordlist, name: String): Unit = js.native
}
