package typingsSlinky.binaryParser.mod.Parser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StringOptions extends Options {
  
  var encoding: js.UndefOr[String] = js.native
  
  var greedy: js.UndefOr[Boolean] = js.native
  
  var length: js.UndefOr[
    Double | String | (js.ThisFunction0[/* this */ typingsSlinky.binaryParser.mod.Parser[_], Double])
  ] = js.native
  
  var stripNull: js.UndefOr[Boolean] = js.native
  
  var zeroTerminated: js.UndefOr[Boolean] = js.native
}
object StringOptions {
  
  @scala.inline
  def apply(): StringOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StringOptions]
  }
  
  @scala.inline
  implicit class StringOptionsOps[Self <: StringOptions] (val x: Self) extends AnyVal {
    
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
    def setEncoding(value: String): Self = this.set("encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncoding: Self = this.set("encoding", js.undefined)
    
    @scala.inline
    def setGreedy(value: Boolean): Self = this.set("greedy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGreedy: Self = this.set("greedy", js.undefined)
    
    @scala.inline
    def setLength(
      value: Double | String | (js.ThisFunction0[/* this */ typingsSlinky.binaryParser.mod.Parser[_], Double])
    ): Self = this.set("length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLength: Self = this.set("length", js.undefined)
    
    @scala.inline
    def setStripNull(value: Boolean): Self = this.set("stripNull", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStripNull: Self = this.set("stripNull", js.undefined)
    
    @scala.inline
    def setZeroTerminated(value: Boolean): Self = this.set("zeroTerminated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZeroTerminated: Self = this.set("zeroTerminated", js.undefined)
  }
}
