package typingsSlinky.raphael.mod

import typingsSlinky.raphael.anon.PartialRaphaelFontFace
import typingsSlinky.raphael.anon.PartialRaphaelFontGlyph
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RaphaelFont extends StObject {
  
  /** The font faces that are available in this font. */
  var face: PartialRaphaelFontFace = js.native
  
  /** The glyphs that are available in this font. */
  var glyphs: Record[String, PartialRaphaelFontGlyph] = js.native
  
  /** The width of this font. */
  var w: Double = js.native
}
object RaphaelFont {
  
  @scala.inline
  def apply(face: PartialRaphaelFontFace, glyphs: Record[String, PartialRaphaelFontGlyph], w: Double): RaphaelFont = {
    val __obj = js.Dynamic.literal(face = face.asInstanceOf[js.Any], glyphs = glyphs.asInstanceOf[js.Any], w = w.asInstanceOf[js.Any])
    __obj.asInstanceOf[RaphaelFont]
  }
  
  @scala.inline
  implicit class RaphaelFontMutableBuilder[Self <: RaphaelFont] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFace(value: PartialRaphaelFontFace): Self = StObject.set(x, "face", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlyphs(value: Record[String, PartialRaphaelFontGlyph]): Self = StObject.set(x, "glyphs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setW(value: Double): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
  }
}
