package typingsSlinky.puppeteer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Coverage extends js.Object {
  
  def startCSSCoverage(): js.Promise[Unit] = js.native
  def startCSSCoverage(options: StartCoverageOptions): js.Promise[Unit] = js.native
  
  def startJSCoverage(): js.Promise[Unit] = js.native
  def startJSCoverage(options: StartCoverageOptions): js.Promise[Unit] = js.native
  
  def stopCSSCoverage(): js.Promise[js.Array[CoverageEntry]] = js.native
  
  def stopJSCoverage(): js.Promise[js.Array[CoverageEntry]] = js.native
}
