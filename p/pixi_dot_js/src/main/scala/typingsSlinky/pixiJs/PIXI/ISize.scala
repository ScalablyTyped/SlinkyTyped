package typingsSlinky.pixiJs.PIXI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Size object, contains width and height
  *
  * @memberof PIXI
  * @typedef {object} ISize
  * @property {number} width - Width component
  * @property {number} height - Height component
  */
@js.native
trait ISize extends StObject {
  
  var height: Double = js.native
  
  var width: Double = js.native
}
object ISize {
  
  @scala.inline
  def apply(height: Double, width: Double): ISize = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISize]
  }
  
  @scala.inline
  implicit class ISizeMutableBuilder[Self <: ISize] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
