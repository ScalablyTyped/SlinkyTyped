package typingsSlinky.gulpProtractor.mod

import typingsSlinky.gulp.mod.TaskCallback
import typingsSlinky.node.NodeJS.ReadWriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IGulpProtractor extends js.Object {
  
  def getProtractorDir(): String = js.native
  
  def protractor(): ReadWriteStream = js.native
  def protractor(options: IOptions): ReadWriteStream = js.native
  
  var webdriver_standalone: TaskCallback = js.native
  
  var webdriver_update: TaskCallback = js.native
}
