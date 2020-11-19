package typingsSlinky.cloudeventsSdk.anon

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Dictx
  extends /* x */ NumberDictionary[NumberDictionary[js.Any]] {
  
  var `null`: NumberDictionary[js.Any] = js.native
  
  var undefined: NumberDictionary[js.Any] = js.native
}
object Dictx {
  
  @scala.inline
  def apply(`null`: NumberDictionary[js.Any], undefined: NumberDictionary[js.Any]): Dictx = {
    val __obj = js.Dynamic.literal(undefined = undefined.asInstanceOf[js.Any])
    __obj.updateDynamic("null")(`null`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dictx]
  }
  
  @scala.inline
  implicit class DictxOps[Self <: Dictx] (val x: Self) extends AnyVal {
    
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
    def setNull(value: NumberDictionary[js.Any]): Self = this.set("null", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUndefined(value: NumberDictionary[js.Any]): Self = this.set("undefined", value.asInstanceOf[js.Any])
  }
}
