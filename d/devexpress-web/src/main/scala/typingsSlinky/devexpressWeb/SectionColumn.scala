package typingsSlinky.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Defines a section column in the document.
  */
@js.native
trait SectionColumn extends StObject {
  
  /**
    * Specifies the space between adjacent section columns.
    */
  var spacing: Double = js.native
  
  /**
    * Specifies the width of the section column.
    */
  var width: Double = js.native
}
object SectionColumn {
  
  @scala.inline
  def apply(spacing: Double, width: Double): SectionColumn = {
    val __obj = js.Dynamic.literal(spacing = spacing.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[SectionColumn]
  }
  
  @scala.inline
  implicit class SectionColumnMutableBuilder[Self <: SectionColumn] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSpacing(value: Double): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
