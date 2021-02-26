package typingsSlinky.ansiFragments

import typingsSlinky.ansiFragments.ifragmentMod.IFragment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modifierMod {
  
  @JSImport("ansi-fragments/build/fragments/Modifier", "Modifier")
  @js.native
  class Modifier_ protected () extends IFragment {
    def this(ansiModifier: AnsiModifier, children: js.Array[String | IFragment]) = this()
    
    val children: js.Any = js.native
    
    val modifier: js.Any = js.native
  }
  
  @JSImport("ansi-fragments/build/fragments/Modifier", "modifier")
  @js.native
  def modifier(ansiModifier: AnsiModifier, children: (String | IFragment)*): Modifier_ = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.ansiFragments.ansiFragmentsStrings.dim
    - typingsSlinky.ansiFragments.ansiFragmentsStrings.bold
    - typingsSlinky.ansiFragments.ansiFragmentsStrings.hidden
    - typingsSlinky.ansiFragments.ansiFragmentsStrings.italic
    - typingsSlinky.ansiFragments.ansiFragmentsStrings.underline
    - typingsSlinky.ansiFragments.ansiFragmentsStrings.strikethrough
    - typingsSlinky.ansiFragments.ansiFragmentsStrings.none
  */
  trait AnsiModifier extends StObject
  object AnsiModifier {
    
    @scala.inline
    def bold: typingsSlinky.ansiFragments.ansiFragmentsStrings.bold = "bold".asInstanceOf[typingsSlinky.ansiFragments.ansiFragmentsStrings.bold]
    
    @scala.inline
    def dim: typingsSlinky.ansiFragments.ansiFragmentsStrings.dim = "dim".asInstanceOf[typingsSlinky.ansiFragments.ansiFragmentsStrings.dim]
    
    @scala.inline
    def hidden: typingsSlinky.ansiFragments.ansiFragmentsStrings.hidden = "hidden".asInstanceOf[typingsSlinky.ansiFragments.ansiFragmentsStrings.hidden]
    
    @scala.inline
    def italic: typingsSlinky.ansiFragments.ansiFragmentsStrings.italic = "italic".asInstanceOf[typingsSlinky.ansiFragments.ansiFragmentsStrings.italic]
    
    @scala.inline
    def none: typingsSlinky.ansiFragments.ansiFragmentsStrings.none = "none".asInstanceOf[typingsSlinky.ansiFragments.ansiFragmentsStrings.none]
    
    @scala.inline
    def strikethrough: typingsSlinky.ansiFragments.ansiFragmentsStrings.strikethrough = "strikethrough".asInstanceOf[typingsSlinky.ansiFragments.ansiFragmentsStrings.strikethrough]
    
    @scala.inline
    def underline: typingsSlinky.ansiFragments.ansiFragmentsStrings.underline = "underline".asInstanceOf[typingsSlinky.ansiFragments.ansiFragmentsStrings.underline]
  }
}
