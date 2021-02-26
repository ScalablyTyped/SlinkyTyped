package typingsSlinky.mapboxGl.mod

import typingsSlinky.mapboxGl.mapboxGlStrings.`raster-dem`
import typingsSlinky.mapboxGl.mapboxGlStrings.canvas
import typingsSlinky.mapboxGl.mapboxGlStrings.geojson
import typingsSlinky.mapboxGl.mapboxGlStrings.image_
import typingsSlinky.mapboxGl.mapboxGlStrings.raster
import typingsSlinky.mapboxGl.mapboxGlStrings.vector
import typingsSlinky.mapboxGl.mapboxGlStrings.video
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Source extends StObject {
  
  var `type`: vector | raster | `raster-dem` | geojson | image_ | video | canvas = js.native
}
object Source {
  
  @scala.inline
  def apply(`type`: vector | raster | `raster-dem` | geojson | image_ | video | canvas): Source = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Source]
  }
  
  @scala.inline
  implicit class SourceMutableBuilder[Self <: Source] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: vector | raster | `raster-dem` | geojson | image_ | video | canvas): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
