package typingsSlinky.babylonjs

import org.scalajs.dom.raw.ProgressEvent
import typingsSlinky.babylonjs.fileRequestMod.IFileRequest
import typingsSlinky.babylonjs.fileToolsMod.LoadFileError
import typingsSlinky.babylonjs.iofflineproviderMod.IOfflineProvider
import typingsSlinky.babylonjs.shaderProcessingOptionsMod.ProcessingOptions
import typingsSlinky.babylonjs.thinEngineMod.ThinEngine
import typingsSlinky.babylonjs.webRequestMod.WebRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object processorsIndexMod {
  
  @JSImport("babylonjs/Engines/Processors/index", "ShaderCodeConditionNode")
  @js.native
  class ShaderCodeConditionNode ()
    extends typingsSlinky.babylonjs.shaderCodeConditionNodeMod.ShaderCodeConditionNode
  
  @JSImport("babylonjs/Engines/Processors/index", "ShaderCodeCursor")
  @js.native
  class ShaderCodeCursor ()
    extends typingsSlinky.babylonjs.shaderCodeCursorMod.ShaderCodeCursor
  
  @JSImport("babylonjs/Engines/Processors/index", "ShaderCodeInliner")
  @js.native
  class ShaderCodeInliner protected ()
    extends typingsSlinky.babylonjs.shaderCodeInlinerMod.ShaderCodeInliner {
    /**
      * Initializes the inliner
      * @param sourceCode shader code source to inline
      * @param numMaxIterations maximum number of iterations (used to detect recursive calls)
      */
    def this(sourceCode: String) = this()
    def this(sourceCode: String, numMaxIterations: Double) = this()
  }
  /* static members */
  object ShaderCodeInliner {
    
    @JSImport("babylonjs/Engines/Processors/index", "ShaderCodeInliner._RegexpFindFunctionNameAndType")
    @js.native
    val _RegexpFindFunctionNameAndType: js.Any = js.native
  }
  
  @JSImport("babylonjs/Engines/Processors/index", "ShaderCodeNode")
  @js.native
  class ShaderCodeNode ()
    extends typingsSlinky.babylonjs.shaderCodeNodeMod.ShaderCodeNode
  
  @JSImport("babylonjs/Engines/Processors/index", "ShaderCodeTestNode")
  @js.native
  class ShaderCodeTestNode ()
    extends typingsSlinky.babylonjs.shaderCodeTestNodeMod.ShaderCodeTestNode
  
  @JSImport("babylonjs/Engines/Processors/index", "ShaderDefineAndOperator")
  @js.native
  class ShaderDefineAndOperator ()
    extends typingsSlinky.babylonjs.expressionsIndexMod.ShaderDefineAndOperator
  
  @JSImport("babylonjs/Engines/Processors/index", "ShaderDefineArithmeticOperator")
  @js.native
  class ShaderDefineArithmeticOperator protected ()
    extends typingsSlinky.babylonjs.expressionsIndexMod.ShaderDefineArithmeticOperator {
    def this(define: String, operand: String, testValue: String) = this()
  }
  
  @JSImport("babylonjs/Engines/Processors/index", "ShaderDefineExpression")
  @js.native
  class ShaderDefineExpression ()
    extends typingsSlinky.babylonjs.expressionsIndexMod.ShaderDefineExpression
  /* static members */
  object ShaderDefineExpression {
    
    @JSImport("babylonjs/Engines/Processors/index", "ShaderDefineExpression")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("babylonjs/Engines/Processors/index", "ShaderDefineExpression._OperatorPriority")
    @js.native
    def _OperatorPriority: js.Any = js.native
    @scala.inline
    def _OperatorPriority_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_OperatorPriority")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Engines/Processors/index", "ShaderDefineExpression._Stack")
    @js.native
    def _Stack: js.Any = js.native
    @scala.inline
    def _Stack_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_Stack")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Engines/Processors/index", "ShaderDefineExpression.infixToPostfix")
    @js.native
    def infixToPostfix(infix: String): js.Array[String] = js.native
    
    @JSImport("babylonjs/Engines/Processors/index", "ShaderDefineExpression.postfixToInfix")
    @js.native
    def postfixToInfix(postfix: js.Array[String]): String = js.native
  }
  
  @JSImport("babylonjs/Engines/Processors/index", "ShaderDefineIsDefinedOperator")
  @js.native
  class ShaderDefineIsDefinedOperator protected ()
    extends typingsSlinky.babylonjs.expressionsIndexMod.ShaderDefineIsDefinedOperator {
    def this(define: String) = this()
    def this(define: String, not: Boolean) = this()
  }
  
  @JSImport("babylonjs/Engines/Processors/index", "ShaderDefineOrOperator")
  @js.native
  class ShaderDefineOrOperator ()
    extends typingsSlinky.babylonjs.expressionsIndexMod.ShaderDefineOrOperator
  
  @JSImport("babylonjs/Engines/Processors/index", "ShaderProcessor")
  @js.native
  class ShaderProcessor ()
    extends typingsSlinky.babylonjs.shaderProcessorMod.ShaderProcessor
  /* static members */
  object ShaderProcessor {
    
    @JSImport("babylonjs/Engines/Processors/index", "ShaderProcessor")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("babylonjs/Engines/Processors/index", "ShaderProcessor.Process")
    @js.native
    def Process(
      sourceCode: String,
      options: ProcessingOptions,
      callback: js.Function1[/* migratedCode */ String, Unit],
      engine: ThinEngine
    ): Unit = js.native
    
    @JSImport("babylonjs/Engines/Processors/index", "ShaderProcessor._BuildExpression")
    @js.native
    def _BuildExpression: js.Any = js.native
    @scala.inline
    def _BuildExpression_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_BuildExpression")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Engines/Processors/index", "ShaderProcessor._BuildSubExpression")
    @js.native
    def _BuildSubExpression: js.Any = js.native
    @scala.inline
    def _BuildSubExpression_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_BuildSubExpression")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Engines/Processors/index", "ShaderProcessor._EvaluatePreProcessors")
    @js.native
    def _EvaluatePreProcessors: js.Any = js.native
    @scala.inline
    def _EvaluatePreProcessors_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_EvaluatePreProcessors")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Engines/Processors/index", "ShaderProcessor._ExtractOperation")
    @js.native
    def _ExtractOperation: js.Any = js.native
    @scala.inline
    def _ExtractOperation_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_ExtractOperation")(x.asInstanceOf[js.Any])
    
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
    @JSImport("babylonjs/Engines/Processors/index", "ShaderProcessor._FileToolsLoadFile")
    @js.native
    def _FileToolsLoadFile(
      url: String,
      onSuccess: js.Function2[
          /* data */ String | js.typedarray.ArrayBuffer, 
          /* responseURL */ js.UndefOr[String], 
          Unit
        ]
    ): IFileRequest = js.native
    @JSImport("babylonjs/Engines/Processors/index", "ShaderProcessor._FileToolsLoadFile")
    @js.native
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
    @JSImport("babylonjs/Engines/Processors/index", "ShaderProcessor._FileToolsLoadFile")
    @js.native
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
    @JSImport("babylonjs/Engines/Processors/index", "ShaderProcessor._FileToolsLoadFile")
    @js.native
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
    @JSImport("babylonjs/Engines/Processors/index", "ShaderProcessor._FileToolsLoadFile")
    @js.native
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
    @JSImport("babylonjs/Engines/Processors/index", "ShaderProcessor._FileToolsLoadFile")
    @js.native
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
    @JSImport("babylonjs/Engines/Processors/index", "ShaderProcessor._FileToolsLoadFile")
    @js.native
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
    @JSImport("babylonjs/Engines/Processors/index", "ShaderProcessor._FileToolsLoadFile")
    @js.native
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
    @JSImport("babylonjs/Engines/Processors/index", "ShaderProcessor._FileToolsLoadFile")
    @js.native
    def _FileToolsLoadFile(
      url: String,
      onSuccess: js.Function2[
          /* data */ String | js.typedarray.ArrayBuffer, 
          /* responseURL */ js.UndefOr[String], 
          Unit
        ],
      onProgress: js.Function1[/* ev */ ProgressEvent, Unit]
    ): IFileRequest = js.native
    @JSImport("babylonjs/Engines/Processors/index", "ShaderProcessor._FileToolsLoadFile")
    @js.native
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
    @JSImport("babylonjs/Engines/Processors/index", "ShaderProcessor._FileToolsLoadFile")
    @js.native
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
    @JSImport("babylonjs/Engines/Processors/index", "ShaderProcessor._FileToolsLoadFile")
    @js.native
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
    @JSImport("babylonjs/Engines/Processors/index", "ShaderProcessor._FileToolsLoadFile")
    @js.native
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
    @JSImport("babylonjs/Engines/Processors/index", "ShaderProcessor._FileToolsLoadFile")
    @js.native
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
    @JSImport("babylonjs/Engines/Processors/index", "ShaderProcessor._FileToolsLoadFile")
    @js.native
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
    @JSImport("babylonjs/Engines/Processors/index", "ShaderProcessor._FileToolsLoadFile")
    @js.native
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
    
    @JSImport("babylonjs/Engines/Processors/index", "ShaderProcessor._MoveCursor")
    @js.native
    def _MoveCursor: js.Any = js.native
    
    @JSImport("babylonjs/Engines/Processors/index", "ShaderProcessor._MoveCursorWithinIf")
    @js.native
    def _MoveCursorWithinIf: js.Any = js.native
    @scala.inline
    def _MoveCursorWithinIf_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_MoveCursorWithinIf")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def _MoveCursor_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_MoveCursor")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Engines/Processors/index", "ShaderProcessor._PreparePreProcessors")
    @js.native
    def _PreparePreProcessors: js.Any = js.native
    @scala.inline
    def _PreparePreProcessors_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_PreparePreProcessors")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Engines/Processors/index", "ShaderProcessor._ProcessIncludes")
    @js.native
    def _ProcessIncludes: js.Any = js.native
    @scala.inline
    def _ProcessIncludes_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_ProcessIncludes")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Engines/Processors/index", "ShaderProcessor._ProcessPrecision")
    @js.native
    def _ProcessPrecision: js.Any = js.native
    @scala.inline
    def _ProcessPrecision_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_ProcessPrecision")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Engines/Processors/index", "ShaderProcessor._ProcessShaderConversion")
    @js.native
    def _ProcessShaderConversion: js.Any = js.native
    @scala.inline
    def _ProcessShaderConversion_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_ProcessShaderConversion")(x.asInstanceOf[js.Any])
  }
}
