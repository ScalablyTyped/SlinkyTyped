package typingsSlinky.ejWebAll.ej

import typingsSlinky.ejWebAll.anon.Accept
import typingsSlinky.ejWebAll.anon.DataType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebApiAdaptor extends ODataAdaptor {
  
  def insert(dm: DataManager, data: js.Any): DataType = js.native
  
  def remove(dm: DataManager, value: js.Any): DataType = js.native
  def remove(dm: DataManager, value: js.Any, keyField: js.UndefOr[scala.Nothing], tableName: String): DataType = js.native
  def remove(dm: DataManager, value: js.Any, keyField: String): DataType = js.native
  def remove(dm: DataManager, value: js.Any, keyField: String, tableName: String): DataType = js.native
  
  def update(dm: DataManager, value: js.Any): Accept = js.native
  def update(dm: DataManager, value: js.Any, keyField: js.UndefOr[scala.Nothing], tableName: String): Accept = js.native
  def update(dm: DataManager, value: js.Any, keyField: String): Accept = js.native
  def update(dm: DataManager, value: js.Any, keyField: String, tableName: String): Accept = js.native
}
