package typingsSlinky.devextreme.mod.DevExpress.ui

import typingsSlinky.devextreme.devextremeStrings.arrowBottom
import typingsSlinky.devextreme.devextremeStrings.arrowEastWest
import typingsSlinky.devextreme.devextremeStrings.arrowLeft
import typingsSlinky.devextreme.devextremeStrings.arrowNorthSouth
import typingsSlinky.devextreme.devextremeStrings.arrowRight
import typingsSlinky.devextreme.devextremeStrings.arrowTop
import typingsSlinky.devextreme.devextremeStrings.cardWithImageOnLeft
import typingsSlinky.devextreme.devextremeStrings.cardWithImageOnRight
import typingsSlinky.devextreme.devextremeStrings.cardWithImageOnTop
import typingsSlinky.devextreme.devextremeStrings.connector
import typingsSlinky.devextreme.devextremeStrings.cross
import typingsSlinky.devextreme.devextremeStrings.data
import typingsSlinky.devextreme.devextremeStrings.database
import typingsSlinky.devextreme.devextremeStrings.decision
import typingsSlinky.devextreme.devextremeStrings.delay
import typingsSlinky.devextreme.devextremeStrings.diamond
import typingsSlinky.devextreme.devextremeStrings.display
import typingsSlinky.devextreme.devextremeStrings.document
import typingsSlinky.devextreme.devextremeStrings.ellipse
import typingsSlinky.devextreme.devextremeStrings.hardDisk
import typingsSlinky.devextreme.devextremeStrings.heart
import typingsSlinky.devextreme.devextremeStrings.horizontalContainer
import typingsSlinky.devextreme.devextremeStrings.internalStorage
import typingsSlinky.devextreme.devextremeStrings.manualInput
import typingsSlinky.devextreme.devextremeStrings.manualOperation
import typingsSlinky.devextreme.devextremeStrings.merge
import typingsSlinky.devextreme.devextremeStrings.multipleDocuments
import typingsSlinky.devextreme.devextremeStrings.octagon
import typingsSlinky.devextreme.devextremeStrings.or
import typingsSlinky.devextreme.devextremeStrings.paperTape
import typingsSlinky.devextreme.devextremeStrings.pentagon
import typingsSlinky.devextreme.devextremeStrings.predefinedProcess
import typingsSlinky.devextreme.devextremeStrings.preparation
import typingsSlinky.devextreme.devextremeStrings.process
import typingsSlinky.devextreme.devextremeStrings.rectangle
import typingsSlinky.devextreme.devextremeStrings.star
import typingsSlinky.devextreme.devextremeStrings.storedData
import typingsSlinky.devextreme.devextremeStrings.summingJunction
import typingsSlinky.devextreme.devextremeStrings.terminator
import typingsSlinky.devextreme.devextremeStrings.text
import typingsSlinky.devextreme.devextremeStrings.triangle
import typingsSlinky.devextreme.devextremeStrings.verticalContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxDiagramShape extends dxDiagramItem {
  
  /** @name dxDiagramShape.text */
  var text: js.UndefOr[String] = js.native
  
  /** @name dxDiagramShape.type */
  var `type`: js.UndefOr[
    text | rectangle | ellipse | cross | triangle | diamond | heart | pentagon | octagon | star | arrowLeft | arrowTop | arrowRight | arrowBottom | arrowNorthSouth | arrowEastWest | process | decision | terminator | predefinedProcess | document | multipleDocuments | manualInput | preparation | data | database | hardDisk | internalStorage | paperTape | manualOperation | delay | storedData | display | merge | connector | or | summingJunction | verticalContainer | horizontalContainer | cardWithImageOnLeft | cardWithImageOnTop | cardWithImageOnRight | String
  ] = js.native
}
object dxDiagramShape {
  
  @scala.inline
  def apply(): dxDiagramShape = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxDiagramShape]
  }
  
  @scala.inline
  implicit class dxDiagramShapeOps[Self <: dxDiagramShape] (val x: Self) extends AnyVal {
    
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
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    
    @scala.inline
    def setType(
      value: text | rectangle | ellipse | cross | triangle | diamond | heart | pentagon | octagon | star | arrowLeft | arrowTop | arrowRight | arrowBottom | arrowNorthSouth | arrowEastWest | process | decision | terminator | predefinedProcess | document | multipleDocuments | manualInput | preparation | data | database | hardDisk | internalStorage | paperTape | manualOperation | delay | storedData | display | merge | connector | or | summingJunction | verticalContainer | horizontalContainer | cardWithImageOnLeft | cardWithImageOnTop | cardWithImageOnRight | String
    ): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
