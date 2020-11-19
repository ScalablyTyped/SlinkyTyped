package typingsSlinky.awsSdk.comprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocumentLabel extends js.Object {
  
  /**
    * The name of the label.
    */
  var Name: js.UndefOr[String] = js.native
  
  /**
    * The confidence score that Amazon Comprehend has this label correctly attributed.
    */
  var Score: js.UndefOr[Float] = js.native
}
object DocumentLabel {
  
  @scala.inline
  def apply(): DocumentLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentLabel]
  }
  
  @scala.inline
  implicit class DocumentLabelOps[Self <: DocumentLabel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    
    @scala.inline
    def setScore(value: Float): Self = this.set("Score", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScore: Self = this.set("Score", js.undefined)
  }
}
