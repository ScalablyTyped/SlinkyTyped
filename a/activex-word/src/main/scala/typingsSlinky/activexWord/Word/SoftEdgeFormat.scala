package typingsSlinky.activexWord.Word

import typingsSlinky.activexOffice.Office.MsoSoftEdgeType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SoftEdgeFormat extends js.Object {
  
  val Application: typingsSlinky.activexWord.Word.Application = js.native
  
  val Creator: Double = js.native
  
  val Parent: js.Any = js.native
  
  var Radius: Double = js.native
  
  var Type: MsoSoftEdgeType = js.native
  
  @JSName("Word.SoftEdgeFormat_typekey")
  var WordDotSoftEdgeFormat_typekey: SoftEdgeFormat = js.native
}
object SoftEdgeFormat {
  
  @scala.inline
  def apply(
    Application: Application,
    Creator: Double,
    Parent: js.Any,
    Radius: Double,
    Type: MsoSoftEdgeType,
    WordDotSoftEdgeFormat_typekey: SoftEdgeFormat
  ): SoftEdgeFormat = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Radius = Radius.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.SoftEdgeFormat_typekey")(WordDotSoftEdgeFormat_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SoftEdgeFormat]
  }
  
  @scala.inline
  implicit class SoftEdgeFormatOps[Self <: SoftEdgeFormat] (val x: Self) extends AnyVal {
    
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
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = this.set("Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadius(value: Double): Self = this.set("Radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: MsoSoftEdgeType): Self = this.set("Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotSoftEdgeFormat_typekey(value: SoftEdgeFormat): Self = this.set("Word.SoftEdgeFormat_typekey", value.asInstanceOf[js.Any])
  }
}
