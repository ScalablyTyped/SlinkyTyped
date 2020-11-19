package typingsSlinky.cavy.mod

import slinky.core.ReactComponentClass
import typingsSlinky.cavy.cavyBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cavy", "TestScope")
@js.native
class TestScope () extends js.Object {
  
  def beforeEach(fn: js.Function0[Unit]): Unit = js.native
  
  var component: Tester = js.native
  
  def containsText(identifier: String, text: String): js.Promise[Unit] = js.native
  
  def describe(label: String, fn: js.Function0[Unit]): Unit = js.native
  
  def exists(identifier: String): js.Promise[`true`] = js.native
  
  def fillIn(identifier: String, str: String): js.Promise[Unit] = js.native
  
  def findComponent(identifier: String): js.Promise[ReactComponentClass[js.Object]] = js.native
  
  def focus(identifier: String): js.Promise[Unit] = js.native
  
  def it(label: String, fn: js.Function0[Unit]): Unit = js.native
  
  def notExists(identifier: String): js.Promise[`true`] = js.native
  
  def pause(time: Double): js.Promise[Unit] = js.native
  
  def press(identifier: String): js.Promise[Unit] = js.native
}
