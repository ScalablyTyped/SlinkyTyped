package typingsSlinky.makerJs.MakerJs.models

import typingsSlinky.makerJs.MakerJs.IModel
import typingsSlinky.makerJs.MakerJs.IPathMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BoltCircle extends IModel {
  
  @JSName("paths")
  var paths_BoltCircle: IPathMap = js.native
}
object BoltCircle {
  
  @scala.inline
  def apply(paths: IPathMap): BoltCircle = {
    val __obj = js.Dynamic.literal(paths = paths.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoltCircle]
  }
  
  @scala.inline
  implicit class BoltCircleMutableBuilder[Self <: BoltCircle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPaths(value: IPathMap): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
  }
}
