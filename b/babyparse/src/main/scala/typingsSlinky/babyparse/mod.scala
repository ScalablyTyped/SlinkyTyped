package typingsSlinky.babyparse

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.babyparse.BabyParse.ParseConfig
import typingsSlinky.babyparse.BabyParse.Static
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("babyparse", JSImport.Namespace)
  @js.native
  val ^ : Static = js.native
  
  /**
    * On Papa there are actually more classes exposed
    * but none of them are officially documented
    * Since we can interact with the Parser from one of the callbacks
    * I have included the API for this class.
    */
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("babyparse", "Parser")
  @js.native
  class Parser protected ()
    extends typingsSlinky.babyparse.BabyParse.Parser {
    def this(config: ParseConfig) = this()
  }
  
  type _To = Static
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Static = ^
}
