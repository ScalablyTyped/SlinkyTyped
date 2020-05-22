package typingsSlinky.mocha.mod.reporters

import typingsSlinky.mocha.Mocha.Runner
import typingsSlinky.mocha.Mocha.Stats
import typingsSlinky.mocha.Mocha.Test
import typingsSlinky.mocha.Mocha.reporters.Base
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Initialize a new `Doc` reporter.
  *
  * @see https://mochajs.org/api/Mocha.reporters.Doc.html
  */
@JSImport("mocha", "reporters.Doc")
@js.native
class Doc_ () extends Base {
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

