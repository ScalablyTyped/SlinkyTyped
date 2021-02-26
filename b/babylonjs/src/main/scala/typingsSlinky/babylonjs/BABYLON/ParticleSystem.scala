package typingsSlinky.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.babylonjs.BABYLON.IParticleSystem because var conflicts: animations, beginAnimationFrom, beginAnimationLoop, beginAnimationOnStart, beginAnimationTo, billboardMode, blendMode, color1, color2, colorDead, disposeOnStop, emitRate, emitter, endSpriteCellID, gravity, id, isAnimationSheetEnabled, isBillboardBased, layerMask, limitVelocityDamping, maxAngularSpeed, maxEmitPower, maxInitialRotation, maxLifeTime, maxScaleX, maxScaleY, maxSize, minAngularSpeed, minEmitPower, minInitialRotation, minLifeTime, minScaleX, minScaleY, minSize, name, noiseStrength, noiseTexture, particleEmitterType, particleTexture, preWarmCycles, preWarmStepOffset, renderingGroupId, snippetId, spriteCellChangeSpeed, spriteCellHeight, spriteCellWidth, spriteRandomStartCell, startDelay, startSpriteCellID, targetStopDuration, translationPivot, updateSpeed. Inlined isLocal, defaultProjectionMatrix, getCapacity, getActiveCount, isStarted, animate, render, onDisposeObservable, onStoppedObservable, clone, serialize, rebuild, forceRefreshGradients, start, start, stop, reset, isStopping, isReady, getClassName, getCustomEffect, setCustomEffect, fillDefines, fillUniformsAttributesAndSamplerNames, onBeforeDrawParticlesObservable, vertexShaderName, addColorGradient, addColorGradient, removeColorGradient, addSizeGradient, addSizeGradient, removeSizeGradient, addAngularSpeedGradient, addAngularSpeedGradient, removeAngularSpeedGradient, addVelocityGradient, addVelocityGradient, removeVelocityGradient, addLimitVelocityGradient, addLimitVelocityGradient, removeLimitVelocityGradient, addDragGradient, addDragGradient, removeDragGradient, addEmitRateGradient, addEmitRateGradient, removeEmitRateGradient, addStartSizeGradient, addStartSizeGradient, removeStartSizeGradient, addLifeTimeGradient, addLifeTimeGradient, removeLifeTimeGradient, addRampGradient, getRampGradients, useRampGradients, addColorRemapGradient, addAlphaRemapGradient
- typingsSlinky.babylonjs.BABYLON.IAnimatable because var conflicts: animations. Inlined  */ @js.native
trait ParticleSystem
  extends BaseParticleSystem
     with IDisposable {
  
  var _actualFrame: js.Any = js.native
  
  var _addFactorGradient: js.Any = js.native
  
  var _alive: js.Any = js.native
  
  /**
    * @hidden (for internal use only)
    */
  def _appendParticleVertex(index: Double, particle: Particle, offsetX: Double, offsetY: Double): Unit = js.native
  
  var _appendParticleVertices: js.Any = js.native
  
  var _cachedDefines: js.Any = js.native
  
  var _capacity: js.Any = js.native
  
  var _colorDiff: js.Any = js.native
  
  var _createIndexBuffer: js.Any = js.native
  
  var _createParticle: js.Any = js.native
  
  var _createRampGradientTexture: js.Any = js.native
  
  var _createVertexBuffers: js.Any = js.native
  
  /** @hidden */
  var _currentEmitRate1: Double = js.native
  
  /** @hidden */
  var _currentEmitRate2: Double = js.native
  
  /** @hidden */
  var _currentEmitRateGradient: Nullable[FactorGradient] = js.native
  
  var _currentRenderId: js.Any = js.native
  
  /** @hidden */
  var _currentStartSize1: Double = js.native
  
  /** @hidden */
  var _currentStartSize2: Double = js.native
  
  /** @hidden */
  var _currentStartSizeGradient: Nullable[FactorGradient] = js.native
  
  var _customEffect: js.Any = js.native
  
  /**
    * @hidden
    * If the particle systems emitter should be disposed when the particle system is disposed
    */
  var _disposeEmitterOnDispose: Boolean = js.native
  
  var _effect: js.Any = js.native
  
  var _emitFromParticle: js.Any = js.native
  
  var _emitterWorldMatrix: js.Any = js.native
  
  var _epsilon: js.Any = js.native
  
  var _fetchR: js.Any = js.native
  
  /** @hidden */
  var _getEffect: js.Any = js.native
  
  var _indexBuffer: js.Any = js.native
  
  /**
    * @hidden
    */
  var _inheritedVelocityOffset: Vector3 = js.native
  
  var _newPartsExcess: js.Any = js.native
  
  /** @hidden */
  var _onBeforeDrawParticlesObservable: js.Any = js.native
  
  var _onDisposeObserver: js.Any = js.native
  
  var _particles: js.Any = js.native
  
  var _prepareSubEmitterInternalArray: js.Any = js.native
  
  var _rampGradientsTexture: js.Any = js.native
  
  val _rawTextureWidth: js.Any = js.native
  
  var _removeFactorGradient: js.Any = js.native
  
  var _removeFromRoot: js.Any = js.native
  
  var _render: js.Any = js.native
  
  var _resetEffect: js.Any = js.native
  
  var _rootParticleSystem: js.Any = js.native
  
  var _scaledColorStep: js.Any = js.native
  
  var _scaledDirection: js.Any = js.native
  
  var _scaledGravity: js.Any = js.native
  
  var _scaledUpdateSpeed: js.Any = js.native
  
  var _spriteBuffer: js.Any = js.native
  
  var _started: js.Any = js.native
  
  var _stockParticles: js.Any = js.native
  
  var _stopSubEmitters: js.Any = js.native
  
  var _stopped: js.Any = js.native
  
  var _subEmitters: js.Any = js.native
  
  var _syncRampGradientTexture: js.Any = js.native
  
  var _update: js.Any = js.native
  
  var _useInstancing: js.Any = js.native
  
  var _useRampGradients: js.Any = js.native
  
  var _vertexArrayObject: js.Any = js.native
  
  var _vertexBuffer: js.Any = js.native
  
  var _vertexBufferSize: js.Any = js.native
  
  var _vertexBuffers: js.Any = js.native
  
  var _vertexData: js.Any = js.native
  
  /**
    * The current active Sub-systems, this property is used by the root particle system only.
    */
  var activeSubSystems: js.Array[ParticleSystem] = js.native
  
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
    * @param factor defines the angular speed  to affect to the specified gradient
    * @param factor2 defines an additional factor used to define a range ([factor, factor2]) with main value to pick the final value from
    * @returns the current particle system
    */
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
    * Adds a new color gradient
    * @param gradient defines the gradient to use (between 0 and 1)
    * @param color1 defines the color to affect to the specified gradient
    * @param color2 defines an additional color used to define a range ([color, color2]) with main color to pick the final color from
    * @returns this particle system
    */
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
    * @param factor defines the drag value to affect to the specified gradient
    * @param factor2 defines an additional factor used to define a range ([factor, factor2]) with main value to pick the final value from
    * @returns the current particle system
    */
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
    * Adds a new emit rate gradient (please note that this will only work if you set the targetStopDuration property)
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
    * @param factor defines the limit velocity value to affect to the specified gradient
    * @param factor2 defines an additional factor used to define a range ([factor, factor2]) with main value to pick the final value from
    * @returns the current particle system
    */
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
    * Adds a new ramp gradient used to remap particle colors
    * @param gradient defines the gradient to use (between 0 and 1)
    * @param color defines the color to affect to the specified gradient
    * @returns the current particle system
    */
  def addRampGradient(gradient: Double, color: Color3): IParticleSystem = js.native
  /**
    * Adds a new ramp gradient used to remap particle colors
    * @param gradient defines the gradient to use (between 0 and 1)
    * @param color defines the color to affect to the specified gradient
    * @returns the current particle system
    */
  @JSName("addRampGradient")
  def addRampGradient_ParticleSystem(gradient: Double, color: Color3): ParticleSystem = js.native
  
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
    * Adds a new start size gradient (please note that this will only work if you set the targetStopDuration property)
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
    * Animates the particle system for the current frame by emitting new particles and or animating the living ones.
    * @param preWarmOnly will prevent the system from updating the vertex buffer (default is false)
    */
  /**
    * Animates the particle system for this frame.
    */
  def animate(): Unit = js.native
  def animate(preWarmOnly: Boolean): Unit = js.native
  
  /**
    * Clones the particle system.
    * @param name The name of the cloned object
    * @param newEmitter The new emitter to use
    * @returns the cloned particle system
    */
  def clone(name: String, newEmitter: js.Any): ParticleSystem = js.native
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
  
  /** Gets or sets a matrix to use to compute view */
  var defaultViewMatrix: Matrix = js.native
  
  def dispose(disposeTexture: Boolean): Unit = js.native
  
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
    * Gets the current list of ramp gradients.
    * You must use addRampGradient and removeRampGradient to udpate this list
    * @returns the list of ramp gradients
    */
  def getRampGradients(): Nullable[js.Array[Color3Gradient]] = js.native
  
  /**
    * Gets whether there are still active particles in the system.
    * @returns True if it is alive, otherwise false.
    */
  def isAlive(): Boolean = js.native
  
  /**
    * Specifies if the particles are updated in emitter local space or world space
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
  var onBeforeDrawParticlesObservable_FParticleSystem: Observable[Nullable[Effect]] = js.native
  
  /**
    * An event triggered when the system is disposed
    */
  var onDisposeObservable: Observable[IParticleSystem] = js.native
  
  /**
    * Sets a callback that will be triggered when the system is disposed
    */
  def onDispose_=(callback: js.Function0[Unit]): Unit = js.native
  
  /**
    * An event triggered when the system is stopped
    */
  var onStoppedObservable: Observable[IParticleSystem] = js.native
  
  /**
    * Gets the current list of active particles
    */
  def particles: js.Array[Particle] = js.native
  
  /**
    * Rebuilds the particle system.
    */
  /**
    * Rebuild the particle system
    */
  def rebuild(): Unit = js.native
  
  /**
    * "Recycles" one of the particle by copying it back to the "stock" of particles and removing it from the active list.
    * Its lifetime will start back at 0.
    */
  def recycleParticle(particle: Particle): Unit = js.native
  
  /**
    * Remove a specific alpha remap gradient
    * @param gradient defines the gradient to remove
    * @returns the current particle system
    */
  def removeAlphaRemapGradient(gradient: Double): IParticleSystem = js.native
  
  /**
    * Remove a specific angular speed gradient
    * @param gradient defines the gradient to remove
    * @returns the current particle system
    */
  def removeAngularSpeedGradient(gradient: Double): IParticleSystem = js.native
  
  /**
    * Remove a specific color gradient
    * @param gradient defines the gradient to remove
    * @returns this particle system
    */
  /**
    * Remove a specific color gradient
    * @param gradient defines the gradient to remove
    * @returns the current particle system
    */
  def removeColorGradient(gradient: Double): IParticleSystem = js.native
  
  /**
    * Remove a specific color remap gradient
    * @param gradient defines the gradient to remove
    * @returns the current particle system
    */
  def removeColorRemapGradient(gradient: Double): IParticleSystem = js.native
  
  /**
    * Remove a specific drag gradient
    * @param gradient defines the gradient to remove
    * @returns the current particle system
    */
  def removeDragGradient(gradient: Double): IParticleSystem = js.native
  
  /**
    * Remove a specific emit rate gradient
    * @param gradient defines the gradient to remove
    * @returns the current particle system
    */
  def removeEmitRateGradient(gradient: Double): IParticleSystem = js.native
  
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
    * Remove a specific ramp gradient
    * @param gradient defines the gradient to remove
    * @returns the current particle system
    */
  def removeRampGradient(gradient: Double): ParticleSystem = js.native
  
  /**
    * Remove a specific size gradient
    * @param gradient defines the gradient to remove
    * @returns the current particle system
    */
  def removeSizeGradient(gradient: Double): IParticleSystem = js.native
  
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
    * Renders the particle system in its current state.
    * @returns the current number of particles
    */
  def render(): Double = js.native
  
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
    * This function can be defined to specify initial direction for every new particle.
    * It by default use the emitterType defined function
    */
  def startDirectionFunction(worldMatrix: Matrix, directionToUpdate: Vector3, particle: Particle, isLocal: Boolean): Unit = js.native
  
  /**
    * This function can be defined to specify initial position for every new particle.
    * It by default use the emitterType defined function
    */
  def startPositionFunction(worldMatrix: Matrix, positionToUpdate: Vector3, particle: Particle, isLocal: Boolean): Unit = js.native
  
  /**
    * Stops the particle system.
    * @param stopSubEmitters if true it will stop the current system and all created sub-Systems if false it will stop the current root system only, this param is used by the root particle system only. the default value is true.
    */
  /**
    * Stops the particle system.
    */
  def stop(): Unit = js.native
  def stop(stopSubEmitters: Boolean): Unit = js.native
  
  /**
    * The Sub-emitters templates that will be used to generate the sub particle system to be associated with the system, this property is used by the root particle system only.
    * When a particle is spawned, an array will be chosen at random and all the emitters in that array will be attached to the particle.  (Default: [])
    */
  var subEmitters: js.Array[ParticleSystem | SubEmitter | js.Array[SubEmitter]] = js.native
  
  /**
    * This function can be defined to provide custom update for active particles.
    * This function will be called instead of regular update (age, position, color, etc.).
    * Do not forget that this function will be called on every frame so try to keep it simple and fast :)
    */
  def updateFunction(particles: js.Array[Particle]): Unit = js.native
  
  /** Gets or sets a boolean indicating that ramp gradients must be used
    * @see https://doc.babylonjs.com/babylon101/particles#ramp-gradients
    */
  def useRampGradients: Boolean = js.native
  def useRampGradients_=(value: Boolean): Unit = js.native
  /** Gets or sets a boolean indicating that ramp gradients must be used
    * @see https://doc.babylonjs.com/babylon101/particles#ramp-gradients
    */
  @JSName("useRampGradients")
  var useRampGradients_FParticleSystem: Boolean = js.native
  
  /**
    * Gets the name of the particle vertex shader
    */
  def vertexShaderName: String = js.native
  /**
    * Gets the name of the particle vertex shader
    */
  @JSName("vertexShaderName")
  var vertexShaderName_FParticleSystem: String = js.native
}
