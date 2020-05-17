package typingsSlinky.babylonjs.BABYLON

import typingsSlinky.babylonjs.WebGLUniformLocation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Effect extends IDisposable {
  var _allFallbacksProcessed: js.Any = js.native
  var _attributeLocationByName: js.Any = js.native
  var _attributes: js.Any = js.native
  var _attributesNames: js.Any = js.native
  /** @hidden */
  var _bonesComputationForcedToCPU: Boolean = js.native
  var _checkIsReady: js.Any = js.native
  var _compilationError: js.Any = js.native
  var _engine: js.Any = js.native
  var _fallbacks: js.Any = js.native
  var _fragmentSourceCode: js.Any = js.native
  var _fragmentSourceCodeOverride: js.Any = js.native
  var _indexParameters: js.Any = js.native
  var _isReady: js.Any = js.native
  var _isReadyInternal: js.Any = js.native
  /**
    * Key for the effect.
    * @hidden
    */
  var _key: String = js.native
  var _loadShader: js.Any = js.native
  /** @hidden */
  var _onBindObservable: Nullable[Observable[Effect]] = js.native
  /**
    * Compiled shader to webGL program.
    * @hidden
    */
  var _pipelineContext: Nullable[IPipelineContext] = js.native
  var _processCompilationErrors: js.Any = js.native
  var _samplerList: js.Any = js.native
  var _samplers: js.Any = js.native
  var _transformFeedbackVaryings: js.Any = js.native
  var _uniformBuffersNames: js.Any = js.native
  var _uniforms: js.Any = js.native
  var _uniformsNames: js.Any = js.native
  var _useFinalCode: js.Any = js.native
  var _valueCache: js.Any = js.native
  var _vertexSourceCode: js.Any = js.native
  var _vertexSourceCodeOverride: js.Any = js.native
  /**
    * @hidden
    * Specifies if the effect was previously ready
    */
  var _wasPreviouslyReady: Boolean = js.native
  /**
    * String container all the define statements that should be set on the shader.
    */
  var defines: String = js.native
  /**
    * Name of the effect.
    */
  var name: js.Any = js.native
  /**
    * Callback that will be called when effect is bound.
    */
  var onBind: Nullable[js.Function1[/* effect */ this.type, Unit]] = js.native
  /**
    * Observable that will be called when the shader is compiled.
    * It is recommended to use executeWhenCompile() or to make sure that scene.isReady() is called to get this observable raised.
    */
  var onCompileObservable: Observable[Effect] = js.native
  /**
    * Callback that will be called when the shader is compiled.
    */
  var onCompiled: Nullable[js.Function1[/* effect */ this.type, Unit]] = js.native
  /**
    * Callback that will be called if an error occurs during shader compilation.
    */
  var onError: Nullable[js.Function2[/* effect */ this.type, /* errors */ String, Unit]] = js.native
  /**
    * Observable that will be called if an error occurs during shader compilation.
    */
  var onErrorObservable: Observable[Effect] = js.native
  /**
    * Unique ID of the effect.
    */
  var uniqueId: Double = js.native
  /**
    * Binds a texture to the engine to be used as output of the shader.
    * @param channel Name of the output variable.
    * @param texture Texture to bind.
    * @hidden
    */
  def _bindTexture(channel: String, texture: Nullable[InternalTexture]): Unit = js.native
  /** @hidden */
  def _cacheFloat2(uniformName: String, x: Double, y: Double): Boolean = js.native
  /** @hidden */
  def _cacheFloat3(uniformName: String, x: Double, y: Double, z: Double): Boolean = js.native
  /** @hidden */
  def _cacheFloat4(uniformName: String, x: Double, y: Double, z: Double, w: Double): Boolean = js.native
  /** @hidden */
  def _cacheMatrix(uniformName: String, matrix: IMatrixLike): Boolean = js.native
  /**
    * Prepares the effect
    * @hidden
    */
  def _prepareEffect(): Unit = js.native
  /**
    * Recompiles the webGL program
    * @param vertexSourceCode The source code for the vertex shader.
    * @param fragmentSourceCode The source code for the fragment shader.
    * @param onCompiled Callback called when completed.
    * @param onError Callback called on error.
    * @hidden
    */
  def _rebuildProgram(
    vertexSourceCode: String,
    fragmentSourceCode: String,
    onCompiled: js.Function1[/* pipelineContext */ IPipelineContext, Unit],
    onError: js.Function1[/* message */ String, Unit]
  ): Unit = js.native
  /**
    * Gets a boolean indicating that all fallbacks were used during compilation
    * @returns true if all fallbacks were used
    */
  def allFallbacksProcessed(): Boolean = js.native
  /**
    * Binds block to a uniform.
    * @param blockName Name of the block to bind.
    * @param index Index to bind.
    */
  def bindUniformBlock(blockName: String, index: Double): Unit = js.native
  /**
    * Binds a buffer to a uniform.
    * @param buffer Buffer to bind.
    * @param name Name of the uniform variable to bind to.
    */
  def bindUniformBuffer(buffer: DataBuffer, name: String): Unit = js.native
  /**
    * Adds a callback to the onCompiled observable and call the callback imediatly if already ready.
    * @param func The callback to be used.
    */
  def executeWhenCompiled(func: js.Function1[/* effect */ this.type, Unit]): Unit = js.native
  /**
    * Returns the attribute at the given index.
    * @param index The index of the attribute.
    * @returns The location of the attribute.
    */
  def getAttributeLocation(index: Double): Double = js.native
  /**
    * Returns the attribute based on the name of the variable.
    * @param name of the attribute to look up.
    * @returns the attribute location.
    */
  def getAttributeLocationByName(name: String): Double = js.native
  /**
    * The number of attributes.
    * @returns the numnber of attributes.
    */
  def getAttributesCount(): Double = js.native
  /**
    * The set of names of attribute variables for the shader.
    * @returns An array of attribute names.
    */
  def getAttributesNames(): js.Array[String] = js.native
  /**
    * The error from the last compilation.
    * @returns the error string.
    */
  def getCompilationError(): String = js.native
  /**
    * The engine the effect was initialized with.
    * @returns the engine.
    */
  def getEngine(): Engine = js.native
  /**
    * The pipeline context for this effect
    * @returns the associated pipeline context
    */
  def getPipelineContext(): Nullable[IPipelineContext] = js.native
  /**
    * Returns an array of sampler variable names
    * @returns The array of sampler variable neames.
    */
  def getSamplers(): js.Array[String] = js.native
  /**
    * Returns the attribute based on the name of the variable.
    * @param uniformName of the uniform to look up.
    * @returns the location of the uniform.
    */
  def getUniform(uniformName: String): Nullable[WebGLUniformLocation] = js.native
  /**
    * Gets the index of a uniform variable.
    * @param uniformName of the uniform to look up.
    * @returns the index.
    */
  def getUniformIndex(uniformName: String): Double = js.native
  /**
    * If the effect has been compiled and prepared.
    * @returns if the effect is compiled and prepared.
    */
  def isReady(): Boolean = js.native
  /**
    * Checks if the effect is supported. (Must be called after compilation)
    */
  def isSupported: Boolean = js.native
  /**
    * Unique key for this effect
    */
  def key: String = js.native
  /**
    * Observable that will be called when effect is bound.
    */
  def onBindObservable: Observable[Effect] = js.native
  /**
    * Sets an array on a uniform variable.
    * @param uniformName Name of the variable.
    * @param array array to be set.
    * @returns this effect.
    */
  def setArray(uniformName: String, array: js.Array[Double]): Effect = js.native
  /**
    * Sets an array 2 on a uniform variable. (Array is specified as single array eg. [1,2,3,4] will result in [[1,2],[3,4]] in the shader)
    * @param uniformName Name of the variable.
    * @param array array to be set.
    * @returns this effect.
    */
  def setArray2(uniformName: String, array: js.Array[Double]): Effect = js.native
  /**
    * Sets an array 3 on a uniform variable. (Array is specified as single array eg. [1,2,3,4,5,6] will result in [[1,2,3],[4,5,6]] in the shader)
    * @param uniformName Name of the variable.
    * @param array array to be set.
    * @returns this effect.
    */
  def setArray3(uniformName: String, array: js.Array[Double]): Effect = js.native
  /**
    * Sets an array 4 on a uniform variable. (Array is specified as single array eg. [1,2,3,4,5,6,7,8] will result in [[1,2,3,4],[5,6,7,8]] in the shader)
    * @param uniformName Name of the variable.
    * @param array array to be set.
    * @returns this effect.
    */
  def setArray4(uniformName: String, array: js.Array[Double]): Effect = js.native
  /**
    * Sets a boolean on a uniform variable.
    * @param uniformName Name of the variable.
    * @param bool value to be set.
    * @returns this effect.
    */
  def setBool(uniformName: String, bool: Boolean): Effect = js.native
  /**
    * Sets a Color3 on a uniform variable.
    * @param uniformName Name of the variable.
    * @param color3 Value to be set.
    * @returns this effect.
    */
  def setColor3(uniformName: String, color3: IColor3Like): Effect = js.native
  /**
    * Sets a Color4 on a uniform variable.
    * @param uniformName Name of the variable.
    * @param color3 Value to be set.
    * @param alpha Alpha value to be set.
    * @returns this effect.
    */
  def setColor4(uniformName: String, color3: IColor3Like, alpha: Double): Effect = js.native
  /**
    * Sets a depth stencil texture from a render target on the engine to be used in the shader.
    * @param channel Name of the sampler variable.
    * @param texture Texture to set.
    */
  def setDepthStencilTexture(channel: String, texture: Nullable[RenderTargetTexture]): Unit = js.native
  /**
    * Sets a Color4 on a uniform variable
    * @param uniformName defines the name of the variable
    * @param color4 defines the value to be set
    * @returns this effect.
    */
  def setDirectColor4(uniformName: String, color4: IColor4Like): Effect = js.native
  /**
    * Sets a float on a uniform variable.
    * @param uniformName Name of the variable.
    * @param value value to be set.
    * @returns this effect.
    */
  def setFloat(uniformName: String, value: Double): Effect = js.native
  /**
    * Sets a float2 on a uniform variable.
    * @param uniformName Name of the variable.
    * @param x First float in float2.
    * @param y Second float in float2.
    * @returns this effect.
    */
  def setFloat2(uniformName: String, x: Double, y: Double): Effect = js.native
  /**
    * Sets a float3 on a uniform variable.
    * @param uniformName Name of the variable.
    * @param x First float in float3.
    * @param y Second float in float3.
    * @param z Third float in float3.
    * @returns this effect.
    */
  def setFloat3(uniformName: String, x: Double, y: Double, z: Double): Effect = js.native
  /**
    * Sets a float4 on a uniform variable.
    * @param uniformName Name of the variable.
    * @param x First float in float4.
    * @param y Second float in float4.
    * @param z Third float in float4.
    * @param w Fourth float in float4.
    * @returns this effect.
    */
  def setFloat4(uniformName: String, x: Double, y: Double, z: Double, w: Double): Effect = js.native
  /**
    * Sets an float array on a uniform variable.
    * @param uniformName Name of the variable.
    * @param array array to be set.
    * @returns this effect.
    */
  def setFloatArray(uniformName: String, array: js.typedarray.Float32Array): Effect = js.native
  /**
    * Sets an float array 2 on a uniform variable. (Array is specified as single array eg. [1,2,3,4] will result in [[1,2],[3,4]] in the shader)
    * @param uniformName Name of the variable.
    * @param array array to be set.
    * @returns this effect.
    */
  def setFloatArray2(uniformName: String, array: js.typedarray.Float32Array): Effect = js.native
  /**
    * Sets an float array 3 on a uniform variable. (Array is specified as single array eg. [1,2,3,4,5,6] will result in [[1,2,3],[4,5,6]] in the shader)
    * @param uniformName Name of the variable.
    * @param array array to be set.
    * @returns this effect.
    */
  def setFloatArray3(uniformName: String, array: js.typedarray.Float32Array): Effect = js.native
  /**
    * Sets an float array 4 on a uniform variable. (Array is specified as single array eg. [1,2,3,4,5,6,7,8] will result in [[1,2,3,4],[5,6,7,8]] in the shader)
    * @param uniformName Name of the variable.
    * @param array array to be set.
    * @returns this effect.
    */
  def setFloatArray4(uniformName: String, array: js.typedarray.Float32Array): Effect = js.native
  /**
    * Sets an interger value on a uniform variable.
    * @param uniformName Name of the variable.
    * @param value Value to be set.
    * @returns this effect.
    */
  def setInt(uniformName: String, value: Double): Effect = js.native
  /**
    * Sets an int array on a uniform variable.
    * @param uniformName Name of the variable.
    * @param array array to be set.
    * @returns this effect.
    */
  def setIntArray(uniformName: String, array: js.typedarray.Int32Array): Effect = js.native
  /**
    * Sets an int array 2 on a uniform variable. (Array is specified as single array eg. [1,2,3,4] will result in [[1,2],[3,4]] in the shader)
    * @param uniformName Name of the variable.
    * @param array array to be set.
    * @returns this effect.
    */
  def setIntArray2(uniformName: String, array: js.typedarray.Int32Array): Effect = js.native
  /**
    * Sets an int array 3 on a uniform variable. (Array is specified as single array eg. [1,2,3,4,5,6] will result in [[1,2,3],[4,5,6]] in the shader)
    * @param uniformName Name of the variable.
    * @param array array to be set.
    * @returns this effect.
    */
  def setIntArray3(uniformName: String, array: js.typedarray.Int32Array): Effect = js.native
  /**
    * Sets an int array 4 on a uniform variable. (Array is specified as single array eg. [1,2,3,4,5,6,7,8] will result in [[1,2,3,4],[5,6,7,8]] in the shader)
    * @param uniformName Name of the variable.
    * @param array array to be set.
    * @returns this effect.
    */
  def setIntArray4(uniformName: String, array: js.typedarray.Int32Array): Effect = js.native
  /**
    * Sets matrices on a uniform variable.
    * @param uniformName Name of the variable.
    * @param matrices matrices to be set.
    * @returns this effect.
    */
  def setMatrices(uniformName: String, matrices: js.typedarray.Float32Array): Effect = js.native
  /**
    * Sets matrix on a uniform variable.
    * @param uniformName Name of the variable.
    * @param matrix matrix to be set.
    * @returns this effect.
    */
  def setMatrix(uniformName: String, matrix: IMatrixLike): Effect = js.native
  /**
    * Sets a 2x2 matrix on a uniform variable. (Speicified as [1,2,3,4] will result in [1,2][3,4] matrix)
    * @param uniformName Name of the variable.
    * @param matrix matrix to be set.
    * @returns this effect.
    */
  def setMatrix2x2(uniformName: String, matrix: js.typedarray.Float32Array): Effect = js.native
  /**
    * Sets a 3x3 matrix on a uniform variable. (Speicified as [1,2,3,4,5,6,7,8,9] will result in [1,2,3][4,5,6][7,8,9] matrix)
    * @param uniformName Name of the variable.
    * @param matrix matrix to be set.
    * @returns this effect.
    */
  def setMatrix3x3(uniformName: String, matrix: js.typedarray.Float32Array): Effect = js.native
  /**
    * Sets a texture on the engine to be used in the shader.
    * @param channel Name of the sampler variable.
    * @param texture Texture to set.
    */
  def setTexture(channel: String, texture: Nullable[BaseTexture]): Unit = js.native
  /**
    * Sets an array of textures on the engine to be used in the shader.
    * @param channel Name of the variable.
    * @param textures Textures to set.
    */
  def setTextureArray(channel: String, textures: js.Array[BaseTexture]): Unit = js.native
  /**
    * Sets a texture to be the input of the specified post process. (To use the output, pass in the next post process in the pipeline)
    * @param channel Name of the sampler variable.
    * @param postProcess Post process to get the input texture from.
    */
  def setTextureFromPostProcess(channel: String, postProcess: Nullable[PostProcess]): Unit = js.native
  /**
    * (Warning! setTextureFromPostProcessOutput may be desired instead)
    * Sets the input texture of the passed in post process to be input of this effect. (To use the output of the passed in post process use setTextureFromPostProcessOutput)
    * @param channel Name of the sampler variable.
    * @param postProcess Post process to get the output texture from.
    */
  def setTextureFromPostProcessOutput(channel: String, postProcess: Nullable[PostProcess]): Unit = js.native
  /**
    * Sets a Vector2 on a uniform variable.
    * @param uniformName Name of the variable.
    * @param vector2 vector2 to be set.
    * @returns this effect.
    */
  def setVector2(uniformName: String, vector2: IVector2Like): Effect = js.native
  /**
    * Sets a Vector3 on a uniform variable.
    * @param uniformName Name of the variable.
    * @param vector3 Value to be set.
    * @returns this effect.
    */
  def setVector3(uniformName: String, vector3: IVector3Like): Effect = js.native
  /**
    * Sets a Vector4 on a uniform variable.
    * @param uniformName Name of the variable.
    * @param vector4 Value to be set.
    * @returns this effect.
    */
  def setVector4(uniformName: String, vector4: IVector4Like): Effect = js.native
}

object Effect {
  @scala.inline
  def apply(
    _allFallbacksProcessed: js.Any,
    _attributeLocationByName: js.Any,
    _attributes: js.Any,
    _attributesNames: js.Any,
    _bindTexture: (String, Nullable[InternalTexture]) => Unit,
    _bonesComputationForcedToCPU: Boolean,
    _cacheFloat2: (String, Double, Double) => Boolean,
    _cacheFloat3: (String, Double, Double, Double) => Boolean,
    _cacheFloat4: (String, Double, Double, Double, Double) => Boolean,
    _cacheMatrix: (String, IMatrixLike) => Boolean,
    _checkIsReady: js.Any,
    _compilationError: js.Any,
    _engine: js.Any,
    _fallbacks: js.Any,
    _fragmentSourceCode: js.Any,
    _fragmentSourceCodeOverride: js.Any,
    _indexParameters: js.Any,
    _isReady: js.Any,
    _isReadyInternal: js.Any,
    _key: String,
    _loadShader: js.Any,
    _prepareEffect: () => Unit,
    _processCompilationErrors: js.Any,
    _rebuildProgram: (String, String, js.Function1[/* pipelineContext */ IPipelineContext, Unit], js.Function1[/* message */ String, Unit]) => Unit,
    _samplerList: js.Any,
    _samplers: js.Any,
    _transformFeedbackVaryings: js.Any,
    _uniformBuffersNames: js.Any,
    _uniforms: js.Any,
    _uniformsNames: js.Any,
    _useFinalCode: js.Any,
    _valueCache: js.Any,
    _vertexSourceCode: js.Any,
    _vertexSourceCodeOverride: js.Any,
    _wasPreviouslyReady: Boolean,
    allFallbacksProcessed: () => Boolean,
    bindUniformBlock: (String, Double) => Unit,
    bindUniformBuffer: (DataBuffer, String) => Unit,
    defines: String,
    dispose: () => Unit,
    executeWhenCompiled: js.Function1[Effect, Unit] => Unit,
    getAttributeLocation: Double => Double,
    getAttributeLocationByName: String => Double,
    getAttributesCount: () => Double,
    getAttributesNames: () => js.Array[String],
    getCompilationError: () => String,
    getEngine: () => Engine,
    getPipelineContext: () => Nullable[IPipelineContext],
    getSamplers: () => js.Array[String],
    getUniform: String => Nullable[WebGLUniformLocation],
    getUniformIndex: String => Double,
    isReady: () => Boolean,
    isSupported: () => Boolean,
    key: () => String,
    name: js.Any,
    onBindObservable: () => Observable[Effect],
    onCompileObservable: Observable[Effect],
    onErrorObservable: Observable[Effect],
    setArray: (String, js.Array[Double]) => Effect,
    setArray2: (String, js.Array[Double]) => Effect,
    setArray3: (String, js.Array[Double]) => Effect,
    setArray4: (String, js.Array[Double]) => Effect,
    setBool: (String, Boolean) => Effect,
    setColor3: (String, IColor3Like) => Effect,
    setColor4: (String, IColor3Like, Double) => Effect,
    setDepthStencilTexture: (String, Nullable[RenderTargetTexture]) => Unit,
    setDirectColor4: (String, IColor4Like) => Effect,
    setFloat: (String, Double) => Effect,
    setFloat2: (String, Double, Double) => Effect,
    setFloat3: (String, Double, Double, Double) => Effect,
    setFloat4: (String, Double, Double, Double, Double) => Effect,
    setFloatArray: (String, js.typedarray.Float32Array) => Effect,
    setFloatArray2: (String, js.typedarray.Float32Array) => Effect,
    setFloatArray3: (String, js.typedarray.Float32Array) => Effect,
    setFloatArray4: (String, js.typedarray.Float32Array) => Effect,
    setInt: (String, Double) => Effect,
    setIntArray: (String, js.typedarray.Int32Array) => Effect,
    setIntArray2: (String, js.typedarray.Int32Array) => Effect,
    setIntArray3: (String, js.typedarray.Int32Array) => Effect,
    setIntArray4: (String, js.typedarray.Int32Array) => Effect,
    setMatrices: (String, js.typedarray.Float32Array) => Effect,
    setMatrix: (String, IMatrixLike) => Effect,
    setMatrix2x2: (String, js.typedarray.Float32Array) => Effect,
    setMatrix3x3: (String, js.typedarray.Float32Array) => Effect,
    setTexture: (String, Nullable[BaseTexture]) => Unit,
    setTextureArray: (String, js.Array[BaseTexture]) => Unit,
    setTextureFromPostProcess: (String, Nullable[PostProcess]) => Unit,
    setTextureFromPostProcessOutput: (String, Nullable[PostProcess]) => Unit,
    setVector2: (String, IVector2Like) => Effect,
    setVector3: (String, IVector3Like) => Effect,
    setVector4: (String, IVector4Like) => Effect,
    uniqueId: Double
  ): Effect = {
    val __obj = js.Dynamic.literal(_allFallbacksProcessed = _allFallbacksProcessed.asInstanceOf[js.Any], _attributeLocationByName = _attributeLocationByName.asInstanceOf[js.Any], _attributes = _attributes.asInstanceOf[js.Any], _attributesNames = _attributesNames.asInstanceOf[js.Any], _bindTexture = js.Any.fromFunction2(_bindTexture), _bonesComputationForcedToCPU = _bonesComputationForcedToCPU.asInstanceOf[js.Any], _cacheFloat2 = js.Any.fromFunction3(_cacheFloat2), _cacheFloat3 = js.Any.fromFunction4(_cacheFloat3), _cacheFloat4 = js.Any.fromFunction5(_cacheFloat4), _cacheMatrix = js.Any.fromFunction2(_cacheMatrix), _checkIsReady = _checkIsReady.asInstanceOf[js.Any], _compilationError = _compilationError.asInstanceOf[js.Any], _engine = _engine.asInstanceOf[js.Any], _fallbacks = _fallbacks.asInstanceOf[js.Any], _fragmentSourceCode = _fragmentSourceCode.asInstanceOf[js.Any], _fragmentSourceCodeOverride = _fragmentSourceCodeOverride.asInstanceOf[js.Any], _indexParameters = _indexParameters.asInstanceOf[js.Any], _isReady = _isReady.asInstanceOf[js.Any], _isReadyInternal = _isReadyInternal.asInstanceOf[js.Any], _key = _key.asInstanceOf[js.Any], _loadShader = _loadShader.asInstanceOf[js.Any], _prepareEffect = js.Any.fromFunction0(_prepareEffect), _processCompilationErrors = _processCompilationErrors.asInstanceOf[js.Any], _rebuildProgram = js.Any.fromFunction4(_rebuildProgram), _samplerList = _samplerList.asInstanceOf[js.Any], _samplers = _samplers.asInstanceOf[js.Any], _transformFeedbackVaryings = _transformFeedbackVaryings.asInstanceOf[js.Any], _uniformBuffersNames = _uniformBuffersNames.asInstanceOf[js.Any], _uniforms = _uniforms.asInstanceOf[js.Any], _uniformsNames = _uniformsNames.asInstanceOf[js.Any], _useFinalCode = _useFinalCode.asInstanceOf[js.Any], _valueCache = _valueCache.asInstanceOf[js.Any], _vertexSourceCode = _vertexSourceCode.asInstanceOf[js.Any], _vertexSourceCodeOverride = _vertexSourceCodeOverride.asInstanceOf[js.Any], _wasPreviouslyReady = _wasPreviouslyReady.asInstanceOf[js.Any], allFallbacksProcessed = js.Any.fromFunction0(allFallbacksProcessed), bindUniformBlock = js.Any.fromFunction2(bindUniformBlock), bindUniformBuffer = js.Any.fromFunction2(bindUniformBuffer), defines = defines.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), executeWhenCompiled = js.Any.fromFunction1(executeWhenCompiled), getAttributeLocation = js.Any.fromFunction1(getAttributeLocation), getAttributeLocationByName = js.Any.fromFunction1(getAttributeLocationByName), getAttributesCount = js.Any.fromFunction0(getAttributesCount), getAttributesNames = js.Any.fromFunction0(getAttributesNames), getCompilationError = js.Any.fromFunction0(getCompilationError), getEngine = js.Any.fromFunction0(getEngine), getPipelineContext = js.Any.fromFunction0(getPipelineContext), getSamplers = js.Any.fromFunction0(getSamplers), getUniform = js.Any.fromFunction1(getUniform), getUniformIndex = js.Any.fromFunction1(getUniformIndex), isReady = js.Any.fromFunction0(isReady), isSupported = js.Any.fromFunction0(isSupported), key = js.Any.fromFunction0(key), name = name.asInstanceOf[js.Any], onBindObservable = js.Any.fromFunction0(onBindObservable), onCompileObservable = onCompileObservable.asInstanceOf[js.Any], onErrorObservable = onErrorObservable.asInstanceOf[js.Any], setArray = js.Any.fromFunction2(setArray), setArray2 = js.Any.fromFunction2(setArray2), setArray3 = js.Any.fromFunction2(setArray3), setArray4 = js.Any.fromFunction2(setArray4), setBool = js.Any.fromFunction2(setBool), setColor3 = js.Any.fromFunction2(setColor3), setColor4 = js.Any.fromFunction3(setColor4), setDepthStencilTexture = js.Any.fromFunction2(setDepthStencilTexture), setDirectColor4 = js.Any.fromFunction2(setDirectColor4), setFloat = js.Any.fromFunction2(setFloat), setFloat2 = js.Any.fromFunction3(setFloat2), setFloat3 = js.Any.fromFunction4(setFloat3), setFloat4 = js.Any.fromFunction5(setFloat4), setFloatArray = js.Any.fromFunction2(setFloatArray), setFloatArray2 = js.Any.fromFunction2(setFloatArray2), setFloatArray3 = js.Any.fromFunction2(setFloatArray3), setFloatArray4 = js.Any.fromFunction2(setFloatArray4), setInt = js.Any.fromFunction2(setInt), setIntArray = js.Any.fromFunction2(setIntArray), setIntArray2 = js.Any.fromFunction2(setIntArray2), setIntArray3 = js.Any.fromFunction2(setIntArray3), setIntArray4 = js.Any.fromFunction2(setIntArray4), setMatrices = js.Any.fromFunction2(setMatrices), setMatrix = js.Any.fromFunction2(setMatrix), setMatrix2x2 = js.Any.fromFunction2(setMatrix2x2), setMatrix3x3 = js.Any.fromFunction2(setMatrix3x3), setTexture = js.Any.fromFunction2(setTexture), setTextureArray = js.Any.fromFunction2(setTextureArray), setTextureFromPostProcess = js.Any.fromFunction2(setTextureFromPostProcess), setTextureFromPostProcessOutput = js.Any.fromFunction2(setTextureFromPostProcessOutput), setVector2 = js.Any.fromFunction2(setVector2), setVector3 = js.Any.fromFunction2(setVector3), setVector4 = js.Any.fromFunction2(setVector4), uniqueId = uniqueId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Effect]
  }
  @scala.inline
  implicit class EffectOps[Self <: Effect] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_allFallbacksProcessed(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_allFallbacksProcessed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_attributeLocationByName(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_attributeLocationByName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_attributes(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_attributesNames(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_attributesNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_bindTexture(value: (String, Nullable[InternalTexture]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_bindTexture")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def with_bonesComputationForcedToCPU(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_bonesComputationForcedToCPU")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_cacheFloat2(value: (String, Double, Double) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_cacheFloat2")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def with_cacheFloat3(value: (String, Double, Double, Double) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_cacheFloat3")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def with_cacheFloat4(value: (String, Double, Double, Double, Double) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_cacheFloat4")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def with_cacheMatrix(value: (String, IMatrixLike) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_cacheMatrix")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def with_checkIsReady(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_checkIsReady")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_compilationError(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_compilationError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_engine(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_engine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_fallbacks(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_fallbacks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_fragmentSourceCode(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_fragmentSourceCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_fragmentSourceCodeOverride(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_fragmentSourceCodeOverride")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_indexParameters(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_indexParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_isReady(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_isReady")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_isReadyInternal(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_isReadyInternal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_key(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_loadShader(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_loadShader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_prepareEffect(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_prepareEffect")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def with_processCompilationErrors(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_processCompilationErrors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_rebuildProgram(
      value: (String, String, js.Function1[/* pipelineContext */ IPipelineContext, Unit], js.Function1[/* message */ String, Unit]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_rebuildProgram")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def with_samplerList(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_samplerList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_samplers(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_samplers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_transformFeedbackVaryings(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_transformFeedbackVaryings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_uniformBuffersNames(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_uniformBuffersNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_uniforms(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_uniforms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_uniformsNames(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_uniformsNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_useFinalCode(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_useFinalCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_valueCache(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_valueCache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_vertexSourceCode(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_vertexSourceCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_vertexSourceCodeOverride(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_vertexSourceCodeOverride")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_wasPreviouslyReady(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_wasPreviouslyReady")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllFallbacksProcessed(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allFallbacksProcessed")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withBindUniformBlock(value: (String, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindUniformBlock")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withBindUniformBuffer(value: (DataBuffer, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindUniformBuffer")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withDefines(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExecuteWhenCompiled(value: js.Function1[Effect, Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executeWhenCompiled")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetAttributeLocation(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAttributeLocation")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetAttributeLocationByName(value: String => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAttributeLocationByName")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetAttributesCount(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAttributesCount")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetAttributesNames(value: () => js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAttributesNames")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetCompilationError(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCompilationError")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetEngine(value: () => Engine): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEngine")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetPipelineContext(value: () => Nullable[IPipelineContext]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPipelineContext")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSamplers(value: () => js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSamplers")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetUniform(value: String => Nullable[WebGLUniformLocation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUniform")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetUniformIndex(value: String => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUniformIndex")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsReady(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isReady")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsSupported(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSupported")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withKey(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withName(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnBindObservable(value: () => Observable[Effect]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBindObservable")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnCompileObservable(value: Observable[Effect]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCompileObservable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnErrorObservable(value: Observable[Effect]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onErrorObservable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetArray(value: (String, js.Array[Double]) => Effect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setArray")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetArray2(value: (String, js.Array[Double]) => Effect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setArray2")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetArray3(value: (String, js.Array[Double]) => Effect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setArray3")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetArray4(value: (String, js.Array[Double]) => Effect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setArray4")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetBool(value: (String, Boolean) => Effect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBool")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetColor3(value: (String, IColor3Like) => Effect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setColor3")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetColor4(value: (String, IColor3Like, Double) => Effect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setColor4")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withSetDepthStencilTexture(value: (String, Nullable[RenderTargetTexture]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDepthStencilTexture")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetDirectColor4(value: (String, IColor4Like) => Effect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDirectColor4")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetFloat(value: (String, Double) => Effect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFloat")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetFloat2(value: (String, Double, Double) => Effect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFloat2")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withSetFloat3(value: (String, Double, Double, Double) => Effect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFloat3")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withSetFloat4(value: (String, Double, Double, Double, Double) => Effect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFloat4")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withSetFloatArray(value: (String, js.typedarray.Float32Array) => Effect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFloatArray")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetFloatArray2(value: (String, js.typedarray.Float32Array) => Effect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFloatArray2")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetFloatArray3(value: (String, js.typedarray.Float32Array) => Effect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFloatArray3")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetFloatArray4(value: (String, js.typedarray.Float32Array) => Effect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFloatArray4")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetInt(value: (String, Double) => Effect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setInt")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetIntArray(value: (String, js.typedarray.Int32Array) => Effect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setIntArray")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetIntArray2(value: (String, js.typedarray.Int32Array) => Effect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setIntArray2")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetIntArray3(value: (String, js.typedarray.Int32Array) => Effect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setIntArray3")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetIntArray4(value: (String, js.typedarray.Int32Array) => Effect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setIntArray4")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetMatrices(value: (String, js.typedarray.Float32Array) => Effect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMatrices")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetMatrix(value: (String, IMatrixLike) => Effect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMatrix")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetMatrix2x2(value: (String, js.typedarray.Float32Array) => Effect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMatrix2x2")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetMatrix3x3(value: (String, js.typedarray.Float32Array) => Effect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMatrix3x3")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetTexture(value: (String, Nullable[BaseTexture]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTexture")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetTextureArray(value: (String, js.Array[BaseTexture]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTextureArray")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetTextureFromPostProcess(value: (String, Nullable[PostProcess]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTextureFromPostProcess")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetTextureFromPostProcessOutput(value: (String, Nullable[PostProcess]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTextureFromPostProcessOutput")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetVector2(value: (String, IVector2Like) => Effect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setVector2")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetVector3(value: (String, IVector3Like) => Effect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setVector3")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetVector4(value: (String, IVector4Like) => Effect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setVector4")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withUniqueId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uniqueId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_onBindObservable(value: Nullable[Observable[Effect]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_onBindObservable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_onBindObservableNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_onBindObservable")(null)
        ret
    }
    @scala.inline
    def with_pipelineContext(value: Nullable[IPipelineContext]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_pipelineContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_pipelineContextNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_pipelineContext")(null)
        ret
    }
    @scala.inline
    def withOnBind(value: Effect => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBind")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnBindNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBind")(null)
        ret
    }
    @scala.inline
    def withOnCompiled(value: Effect => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCompiled")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnCompiledNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCompiled")(null)
        ret
    }
    @scala.inline
    def withOnError(value: (Effect, /* errors */ String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withOnErrorNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(null)
        ret
    }
  }
  
}

