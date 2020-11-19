package typingsSlinky.oracleOraclejet.ojmenuMod.ojMenu

import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.fit
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.flip
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.flipcenter
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.flipfit
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// tslint:disable-next-line interface-over-type-literal
@js.native
trait Position extends js.Object {
  
  var at: js.UndefOr[PositionAlign] = js.native
  
  var collision: js.UndefOr[flip | fit | flipfit | flipcenter | none] = js.native
  
  var my: js.UndefOr[PositionAlign] = js.native
  
  var of: js.UndefOr[String | PositionPoint] = js.native
  
  var offset: js.UndefOr[PositionPoint] = js.native
}
object Position {
  
  @scala.inline
  def apply(): Position = {
    val __obj = js.Dynamic.literal()
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
    def setAt(value: PositionAlign): Self = this.set("at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAt: Self = this.set("at", js.undefined)
    
    @scala.inline
    def setCollision(value: flip | fit | flipfit | flipcenter | none): Self = this.set("collision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollision: Self = this.set("collision", js.undefined)
    
    @scala.inline
    def setMy(value: PositionAlign): Self = this.set("my", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMy: Self = this.set("my", js.undefined)
    
    @scala.inline
    def setOf(value: String | PositionPoint): Self = this.set("of", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOf: Self = this.set("of", js.undefined)
    
    @scala.inline
    def setOffset(value: PositionPoint): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
  }
}
