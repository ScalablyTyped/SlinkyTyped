package typingsSlinky.jupyterlabNbformat.mod

import typingsSlinky.jupyterlabNbformat.jupyterlabNbformatStrings.display_data
import typingsSlinky.jupyterlabNbformat.jupyterlabNbformatStrings.error
import typingsSlinky.jupyterlabNbformat.jupyterlabNbformatStrings.execute_result
import typingsSlinky.jupyterlabNbformat.jupyterlabNbformatStrings.stream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _IOutput extends StObject
object _IOutput {
  
  @scala.inline
  def IDisplayData(data: IMimeBundle, metadata: OutputMetadata, output_type: display_data): typingsSlinky.jupyterlabNbformat.mod.IDisplayData = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], output_type = output_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.jupyterlabNbformat.mod.IDisplayData]
  }
  
  @scala.inline
  def IError(ename: String, evalue: String, output_type: error, traceback: js.Array[String]): typingsSlinky.jupyterlabNbformat.mod.IError = {
    val __obj = js.Dynamic.literal(ename = ename.asInstanceOf[js.Any], evalue = evalue.asInstanceOf[js.Any], output_type = output_type.asInstanceOf[js.Any], traceback = traceback.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.jupyterlabNbformat.mod.IError]
  }
  
  @scala.inline
  def IExecuteResult(data: IMimeBundle, metadata: OutputMetadata, output_type: execute_result): typingsSlinky.jupyterlabNbformat.mod.IExecuteResult = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], output_type = output_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.jupyterlabNbformat.mod.IExecuteResult]
  }
  
  @scala.inline
  def IStream(name: StreamType, output_type: stream, text: MultilineString): typingsSlinky.jupyterlabNbformat.mod.IStream = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], output_type = output_type.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.jupyterlabNbformat.mod.IStream]
  }
}
