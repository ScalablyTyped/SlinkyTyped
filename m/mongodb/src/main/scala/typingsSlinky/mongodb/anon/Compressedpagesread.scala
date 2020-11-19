package typingsSlinky.mongodb.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Compressedpagesread extends js.Object {
  
  var `compressed pages read`: Double = js.native
  
  var `compressed pages written`: Double = js.native
  
  var `page written failed to compress`: Double = js.native
  
  var `page written was too small to compress`: Double = js.native
  
  @JSName("raw compression call failed, additional data available")
  var `raw compression call failedComma additional data available`: Double = js.native
  
  @JSName("raw compression call failed, no additional data available")
  var `raw compression call failedComma no additional data available`: Double = js.native
  
  var `raw compression call succeeded`: Double = js.native
}
object Compressedpagesread {
  
  @scala.inline
  def apply(
    `compressed pages read`: Double,
    `compressed pages written`: Double,
    `page written failed to compress`: Double,
    `page written was too small to compress`: Double,
    `raw compression call failedComma additional data available`: Double,
    `raw compression call failedComma no additional data available`: Double,
    `raw compression call succeeded`: Double
  ): Compressedpagesread = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("compressed pages read")((`compressed pages read`).asInstanceOf[js.Any])
    __obj.updateDynamic("compressed pages written")((`compressed pages written`).asInstanceOf[js.Any])
    __obj.updateDynamic("page written failed to compress")((`page written failed to compress`).asInstanceOf[js.Any])
    __obj.updateDynamic("page written was too small to compress")((`page written was too small to compress`).asInstanceOf[js.Any])
    __obj.updateDynamic("raw compression call failed, additional data available")((`raw compression call failedComma additional data available`).asInstanceOf[js.Any])
    __obj.updateDynamic("raw compression call failed, no additional data available")((`raw compression call failedComma no additional data available`).asInstanceOf[js.Any])
    __obj.updateDynamic("raw compression call succeeded")((`raw compression call succeeded`).asInstanceOf[js.Any])
    __obj.asInstanceOf[Compressedpagesread]
  }
  
  @scala.inline
  implicit class CompressedpagesreadOps[Self <: Compressedpagesread] (val x: Self) extends AnyVal {
    
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
    def `setCompressed pages read`(value: Double): Self = this.set("compressed pages read", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setCompressed pages written`(value: Double): Self = this.set("compressed pages written", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setPage written failed to compress`(value: Double): Self = this.set("page written failed to compress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setPage written was too small to compress`(value: Double): Self = this.set("page written was too small to compress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setRaw compression call failedComma additional data available`(value: Double): Self = this.set("raw compression call failed, additional data available", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setRaw compression call failedComma no additional data available`(value: Double): Self = this.set("raw compression call failed, no additional data available", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setRaw compression call succeeded`(value: Double): Self = this.set("raw compression call succeeded", value.asInstanceOf[js.Any])
  }
}
