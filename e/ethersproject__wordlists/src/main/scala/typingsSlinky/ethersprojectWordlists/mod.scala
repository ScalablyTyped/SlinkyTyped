package typingsSlinky.ethersprojectWordlists

import typingsSlinky.ethersprojectLogger.mod.Logger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@ethersproject/wordlists", "Wordlist")
  @js.native
  abstract class Wordlist protected ()
    extends typingsSlinky.ethersprojectWordlists.wordlistMod.Wordlist {
    def this(locale: String) = this()
  }
  /* static members */
  object Wordlist {
    
    @JSImport("@ethersproject/wordlists", "Wordlist.check")
    @js.native
    def check(wordlist: typingsSlinky.ethersprojectWordlists.wordlistMod.Wordlist): String = js.native
    
    @JSImport("@ethersproject/wordlists", "Wordlist.register")
    @js.native
    def register(lang: typingsSlinky.ethersprojectWordlists.wordlistMod.Wordlist): Unit = js.native
    @JSImport("@ethersproject/wordlists", "Wordlist.register")
    @js.native
    def register(lang: typingsSlinky.ethersprojectWordlists.wordlistMod.Wordlist, name: String): Unit = js.native
  }
  
  @JSImport("@ethersproject/wordlists", "logger")
  @js.native
  val logger: Logger = js.native
}
