package typingsSlinky.breeze.global.breeze

import typingsSlinky.breeze.anon.AllowConcurrentSaves
import typingsSlinky.breeze.breeze.SaveOptionsConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("breeze.SaveOptions")
@js.native
class SaveOptions ()
  extends typingsSlinky.breeze.breeze.SaveOptions {
  def this(config: AllowConcurrentSaves) = this()
  /* CompleteClass */
  override var allowConcurrentSaves: Boolean = js.native
  /* CompleteClass */
  override var dataService: typingsSlinky.breeze.breeze.DataService = js.native
  /* CompleteClass */
  override var resourceName: String = js.native
  /* CompleteClass */
  override var tag: js.Object = js.native
  /* CompleteClass */
  override def setAsDefault(): typingsSlinky.breeze.breeze.SaveOptions = js.native
  /* CompleteClass */
  override def using(config: SaveOptionsConfiguration): typingsSlinky.breeze.breeze.SaveOptions = js.native
}

/* static members */
@JSGlobal("breeze.SaveOptions")
@js.native
object SaveOptions extends js.Object {
  var defaultInstance: typingsSlinky.breeze.breeze.SaveOptions = js.native
}

