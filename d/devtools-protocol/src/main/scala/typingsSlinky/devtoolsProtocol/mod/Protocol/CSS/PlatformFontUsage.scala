package typingsSlinky.devtoolsProtocol.mod.Protocol.CSS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlatformFontUsage extends StObject {
  
  /**
    * Font's family name reported by platform.
    */
  var familyName: String = js.native
  
  /**
    * Amount of glyphs that were rendered with this font.
    */
  var glyphCount: Double = js.native
  
  /**
    * Indicates if the font was downloaded or resolved locally.
    */
  var isCustomFont: Boolean = js.native
}
object PlatformFontUsage {
  
  @scala.inline
  def apply(familyName: String, glyphCount: Double, isCustomFont: Boolean): PlatformFontUsage = {
    val __obj = js.Dynamic.literal(familyName = familyName.asInstanceOf[js.Any], glyphCount = glyphCount.asInstanceOf[js.Any], isCustomFont = isCustomFont.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlatformFontUsage]
  }
  
  @scala.inline
  implicit class PlatformFontUsageMutableBuilder[Self <: PlatformFontUsage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFamilyName(value: String): Self = StObject.set(x, "familyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlyphCount(value: Double): Self = StObject.set(x, "glyphCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsCustomFont(value: Boolean): Self = StObject.set(x, "isCustomFont", value.asInstanceOf[js.Any])
  }
}
