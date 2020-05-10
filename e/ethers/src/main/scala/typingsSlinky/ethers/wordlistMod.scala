package typingsSlinky.ethers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ethers/dist/types/wordlists/wordlist", JSImport.Namespace)
@js.native
object wordlistMod extends js.Object {
  @js.native
  abstract class Wordlist protected ()
    extends typingsSlinky.ethers.typesMod.Wordlist {
    def this(locale: String) = this()
  }
  
  def check(wordlist: typingsSlinky.ethers.typesMod.Wordlist): String = js.native
  def register(lang: Wordlist): Unit = js.native
  def register(lang: Wordlist, name: String): Unit = js.native
}

