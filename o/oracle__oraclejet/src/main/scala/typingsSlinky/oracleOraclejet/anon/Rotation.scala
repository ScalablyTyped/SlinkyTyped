package typingsSlinky.oracleOraclejet.anon

import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.auto
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.billion
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.million
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.none
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.off
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.on
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.quadrillion
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.thousand
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.trillion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Rotation extends StObject {
  
  var converter: js.Object = js.native
  
  var rendered: off | on = js.native
  
  var rotation: none | auto = js.native
  
  var scaling: none | thousand | million | billion | trillion | quadrillion | auto = js.native
  
  var style: js.Object = js.native
}
object Rotation {
  
  @scala.inline
  def apply(
    converter: js.Object,
    rendered: off | on,
    rotation: none | auto,
    scaling: none | thousand | million | billion | trillion | quadrillion | auto,
    style: js.Object
  ): Rotation = {
    val __obj = js.Dynamic.literal(converter = converter.asInstanceOf[js.Any], rendered = rendered.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], scaling = scaling.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rotation]
  }
  
  @scala.inline
  implicit class RotationMutableBuilder[Self <: Rotation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConverter(value: js.Object): Self = StObject.set(x, "converter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRendered(value: off | on): Self = StObject.set(x, "rendered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotation(value: none | auto): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaling(value: none | thousand | million | billion | trillion | quadrillion | auto): Self = StObject.set(x, "scaling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
  }
}
