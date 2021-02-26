package typingsSlinky.makerJs.MakerJs.models

import typingsSlinky.makerJs.MakerJs.IModel
import typingsSlinky.makerJs.MakerJs.IPathMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Square extends IModel {
  
  @JSName("paths")
  var paths_Square: IPathMap = js.native
}
object Square {
  
  @scala.inline
  def apply(paths: IPathMap): Square = {
    val __obj = js.Dynamic.literal(paths = paths.asInstanceOf[js.Any])
    __obj.asInstanceOf[Square]
  }
  
  @scala.inline
  implicit class SquareMutableBuilder[Self <: Square] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPaths(value: IPathMap): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
  }
}
