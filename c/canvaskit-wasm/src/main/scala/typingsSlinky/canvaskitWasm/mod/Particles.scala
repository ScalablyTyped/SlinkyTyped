package typingsSlinky.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Particles extends EmbindObject[Particles] {
  
  /**
    * Draws the current state of the particles on the given canvas.
    * @param canvas
    */
  def draw(canvas: SkCanvas): Unit = js.native
  
  /**
    * Returns a Float32Array bound to the WASM memory of these uniforms. Changing these
    * floats will change the corresponding uniforms instantly.
    */
  def effectUniforms(): js.typedarray.Float32Array = js.native
  
  /**
    * Returns the nth uniform from the effect.
    * @param index
    */
  def getEffectUniform(index: Double): ParticlesUniform = js.native
  
  /**
    * Returns the number of uniforms on the effect.
    */
  def getEffectUniformCount(): Double = js.native
  
  /**
    * Returns the number of float uniforms on the effect.
    */
  def getEffectUniformFloatCount(): Double = js.native
  
  /**
    * Returns the name of the nth effect uniform.
    * @param index
    */
  def getEffectUniformName(index: Double): String = js.native
  
  /**
    * Returns the nth uniform on the particles.
    * @param index
    */
  def getParticleUniform(index: Double): ParticlesUniform = js.native
  
  /**
    * Returns the count of uniforms on the particles.
    */
  def getParticleUniformCount(): Double = js.native
  
  /**
    * Returns the number of float uniforms on the particles.
    */
  def getParticleUniformFloatCount(): Double = js.native
  
  /**
    * Returns the name of the nth particle uniform.
    * @param index
    */
  def getParticleUniformName(index: Double): String = js.native
  
  /**
    * Returns a Float32Array bound to the WASM memory of these uniforms. Changing these
    * floats will change the corresponding uniforms instantly.
    */
  def particleUniforms(): js.typedarray.Float32Array = js.native
  
  /**
    * Sets the base position of the effect.
    * @param point
    */
  def setPosition(point: SkPoint): Unit = js.native
  
  /**
    * Sets the base rate of the effect.
    * @param rate
    */
  def setRate(rate: Double): Unit = js.native
  
  /**
    * Starts playing the effect.
    * @param now
    * @param looping
    */
  def start(now: Double, looping: Boolean): Unit = js.native
  
  /**
    * Updates the effect using the new time.
    * @param now
    */
  def update(now: Double): Unit = js.native
}
object Particles {
  
  @scala.inline
  def apply(
    delete: () => Unit,
    deleteAfter: () => Unit,
    draw: SkCanvas => Unit,
    effectUniforms: () => js.typedarray.Float32Array,
    getEffectUniform: Double => ParticlesUniform,
    getEffectUniformCount: () => Double,
    getEffectUniformFloatCount: () => Double,
    getEffectUniformName: Double => String,
    getParticleUniform: Double => ParticlesUniform,
    getParticleUniformCount: () => Double,
    getParticleUniformFloatCount: () => Double,
    getParticleUniformName: Double => String,
    isAliasOf: js.Any => Boolean,
    isDeleted: () => Boolean,
    particleUniforms: () => js.typedarray.Float32Array,
    setPosition: SkPoint => Unit,
    setRate: Double => Unit,
    start: (Double, Boolean) => Unit,
    update: Double => Unit
  ): Particles = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction0(delete), deleteAfter = js.Any.fromFunction0(deleteAfter), draw = js.Any.fromFunction1(draw), effectUniforms = js.Any.fromFunction0(effectUniforms), getEffectUniform = js.Any.fromFunction1(getEffectUniform), getEffectUniformCount = js.Any.fromFunction0(getEffectUniformCount), getEffectUniformFloatCount = js.Any.fromFunction0(getEffectUniformFloatCount), getEffectUniformName = js.Any.fromFunction1(getEffectUniformName), getParticleUniform = js.Any.fromFunction1(getParticleUniform), getParticleUniformCount = js.Any.fromFunction0(getParticleUniformCount), getParticleUniformFloatCount = js.Any.fromFunction0(getParticleUniformFloatCount), getParticleUniformName = js.Any.fromFunction1(getParticleUniformName), isAliasOf = js.Any.fromFunction1(isAliasOf), isDeleted = js.Any.fromFunction0(isDeleted), particleUniforms = js.Any.fromFunction0(particleUniforms), setPosition = js.Any.fromFunction1(setPosition), setRate = js.Any.fromFunction1(setRate), start = js.Any.fromFunction2(start), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[Particles]
  }
  
  @scala.inline
  implicit class ParticlesMutableBuilder[Self <: Particles] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDraw(value: SkCanvas => Unit): Self = StObject.set(x, "draw", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEffectUniforms(value: () => js.typedarray.Float32Array): Self = StObject.set(x, "effectUniforms", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetEffectUniform(value: Double => ParticlesUniform): Self = StObject.set(x, "getEffectUniform", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetEffectUniformCount(value: () => Double): Self = StObject.set(x, "getEffectUniformCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetEffectUniformFloatCount(value: () => Double): Self = StObject.set(x, "getEffectUniformFloatCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetEffectUniformName(value: Double => String): Self = StObject.set(x, "getEffectUniformName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetParticleUniform(value: Double => ParticlesUniform): Self = StObject.set(x, "getParticleUniform", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetParticleUniformCount(value: () => Double): Self = StObject.set(x, "getParticleUniformCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetParticleUniformFloatCount(value: () => Double): Self = StObject.set(x, "getParticleUniformFloatCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetParticleUniformName(value: Double => String): Self = StObject.set(x, "getParticleUniformName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParticleUniforms(value: () => js.typedarray.Float32Array): Self = StObject.set(x, "particleUniforms", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetPosition(value: SkPoint => Unit): Self = StObject.set(x, "setPosition", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetRate(value: Double => Unit): Self = StObject.set(x, "setRate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStart(value: (Double, Boolean) => Unit): Self = StObject.set(x, "start", js.Any.fromFunction2(value))
    
    @scala.inline
    def setUpdate(value: Double => Unit): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
  }
}
