package typingsSlinky.d3pie.anon

import typingsSlinky.d3pie.d3pieStrings.inner
import typingsSlinky.d3pie.d3pieStrings.outer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Section extends StObject {
  
  var label: String = js.native
  
  var section: outer | inner = js.native
  
  var value: Double = js.native
}
object Section {
  
  @scala.inline
  def apply(label: String, section: outer | inner, value: Double): Section = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], section = section.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Section]
  }
  
  @scala.inline
  implicit class SectionMutableBuilder[Self <: Section] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSection(value: outer | inner): Self = StObject.set(x, "section", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
