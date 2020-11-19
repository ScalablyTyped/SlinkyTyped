package typingsSlinky.babylonjs

import org.scalajs.dom.raw.ProgressEvent
import typingsSlinky.babylonjs.fileRequestMod.IFileRequest
import typingsSlinky.babylonjs.fileToolsMod.LoadFileError
import typingsSlinky.babylonjs.iofflineproviderMod.IOfflineProvider
import typingsSlinky.babylonjs.shaderProcessingOptionsMod.ProcessingOptions
import typingsSlinky.babylonjs.webRequestMod.WebRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Engines/Processors/index", JSImport.Namespace)
@js.native
object processorsIndexMod extends js.Object {
  
  @js.native
  class ShaderCodeConditionNode ()
    extends typingsSlinky.babylonjs.shaderCodeConditionNodeMod.ShaderCodeConditionNode
  
  @js.native
  class ShaderCodeCursor ()
    extends typingsSlinky.babylonjs.shaderCodeCursorMod.ShaderCodeCursor
  
  @js.native
  class ShaderCodeNode ()
    extends typingsSlinky.babylonjs.shaderCodeNodeMod.ShaderCodeNode
  
  @js.native
  class ShaderCodeTestNode ()
    extends typingsSlinky.babylonjs.shaderCodeTestNodeMod.ShaderCodeTestNode
  
  @js.native
  class ShaderDefineAndOperator ()
    extends typingsSlinky.babylonjs.shaderDefineAndOperatorMod.ShaderDefineAndOperator
  
  @js.native
  class ShaderDefineArithmeticOperator protected ()
    extends typingsSlinky.babylonjs.expressionsIndexMod.ShaderDefineArithmeticOperator {
    def this(define: String, operand: String, testValue: String) = this()
  }
  
  @js.native
  class ShaderDefineExpression ()
    extends typingsSlinky.babylonjs.shaderDefineExpressionMod.ShaderDefineExpression
  
  @js.native
  class ShaderDefineIsDefinedOperator protected ()
    extends typingsSlinky.babylonjs.expressionsIndexMod.ShaderDefineIsDefinedOperator {
    def this(define: String) = this()
    def this(define: String, not: Boolean) = this()
  }
  
  @js.native
  class ShaderDefineOrOperator ()
    extends typingsSlinky.babylonjs.shaderDefineOrOperatorMod.ShaderDefineOrOperator
  
  @js.native
  class ShaderProcessor ()
    extends typingsSlinky.babylonjs.shaderProcessorMod.ShaderProcessor
  /* static members */
  @js.native
  object ShaderProcessor extends js.Object {
    
    def Process(
      sourceCode: String,
      options: ProcessingOptions,
      callback: js.Function1[/* migratedCode */ String, Unit]
    ): Unit = js.native
    
    var _BuildExpression: js.Any = js.native
    
    var _BuildSubExpression: js.Any = js.native
    
    var _EvaluatePreProcessors: js.Any = js.native
    
    var _ExtractOperation: js.Any = js.native
    
    /**
      * Loads a file from a url
      * @param url url to load
      * @param onSuccess callback called when the file successfully loads
      * @param onProgress callback called while file is loading (if the server supports this mode)
      * @param offlineProvider defines the offline provider for caching
      * @param useArrayBuffer defines a boolean indicating that date must be returned as ArrayBuffer
      * @param onError callback called when the file fails to load
      * @returns a file request object
      * @hidden
      */
    def _FileToolsLoadFile(
      url: String,
      onSuccess: js.Function2[
          /* data */ String | js.typedarray.ArrayBuffer, 
          /* responseURL */ js.UndefOr[String], 
          Unit
        ]
    ): IFileRequest = js.native
    def _FileToolsLoadFile(
      url: String,
      onSuccess: js.Function2[
          /* data */ String | js.typedarray.ArrayBuffer, 
          /* responseURL */ js.UndefOr[String], 
          Unit
        ],
      onProgress: js.UndefOr[scala.Nothing],
      offlineProvider: js.UndefOr[scala.Nothing],
      useArrayBuffer: js.UndefOr[scala.Nothing],
      onError: js.Function2[
          /* request */ js.UndefOr[WebRequest], 
          /* exception */ js.UndefOr[LoadFileError], 
          Unit
        ]
    ): IFileRequest = js.native
    def _FileToolsLoadFile(
      url: String,
      onSuccess: js.Function2[
          /* data */ String | js.typedarray.ArrayBuffer, 
          /* responseURL */ js.UndefOr[String], 
          Unit
        ],
      onProgress: js.UndefOr[scala.Nothing],
      offlineProvider: js.UndefOr[scala.Nothing],
      useArrayBuffer: Boolean
    ): IFileRequest = js.native
    def _FileToolsLoadFile(
      url: String,
      onSuccess: js.Function2[
          /* data */ String | js.typedarray.ArrayBuffer, 
          /* responseURL */ js.UndefOr[String], 
          Unit
        ],
      onProgress: js.UndefOr[scala.Nothing],
      offlineProvider: js.UndefOr[scala.Nothing],
      useArrayBuffer: Boolean,
      onError: js.Function2[
          /* request */ js.UndefOr[WebRequest], 
          /* exception */ js.UndefOr[LoadFileError], 
          Unit
        ]
    ): IFileRequest = js.native
    def _FileToolsLoadFile(
      url: String,
      onSuccess: js.Function2[
          /* data */ String | js.typedarray.ArrayBuffer, 
          /* responseURL */ js.UndefOr[String], 
          Unit
        ],
      onProgress: js.UndefOr[scala.Nothing],
      offlineProvider: IOfflineProvider
    ): IFileRequest = js.native
    def _FileToolsLoadFile(
      url: String,
      onSuccess: js.Function2[
          /* data */ String | js.typedarray.ArrayBuffer, 
          /* responseURL */ js.UndefOr[String], 
          Unit
        ],
      onProgress: js.UndefOr[scala.Nothing],
      offlineProvider: IOfflineProvider,
      useArrayBuffer: js.UndefOr[scala.Nothing],
      onError: js.Function2[
          /* request */ js.UndefOr[WebRequest], 
          /* exception */ js.UndefOr[LoadFileError], 
          Unit
        ]
    ): IFileRequest = js.native
    def _FileToolsLoadFile(
      url: String,
      onSuccess: js.Function2[
          /* data */ String | js.typedarray.ArrayBuffer, 
          /* responseURL */ js.UndefOr[String], 
          Unit
        ],
      onProgress: js.UndefOr[scala.Nothing],
      offlineProvider: IOfflineProvider,
      useArrayBuffer: Boolean
    ): IFileRequest = js.native
    def _FileToolsLoadFile(
      url: String,
      onSuccess: js.Function2[
          /* data */ String | js.typedarray.ArrayBuffer, 
          /* responseURL */ js.UndefOr[String], 
          Unit
        ],
      onProgress: js.UndefOr[scala.Nothing],
      offlineProvider: IOfflineProvider,
      useArrayBuffer: Boolean,
      onError: js.Function2[
          /* request */ js.UndefOr[WebRequest], 
          /* exception */ js.UndefOr[LoadFileError], 
          Unit
        ]
    ): IFileRequest = js.native
    def _FileToolsLoadFile(
      url: String,
      onSuccess: js.Function2[
          /* data */ String | js.typedarray.ArrayBuffer, 
          /* responseURL */ js.UndefOr[String], 
          Unit
        ],
      onProgress: js.Function1[/* ev */ ProgressEvent, Unit]
    ): IFileRequest = js.native
    def _FileToolsLoadFile(
      url: String,
      onSuccess: js.Function2[
          /* data */ String | js.typedarray.ArrayBuffer, 
          /* responseURL */ js.UndefOr[String], 
          Unit
        ],
      onProgress: js.Function1[/* ev */ ProgressEvent, Unit],
      offlineProvider: js.UndefOr[scala.Nothing],
      useArrayBuffer: js.UndefOr[scala.Nothing],
      onError: js.Function2[
          /* request */ js.UndefOr[WebRequest], 
          /* exception */ js.UndefOr[LoadFileError], 
          Unit
        ]
    ): IFileRequest = js.native
    def _FileToolsLoadFile(
      url: String,
      onSuccess: js.Function2[
          /* data */ String | js.typedarray.ArrayBuffer, 
          /* responseURL */ js.UndefOr[String], 
          Unit
        ],
      onProgress: js.Function1[/* ev */ ProgressEvent, Unit],
      offlineProvider: js.UndefOr[scala.Nothing],
      useArrayBuffer: Boolean
    ): IFileRequest = js.native
    def _FileToolsLoadFile(
      url: String,
      onSuccess: js.Function2[
          /* data */ String | js.typedarray.ArrayBuffer, 
          /* responseURL */ js.UndefOr[String], 
          Unit
        ],
      onProgress: js.Function1[/* ev */ ProgressEvent, Unit],
      offlineProvider: js.UndefOr[scala.Nothing],
      useArrayBuffer: Boolean,
      onError: js.Function2[
          /* request */ js.UndefOr[WebRequest], 
          /* exception */ js.UndefOr[LoadFileError], 
          Unit
        ]
    ): IFileRequest = js.native
    def _FileToolsLoadFile(
      url: String,
      onSuccess: js.Function2[
          /* data */ String | js.typedarray.ArrayBuffer, 
          /* responseURL */ js.UndefOr[String], 
          Unit
        ],
      onProgress: js.Function1[/* ev */ ProgressEvent, Unit],
      offlineProvider: IOfflineProvider
    ): IFileRequest = js.native
    def _FileToolsLoadFile(
      url: String,
      onSuccess: js.Function2[
          /* data */ String | js.typedarray.ArrayBuffer, 
          /* responseURL */ js.UndefOr[String], 
          Unit
        ],
      onProgress: js.Function1[/* ev */ ProgressEvent, Unit],
      offlineProvider: IOfflineProvider,
      useArrayBuffer: js.UndefOr[scala.Nothing],
      onError: js.Function2[
          /* request */ js.UndefOr[WebRequest], 
          /* exception */ js.UndefOr[LoadFileError], 
          Unit
        ]
    ): IFileRequest = js.native
    def _FileToolsLoadFile(
      url: String,
      onSuccess: js.Function2[
          /* data */ String | js.typedarray.ArrayBuffer, 
          /* responseURL */ js.UndefOr[String], 
          Unit
        ],
      onProgress: js.Function1[/* ev */ ProgressEvent, Unit],
      offlineProvider: IOfflineProvider,
      useArrayBuffer: Boolean
    ): IFileRequest = js.native
    def _FileToolsLoadFile(
      url: String,
      onSuccess: js.Function2[
          /* data */ String | js.typedarray.ArrayBuffer, 
          /* responseURL */ js.UndefOr[String], 
          Unit
        ],
      onProgress: js.Function1[/* ev */ ProgressEvent, Unit],
      offlineProvider: IOfflineProvider,
      useArrayBuffer: Boolean,
      onError: js.Function2[
          /* request */ js.UndefOr[WebRequest], 
          /* exception */ js.UndefOr[LoadFileError], 
          Unit
        ]
    ): IFileRequest = js.native
    
    var _MoveCursor: js.Any = js.native
    
    var _MoveCursorWithinIf: js.Any = js.native
    
    var _PreparePreProcessors: js.Any = js.native
    
    var _ProcessIncludes: js.Any = js.native
    
    var _ProcessPrecision: js.Any = js.native
    
    var _ProcessShaderConversion: js.Any = js.native
  }
}
