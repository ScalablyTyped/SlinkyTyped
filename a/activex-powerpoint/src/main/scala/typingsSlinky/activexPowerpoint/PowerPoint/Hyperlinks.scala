package typingsSlinky.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Hyperlinks extends js.Object {
  
  val Application: typingsSlinky.activexPowerpoint.PowerPoint.Application = js.native
  
  val Count: Double = js.native
  
  def Item(Index: Double): Hyperlink = js.native
  
  val Parent: js.Any = js.native
  
  @JSName("PowerPoint.Hyperlinks_typekey")
  var PowerPointDotHyperlinks_typekey: Hyperlinks = js.native
}
object Hyperlinks {
  
  @scala.inline
  def apply(
    Application: Application,
    Count: Double,
    Item: Double => Hyperlink,
    Parent: js.Any,
    PowerPointDotHyperlinks_typekey: Hyperlinks
  ): Hyperlinks = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.Hyperlinks_typekey")(PowerPointDotHyperlinks_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hyperlinks]
  }
  
  @scala.inline
  implicit class HyperlinksOps[Self <: Hyperlinks] (val x: Self) extends AnyVal {
    
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
    def setCount(value: Double): Self = this.set("Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: Double => Hyperlink): Self = this.set("Item", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPowerPointDotHyperlinks_typekey(value: Hyperlinks): Self = this.set("PowerPoint.Hyperlinks_typekey", value.asInstanceOf[js.Any])
  }
}
