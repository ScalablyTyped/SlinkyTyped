package typingsSlinky.azdata.mod.nb

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.azdata.azdataStrings.display_data
import typingsSlinky.azdata.azdataStrings.error
import typingsSlinky.azdata.azdataStrings.execute_result
import typingsSlinky.azdata.azdataStrings.stream
import typingsSlinky.azdata.azdataStrings.update_display_data
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.azdata.mod.nb.IDisplayData
  - typingsSlinky.azdata.mod.nb.IUpdateDisplayData
  - typingsSlinky.azdata.mod.nb.IExecuteResult
  - typingsSlinky.azdata.mod.nb.IErrorResult
  - typingsSlinky.azdata.mod.nb.IStreamResult
*/
trait Output extends StObject
object Output {
  
  @scala.inline
  def IDisplayData(data: StringDictionary[js.Any], output_type: display_data): typingsSlinky.azdata.mod.nb.IDisplayData = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], output_type = output_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.azdata.mod.nb.IDisplayData]
  }
  
  @scala.inline
  def IErrorResult(ename: String, evalue: String, output_type: error): typingsSlinky.azdata.mod.nb.IErrorResult = {
    val __obj = js.Dynamic.literal(ename = ename.asInstanceOf[js.Any], evalue = evalue.asInstanceOf[js.Any], output_type = output_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.azdata.mod.nb.IErrorResult]
  }
  
  @scala.inline
  def IExecuteResult(data: StringDictionary[js.Any], execution_count: Double, output_type: execute_result): typingsSlinky.azdata.mod.nb.IExecuteResult = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], execution_count = execution_count.asInstanceOf[js.Any], output_type = output_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.azdata.mod.nb.IExecuteResult]
  }
  
  @scala.inline
  def IStreamResult(name: StreamType, output_type: stream, text: MultilineString): typingsSlinky.azdata.mod.nb.IStreamResult = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], output_type = output_type.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.azdata.mod.nb.IStreamResult]
  }
  
  @scala.inline
  def IUpdateDisplayData(data: StringDictionary[js.Any], output_type: update_display_data): typingsSlinky.azdata.mod.nb.IUpdateDisplayData = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], output_type = output_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.azdata.mod.nb.IUpdateDisplayData]
  }
}
