package typingsSlinky.extjs.Ext.chart

import typingsSlinky.extjs.Ext.IBase
import typingsSlinky.extjs.Ext.data.IModel
import typingsSlinky.extjs.Ext.draw.ISprite
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ILabel extends IBase {
  
  /** [Config Option] (Object) */
  var label: js.UndefOr[js.Any] = js.native
  
  /** [Method] Called each time a new label is created
    * @param storeItem Ext.data.Model The element of the store that is related to the sprite.
    * @param item Object The item related to the sprite. An item is an object containing the position of the shape used to describe the visualization and also pointing to the actual shape (circle, rectangle, path, etc).
    * @param i Number The index of the element created (i.e the first created label, second created label, etc).
    * @param display String The label.display type. May be false if the label is hidden
    * @returns Ext.draw.Sprite The created sprite that will draw the label.
    */
  var onCreateLabel: js.UndefOr[
    js.Function4[
      /* storeItem */ js.UndefOr[IModel], 
      /* item */ js.UndefOr[js.Any], 
      /* i */ js.UndefOr[Double], 
      /* display */ js.UndefOr[String], 
      ISprite
    ]
  ] = js.native
  
  /** [Method] Called for updating the position of the label
    * @param label Ext.draw.Sprite The sprite that draws the label.
    * @param storeItem Ext.data.Model The element of the store that is related to the sprite.
    * @param item Object The item related to the sprite. An item is an object containing the position of the shape used to describe the visualization and also pointing to the actual shape (circle, rectangle, path, etc).
    * @param i Number The index of the element to be updated (i.e. whether it is the first, second, third from the labelGroup)
    * @param display String The label.display type. May be false if the label is hidden
    * @param animate Boolean A boolean value to set or unset animations for the labels.
    * @param index Number The series index.
    */
  var onPlaceLabel: js.UndefOr[
    js.Function7[
      /* label */ js.UndefOr[ISprite], 
      /* storeItem */ js.UndefOr[IModel], 
      /* item */ js.UndefOr[js.Any], 
      /* i */ js.UndefOr[Double], 
      /* display */ js.UndefOr[String], 
      /* animate */ js.UndefOr[Boolean], 
      /* index */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.native
}
object ILabel {
  
  @scala.inline
  def apply(): ILabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ILabel]
  }
  
  @scala.inline
  implicit class ILabelMutableBuilder[Self <: ILabel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLabel(value: js.Any): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setOnCreateLabel(
      value: (/* storeItem */ js.UndefOr[IModel], /* item */ js.UndefOr[js.Any], /* i */ js.UndefOr[Double], /* display */ js.UndefOr[String]) => ISprite
    ): Self = StObject.set(x, "onCreateLabel", js.Any.fromFunction4(value))
    
    @scala.inline
    def setOnCreateLabelUndefined: Self = StObject.set(x, "onCreateLabel", js.undefined)
    
    @scala.inline
    def setOnPlaceLabel(
      value: (/* label */ js.UndefOr[ISprite], /* storeItem */ js.UndefOr[IModel], /* item */ js.UndefOr[js.Any], /* i */ js.UndefOr[Double], /* display */ js.UndefOr[String], /* animate */ js.UndefOr[Boolean], /* index */ js.UndefOr[Double]) => Unit
    ): Self = StObject.set(x, "onPlaceLabel", js.Any.fromFunction7(value))
    
    @scala.inline
    def setOnPlaceLabelUndefined: Self = StObject.set(x, "onPlaceLabel", js.undefined)
  }
}
