package typingsSlinky.babylonjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Engines/Processors/shaderCodeInliner", JSImport.Namespace)
@js.native
object shaderCodeInlinerMod extends js.Object {
  
  @js.native
  class ShaderCodeInliner protected () extends js.Object {
    /**
      * Initializes the inliner
      * @param sourceCode shader code source to inline
      * @param numMaxIterations maximum number of iterations (used to detect recursive calls)
      */
    def this(sourceCode: String) = this()
    def this(sourceCode: String, numMaxIterations: Double) = this()
    
    var _collectFunctions: js.Any = js.native
    
    var _escapeRegExp: js.Any = js.native
    
    var _extractBetweenMarkers: js.Any = js.native
    
    var _findBackward: js.Any = js.native
    
    var _functionDescr: js.Any = js.native
    
    var _numMaxIterations: js.Any = js.native
    
    var _processInlining: js.Any = js.native
    
    var _removeComments: js.Any = js.native
    
    var _replaceFunctionCallsByCode: js.Any = js.native
    
    var _replaceNames: js.Any = js.native
    
    var _skipWhitespaces: js.Any = js.native
    
    var _sourceCode: js.Any = js.native
    
    /** Gets the code after the inlining process */
    def code: String = js.native
    
    /** Gets or sets the debug mode */
    var debug: Boolean = js.native
    
    /** Gets or sets the token used to mark the functions to inline */
    var inlineToken: String = js.native
    
    /**
      * Start the processing of the shader code
      */
    def processCode(): Unit = js.native
  }
  /* static members */
  @js.native
  object ShaderCodeInliner extends js.Object {
    
    val _RegexpFindFunctionNameAndType: js.Any = js.native
  }
}
