package typingsSlinky.makerJs.MakerJs.models

import typingsSlinky.makerJs.MakerJs.IModel
import typingsSlinky.makerJs.MakerJs.IPathMap
import typingsSlinky.makerJs.MakerJs.IPoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RoundRectangle extends IModel {
  
  @JSName("origin")
  var origin_RoundRectangle: IPoint = js.native
  
  @JSName("paths")
  var paths_RoundRectangle: IPathMap = js.native
}
object RoundRectangle {
  
  @scala.inline
  def apply(origin: IPoint, paths: IPathMap): RoundRectangle = {
    val __obj = js.Dynamic.literal(origin = origin.asInstanceOf[js.Any], paths = paths.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoundRectangle]
  }
  
  @scala.inline
  implicit class RoundRectangleMutableBuilder[Self <: RoundRectangle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOrigin(value: IPoint): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaths(value: IPathMap): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
  }
}
