package typingsSlinky.cypress.mochaMod.reporters

import typingsSlinky.cypress.Mocha.Runner
import typingsSlinky.cypress.Mocha.Stats
import typingsSlinky.cypress.Mocha.Test
import typingsSlinky.cypress.Mocha.reporters.Base
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Initialize a new `Spec` test reporter.
  *
  * @see https://mochajs.org/api/Mocha.reporters.Spec.html
  */
@JSImport("mocha", "reporters.Spec")
@js.native
class Spec_ () extends Base {
  /**
    * Test failures
    */
  /* CompleteClass */
  override var failures: js.Array[Test] = js.native
  /**
    * The configured runner
    */
  /* CompleteClass */
  override var runner: Runner = js.native
  /**
    * Test run statistics
    */
  /* CompleteClass */
  override var stats: Stats = js.native
  /**
    * Output common epilogue used by many of the bundled reporters.
    *
    * @see https://mochajs.org/api/Mocha.reporters.Base.html#.Base#epilogue
    */
  /* CompleteClass */
  override def epilogue(): Unit = js.native
}

