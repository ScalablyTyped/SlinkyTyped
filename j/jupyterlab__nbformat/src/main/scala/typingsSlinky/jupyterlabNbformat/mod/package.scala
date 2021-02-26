package typingsSlinky.jupyterlabNbformat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type ExecutionCount = scala.Double | scala.Null
  
  type IAttachments = org.scalablytyped.runtime.StringDictionary[js.UndefOr[typingsSlinky.jupyterlabNbformat.mod.IMimeBundle]]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.jupyterlabNbformat.mod.IRawCell
    - typingsSlinky.jupyterlabNbformat.mod.IMarkdownCell
    - typingsSlinky.jupyterlabNbformat.mod.ICodeCell
    - typingsSlinky.jupyterlabNbformat.mod.IUnrecognizedCell
  */
  type ICell = typingsSlinky.jupyterlabNbformat.mod._ICell | typingsSlinky.jupyterlabNbformat.mod.IUnrecognizedCell
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.jupyterlabNbformat.mod.IUnrecognizedOutput
    - typingsSlinky.jupyterlabNbformat.mod.IExecuteResult
    - typingsSlinky.jupyterlabNbformat.mod.IDisplayData
    - typingsSlinky.jupyterlabNbformat.mod.IStream
    - typingsSlinky.jupyterlabNbformat.mod.IError
  */
  type IOutput = typingsSlinky.jupyterlabNbformat.mod._IOutput | typingsSlinky.jupyterlabNbformat.mod.IUnrecognizedOutput
  
  type IUnrecognizedCell = typingsSlinky.jupyterlabNbformat.mod.IBaseCell
  
  type IUnrecognizedOutput = typingsSlinky.jupyterlabNbformat.mod.IBaseOutput
  
  @scala.inline
  def MAJOR_VERSION: scala.Double = typingsSlinky.jupyterlabNbformat.mod.^.asInstanceOf[js.Dynamic].selectDynamic("MAJOR_VERSION").asInstanceOf[scala.Double]
  
  @scala.inline
  def MINOR_VERSION: scala.Double = typingsSlinky.jupyterlabNbformat.mod.^.asInstanceOf[js.Dynamic].selectDynamic("MINOR_VERSION").asInstanceOf[scala.Double]
  
  type MultilineString = java.lang.String | js.Array[java.lang.String]
  
  type OutputMetadata = typingsSlinky.luminoCoreutils.jsonMod.PartialJSONObject
  
  @scala.inline
  def isCode(cell: typingsSlinky.jupyterlabNbformat.mod.ICell): /* is @jupyterlab/nbformat.@jupyterlab/nbformat.ICodeCell */ scala.Boolean = typingsSlinky.jupyterlabNbformat.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isCode")(cell.asInstanceOf[js.Any]).asInstanceOf[/* is @jupyterlab/nbformat.@jupyterlab/nbformat.ICodeCell */ scala.Boolean]
  
  @scala.inline
  def isDisplayData(output: typingsSlinky.jupyterlabNbformat.mod.IOutput): /* is @jupyterlab/nbformat.@jupyterlab/nbformat.IDisplayData */ scala.Boolean = typingsSlinky.jupyterlabNbformat.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isDisplayData")(output.asInstanceOf[js.Any]).asInstanceOf[/* is @jupyterlab/nbformat.@jupyterlab/nbformat.IDisplayData */ scala.Boolean]
  
  @scala.inline
  def isDisplayUpdate(output: typingsSlinky.jupyterlabNbformat.mod.IOutput): /* is @jupyterlab/nbformat.@jupyterlab/nbformat.IDisplayUpdate */ scala.Boolean = typingsSlinky.jupyterlabNbformat.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isDisplayUpdate")(output.asInstanceOf[js.Any]).asInstanceOf[/* is @jupyterlab/nbformat.@jupyterlab/nbformat.IDisplayUpdate */ scala.Boolean]
  
  @scala.inline
  def isError(output: typingsSlinky.jupyterlabNbformat.mod.IOutput): /* is @jupyterlab/nbformat.@jupyterlab/nbformat.IError */ scala.Boolean = typingsSlinky.jupyterlabNbformat.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isError")(output.asInstanceOf[js.Any]).asInstanceOf[/* is @jupyterlab/nbformat.@jupyterlab/nbformat.IError */ scala.Boolean]
  
  @scala.inline
  def isExecuteResult(output: typingsSlinky.jupyterlabNbformat.mod.IOutput): /* is @jupyterlab/nbformat.@jupyterlab/nbformat.IExecuteResult */ scala.Boolean = typingsSlinky.jupyterlabNbformat.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isExecuteResult")(output.asInstanceOf[js.Any]).asInstanceOf[/* is @jupyterlab/nbformat.@jupyterlab/nbformat.IExecuteResult */ scala.Boolean]
  
  @scala.inline
  def isMarkdown(cell: typingsSlinky.jupyterlabNbformat.mod.ICell): /* is @jupyterlab/nbformat.@jupyterlab/nbformat.IMarkdownCell */ scala.Boolean = typingsSlinky.jupyterlabNbformat.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isMarkdown")(cell.asInstanceOf[js.Any]).asInstanceOf[/* is @jupyterlab/nbformat.@jupyterlab/nbformat.IMarkdownCell */ scala.Boolean]
  
  @scala.inline
  def isRaw(cell: typingsSlinky.jupyterlabNbformat.mod.ICell): /* is @jupyterlab/nbformat.@jupyterlab/nbformat.IRawCell */ scala.Boolean = typingsSlinky.jupyterlabNbformat.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isRaw")(cell.asInstanceOf[js.Any]).asInstanceOf[/* is @jupyterlab/nbformat.@jupyterlab/nbformat.IRawCell */ scala.Boolean]
  
  @scala.inline
  def isStream(output: typingsSlinky.jupyterlabNbformat.mod.IOutput): /* is @jupyterlab/nbformat.@jupyterlab/nbformat.IStream */ scala.Boolean = typingsSlinky.jupyterlabNbformat.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isStream")(output.asInstanceOf[js.Any]).asInstanceOf[/* is @jupyterlab/nbformat.@jupyterlab/nbformat.IStream */ scala.Boolean]
  
  @scala.inline
  def validateMimeValue(`type`: java.lang.String, value: typingsSlinky.jupyterlabNbformat.mod.MultilineString): scala.Boolean = (typingsSlinky.jupyterlabNbformat.mod.^.asInstanceOf[js.Dynamic].applyDynamic("validateMimeValue")(`type`.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  @scala.inline
  def validateMimeValue(`type`: java.lang.String, value: typingsSlinky.luminoCoreutils.jsonMod.PartialJSONObject): scala.Boolean = (typingsSlinky.jupyterlabNbformat.mod.^.asInstanceOf[js.Dynamic].applyDynamic("validateMimeValue")(`type`.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
}
