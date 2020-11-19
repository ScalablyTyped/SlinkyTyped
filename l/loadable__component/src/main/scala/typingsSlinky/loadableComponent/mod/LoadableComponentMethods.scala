package typingsSlinky.loadableComponent.mod

import slinky.core.ReactComponentClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoadableComponentMethods[Props] extends js.Object {
  
  def load(): js.Promise[ReactComponentClass[Props]] = js.native
  def load(props: Props): js.Promise[ReactComponentClass[Props]] = js.native
  
  def preload(): Unit = js.native
  def preload(props: Props): Unit = js.native
}
