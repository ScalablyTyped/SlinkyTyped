package typingsSlinky.ethersprojectWordlists

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.ethersprojectLogger.mod.Logger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ethersproject/wordlists", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val logger: Logger = js.native
  
  @js.native
  abstract class Wordlist protected ()
    extends typingsSlinky.ethersprojectWordlists.wordlistMod.Wordlist {
    def this(locale: String) = this()
  }
  /* static members */
  @js.native
  object Wordlist extends js.Object {
    
    def check(wordlist: typingsSlinky.ethersprojectWordlists.wordlistMod.Wordlist): String = js.native
    
    def register(lang: typingsSlinky.ethersprojectWordlists.wordlistMod.Wordlist): Unit = js.native
    def register(lang: typingsSlinky.ethersprojectWordlists.wordlistMod.Wordlist, name: String): Unit = js.native
  }
  
  @js.native
  object wordlists
    extends /* locale */ StringDictionary[typingsSlinky.ethersprojectWordlists.wordlistMod.Wordlist]
}
