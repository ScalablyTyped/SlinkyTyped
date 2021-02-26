package typingsSlinky.markdownIt

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.markdownIt.parseLinkDestinationMod.ParseResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helpersMod extends Shortcut {
  
  @JSImport("markdown-it/lib/helpers", JSImport.Namespace)
  @js.native
  val ^ : Helpers = js.native
  
  @js.native
  trait Helpers extends StObject {
    
    def parseLinkDestination(str: String, pos: Double, max: Double): ParseResult = js.native
    @JSName("parseLinkDestination")
    var parseLinkDestination_Original: js.Function3[/* str */ String, /* pos */ Double, /* max */ Double, ParseResult] = js.native
    
    def parseLinkLabel(state: typingsSlinky.markdownIt.stateInlineMod.^, start: Double): Double = js.native
    def parseLinkLabel(state: typingsSlinky.markdownIt.stateInlineMod.^, start: Double, disableNested: Boolean): Double = js.native
    @JSName("parseLinkLabel")
    var parseLinkLabel_Original: js.Function3[
        /* state */ typingsSlinky.markdownIt.stateInlineMod.^, 
        /* start */ Double, 
        /* disableNested */ js.UndefOr[Boolean], 
        Double
      ] = js.native
    
    def parseLinkTitle(str: String, pos: Double, max: Double): ParseResult = js.native
    @JSName("parseLinkTitle")
    var parseLinkTitle_Original: js.Function3[/* str */ String, /* pos */ Double, /* max */ Double, ParseResult] = js.native
  }
  
  type _To = Helpers
  
  /* This means you don't have to write `^`, but can instead just say `helpersMod.foo` */
  override def _to: Helpers = ^
}
