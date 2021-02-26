package typingsSlinky.officeJsPreview.Visio.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling "shape.toJSON()". */
@js.native
trait ShapeData extends StObject {
  
  /**
    *
    * Returns the Comments Collection. Read-only.
    *
    * [Api set:  1.1]
    */
  var comments: js.UndefOr[js.Array[CommentData]] = js.native
  
  /**
    *
    * Returns the Hyperlinks collection for a Shape object. Read-only.
    *
    * [Api set:  1.1]
    */
  var hyperlinks: js.UndefOr[js.Array[HyperlinkData]] = js.native
  
  /**
    *
    * Shape's identifier. Read-only.
    *
    * [Api set:  1.1]
    */
  var id: js.UndefOr[Double] = js.native
  
  /**
    *
    * Shape's name. Read-only.
    *
    * [Api set:  1.1]
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    *
    * Returns true, if shape is selected. User can set true to select the shape explicitly.
    *
    * [Api set:  1.1]
    */
  var select: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Returns the Shape's Data Section. Read-only.
    *
    * [Api set:  1.1]
    */
  var shapeDataItems: js.UndefOr[js.Array[ShapeDataItemData]] = js.native
  
  /**
    *
    * Gets SubShape Collection. Read-only.
    *
    * [Api set:  1.1]
    */
  var subShapes: js.UndefOr[js.Array[ShapeData]] = js.native
  
  /**
    *
    * Shape's text. Read-only.
    *
    * [Api set:  1.1]
    */
  var text: js.UndefOr[String] = js.native
  
  /**
    *
    * Returns the view of the shape. Read-only.
    *
    * [Api set:  1.1]
    */
  var view: js.UndefOr[ShapeViewData] = js.native
}
object ShapeData {
  
  @scala.inline
  def apply(): ShapeData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShapeData]
  }
  
  @scala.inline
  implicit class ShapeDataMutableBuilder[Self <: ShapeData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComments(value: js.Array[CommentData]): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
    
    @scala.inline
    def setCommentsVarargs(value: CommentData*): Self = StObject.set(x, "comments", js.Array(value :_*))
    
    @scala.inline
    def setHyperlinks(value: js.Array[HyperlinkData]): Self = StObject.set(x, "hyperlinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHyperlinksUndefined: Self = StObject.set(x, "hyperlinks", js.undefined)
    
    @scala.inline
    def setHyperlinksVarargs(value: HyperlinkData*): Self = StObject.set(x, "hyperlinks", js.Array(value :_*))
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setSelect(value: Boolean): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
    
    @scala.inline
    def setShapeDataItems(value: js.Array[ShapeDataItemData]): Self = StObject.set(x, "shapeDataItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShapeDataItemsUndefined: Self = StObject.set(x, "shapeDataItems", js.undefined)
    
    @scala.inline
    def setShapeDataItemsVarargs(value: ShapeDataItemData*): Self = StObject.set(x, "shapeDataItems", js.Array(value :_*))
    
    @scala.inline
    def setSubShapes(value: js.Array[ShapeData]): Self = StObject.set(x, "subShapes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubShapesUndefined: Self = StObject.set(x, "subShapes", js.undefined)
    
    @scala.inline
    def setSubShapesVarargs(value: ShapeData*): Self = StObject.set(x, "subShapes", js.Array(value :_*))
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    @scala.inline
    def setView(value: ShapeViewData): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
