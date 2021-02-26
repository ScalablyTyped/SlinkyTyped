package typingsSlinky.activexLibreoffice.com_.sun.star.form

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsSlinky.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * allows to create columns to be added into a grid control model.
  *
  * Grid columns (more precise: models of grid columns) are direct children of the grid control model they belong to. Grid columns can't be created on a
  * global service factory, instead, you need to create them on the grid, where you want to insert them later on.
  * @see com.sun.star.form.component.GridControl
  */
@js.native
trait XGridColumnFactory extends XInterface {
  
  /**
    * returns a list of available column types.
    * @returns a list of column types.
    */
  val ColumnTypes: SafeArray[String] = js.native
  
  /**
    * creates a new column object
    * @param aColumnType the type of column to be created
    * @returns the new column object
    * @throws com::sun::star::lang::IllegalArgumentException if aColumnType is not available.
    */
  def createColumn(aColumnType: String): XPropertySet = js.native
  
  /**
    * returns a list of available column types.
    * @returns a list of column types.
    */
  def getColumnTypes(): SafeArray[String] = js.native
}
object XGridColumnFactory {
  
  @scala.inline
  def apply(
    ColumnTypes: SafeArray[String],
    acquire: () => Unit,
    createColumn: String => XPropertySet,
    getColumnTypes: () => SafeArray[String],
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XGridColumnFactory = {
    val __obj = js.Dynamic.literal(ColumnTypes = ColumnTypes.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), createColumn = js.Any.fromFunction1(createColumn), getColumnTypes = js.Any.fromFunction0(getColumnTypes), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XGridColumnFactory]
  }
  
  @scala.inline
  implicit class XGridColumnFactoryMutableBuilder[Self <: XGridColumnFactory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumnTypes(value: SafeArray[String]): Self = StObject.set(x, "ColumnTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateColumn(value: String => XPropertySet): Self = StObject.set(x, "createColumn", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetColumnTypes(value: () => SafeArray[String]): Self = StObject.set(x, "getColumnTypes", js.Any.fromFunction0(value))
  }
}
