package typingsSlinky.motorHat.mod

import typingsSlinky.motorHat.anon.M1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MotorHat extends js.Object {
  
  /**
    * Creates a new DC motor controller
    * Pass in an options object to generate an uninitialized DCLib object
    */
  def dc(opts: DCOptions): DC = js.native
  
  /**
    * Array of initialized DC controllers
    */
  val dcs: js.Array[DC] = js.native
  
  /**
    * Initialize the motorHat library instance.
    * Synchronous overload.
    *
    * Instantiates the individual Motor/Servo/Stepper controllers and initializes them.
    *
    * @returns     Returns initialized motorHat object (self)
    */
  def init(): MotorHat = js.native
  /**
    * Initialize the motorHat library instance.
    * Asynchronous overload.
    *
    * Instantiates the individual Motor/Servo/Stepper controllers and initializes them.
    * Returns initialized motorHat object (self) in second parameter to callback if callback
    * provided, to enable chaining.
    *
    * @param   cb  Node style callback for asynch initialization
    */
  def init(cb: Callback): Unit = js.native
  
  val pins: M1 = js.native
  
  /**
    * Creates a servo motor controller.
    * Pass in an options object to generate an uninitialized ServoLib object.
    */
  def servo(opts: ServoOptions): Servo = js.native
  
  /**
    * Array of initialized Servo controllers
    */
  val servos: js.Array[Servo] = js.native
  
  /**
    * Creates a stepper motor controller.
    * Pass in an options object to generate an uninitialized StepperLib object.
    */
  def stepper(opts: StepperOptions): Stepper = js.native
  
  /**
    * Array of initialized Stepper controllers
    */
  val steppers: js.Array[Stepper] = js.native
}
