package typingsSlinky.recase.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Exceptions extends js.Object {
  
  var exceptions: js.UndefOr[StringDictionary[String]] = js.native
}
object Exceptions {
  
  @scala.inline
  def apply(): Exceptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Exceptions]
  }
  
  @scala.inline
  implicit class ExceptionsOps[Self <: Exceptions] (val x: Self) extends AnyVal {
    
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
    def setExceptions(value: StringDictionary[String]): Self = this.set("exceptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExceptions: Self = this.set("exceptions", js.undefined)
  }
}
