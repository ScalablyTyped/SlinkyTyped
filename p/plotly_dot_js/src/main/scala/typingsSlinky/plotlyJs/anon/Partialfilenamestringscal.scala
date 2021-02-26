package typingsSlinky.plotlyJs.anon

import typingsSlinky.plotlyJs.plotlyJsStrings.jpeg
import typingsSlinky.plotlyJs.plotlyJsStrings.png
import typingsSlinky.plotlyJs.plotlyJsStrings.svg
import typingsSlinky.plotlyJs.plotlyJsStrings.webp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  filename :string,   scale :number,   format :'png' | 'svg' | 'jpeg' | 'webp',   height :number,   width :number}> */
@js.native
trait Partialfilenamestringscal extends StObject {
  
  var filename: js.UndefOr[String] = js.native
  
  var format: js.UndefOr[png | svg | jpeg | webp] = js.native
  
  var height: js.UndefOr[Double] = js.native
  
  var scale: js.UndefOr[Double] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object Partialfilenamestringscal {
  
  @scala.inline
  def apply(): Partialfilenamestringscal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Partialfilenamestringscal]
  }
  
  @scala.inline
  implicit class PartialfilenamestringscalMutableBuilder[Self <: Partialfilenamestringscal] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
    
    @scala.inline
    def setFormat(value: png | svg | jpeg | webp): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
