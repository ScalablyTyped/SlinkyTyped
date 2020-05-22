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
import typingsSlinky.devextreme.devextremeStrings.shape
import typingsSlinky.devextreme.devextremeStrings.star
import typingsSlinky.devextreme.devextremeStrings.storedData
import typingsSlinky.devextreme.devextremeStrings.summingJunction
import typingsSlinky.devextreme.devextremeStrings.terminator
import typingsSlinky.devextreme.devextremeStrings.text
import typingsSlinky.devextreme.devextremeStrings.triangle
import typingsSlinky.devextreme.devextremeStrings.verticalContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxDiagramShape extends dxDiagramItem {
  /** @name dxDiagramShape.text */
  var text: js.UndefOr[String] = js.undefined
  /** @name dxDiagramShape.type */
  var `type`: js.UndefOr[
    text | rectangle | ellipse | cross | triangle | diamond | heart | pentagon | octagon | star | arrowLeft | arrowTop | arrowRight | arrowBottom | arrowNorthSouth | arrowEastWest | process | decision | terminator | predefinedProcess | document | multipleDocuments | manualInput | preparation | data | database | hardDisk | internalStorage | paperTape | manualOperation | delay | storedData | display | merge | or | summingJunction | verticalContainer | horizontalContainer | cardWithImageOnLeft | cardWithImageOnTop | cardWithImageOnRight | String
  ] = js.undefined
}

object dxDiagramShape {
  @scala.inline
  def apply(
    dataItem: js.Any = null,
    id: String = null,
    itemType: shape | connector = null,
    text: String = null,
    `type`: text | rectangle | ellipse | cross | triangle | diamond | heart | pentagon | octagon | star | arrowLeft | arrowTop | arrowRight | arrowBottom | arrowNorthSouth | arrowEastWest | process | decision | terminator | predefinedProcess | document | multipleDocuments | manualInput | preparation | data | database | hardDisk | internalStorage | paperTape | manualOperation | delay | storedData | display | merge | or | summingJunction | verticalContainer | horizontalContainer | cardWithImageOnLeft | cardWithImageOnTop | cardWithImageOnRight | String = null
  ): dxDiagramShape = {
    val __obj = js.Dynamic.literal()
    if (dataItem != null) __obj.updateDynamic("dataItem")(dataItem.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (itemType != null) __obj.updateDynamic("itemType")(itemType.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxDiagramShape]
  }
}

