package typingsSlinky.joi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WhenOptions extends js.Object {
  
  /**
    * whether to stop applying further conditions if the condition is true.
    */
  var break: js.UndefOr[Boolean] = js.native
  
  /**
    * the required condition joi type.
    */
  var is: js.UndefOr[SchemaLike] = js.native
  
  /**
    * the negative version of `is` (`then` and `otherwise` have reverse
    * roles).
    */
  var not: js.UndefOr[SchemaLike] = js.native
  
  /**
    * the alternative schema type if the condition is false. Required if then or switch are missing.
    */
  var otherwise: js.UndefOr[SchemaLike] = js.native
  
  /**
    * the list of cases. Required if then is missing.  Required if then or otherwise are missing.
    */
  var switch: js.UndefOr[js.Array[SwitchCases | SwitchDefault]] = js.native
  
  /**
    * the alternative schema type if the condition is true. Required if otherwise or switch are missing.
    */
  var `then`: js.UndefOr[SchemaLike] = js.native
}
object WhenOptions {
  
  @scala.inline
  def apply(): WhenOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WhenOptions]
  }
  
  @scala.inline
  implicit class WhenOptionsOps[Self <: WhenOptions] (val x: Self) extends AnyVal {
    
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
    def setBreak(value: Boolean): Self = this.set("break", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBreak: Self = this.set("break", js.undefined)
    
    @scala.inline
    def setIs(value: SchemaLike): Self = this.set("is", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIs: Self = this.set("is", js.undefined)
    
    @scala.inline
    def setIsNull: Self = this.set("is", null)
    
    @scala.inline
    def setNot(value: SchemaLike): Self = this.set("not", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNot: Self = this.set("not", js.undefined)
    
    @scala.inline
    def setNotNull: Self = this.set("not", null)
    
    @scala.inline
    def setOtherwise(value: SchemaLike): Self = this.set("otherwise", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOtherwise: Self = this.set("otherwise", js.undefined)
    
    @scala.inline
    def setOtherwiseNull: Self = this.set("otherwise", null)
    
    @scala.inline
    def setSwitchVarargs(value: (SwitchCases | SwitchDefault)*): Self = this.set("switch", js.Array(value :_*))
    
    @scala.inline
    def setSwitch(value: js.Array[SwitchCases | SwitchDefault]): Self = this.set("switch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSwitch: Self = this.set("switch", js.undefined)
    
    @scala.inline
    def setThen(value: SchemaLike): Self = this.set("then", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThen: Self = this.set("then", js.undefined)
    
    @scala.inline
    def setThenNull: Self = this.set("then", null)
  }
}
