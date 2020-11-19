package typingsSlinky.phantom.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PhantomJS extends js.Object {
  
  def callback(fn: js.Function2[/* pageNum */ Double, /* numPages */ Double, String]): IPhantomCallback = js.native
  
  def createPage(): js.Promise[WebPage] = js.native
  
  def exit(): Unit = js.native
  def exit(returnValue: Double): Unit = js.native
}
