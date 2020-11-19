package typingsSlinky.jupyterlabNbformat

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
  
  type MultilineString = java.lang.String | js.Array[java.lang.String]
  
  type OutputMetadata = typingsSlinky.luminoCoreutils.jsonMod.PartialJSONObject
}
