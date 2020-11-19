package typingsSlinky.pulumiAws.xssMatchSetMod

import typingsSlinky.pulumiAws.inputMod.wafregional.XssMatchSetXssMatchTuple
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XssMatchSetArgs extends js.Object {
  
  /**
    * The name of the set
    */
  val name: js.UndefOr[Input[String]] = js.native
  
  /**
    * The parts of web requests that you want to inspect for cross-site scripting attacks.
    */
  val xssMatchTuples: js.UndefOr[Input[js.Array[Input[XssMatchSetXssMatchTuple]]]] = js.native
}
object XssMatchSetArgs {
  
  @scala.inline
  def apply(): XssMatchSetArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[XssMatchSetArgs]
  }
  
  @scala.inline
  implicit class XssMatchSetArgsOps[Self <: XssMatchSetArgs] (val x: Self) extends AnyVal {
    
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
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setXssMatchTuplesVarargs(value: Input[XssMatchSetXssMatchTuple]*): Self = this.set("xssMatchTuples", js.Array(value :_*))
    
    @scala.inline
    def setXssMatchTuples(value: Input[js.Array[Input[XssMatchSetXssMatchTuple]]]): Self = this.set("xssMatchTuples", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXssMatchTuples: Self = this.set("xssMatchTuples", js.undefined)
  }
}
