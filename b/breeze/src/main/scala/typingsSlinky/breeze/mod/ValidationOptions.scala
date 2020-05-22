package typingsSlinky.breeze.mod

import typingsSlinky.breeze.breeze.ValidationOptionsConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("breeze", "ValidationOptions")
@js.native
class ValidationOptions ()
  extends typingsSlinky.breeze.breeze.ValidationOptions {
  def this(config: ValidationOptionsConfiguration) = this()
  /* CompleteClass */
  override var validateOnAttach: Boolean = js.native
  /* CompleteClass */
  override var validateOnPropertyChange: Boolean = js.native
  /* CompleteClass */
  override var validateOnQuery: Boolean = js.native
  /* CompleteClass */
  override var validateOnSave: Boolean = js.native
  /* CompleteClass */
  override def setAsDefault(): typingsSlinky.breeze.breeze.ValidationOptions = js.native
  /* CompleteClass */
  override def using(config: ValidationOptionsConfiguration): typingsSlinky.breeze.breeze.ValidationOptions = js.native
}

/* static members */
@JSImport("breeze", "ValidationOptions")
@js.native
object ValidationOptions extends js.Object {
  var defaultInstance: typingsSlinky.breeze.breeze.ValidationOptions = js.native
}

