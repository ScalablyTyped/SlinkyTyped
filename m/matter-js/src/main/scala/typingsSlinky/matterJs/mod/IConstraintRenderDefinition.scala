package typingsSlinky.matterJs.mod

import typingsSlinky.matterJs.matterJsStrings.line
import typingsSlinky.matterJs.matterJsStrings.pin
import typingsSlinky.matterJs.matterJsStrings.spring
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IConstraintRenderDefinition extends StObject {
  
  /**
    * A `Boolean` that defines if the constraint's anchor points should be rendered.
    *
    * @property render.anchors
    * @type boolean
    * @default true
    */
  var anchors: js.UndefOr[Boolean] = js.native
  
  /**
    * A `Number` that defines the line width to use when rendering the constraint outline.
    * A value of `0` means no outline will be rendered.
    *
    * @property render.lineWidth
    * @type number
    * @default 2
    */
  var lineWidth: js.UndefOr[Double] = js.native
  
  /**
    * A `String` that defines the stroke style to use when rendering the constraint outline.
    * It is the same as when using a canvas, so it accepts CSS style property values.
    *
    * @property render.strokeStyle
    * @type string
    * @default a random colour
    */
  var strokeStyle: js.UndefOr[String] = js.native
  
  /**
    * A String that defines the constraint rendering type. The possible values are
    * 'line', 'pin', 'spring'. An appropriate render type will be automatically
    * chosen unless one is given in options.
    *
    * @property render.type
    * @type string
    * @default 'line'
    */
  var `type`: js.UndefOr[line | pin | spring] = js.native
  
  /**
    * A flag that indicates if the constraint should be rendered.
    *
    * @property render.visible
    * @type boolean
    * @default true
    */
  var visible: js.UndefOr[Boolean] = js.native
}
object IConstraintRenderDefinition {
  
  @scala.inline
  def apply(): IConstraintRenderDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IConstraintRenderDefinition]
  }
  
  @scala.inline
  implicit class IConstraintRenderDefinitionMutableBuilder[Self <: IConstraintRenderDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnchors(value: Boolean): Self = StObject.set(x, "anchors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnchorsUndefined: Self = StObject.set(x, "anchors", js.undefined)
    
    @scala.inline
    def setLineWidth(value: Double): Self = StObject.set(x, "lineWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineWidthUndefined: Self = StObject.set(x, "lineWidth", js.undefined)
    
    @scala.inline
    def setStrokeStyle(value: String): Self = StObject.set(x, "strokeStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeStyleUndefined: Self = StObject.set(x, "strokeStyle", js.undefined)
    
    @scala.inline
    def setType(value: line | pin | spring): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
