package typingsSlinky.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TickLabels extends js.Object {
  
  var Alignment: Double = js.native
  
  val Application: typingsSlinky.activexPowerpoint.PowerPoint.Application = js.native
  
  var AutoScaleFont: js.Any = js.native
  
  val Creator: Double = js.native
  
  def Delete(): js.Any = js.native
  
  val Depth: Double = js.native
  
  val Font: ChartFont = js.native
  
  val Format: ChartFormat = js.native
  
  var MultiLevel: Boolean = js.native
  
  val Name: String = js.native
  
  var NumberFormat: String = js.native
  
  var NumberFormatLinked: Boolean = js.native
  
  var NumberFormatLocal: js.Any = js.native
  
  var Offset: Double = js.native
  
  var Orientation: XlTickLabelOrientation = js.native
  
  val Parent: js.Any = js.native
  
  @JSName("PowerPoint.TickLabels_typekey")
  var PowerPointDotTickLabels_typekey: TickLabels = js.native
  
  var ReadingOrder: Double = js.native
  
  def Select(): js.Any = js.native
}
object TickLabels {
  
  @scala.inline
  def apply(
    Alignment: Double,
    Application: Application,
    AutoScaleFont: js.Any,
    Creator: Double,
    Delete: () => js.Any,
    Depth: Double,
    Font: ChartFont,
    Format: ChartFormat,
    MultiLevel: Boolean,
    Name: String,
    NumberFormat: String,
    NumberFormatLinked: Boolean,
    NumberFormatLocal: js.Any,
    Offset: Double,
    Orientation: XlTickLabelOrientation,
    Parent: js.Any,
    PowerPointDotTickLabels_typekey: TickLabels,
    ReadingOrder: Double,
    Select: () => js.Any
  ): TickLabels = {
    val __obj = js.Dynamic.literal(Alignment = Alignment.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], AutoScaleFont = AutoScaleFont.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Depth = Depth.asInstanceOf[js.Any], Font = Font.asInstanceOf[js.Any], Format = Format.asInstanceOf[js.Any], MultiLevel = MultiLevel.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], NumberFormat = NumberFormat.asInstanceOf[js.Any], NumberFormatLinked = NumberFormatLinked.asInstanceOf[js.Any], NumberFormatLocal = NumberFormatLocal.asInstanceOf[js.Any], Offset = Offset.asInstanceOf[js.Any], Orientation = Orientation.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], ReadingOrder = ReadingOrder.asInstanceOf[js.Any], Select = js.Any.fromFunction0(Select))
    __obj.updateDynamic("PowerPoint.TickLabels_typekey")(PowerPointDotTickLabels_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TickLabels]
  }
  
  @scala.inline
  implicit class TickLabelsOps[Self <: TickLabels] (val x: Self) extends AnyVal {
    
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
    def setAlignment(value: Double): Self = this.set("Alignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoScaleFont(value: js.Any): Self = this.set("AutoScaleFont", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = this.set("Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelete(value: () => js.Any): Self = this.set("Delete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDepth(value: Double): Self = this.set("Depth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFont(value: ChartFont): Self = this.set("Font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormat(value: ChartFormat): Self = this.set("Format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiLevel(value: Boolean): Self = this.set("MultiLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberFormat(value: String): Self = this.set("NumberFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberFormatLinked(value: Boolean): Self = this.set("NumberFormatLinked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberFormatLocal(value: js.Any): Self = this.set("NumberFormatLocal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffset(value: Double): Self = this.set("Offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientation(value: XlTickLabelOrientation): Self = this.set("Orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPowerPointDotTickLabels_typekey(value: TickLabels): Self = this.set("PowerPoint.TickLabels_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadingOrder(value: Double): Self = this.set("ReadingOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelect(value: () => js.Any): Self = this.set("Select", js.Any.fromFunction0(value))
  }
}
