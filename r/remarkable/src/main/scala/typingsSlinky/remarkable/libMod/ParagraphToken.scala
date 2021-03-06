package typingsSlinky.remarkable.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.remarkable.libMod._Token because Already inherited */ @js.native
trait ParagraphToken extends TagToken {
  
  /**
    * Absence of empty line before current tag: `true` if absent, `false`
    * if present. List is tight if any list item is tight.
    */
  var tight: Boolean = js.native
}
object ParagraphToken {
  
  @scala.inline
  def apply(level: Double, tight: Boolean, `type`: String): ParagraphToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], tight = tight.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParagraphToken]
  }
  
  @scala.inline
  implicit class ParagraphTokenMutableBuilder[Self <: ParagraphToken] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTight(value: Boolean): Self = StObject.set(x, "tight", value.asInstanceOf[js.Any])
  }
}
