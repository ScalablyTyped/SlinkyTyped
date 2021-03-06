package typingsSlinky.javascriptObfuscator.estreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BigIntLiteral extends SimpleLiteral {
  
  var bigint: String = js.native
}
object BigIntLiteral {
  
  @scala.inline
  def apply(bigint: String): BigIntLiteral = {
    val __obj = js.Dynamic.literal(bigint = bigint.asInstanceOf[js.Any])
    __obj.asInstanceOf[BigIntLiteral]
  }
  
  @scala.inline
  implicit class BigIntLiteralOps[Self <: BigIntLiteral] (val x: Self) extends AnyVal {
    
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
    def setBigint(value: String): Self = this.set("bigint", value.asInstanceOf[js.Any])
  }
}
