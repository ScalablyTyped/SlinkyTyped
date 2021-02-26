package typingsSlinky.phaser.MatterJS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The `Matter.Runner` module is an optional utility which provides a game loop,
  * that handles updating and rendering a `Matter.Engine` for you within a browser.
  * It is intended for demo and testing purposes, but may be adequate for simple games.
  * If you are using your own game loop instead, then you do not need the `Matter.Runner` module.
  * Instead just call `Engine.update(engine, delta)` in your own loop.
  * Note that the method `Engine.run` is an alias for `Runner.run`.
  *
  * See the included usage [examples](https://github.com/liabru/matter-js/tree/master/examples).
  *
  * @class Runner
  */
@js.native
trait Runner extends StObject {
  
  /**
    * A `Number` that specifies the time step between updates in milliseconds.
    * If `engine.timing.isFixed` is set to `true`, then `delta` is fixed.
    * If it is `false`, then `delta` can dynamically change to maintain the correct apparent simulation speed.
    *
    * @property delta
    * @type number
    * @default 1000 / 60
    */
  var delta: Double = js.native
  
  /**
    * A flag that specifies whether the runner is running or not.
    *
    * @property enabled
    * @type boolean
    * @default true
    */
  var enabled: Boolean = js.native
  
  /**
    * A `Boolean` that specifies if the runner should use a fixed timestep (otherwise it is variable).
    * If timing is fixed, then the apparent simulation speed will change depending on the frame rate (but behaviour will be deterministic).
    * If the timing is variable, then the apparent simulation speed will be constant (approximately, but at the cost of determininism).
    *
    * @property isFixed
    * @type boolean
    * @default false
    */
  var isFixed: Boolean = js.native
}
object Runner {
  
  @scala.inline
  def apply(delta: Double, enabled: Boolean, isFixed: Boolean): Runner = {
    val __obj = js.Dynamic.literal(delta = delta.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], isFixed = isFixed.asInstanceOf[js.Any])
    __obj.asInstanceOf[Runner]
  }
  
  @scala.inline
  implicit class RunnerMutableBuilder[Self <: Runner] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDelta(value: Double): Self = StObject.set(x, "delta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsFixed(value: Boolean): Self = StObject.set(x, "isFixed", value.asInstanceOf[js.Any])
  }
}
