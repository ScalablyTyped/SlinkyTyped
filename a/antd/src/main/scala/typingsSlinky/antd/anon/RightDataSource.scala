package typingsSlinky.antd.anon

import typingsSlinky.antd.transferMod.KeyWise
import typingsSlinky.antd.transferMod.TransferItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RightDataSource[RecordType /* <: TransferItem */] extends StObject {
  
  var leftDataSource: js.Array[KeyWise[RecordType]] = js.native
  
  var rightDataSource: js.Array[KeyWise[RecordType]] = js.native
}
object RightDataSource {
  
  @scala.inline
  def apply[RecordType /* <: TransferItem */](leftDataSource: js.Array[KeyWise[RecordType]], rightDataSource: js.Array[KeyWise[RecordType]]): RightDataSource[RecordType] = {
    val __obj = js.Dynamic.literal(leftDataSource = leftDataSource.asInstanceOf[js.Any], rightDataSource = rightDataSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[RightDataSource[RecordType]]
  }
  
  @scala.inline
  implicit class RightDataSourceMutableBuilder[Self <: RightDataSource[_], RecordType /* <: TransferItem */] (val x: Self with RightDataSource[RecordType]) extends AnyVal {
    
    @scala.inline
    def setLeftDataSource(value: js.Array[KeyWise[RecordType]]): Self = StObject.set(x, "leftDataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftDataSourceVarargs(value: KeyWise[RecordType]*): Self = StObject.set(x, "leftDataSource", js.Array(value :_*))
    
    @scala.inline
    def setRightDataSource(value: js.Array[KeyWise[RecordType]]): Self = StObject.set(x, "rightDataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightDataSourceVarargs(value: KeyWise[RecordType]*): Self = StObject.set(x, "rightDataSource", js.Array(value :_*))
  }
}
