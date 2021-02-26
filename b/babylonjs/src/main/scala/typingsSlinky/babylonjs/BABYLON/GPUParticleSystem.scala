package typingsSlinky.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.babylonjs.BABYLON.IAnimatable because var conflicts: animations. Inlined 
- typingsSlinky.babylonjs.BABYLON.IParticleSystem because var conflicts: animations, beginAnimationFrom, beginAnimationLoop, beginAnimationOnStart, beginAnimationTo, billboardMode, blendMode, color1, color2, colorDead, disposeOnStop, emitRate, emitter, endSpriteCellID, gravity, id, isAnimationSheetEnabled, isBillboardBased, layerMask, limitVelocityDamping, maxAngularSpeed, maxEmitPower, maxInitialRotation, maxLifeTime, maxScaleX, maxScaleY, maxSize, minAngularSpeed, minEmitPower, minInitialRotation, minLifeTime, minScaleX, minScaleY, minSize, name, noiseStrength, noiseTexture, particleEmitterType, particleTexture, preWarmCycles, preWarmStepOffset, renderingGroupId, snippetId, spriteCellChangeSpeed, spriteCellHeight, spriteCellWidth, spriteRandomStartCell, startDelay, startSpriteCellID, targetStopDuration, translationPivot, updateSpeed. Inlined isLocal, defaultProjectionMatrix, getCapacity, getActiveCount, isStarted, animate, render, onDisposeObservable, onStoppedObservable, clone, serialize, rebuild, forceRefreshGradients, start, start, stop, reset, isStopping, isReady, getClassName, getCustomEffect, setCustomEffect, fillDefines, fillUniformsAttributesAndSamplerNames, onBeforeDrawParticlesObservable, vertexShaderName, addColorGradient, addColorGradient, removeColorGradient, addSizeGradient, addSizeGradient, removeSizeGradient, addAngularSpeedGradient, addAngularSpeedGradient, removeAngularSpeedGradient, addVelocityGradient, addVelocityGradient, removeVelocityGradient, addLimitVelocityGradient, addLimitVelocityGradient, removeLimitVelocityGradient, addDragGradient, addDragGradient, removeDragGradient, addEmitRateGradient, addEmitRateGradient, removeEmitRateGradient, addStartSizeGradient, addStartSizeGradient, removeStartSizeGradient, addLifeTimeGradient, addLifeTimeGradient, removeLifeTimeGradient, addRampGradient, getRampGradients, useRampGradients, addColorRemapGradient, addAlphaRemapGradient */ @js.native
trait GPUParticleSystem
  extends BaseParticleSystem
     with IDisposable {
  
  var _accumulatedCount: js.Any = js.native
  
  var _activeCount: js.Any = js.native
  
  var _actualFrame: js.Any = js.native
  
  var _addFactorGradient: js.Any = js.native
  
  var _angularSpeedGradientsTexture: js.Any = js.native
  
  var _attributesStrideSize: js.Any = js.native
  
  var _buffer0: js.Any = js.native
  
  var _buffer1: js.Any = js.native
  
  var _capacity: js.Any = js.native
  
  var _colorGradientsTexture: js.Any = js.native
  
  var _createAngularSpeedGradientTexture: js.Any = js.native
  
  var _createColorGradientTexture: js.Any = js.native
  
  var _createDragGradientTexture: js.Any = js.native
  
  var _createFactorGradientTexture: js.Any = js.native
  
  var _createLimitVelocityGradientTexture: js.Any = js.native
  
  var _createRenderVAO: js.Any = js.native
  
  var _createSizeGradientTexture: js.Any = js.native
  
  var _createUpdateVAO: js.Any = js.native
  
  var _createVelocityGradientTexture: js.Any = js.native
  
  var _currentActiveCount: js.Any = js.native
  
  var _currentRenderId: js.Any = js.native
  
  var _customEffect: js.Any = js.native
  
  var _dragGradientsTexture: js.Any = js.native
  
  var _getEffect: js.Any = js.native
  
  var _initialize: js.Any = js.native
  
  var _limitVelocityGradientsTexture: js.Any = js.native
  
  /** @hidden */
  var _onBeforeDrawParticlesObservable: Nullable[Observable[Nullable[Effect]]] = js.native
  
  var _preWarmDone: js.Any = js.native
  
  var _randomTexture: js.Any = js.native
  
  var _randomTexture2: js.Any = js.native
  
  var _randomTextureSize: js.Any = js.native
  
  val _rawTextureWidth: js.Any = js.native
  
  /** @hidden */
  def _recreateRenderEffect(): Effect = js.native
  
  /** @hidden */
  def _recreateUpdateEffect(): Unit = js.native
  
  var _refreshColorGradient: js.Any = js.native
  
  var _refreshFactorGradient: js.Any = js.native
  
  var _releaseBuffers: js.Any = js.native
  
  var _releaseVAOs: js.Any = js.native
  
  /* protected */ def _removeGradientAndTexture(gradient: Double, gradients: Nullable[js.Array[IValueGradient]], texture: RawTexture): BaseParticleSystem = js.native
  
  var _renderEffect: js.Any = js.native
  
  var _renderVAO: js.Any = js.native
  
  var _sizeGradientsTexture: js.Any = js.native
  
  var _sourceBuffer: js.Any = js.native
  
  var _spriteBuffer: js.Any = js.native
  
  var _started: js.Any = js.native
  
  var _stopped: js.Any = js.native
  
  var _targetBuffer: js.Any = js.native
  
  var _targetIndex: js.Any = js.native
  
  var _timeDelta: js.Any = js.native
  
  var _updateEffect: js.Any = js.native
  
  var _updateEffectOptions: js.Any = js.native
  
  var _updateVAO: js.Any = js.native
  
  var _velocityGradientsTexture: js.Any = js.native
  
  /**
    * Gets or set the number of active particles
    */
  def activeParticleCount: Double = js.native
  def activeParticleCount_=(value: Double): Unit = js.native
  
  /**
    * Not supported by GPUParticleSystem
    * @param gradient defines the gradient to use (between 0 and 1)
    * @param min defines the alpha remap minimal range
    * @param max defines the alpha remap maximal range
    * @returns the current particle system
    */
  /**
    * Adds a new alpha remap gradient
    * @param gradient defines the gradient to use (between 0 and 1)
    * @param min defines the alpha remap minimal range
    * @param max defines the alpha remap maximal range
    * @returns the current particle system
    */
  def addAlphaRemapGradient(gradient: Double, min: Double, max: Double): IParticleSystem = js.native
  
  /**
    * Adds a new angular speed gradient
    * @param gradient defines the gradient to use (between 0 and 1)
    * @param factor defines the angular speed to affect to the specified gradient
    * @param factor2 defines an additional factor used to define a range ([factor, factor2]) with main value to pick the final value from
    * @returns the current particle system
    */
  def addAngularSpeedGradient(gradient: Double, factor: Double): IParticleSystem = js.native
  def addAngularSpeedGradient(gradient: Double, factor: Double, factor2: Double): IParticleSystem = js.native
  /**
    * Adds a new angular speed gradient
    * @param gradient defines the gradient to use (between 0 and 1)
    * @param factor defines the angular speed to affect to the specified gradient
    * @returns the current particle system
    */
  @JSName("addAngularSpeedGradient")
  def addAngularSpeedGradient_GPUParticleSystem(gradient: Double, factor: Double): GPUParticleSystem = js.native
  
  /**
    * Adds a new color gradient
    * @param gradient defines the gradient to use (between 0 and 1)
    * @param color1 defines the color to affect to the specified gradient
    * @param color2 defines an additional color used to define a range ([color, color2]) with main color to pick the final color from
    * @returns the current particle system
    */
  def addColorGradient(gradient: Double, color1: Color4): IParticleSystem = js.native
  def addColorGradient(gradient: Double, color1: Color4, color2: Color4): IParticleSystem = js.native
  /**
    * Adds a new color gradient
    * @param gradient defines the gradient to use (between 0 and 1)
    * @param color1 defines the color to affect to the specified gradient
    * @param color2 defines an additional color used to define a range ([color, color2]) with main color to pick the final color from
    * @returns the current particle system
    */
  @JSName("addColorGradient")
  def addColorGradient_GPUParticleSystem(gradient: Double, color1: Color4): GPUParticleSystem = js.native
  @JSName("addColorGradient")
  def addColorGradient_GPUParticleSystem(gradient: Double, color1: Color4, color2: Color4): GPUParticleSystem = js.native
  
  /**
    * Not supported by GPUParticleSystem
    * @param gradient defines the gradient to use (between 0 and 1)
    * @param min defines the color remap minimal range
    * @param max defines the color remap maximal range
    * @returns the current particle system
    */
  /**
    * Adds a new color remap gradient
    * @param gradient defines the gradient to use (between 0 and 1)
    * @param min defines the color remap minimal range
    * @param max defines the color remap maximal range
    * @returns the current particle system
    */
  def addColorRemapGradient(gradient: Double, min: Double, max: Double): IParticleSystem = js.native
  
  /**
    * Adds a new drag gradient
    * @param gradient defines the gradient to use (between 0 and 1)
    * @param factor defines the drag to affect to the specified gradient
    * @param factor2 defines an additional factor used to define a range ([factor, factor2]) with main value to pick the final value from
    * @returns the current particle system
    */
  def addDragGradient(gradient: Double, factor: Double): IParticleSystem = js.native
  def addDragGradient(gradient: Double, factor: Double, factor2: Double): IParticleSystem = js.native
  /**
    * Adds a new drag gradient
    * @param gradient defines the gradient to use (between 0 and 1)
    * @param factor defines the drag value to affect to the specified gradient
    * @returns the current particle system
    */
  @JSName("addDragGradient")
  def addDragGradient_GPUParticleSystem(gradient: Double, factor: Double): GPUParticleSystem = js.native
  
  /**
    * Not supported by GPUParticleSystem
    * @param gradient defines the gradient to use (between 0 and 1)
    * @param factor defines the emit rate value to affect to the specified gradient
    * @param factor2 defines an additional factor used to define a range ([factor, factor2]) with main value to pick the final value from
    * @returns the current particle system
    */
  /**
    * Adds a new emit rate gradient (please note that this will only work if you set the targetStopDuration property)
    * @param gradient defines the gradient to use (between 0 and 1)
    * @param factor defines the emit rate to affect to the specified gradient
    * @param factor2 defines an additional factor used to define a range ([factor, factor2]) with main value to pick the final value from
    * @returns the current particle system
    */
  def addEmitRateGradient(gradient: Double, factor: Double): IParticleSystem = js.native
  def addEmitRateGradient(gradient: Double, factor: Double, factor2: Double): IParticleSystem = js.native
  
  /**
    * Not supported by GPUParticleSystem
    * @param gradient defines the gradient to use (between 0 and 1)
    * @param factor defines the life time factor to affect to the specified gradient
    * @param factor2 defines an additional factor used to define a range ([factor, factor2]) with main value to pick the final value from
    * @returns the current particle system
    */
  /**
    * Adds a new life time gradient
    * @param gradient defines the gradient to use (between 0 and 1)
    * @param factor defines the life time factor to affect to the specified gradient
    * @param factor2 defines an additional factor used to define a range ([factor, factor2]) with main value to pick the final value from
    * @returns the current particle system
    */
  def addLifeTimeGradient(gradient: Double, factor: Double): IParticleSystem = js.native
  def addLifeTimeGradient(gradient: Double, factor: Double, factor2: Double): IParticleSystem = js.native
  
  /**
    * Adds a new limit velocity gradient
    * @param gradient defines the gradient to use (between 0 and 1)
    * @param factor defines the limit velocity to affect to the specified gradient
    * @param factor2 defines an additional factor used to define a range ([factor, factor2]) with main value to pick the final value from
    * @returns the current particle system
    */
  def addLimitVelocityGradient(gradient: Double, factor: Double): IParticleSystem = js.native
  def addLimitVelocityGradient(gradient: Double, factor: Double, factor2: Double): IParticleSystem = js.native
  /**
    * Adds a new limit velocity gradient
    * @param gradient defines the gradient to use (between 0 and 1)
    * @param factor defines the limit velocity value to affect to the specified gradient
    * @returns the current particle system
    */
  @JSName("addLimitVelocityGradient")
  def addLimitVelocityGradient_GPUParticleSystem(gradient: Double, factor: Double): GPUParticleSystem = js.native
  
  /**
    * Not supported by GPUParticleSystem
    * @param gradient defines the gradient to use (between 0 and 1)
    * @param color defines the color to affect to the specified gradient
    * @returns the current particle system
    */
  /**
    * Adds a new ramp gradient used to remap particle colors
    * @param gradient defines the gradient to use (between 0 and 1)
    * @param color defines the color to affect to the specified gradient
    * @returns the current particle system
    */
  def addRampGradient(gradient: Double, color: Color3): IParticleSystem = js.native
  
  /**
    * Adds a new size gradient
    * @param gradient defines the gradient to use (between 0 and 1)
    * @param factor defines the size factor to affect to the specified gradient
    * @param factor2 defines an additional factor used to define a range ([factor, factor2]) with main value to pick the final value from
    * @returns the current particle system
    */
  def addSizeGradient(gradient: Double, factor: Double): IParticleSystem = js.native
  def addSizeGradient(gradient: Double, factor: Double, factor2: Double): IParticleSystem = js.native
  /**
    * Adds a new size gradient
    * @param gradient defines the gradient to use (between 0 and 1)
    * @param factor defines the size factor to affect to the specified gradient
    * @returns the current particle system
    */
  @JSName("addSizeGradient")
  def addSizeGradient_GPUParticleSystem(gradient: Double, factor: Double): GPUParticleSystem = js.native
  
  /**
    * Not supported by GPUParticleSystem
    * @param gradient defines the gradient to use (between 0 and 1)
    * @param factor defines the start size value to affect to the specified gradient
    * @param factor2 defines an additional factor used to define a range ([factor, factor2]) with main value to pick the final value from
    * @returns the current particle system
    */
  /**
    * Adds a new start size gradient (please note that this will only work if you set the targetStopDuration property)
    * @param gradient defines the gradient to use (between 0 and 1)
    * @param factor defines the start size to affect to the specified gradient
    * @param factor2 defines an additional factor used to define a range ([factor, factor2]) with main value to pick the final value from
    * @returns the current particle system
    */
  def addStartSizeGradient(gradient: Double, factor: Double): IParticleSystem = js.native
  def addStartSizeGradient(gradient: Double, factor: Double, factor2: Double): IParticleSystem = js.native
  
  /**
    * Adds a new velocity gradient
    * @param gradient defines the gradient to use (between 0 and 1)
    * @param factor defines the velocity to affect to the specified gradient
    * @param factor2 defines an additional factor used to define a range ([factor, factor2]) with main value to pick the final value from
    * @returns the current particle system
    */
  def addVelocityGradient(gradient: Double, factor: Double): IParticleSystem = js.native
  def addVelocityGradient(gradient: Double, factor: Double, factor2: Double): IParticleSystem = js.native
  /**
    * Adds a new velocity gradient
    * @param gradient defines the gradient to use (between 0 and 1)
    * @param factor defines the velocity to affect to the specified gradient
    * @returns the current particle system
    */
  @JSName("addVelocityGradient")
  def addVelocityGradient_GPUParticleSystem(gradient: Double, factor: Double): GPUParticleSystem = js.native
  
  /**
    * Animates the particle system for the current frame by emitting new particles and or animating the living ones.
    * @param preWarm defines if we are in the pre-warmimg phase
    */
  /**
    * Animates the particle system for this frame.
    */
  def animate(): Unit = js.native
  def animate(preWarm: Boolean): Unit = js.native
  
  /**
    * Clones the particle system.
    * @param name The name of the cloned object
    * @param newEmitter The new emitter to use
    * @returns the cloned particle system
    */
  def clone(name: String, newEmitter: js.Any): GPUParticleSystem = js.native
  /**
    * Clones the particle system.
    * @param name The name of the cloned object
    * @param newEmitter The new emitter to use
    * @returns the cloned particle system
    */
  @JSName("clone")
  def clone_Nullable(name: String, newEmitter: js.Any): Nullable[IParticleSystem] = js.native
  
  /** Gets or sets a matrix to use to compute projection */
  var defaultProjectionMatrix: Matrix = js.native
  
  def dispose(disposeTexture: Boolean): Unit = js.native
  
  /**
    * Fill the defines array according to the current settings of the particle system
    * @param defines Array to be updated
    * @param blendMode blend mode to take into account when updating the array
    */
  def fillDefines(defines: js.Array[String]): Unit = js.native
  /**
    * Fill the defines array according to the current settings of the particle system
    * @param defines Array to be updated
    * @param blendMode blend mode to take into account when updating the array
    */
  def fillDefines(defines: js.Array[String], blendMode: Double): Unit = js.native
  
  /**
    * Fill the uniforms, attributes and samplers arrays according to the current settings of the particle system
    * @param uniforms Uniforms array to fill
    * @param attributes Attributes array to fill
    * @param samplers Samplers array to fill
    */
  def fillUniformsAttributesAndSamplerNames(uniforms: js.Array[String], attributes: js.Array[String], samplers: js.Array[String]): Unit = js.native
  
  /** Force the system to rebuild all gradients that need to be resync */
  def forceRefreshGradients(): Unit = js.native
  
  /**
    * Gets the number of particles active at the same time.
    * @returns The number of active particles.
    */
  def getActiveCount(): Double = js.native
  
  /**
    * Gets the maximum number of particles active at the same time.
    * @returns The max number of active particles.
    */
  def getCapacity(): Double = js.native
  
  /**
    * Returns the string "GPUParticleSystem"
    * @returns a string containing the class name
    */
  /**
    * Returns the string "ParticleSystem"
    * @returns a string containing the class name
    */
  def getClassName(): String = js.native
  
  /**
    * Gets the custom effect used to render the particles
    * @param blendMode Blend mode for which the effect should be retrieved
    * @returns The effect
    */
  def getCustomEffect(): Nullable[Effect] = js.native
  /**
    * Gets the custom effect used to render the particles
    * @param blendMode Blend mode for which the effect should be retrieved
    * @returns The effect
    */
  def getCustomEffect(blendMode: Double): Nullable[Effect] = js.native
  
  /**
    * Not supported by GPUParticleSystem
    * @returns the list of ramp gradients
    */
  /**
    * Gets the current list of ramp gradients.
    * You must use addRampGradient and removeRampGradient to udpate this list
    * @returns the list of ramp gradients
    */
  def getRampGradients(): Nullable[js.Array[Color3Gradient]] = js.native
  
  /**
    * Specifies if the particles are updated in emitter local space or world space.
    */
  var isLocal: Boolean = js.native
  
  /**
    * Is this system ready to be used/rendered
    * @return true if the system is ready
    */
  def isReady(): Boolean = js.native
  
  /**
    * Gets if the system has been started. (Note: this will still be true after stop is called)
    * @returns True if it has been started, otherwise false.
    */
  def isStarted(): Boolean = js.native
  
  /**
    * Gets if the system has been stopped. (Note: rendering is still happening but the system is frozen)
    * @returns True if it has been stopped, otherwise false.
    */
  def isStopped(): Boolean = js.native
  
  /**
    * Gets a boolean indicating that the system is stopping
    * @returns true if the system is currently stopping
    */
  def isStopping(): Boolean = js.native
  
  /**
    * Observable that will be called just before the particles are drawn
    */
  def onBeforeDrawParticlesObservable: Observable[Nullable[Effect]] = js.native
  /**
    * Observable that will be called just before the particles are drawn
    */
  @JSName("onBeforeDrawParticlesObservable")
  var onBeforeDrawParticlesObservable_FGPUParticleSystem: Observable[Nullable[Effect]] = js.native
  
  /**
    * An event triggered when the system is disposed.
    */
  var onDisposeObservable: Observable[IParticleSystem] = js.native
  
  /**
    * An event triggered when the system is stopped
    */
  var onStoppedObservable: Observable[IParticleSystem] = js.native
  
  /**
    * Rebuilds the particle system
    */
  /**
    * Rebuild the particle system
    */
  def rebuild(): Unit = js.native
  
  /**
    * Not supported by GPUParticleSystem
    * @param gradient defines the gradient to remove
    * @returns the current particle system
    */
  def removeAlphaRemapGradient(): IParticleSystem = js.native
  
  /**
    * Remove a specific angular speed gradient
    * @param gradient defines the gradient to remove
    * @returns the current particle system
    */
  def removeAngularSpeedGradient(gradient: Double): IParticleSystem = js.native
  /**
    * Remove a specific angular speed gradient
    * @param gradient defines the gradient to remove
    * @returns the current particle system
    */
  @JSName("removeAngularSpeedGradient")
  def removeAngularSpeedGradient_GPUParticleSystem(gradient: Double): GPUParticleSystem = js.native
  
  /**
    * Remove a specific color gradient
    * @param gradient defines the gradient to remove
    * @returns the current particle system
    */
  def removeColorGradient(gradient: Double): IParticleSystem = js.native
  /**
    * Remove a specific color gradient
    * @param gradient defines the gradient to remove
    * @returns the current particle system
    */
  @JSName("removeColorGradient")
  def removeColorGradient_GPUParticleSystem(gradient: Double): GPUParticleSystem = js.native
  
  /**
    * Not supported by GPUParticleSystem
    * @param gradient defines the gradient to remove
    * @returns the current particle system
    */
  def removeColorRemapGradient(): IParticleSystem = js.native
  
  /**
    * Remove a specific drag gradient
    * @param gradient defines the gradient to remove
    * @returns the current particle system
    */
  def removeDragGradient(gradient: Double): IParticleSystem = js.native
  /**
    * Remove a specific drag gradient
    * @param gradient defines the gradient to remove
    * @returns the current particle system
    */
  @JSName("removeDragGradient")
  def removeDragGradient_GPUParticleSystem(gradient: Double): GPUParticleSystem = js.native
  
  /**
    * Not supported by GPUParticleSystem
    * @param gradient defines the gradient to remove
    * @returns the current particle system
    */
  /**
    * Remove a specific emit rate gradient
    * @param gradient defines the gradient to remove
    * @returns the current particle system
    */
  def removeEmitRateGradient(gradient: Double): IParticleSystem = js.native
  
  /**
    * Not supported by GPUParticleSystem
    * @param gradient defines the gradient to remove
    * @returns the current particle system
    */
  /**
    * Remove a specific life time gradient
    * @param gradient defines the gradient to remove
    * @returns the current particle system
    */
  def removeLifeTimeGradient(gradient: Double): IParticleSystem = js.native
  
  /**
    * Remove a specific limit velocity gradient
    * @param gradient defines the gradient to remove
    * @returns the current particle system
    */
  def removeLimitVelocityGradient(gradient: Double): IParticleSystem = js.native
  /**
    * Remove a specific limit velocity gradient
    * @param gradient defines the gradient to remove
    * @returns the current particle system
    */
  @JSName("removeLimitVelocityGradient")
  def removeLimitVelocityGradient_GPUParticleSystem(gradient: Double): GPUParticleSystem = js.native
  
  /**
    * Not supported by GPUParticleSystem
    * @param gradient defines the gradient to remove
    * @returns the current particle system
    */
  def removeRampGradient(): IParticleSystem = js.native
  
  /**
    * Remove a specific size gradient
    * @param gradient defines the gradient to remove
    * @returns the current particle system
    */
  def removeSizeGradient(gradient: Double): IParticleSystem = js.native
  /**
    * Remove a specific size gradient
    * @param gradient defines the gradient to remove
    * @returns the current particle system
    */
  @JSName("removeSizeGradient")
  def removeSizeGradient_GPUParticleSystem(gradient: Double): GPUParticleSystem = js.native
  
  /**
    * Not supported by GPUParticleSystem
    * @param gradient defines the gradient to remove
    * @returns the current particle system
    */
  /**
    * Remove a specific start size gradient
    * @param gradient defines the gradient to remove
    * @returns the current particle system
    */
  def removeStartSizeGradient(gradient: Double): IParticleSystem = js.native
  
  /**
    * Remove a specific velocity gradient
    * @param gradient defines the gradient to remove
    * @returns the current particle system
    */
  def removeVelocityGradient(gradient: Double): IParticleSystem = js.native
  /**
    * Remove a specific velocity gradient
    * @param gradient defines the gradient to remove
    * @returns the current particle system
    */
  @JSName("removeVelocityGradient")
  def removeVelocityGradient_GPUParticleSystem(gradient: Double): GPUParticleSystem = js.native
  
  /**
    * Renders the particle system in its current state
    * @param preWarm defines if the system should only update the particles but not render them
    * @returns the current number of particles
    */
  /**
    * Renders the particle system in its current state.
    * @returns the current number of particles
    */
  def render(): Double = js.native
  def render(preWarm: Boolean): Double = js.native
  
  /**
    * Remove all active particles
    */
  def reset(): Unit = js.native
  
  /**
    * Serializes the particle system to a JSON object
    * @param serializeTexture defines if the texture must be serialized as well
    * @returns the JSON object
    */
  def serialize(): js.Any = js.native
  /**
    * Serializes the particle system to a JSON object
    * @param serializeTexture defines if the texture must be serialized as well
    * @returns the JSON object
    */
  def serialize(serializeTexture: Boolean): js.Any = js.native
  
  /**
    * Sets the custom effect used to render the particles
    * @param effect The effect to set
    * @param blendMode Blend mode for which the effect should be set
    */
  def setCustomEffect(effect: Nullable[Effect]): Unit = js.native
  /**
    * Sets the custom effect used to render the particles
    * @param effect The effect to set
    * @param blendMode Blend mode for which the effect should be set
    */
  def setCustomEffect(effect: Nullable[Effect], blendMode: Double): Unit = js.native
  
  /**
    * Starts the particle system and begins to emit
    * @param delay defines the delay in milliseconds before starting the system (this.startDelay by default)
    */
  /**
    * Starts the particle system and begins to emit
    * @param delay defines the delay in milliseconds before starting the system (0 by default)
    */
  def start(): Unit = js.native
  def start(delay: Double): Unit = js.native
  
  /**
    * Stops the particle system.
    */
  def stop(): Unit = js.native
  
  /**
    * Not supported by GPUParticleSystem
    * Gets or sets a boolean indicating that ramp gradients must be used
    * @see https://doc.babylonjs.com/babylon101/particles#ramp-gradients
    */
  def useRampGradients: Boolean = js.native
  def useRampGradients_=(value: Boolean): Unit = js.native
  /** Gets or sets a boolean indicating that ramp gradients must be used
    * @see https://doc.babylonjs.com/babylon101/particles#ramp-gradients
    */
  @JSName("useRampGradients")
  var useRampGradients_FGPUParticleSystem: Boolean = js.native
  
  /**
    * Gets the name of the particle vertex shader
    */
  def vertexShaderName: String = js.native
  /**
    * Gets the name of the particle vertex shader
    */
  @JSName("vertexShaderName")
  var vertexShaderName_FGPUParticleSystem: String = js.native
}
