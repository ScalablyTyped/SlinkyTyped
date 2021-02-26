package typingsSlinky.googleAppsScript.GoogleAppsScript.Forms

import typingsSlinky.googleAppsScript.GoogleAppsScript.Integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A question item, presented as a grid of columns and rows, that allows the respondent to select
  * one choice per row from a sequence of radio buttons. Items can be accessed or created from a
  * Form.
  *
  *     // Open a form by ID and add a new grid item.
  *     var form = FormApp.openById('1234567890abcdefghijklmnopqrstuvwxyz');
  *     var item = form.addGridItem();
  *     item.setTitle('Rate your interests')
  *         .setRows(['Cars', 'Computers', 'Celebrities'])
  *         .setColumns(['Boring', 'So-so', 'Interesting']);
  */
@js.native
trait GridItem extends StObject {
  
  def clearValidation(): GridItem = js.native
  
  def createResponse(responses: js.Array[String]): ItemResponse = js.native
  
  def duplicate(): GridItem = js.native
  
  def getColumns(): js.Array[String] = js.native
  
  def getHelpText(): String = js.native
  
  def getId(): Integer = js.native
  
  def getIndex(): Integer = js.native
  
  def getRows(): js.Array[String] = js.native
  
  def getTitle(): String = js.native
  
  def getType(): ItemType = js.native
  
  def isRequired(): Boolean = js.native
  
  def setColumns(columns: js.Array[String]): GridItem = js.native
  
  def setHelpText(text: String): GridItem = js.native
  
  def setRequired(enabled: Boolean): GridItem = js.native
  
  def setRows(rows: js.Array[String]): GridItem = js.native
  
  def setTitle(title: String): GridItem = js.native
  
  def setValidation(validation: GridValidation): GridItem = js.native
}
object GridItem {
  
  @scala.inline
  def apply(
    clearValidation: () => GridItem,
    createResponse: js.Array[String] => ItemResponse,
    duplicate: () => GridItem,
    getColumns: () => js.Array[String],
    getHelpText: () => String,
    getId: () => Integer,
    getIndex: () => Integer,
    getRows: () => js.Array[String],
    getTitle: () => String,
    getType: () => ItemType,
    isRequired: () => Boolean,
    setColumns: js.Array[String] => GridItem,
    setHelpText: String => GridItem,
    setRequired: Boolean => GridItem,
    setRows: js.Array[String] => GridItem,
    setTitle: String => GridItem,
    setValidation: GridValidation => GridItem
  ): GridItem = {
    val __obj = js.Dynamic.literal(clearValidation = js.Any.fromFunction0(clearValidation), createResponse = js.Any.fromFunction1(createResponse), duplicate = js.Any.fromFunction0(duplicate), getColumns = js.Any.fromFunction0(getColumns), getHelpText = js.Any.fromFunction0(getHelpText), getId = js.Any.fromFunction0(getId), getIndex = js.Any.fromFunction0(getIndex), getRows = js.Any.fromFunction0(getRows), getTitle = js.Any.fromFunction0(getTitle), getType = js.Any.fromFunction0(getType), isRequired = js.Any.fromFunction0(isRequired), setColumns = js.Any.fromFunction1(setColumns), setHelpText = js.Any.fromFunction1(setHelpText), setRequired = js.Any.fromFunction1(setRequired), setRows = js.Any.fromFunction1(setRows), setTitle = js.Any.fromFunction1(setTitle), setValidation = js.Any.fromFunction1(setValidation))
    __obj.asInstanceOf[GridItem]
  }
  
  @scala.inline
  implicit class GridItemMutableBuilder[Self <: GridItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClearValidation(value: () => GridItem): Self = StObject.set(x, "clearValidation", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCreateResponse(value: js.Array[String] => ItemResponse): Self = StObject.set(x, "createResponse", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDuplicate(value: () => GridItem): Self = StObject.set(x, "duplicate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetColumns(value: () => js.Array[String]): Self = StObject.set(x, "getColumns", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetHelpText(value: () => String): Self = StObject.set(x, "getHelpText", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetId(value: () => Integer): Self = StObject.set(x, "getId", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetIndex(value: () => Integer): Self = StObject.set(x, "getIndex", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetRows(value: () => js.Array[String]): Self = StObject.set(x, "getRows", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTitle(value: () => String): Self = StObject.set(x, "getTitle", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetType(value: () => ItemType): Self = StObject.set(x, "getType", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsRequired(value: () => Boolean): Self = StObject.set(x, "isRequired", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetColumns(value: js.Array[String] => GridItem): Self = StObject.set(x, "setColumns", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetHelpText(value: String => GridItem): Self = StObject.set(x, "setHelpText", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetRequired(value: Boolean => GridItem): Self = StObject.set(x, "setRequired", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetRows(value: js.Array[String] => GridItem): Self = StObject.set(x, "setRows", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetTitle(value: String => GridItem): Self = StObject.set(x, "setTitle", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetValidation(value: GridValidation => GridItem): Self = StObject.set(x, "setValidation", js.Any.fromFunction1(value))
  }
}
