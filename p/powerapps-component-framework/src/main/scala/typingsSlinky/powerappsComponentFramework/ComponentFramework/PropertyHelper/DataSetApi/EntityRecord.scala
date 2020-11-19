package typingsSlinky.powerappsComponentFramework.ComponentFramework.PropertyHelper.DataSetApi

import typingsSlinky.powerappsComponentFramework.ComponentFramework.EntityReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Base interface for dataset record result. Supports value retrival by column name.
  */
@js.native
trait EntityRecord extends js.Object {
  
  /**
    * Get the current formatted value of this record column.
    * @param columnName Column name of the record
    */
  def getFormattedValue(columnName: String): String = js.native
  
  /**
    * Get the object that encapsulates an Entity Reference as a plain object
    */
  def getNamedReference(): EntityReference = js.native
  
  /**
    * Get the record ID
    */
  def getRecordId(): String = js.native
  
  /**
    * Get the raw value of the record's column
    * @param columnName Column name of the record
    */
  def getValue(columnName: String): String | js.Date | Double | (js.Array[Double | EntityReference]) | Boolean | EntityReference = js.native
}
object EntityRecord {
  
  @scala.inline
  def apply(
    getFormattedValue: String => String,
    getNamedReference: () => EntityReference,
    getRecordId: () => String,
    getValue: String => String | js.Date | Double | (js.Array[Double | EntityReference]) | Boolean | EntityReference
  ): EntityRecord = {
    val __obj = js.Dynamic.literal(getFormattedValue = js.Any.fromFunction1(getFormattedValue), getNamedReference = js.Any.fromFunction0(getNamedReference), getRecordId = js.Any.fromFunction0(getRecordId), getValue = js.Any.fromFunction1(getValue))
    __obj.asInstanceOf[EntityRecord]
  }
  
  @scala.inline
  implicit class EntityRecordOps[Self <: EntityRecord] (val x: Self) extends AnyVal {
    
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
    def setGetFormattedValue(value: String => String): Self = this.set("getFormattedValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetNamedReference(value: () => EntityReference): Self = this.set("getNamedReference", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetRecordId(value: () => String): Self = this.set("getRecordId", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetValue(
      value: String => String | js.Date | Double | (js.Array[Double | EntityReference]) | Boolean | EntityReference
    ): Self = this.set("getValue", js.Any.fromFunction1(value))
  }
}
