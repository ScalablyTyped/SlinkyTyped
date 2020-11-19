package typingsSlinky.babylonjs.instrumentationIndexMod

import typingsSlinky.babylonjs.engineMod.Engine
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Instrumentation/index", "EngineInstrumentation")
@js.native
class EngineInstrumentation protected ()
  extends typingsSlinky.babylonjs.engineInstrumentationMod.EngineInstrumentation {
  /**
    * Instantiates a new engine instrumentation.
    * This class can be used to get instrumentation data from a Babylon engine
    * @see http://doc.babylonjs.com/how_to/optimizing_your_scene#engineinstrumentation
    * @param engine Defines the engine to instrument
    */
  def this(/**
    * Define the instrumented engine.
    */
  engine: Engine) = this()
}
