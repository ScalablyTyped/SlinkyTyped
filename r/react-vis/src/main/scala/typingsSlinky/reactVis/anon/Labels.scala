package typingsSlinky.reactVis.anon

import typingsSlinky.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Labels extends StObject {
  
  var axes: js.UndefOr[CSSProperties] = js.native
  
  var labels: js.UndefOr[CSSProperties] = js.native
  
  var lines: js.UndefOr[CSSProperties] = js.native
}
object Labels {
  
  @scala.inline
  def apply(): Labels = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Labels]
  }
  
  @scala.inline
  implicit class LabelsMutableBuilder[Self <: Labels] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAxes(value: CSSProperties): Self = StObject.set(x, "axes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAxesUndefined: Self = StObject.set(x, "axes", js.undefined)
    
    @scala.inline
    def setLabels(value: CSSProperties): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    @scala.inline
    def setLines(value: CSSProperties): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinesUndefined: Self = StObject.set(x, "lines", js.undefined)
  }
}
