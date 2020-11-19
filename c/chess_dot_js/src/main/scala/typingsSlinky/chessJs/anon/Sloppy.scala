package typingsSlinky.chessJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Sloppy extends js.Object {
  
  /**
    * An optional sloppy flag can be used to parse a variety of
    * non-standard move notations.
    */
  var sloppy: js.UndefOr[Boolean] = js.native
}
object Sloppy {
  
  @scala.inline
  def apply(): Sloppy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Sloppy]
  }
  
  @scala.inline
  implicit class SloppyOps[Self <: Sloppy] (val x: Self) extends AnyVal {
    
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
    def setSloppy(value: Boolean): Self = this.set("sloppy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSloppy: Self = this.set("sloppy", js.undefined)
  }
}
