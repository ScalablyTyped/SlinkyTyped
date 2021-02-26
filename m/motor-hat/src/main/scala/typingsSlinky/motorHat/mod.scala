package typingsSlinky.motorHat

import typingsSlinky.motorHat.anon.M1
import typingsSlinky.motorHat.anon.W1
import typingsSlinky.motorHat.anon.W2
import typingsSlinky.motorHat.motorHatNumbers.`16`
import typingsSlinky.motorHat.motorHatNumbers.`8`
import typingsSlinky.motorHat.motorHatStrings.double
import typingsSlinky.motorHat.motorHatStrings.interleaved
import typingsSlinky.motorHat.motorHatStrings.microstep
import typingsSlinky.motorHat.motorHatStrings.single
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Creates a new MotorHat controller
    *
    * Pass in an options object to generate an uninitialized MotorHat object.
    */
  @JSImport("motor-hat", JSImport.Default)
  @js.native
  def default(options: MotorHatOptions): MotorHat = js.native
  
  type Callback = js.Function2[/* err */ js.UndefOr[js.Error], /* result */ js.UndefOr[js.Any], Unit]
  
  @js.native
  trait DC extends StObject {
    
    /**
      * Initialize the DC controller instance.
      * Synchronous overload.
      */
    def init(): this.type = js.native
    /**
      * Initialize the DC controller instance.
      * Asynchronous overload.
      *
      * @param   cb      Node style callback for asynch initialization
      */
    def init(cb: Callback): Unit = js.native
    
    /**
      * Starts the motor in the desired direction.
      *
      * @param   dir     Direction of movement.
      * @param   cb      Node style callback. Gets called with cb(err, result) after completion.
      */
    def run(dir: Direction, cb: Callback): Unit = js.native
    
    /**
      * Starts the motor in the desired direction.
      *
      * @param   dir     Direction of movement.
      */
    def runSync(dir: Direction): Unit = js.native
    
    /**
      * Sets the PWM frequency for the DC motor.
      * This setting affects the frequency at which the PWM chip will work to command the DC motor.
      *
      * @param   freq    PWM Frequency in Hz.
      * @param   cb      Node style callback. Gets called with cb(err, result) after completion.
      */
    def setFrequency(freq: Double, cb: Callback): Unit = js.native
    
    /**
      * Sets the PWM frequency for the DC motor.
      * This setting affects the frequency at which the PWM chip will work to command the DC motor.
      *
      * @param   freq    PWM Frequency in Hz.
      */
    def setFrequencySync(freq: Double): Unit = js.native
    
    /**
      * Sets DC motor speed.
      * The speed can be set as a percentage, from 0% to 100%. To change the actual top speed,
      * the actual voltage supplied to the motor needs to be controlled by hardware (get a higher
      * voltage source).
      *
      * @param   speed   Relative speed. 0% to 100%.
      * @param   cb      Node style callback. Gets called with cb(err, result) after completion.
      */
    def setSpeed(speed: Double, cb: Callback): Unit = js.native
    
    /**
      * Sets DC motor speed.
      * The speed can be set as a percentage, from 0% to 100%. To change the actual top speed,
      * the actual voltage supplied to the motor needs to be controlled by hardware (get a higher
      * voltage source).
      *
      * @param   speed   Relative speed. 0% to 100%.
      */
    def setSpeedSync(speed: Double): Unit = js.native
    
    /**
      * Stops the motor.
      * Doesn't actually brake the motor, just stops applying voltage to it.
      *
      * @param   cb      Node style callback. Gets called with cb(err, result) after completion.
      */
    def stop(cb: Callback): Unit = js.native
    
    /**
      * Stops the motor.
      * Doesn't actually brake the motor, just stops applying voltage to it.
      */
    def stopSync(): Unit = js.native
  }
  
  @js.native
  trait DCOptions extends StObject {
    
    var frequency: js.UndefOr[Double] = js.native
    
    /**
      * Pin definition for the motor
      */
    var pins: PinDefinition = js.native
    
    /**
      * PWM Interface Object
      */
    var pwm: js.Object = js.native
    
    var speed: js.UndefOr[Double] = js.native
  }
  object DCOptions {
    
    @scala.inline
    def apply(pins: PinDefinition, pwm: js.Object): DCOptions = {
      val __obj = js.Dynamic.literal(pins = pins.asInstanceOf[js.Any], pwm = pwm.asInstanceOf[js.Any])
      __obj.asInstanceOf[DCOptions]
    }
    
    @scala.inline
    implicit class DCOptionsMutableBuilder[Self <: DCOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFrequency(value: Double): Self = StObject.set(x, "frequency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrequencyUndefined: Self = StObject.set(x, "frequency", js.undefined)
      
      @scala.inline
      def setPins(value: PinDefinition): Self = StObject.set(x, "pins", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPinsVarargs(value: Double*): Self = StObject.set(x, "pins", js.Array(value :_*))
      
      @scala.inline
      def setPwm(value: js.Object): Self = StObject.set(x, "pwm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpeedUndefined: Self = StObject.set(x, "speed", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.motorHat.motorHatStrings.fwd
    - typingsSlinky.motorHat.motorHatStrings.back
  */
  trait Direction extends StObject
  object Direction {
    
    @scala.inline
    def back: typingsSlinky.motorHat.motorHatStrings.back = "back".asInstanceOf[typingsSlinky.motorHat.motorHatStrings.back]
    
    @scala.inline
    def fwd: typingsSlinky.motorHat.motorHatStrings.fwd = "fwd".asInstanceOf[typingsSlinky.motorHat.motorHatStrings.fwd]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.motorHat.motorHatStrings.M1
    - typingsSlinky.motorHat.motorHatStrings.M2
    - typingsSlinky.motorHat.motorHatStrings.M3
    - typingsSlinky.motorHat.motorHatStrings.M4
  */
  trait Motor extends StObject
  object Motor {
    
    @scala.inline
    def M1: typingsSlinky.motorHat.motorHatStrings.M1 = "M1".asInstanceOf[typingsSlinky.motorHat.motorHatStrings.M1]
    
    @scala.inline
    def M2: typingsSlinky.motorHat.motorHatStrings.M2 = "M2".asInstanceOf[typingsSlinky.motorHat.motorHatStrings.M2]
    
    @scala.inline
    def M3: typingsSlinky.motorHat.motorHatStrings.M3 = "M3".asInstanceOf[typingsSlinky.motorHat.motorHatStrings.M3]
    
    @scala.inline
    def M4: typingsSlinky.motorHat.motorHatStrings.M4 = "M4".asInstanceOf[typingsSlinky.motorHat.motorHatStrings.M4]
  }
  
  @js.native
  trait MotorHat extends StObject {
    
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
  
  @js.native
  trait MotorHatOptions extends StObject {
    
    /**
      * i2c address of the PWM chip on the MotorHat.
      *
      * * 0x6F for knockoff HATs.
      *
      * * 0x60 for official AdaFruit HATs??
      */
    var address: js.UndefOr[Double] = js.native
    
    /**
      * i2c driver devfile number. Varies by RaspBerry version.
      * Should be automatically detected.
      */
    var busnum: js.UndefOr[Double] = js.native
    
    /**
      * Definition of the DC motors connected to the HAT.
      * At most 4 DCs, each should be one of following: 'M1', 'M2', 'M3', 'M4' depending on
      * port the motor is connected to.
      */
    var dcs: js.UndefOr[js.Array[Motor]] = js.native
    
    /**
      * Definition of the servos connected to the HAT.
      * List of the channels that have servos connected to them. 0 to 15.
      */
    var servos: js.UndefOr[js.Array[Double]] = js.native
    
    /**
      * Definition of the stepper motors connected to the HAT.
      * At most 2 steppers, each motor is represented by either an object of the form
      * { W1: winding, W2: winding }. Each winding should be one of following: 'M1', 'M2', 'M3',
      * 'M4' depending on the port the stepper is connected to. Correct example: { W1: 'M3', W2: 'M1' }
      */
    var steppers: js.UndefOr[js.Array[W2]] = js.native
  }
  object MotorHatOptions {
    
    @scala.inline
    def apply(): MotorHatOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MotorHatOptions]
    }
    
    @scala.inline
    implicit class MotorHatOptionsMutableBuilder[Self <: MotorHatOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddress(value: Double): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
      
      @scala.inline
      def setBusnum(value: Double): Self = StObject.set(x, "busnum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBusnumUndefined: Self = StObject.set(x, "busnum", js.undefined)
      
      @scala.inline
      def setDcs(value: js.Array[Motor]): Self = StObject.set(x, "dcs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDcsUndefined: Self = StObject.set(x, "dcs", js.undefined)
      
      @scala.inline
      def setDcsVarargs(value: Motor*): Self = StObject.set(x, "dcs", js.Array(value :_*))
      
      @scala.inline
      def setServos(value: js.Array[Double]): Self = StObject.set(x, "servos", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServosUndefined: Self = StObject.set(x, "servos", js.undefined)
      
      @scala.inline
      def setServosVarargs(value: Double*): Self = StObject.set(x, "servos", js.Array(value :_*))
      
      @scala.inline
      def setSteppers(value: js.Array[W2]): Self = StObject.set(x, "steppers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSteppersUndefined: Self = StObject.set(x, "steppers", js.undefined)
      
      @scala.inline
      def setSteppersVarargs(value: W2*): Self = StObject.set(x, "steppers", js.Array(value :_*))
    }
  }
  
  @js.native
  trait MotorPins extends StObject {
    
    val IN1: Double = js.native
    
    val IN2: Double = js.native
    
    val PWM: Double = js.native
  }
  object MotorPins {
    
    @scala.inline
    def apply(IN1: Double, IN2: Double, PWM: Double): MotorPins = {
      val __obj = js.Dynamic.literal(IN1 = IN1.asInstanceOf[js.Any], IN2 = IN2.asInstanceOf[js.Any], PWM = PWM.asInstanceOf[js.Any])
      __obj.asInstanceOf[MotorPins]
    }
    
    @scala.inline
    implicit class MotorPinsMutableBuilder[Self <: MotorPins] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIN1(value: Double): Self = StObject.set(x, "IN1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIN2(value: Double): Self = StObject.set(x, "IN2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPWM(value: Double): Self = StObject.set(x, "PWM", value.asInstanceOf[js.Any])
    }
  }
  
  type PinDefinition = PinDefinitionObject | js.Array[Double]
  
  @js.native
  trait PinDefinitionObject extends StObject {
    
    /**
      * Pin number of the first coil output
      */
    var IN1: Double = js.native
    
    /**
      * Pin number of the second coil output
      */
    var IN2: Double = js.native
    
    /**
      * Pin number of the PWM output
      */
    var PWM: Double = js.native
  }
  object PinDefinitionObject {
    
    @scala.inline
    def apply(IN1: Double, IN2: Double, PWM: Double): PinDefinitionObject = {
      val __obj = js.Dynamic.literal(IN1 = IN1.asInstanceOf[js.Any], IN2 = IN2.asInstanceOf[js.Any], PWM = PWM.asInstanceOf[js.Any])
      __obj.asInstanceOf[PinDefinitionObject]
    }
    
    @scala.inline
    implicit class PinDefinitionObjectMutableBuilder[Self <: PinDefinitionObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIN1(value: Double): Self = StObject.set(x, "IN1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIN2(value: Double): Self = StObject.set(x, "IN2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPWM(value: Double): Self = StObject.set(x, "PWM", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Servo extends StObject {
    
    /**
      * Calibrate the limits for the servolib
      *
      * @param   freq    The update freq in Hz
      * @param   min     The min. pulse in ms
      * @param   max     The max. pulse in ms
      */
    def calibrate(freq: Double, min: Double, max: Double): Unit = js.native
    
    /**
      * Move Servo to desired position.
      *
      * @param   pos     Relative position (0% to 100%).
      */
    def moveTo(pos: Double): Unit = js.native
  }
  object Servo {
    
    @scala.inline
    def apply(calibrate: (Double, Double, Double) => Unit, moveTo: Double => Unit): Servo = {
      val __obj = js.Dynamic.literal(calibrate = js.Any.fromFunction3(calibrate), moveTo = js.Any.fromFunction1(moveTo))
      __obj.asInstanceOf[Servo]
    }
    
    @scala.inline
    implicit class ServoMutableBuilder[Self <: Servo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCalibrate(value: (Double, Double, Double) => Unit): Self = StObject.set(x, "calibrate", js.Any.fromFunction3(value))
      
      @scala.inline
      def setMoveTo(value: Double => Unit): Self = StObject.set(x, "moveTo", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait ServoOptions extends StObject {
    
    /**
      * PWM Controller frequency for the servo
      */
    var freq: js.UndefOr[Double] = js.native
    
    /**
      * Duration in ms of pulse at position 100
      */
    var max: js.UndefOr[Double] = js.native
    
    /**
      * Duration in ms of pulse at position 0
      */
    var min: js.UndefOr[Double] = js.native
    
    /**
      * Servo controller pin. Which pin (0 to 15) is the servo connected to?
      */
    var pin: Double = js.native
    
    /**
      * PWM Interface Object
      */
    var pwm: js.Object = js.native
  }
  object ServoOptions {
    
    @scala.inline
    def apply(pin: Double, pwm: js.Object): ServoOptions = {
      val __obj = js.Dynamic.literal(pin = pin.asInstanceOf[js.Any], pwm = pwm.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServoOptions]
    }
    
    @scala.inline
    implicit class ServoOptionsMutableBuilder[Self <: ServoOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFreq(value: Double): Self = StObject.set(x, "freq", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFreqUndefined: Self = StObject.set(x, "freq", js.undefined)
      
      @scala.inline
      def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      @scala.inline
      def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      @scala.inline
      def setPin(value: Double): Self = StObject.set(x, "pin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPwm(value: js.Object): Self = StObject.set(x, "pwm", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait StepResult extends StObject {
    
    /**
      * Direction of steps performed
      */
    var dir: Direction = js.native
    
    /**
      * Time in ms taken to perform the steps
      */
    var duration: Double = js.native
    
    /**
      * Number of steps retried
      */
    var retried: Double = js.native
    
    /**
      * Performed steps
      */
    var steps: Double = js.native
  }
  object StepResult {
    
    @scala.inline
    def apply(dir: Direction, duration: Double, retried: Double, steps: Double): StepResult = {
      val __obj = js.Dynamic.literal(dir = dir.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], retried = retried.asInstanceOf[js.Any], steps = steps.asInstanceOf[js.Any])
      __obj.asInstanceOf[StepResult]
    }
    
    @scala.inline
    implicit class StepResultMutableBuilder[Self <: StepResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDir(value: Direction): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetried(value: Double): Self = StObject.set(x, "retried", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSteps(value: Double): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait StepSyncResult extends StObject {
    
    /**
      * Direction of steps performed
      */
    var dir: Direction = js.native
    
    /**
      * Time in ms taken to perform the steps
      */
    var duration: Double = js.native
    
    /**
      * Performed steps
      */
    var steps: Double = js.native
  }
  object StepSyncResult {
    
    @scala.inline
    def apply(dir: Direction, duration: Double, steps: Double): StepSyncResult = {
      val __obj = js.Dynamic.literal(dir = dir.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], steps = steps.asInstanceOf[js.Any])
      __obj.asInstanceOf[StepSyncResult]
    }
    
    @scala.inline
    implicit class StepSyncResultMutableBuilder[Self <: StepSyncResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDir(value: Direction): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSteps(value: Double): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Stepper extends StObject {
    
    /**
      * Initialize the Stepeper controller instance.
      * Synchronous overload.
      *
      * @returns Returns init'd Stepper controller object (self)
      */
    def init(): this.type = js.native
    /**
      * Initialize the Stepeper controller instance.
      * Synchronous overload.
      *
      * @param   cb      Node style callback for asynch initialization
      */
    def init(cb: js.Function2[/* err */ Null, /* self */ this.type, Unit]): Unit = js.native
    
    /**
      * Perform one step asynchronously.
      * Configuration as stepping style, speed, etc should have been set previously.
      *
      * @param   dir     Direction of movement
      * @param   cb      Node style callback. cb(err, result).
      */
    def oneStep(
      dir: Direction,
      cb: js.Function2[/* err */ js.UndefOr[js.Error], /* result */ js.UndefOr[js.Any], Unit]
    ): Unit = js.native
    
    /**
      * Perform one step synchronously.
      * Configuration as stepping style, speed, etc should have been set previously.
      *
      * @param   dir     Direction of movement
      */
    def oneStepSync(dir: Direction): Unit = js.native
    
    val options: StepperOptions = js.native
    
    /**
      * Release the stepper motor asynchronously.
      *
      * Stops applying current to the motor coils.
      *
      * @param   cb      Node style callback
      */
    def release(cb: js.Function2[/* err */ js.UndefOr[js.Error], /* result */ js.UndefOr[js.Any], Unit]): Unit = js.native
    
    /**
      * Release the stepper motor synchronously.
      * Stops applying current to the motor coils.
      */
    def releaseSync(): Unit = js.native
    
    /**
      * Set the current rate at which to supply the steps.
      * Provide a number from 0 to 1 and the current will be reduced proportionally
      *
      * @param   current Current rate, from 0 to 1.
      */
    def setCurrent(current: Double): Unit = js.native
    
    /**
      * Set PWM Controller working frequency asynchronously.
      *
      * @param   freq    PWM frequency.
      * @param   cb      Node style callback. cb(err, result).
      */
    def setFrequency(
      freq: Double,
      cb: js.Function2[/* err */ js.UndefOr[js.Error], /* result */ js.UndefOr[js.Any], Unit]
    ): Unit = js.native
    
    /**
      * Set PWM Controller working frequency synchronously.
      *
      * @param   freq    PWM frequency.
      */
    def setFrequencySync(freq: Double): Unit = js.native
    
    @JSName("setMicrosteps")
    def setMicrosteps_16(ms: `16`): Unit = js.native
    /**
      * Set desired number of microsteps per step.
      * (Used for microstepping)
      *
      * @param   ms      Microsteps per step
      */
    @JSName("setMicrosteps")
    def setMicrosteps_8(ms: `8`): Unit = js.native
    
    /**
      * Set motor speed for step().
      */
    def setSpeed(speed: StepperSpeed): Unit = js.native
    
    /**
      * Set number of steps per revolution for motor.
      *
      * @param   steps   Number of steps per revolution for stepper motor.
      */
    def setSteps(steps: Double): Unit = js.native
    
    @JSName("setStyle")
    def setStyle_double(style: double): Unit = js.native
    @JSName("setStyle")
    def setStyle_interleaved(style: interleaved): Unit = js.native
    @JSName("setStyle")
    def setStyle_microstep(style: microstep): Unit = js.native
    /**
      * Set stepping style.
      *
      * @param   style   Stepping style.
      */
    @JSName("setStyle")
    def setStyle_single(style: single): Unit = js.native
    
    /**
      * Perform arbitrary number of steps asynchronously.
      * Configuration as stepping style, speed, etc should have been set previously.
      *
      * @param   dir     Direction of movement
      * @param   steps   Number of steps.
      * @param   cb      Node style callback. cb(err, result).
      */
    def step(
      dir: Direction,
      steps: Double,
      cb: js.Function2[/* err */ js.UndefOr[js.Error], /* result */ js.UndefOr[StepResult], Unit]
    ): Unit = js.native
    
    /**
      * Perform arbitrary number of steps synchronously.
      * Configuration as stepping style, speed, etc should have been set previously.
      *
      * @param   dir     Direction of movement
      * @param   steps   Number of steps.
      * @returns The result of the action.
      */
    def stepSync(dir: Direction, steps: Double): StepSyncResult = js.native
  }
  
  @js.native
  trait StepperOptions extends StObject {
    
    var current: js.UndefOr[Double] = js.native
    
    /**
      * PWM Controller frequency for the stepper
      */
    var frequency: js.UndefOr[Double] = js.native
    
    /**
      * number of microsteps per step
      */
    var microsteps: js.UndefOr[`8` | `16`] = js.native
    
    /**
      * Pin definition for the motor
      */
    var pins: W1 = js.native
    
    /**
      * Pulses per second
      */
    var pps: js.UndefOr[Double] = js.native
    
    /**
      * PWM Interface Object
      */
    var pwm: js.Object = js.native
    
    /**
      * Revolutions per minute
      */
    var rpm: js.UndefOr[Double] = js.native
    
    /**
      * Steps per second
      */
    var sps: js.UndefOr[Double] = js.native
    
    /**
      * Steps per revolution of the stepper motor
      */
    var steps: js.UndefOr[Double] = js.native
    
    /**
      * Stepping style
      */
    var style: js.UndefOr[single | double | interleaved | microstep] = js.native
  }
  object StepperOptions {
    
    @scala.inline
    def apply(pins: W1, pwm: js.Object): StepperOptions = {
      val __obj = js.Dynamic.literal(pins = pins.asInstanceOf[js.Any], pwm = pwm.asInstanceOf[js.Any])
      __obj.asInstanceOf[StepperOptions]
    }
    
    @scala.inline
    implicit class StepperOptionsMutableBuilder[Self <: StepperOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCurrent(value: Double): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentUndefined: Self = StObject.set(x, "current", js.undefined)
      
      @scala.inline
      def setFrequency(value: Double): Self = StObject.set(x, "frequency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrequencyUndefined: Self = StObject.set(x, "frequency", js.undefined)
      
      @scala.inline
      def setMicrosteps(value: `8` | `16`): Self = StObject.set(x, "microsteps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMicrostepsUndefined: Self = StObject.set(x, "microsteps", js.undefined)
      
      @scala.inline
      def setPins(value: W1): Self = StObject.set(x, "pins", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPps(value: Double): Self = StObject.set(x, "pps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPpsUndefined: Self = StObject.set(x, "pps", js.undefined)
      
      @scala.inline
      def setPwm(value: js.Object): Self = StObject.set(x, "pwm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRpm(value: Double): Self = StObject.set(x, "rpm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRpmUndefined: Self = StObject.set(x, "rpm", js.undefined)
      
      @scala.inline
      def setSps(value: Double): Self = StObject.set(x, "sps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpsUndefined: Self = StObject.set(x, "sps", js.undefined)
      
      @scala.inline
      def setSteps(value: Double): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepsUndefined: Self = StObject.set(x, "steps", js.undefined)
      
      @scala.inline
      def setStyle(value: single | double | interleaved | microstep): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  @js.native
  trait StepperSpeed extends StObject {
    
    /**
      * Speed in pulses per second (pulses can be steps, microsteps, etc)
      */
    var pps: js.UndefOr[Double] = js.native
    
    /**
      * Speed in revolutions per minute
      */
    var rpm: js.UndefOr[Double] = js.native
    
    /**
      * Speed in steps per second
      */
    var sps: js.UndefOr[Double] = js.native
  }
  object StepperSpeed {
    
    @scala.inline
    def apply(): StepperSpeed = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StepperSpeed]
    }
    
    @scala.inline
    implicit class StepperSpeedMutableBuilder[Self <: StepperSpeed] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPps(value: Double): Self = StObject.set(x, "pps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPpsUndefined: Self = StObject.set(x, "pps", js.undefined)
      
      @scala.inline
      def setRpm(value: Double): Self = StObject.set(x, "rpm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRpmUndefined: Self = StObject.set(x, "rpm", js.undefined)
      
      @scala.inline
      def setSps(value: Double): Self = StObject.set(x, "sps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpsUndefined: Self = StObject.set(x, "sps", js.undefined)
    }
  }
}
