package typingsSlinky.devextreme.anon

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
import typingsSlinky.devextreme.devextremeStrings.containers
import typingsSlinky.devextreme.devextremeStrings.cross
import typingsSlinky.devextreme.devextremeStrings.custom
import typingsSlinky.devextreme.devextremeStrings.data
import typingsSlinky.devextreme.devextremeStrings.database
import typingsSlinky.devextreme.devextremeStrings.decision
import typingsSlinky.devextreme.devextremeStrings.delay
import typingsSlinky.devextreme.devextremeStrings.diamond
import typingsSlinky.devextreme.devextremeStrings.display
import typingsSlinky.devextreme.devextremeStrings.document
import typingsSlinky.devextreme.devextremeStrings.ellipse
import typingsSlinky.devextreme.devextremeStrings.flowchart
import typingsSlinky.devextreme.devextremeStrings.general
import typingsSlinky.devextreme.devextremeStrings.hardDisk
import typingsSlinky.devextreme.devextremeStrings.heart
import typingsSlinky.devextreme.devextremeStrings.horizontalContainer
import typingsSlinky.devextreme.devextremeStrings.icons
import typingsSlinky.devextreme.devextremeStrings.internalStorage
import typingsSlinky.devextreme.devextremeStrings.manualInput
import typingsSlinky.devextreme.devextremeStrings.manualOperation
import typingsSlinky.devextreme.devextremeStrings.merge
import typingsSlinky.devextreme.devextremeStrings.multipleDocuments
import typingsSlinky.devextreme.devextremeStrings.octagon
import typingsSlinky.devextreme.devextremeStrings.or
import typingsSlinky.devextreme.devextremeStrings.orgChart
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
import typingsSlinky.devextreme.devextremeStrings.texts
import typingsSlinky.devextreme.devextremeStrings.triangle
import typingsSlinky.devextreme.devextremeStrings.verticalContainer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Category extends StObject {
  
  var category: js.UndefOr[general | flowchart | orgChart | containers | custom | String] = js.native
  
  var displayMode: js.UndefOr[icons | texts] = js.native
  
  var enabled: js.UndefOr[Boolean] = js.native
  
  var shapeIconsPerRow: js.UndefOr[Double] = js.native
  
  var shapes: js.UndefOr[
    js.Array[
      text | rectangle | ellipse | cross | triangle | diamond | heart | pentagon | octagon | star | arrowLeft | arrowTop | arrowRight | arrowBottom | arrowNorthSouth | arrowEastWest | process | decision | terminator | predefinedProcess | document | multipleDocuments | manualInput | preparation | data | database | hardDisk | internalStorage | paperTape | manualOperation | delay | storedData | display | merge | connector | or | summingJunction | verticalContainer | horizontalContainer | cardWithImageOnLeft | cardWithImageOnTop | cardWithImageOnRight | String
    ]
  ] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object Category {
  
  @scala.inline
  def apply(): Category = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Category]
  }
  
  @scala.inline
  implicit class CategoryMutableBuilder[Self <: Category] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCategory(value: general | flowchart | orgChart | containers | custom | String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    @scala.inline
    def setDisplayMode(value: icons | texts): Self = StObject.set(x, "displayMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayModeUndefined: Self = StObject.set(x, "displayMode", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setShapeIconsPerRow(value: Double): Self = StObject.set(x, "shapeIconsPerRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShapeIconsPerRowUndefined: Self = StObject.set(x, "shapeIconsPerRow", js.undefined)
    
    @scala.inline
    def setShapes(
      value: js.Array[
          text | rectangle | ellipse | cross | triangle | diamond | heart | pentagon | octagon | star | arrowLeft | arrowTop | arrowRight | arrowBottom | arrowNorthSouth | arrowEastWest | process | decision | terminator | predefinedProcess | document | multipleDocuments | manualInput | preparation | data | database | hardDisk | internalStorage | paperTape | manualOperation | delay | storedData | display | merge | connector | or | summingJunction | verticalContainer | horizontalContainer | cardWithImageOnLeft | cardWithImageOnTop | cardWithImageOnRight | String
        ]
    ): Self = StObject.set(x, "shapes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShapesUndefined: Self = StObject.set(x, "shapes", js.undefined)
    
    @scala.inline
    def setShapesVarargs(
      value: (text | rectangle | ellipse | cross | triangle | diamond | heart | pentagon | octagon | star | arrowLeft | arrowTop | arrowRight | arrowBottom | arrowNorthSouth | arrowEastWest | process | decision | terminator | predefinedProcess | document | multipleDocuments | manualInput | preparation | data | database | hardDisk | internalStorage | paperTape | manualOperation | delay | storedData | display | merge | connector | or | summingJunction | verticalContainer | horizontalContainer | cardWithImageOnLeft | cardWithImageOnTop | cardWithImageOnRight | String)*
    ): Self = StObject.set(x, "shapes", js.Array(value :_*))
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
