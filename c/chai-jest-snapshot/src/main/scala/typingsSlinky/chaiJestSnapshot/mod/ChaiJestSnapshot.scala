package typingsSlinky.chaiJestSnapshot.mod

import typingsSlinky.chai.Chai.ChaiPlugin
import typingsSlinky.mocha.Mocha.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChaiJestSnapshot extends ChaiPlugin {
  
  /** Add a serializer plugin */
  def addSerializer(serializer: js.Any): Unit = js.native
  
  /** Configure snapshot name using mocha context */
  def configureUsingMochaContext(context: Context): Unit = js.native
  
  /** Reset snapshot registry */
  def resetSnapshotRegistry(): Unit = js.native
  
  /** Set snapshot file name */
  def setFilename(filename: String): Unit = js.native
  
  /**
    * Set snapshot test name
    */
  def setTestName(testname: String): Unit = js.native
}
