package typingsSlinky.oracleOraclejet.anon

import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.auto
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.billion
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.inside
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.million
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.none
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.off
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.on
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.outside
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.quadrillion
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.thousand
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.trillion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Position extends js.Object {
  
  var converter: js.Object = js.native
  
  var position: inside | outside = js.native
  
  var rendered: off | on = js.native
  
  var scaling: none | thousand | million | billion | trillion | quadrillion | auto = js.native
  
  var style: js.Object = js.native
}
object Position {
  
  @scala.inline
  def apply(
    converter: js.Object,
    position: inside | outside,
    rendered: off | on,
    scaling: none | thousand | million | billion | trillion | quadrillion | auto,
    style: js.Object
  ): Position = {
    val __obj = js.Dynamic.literal(converter = converter.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], rendered = rendered.asInstanceOf[js.Any], scaling = scaling.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[Position]
  }
  
  @scala.inline
  implicit class PositionOps[Self <: Position] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setConverter(value: js.Object): Self = this.set("converter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: inside | outside): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRendered(value: off | on): Self = this.set("rendered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaling(value: none | thousand | million | billion | trillion | quadrillion | auto): Self = this.set("scaling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyle(value: js.Object): Self = this.set("style", value.asInstanceOf[js.Any])
  }
}
