package typingsSlinky.postmanCollection.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsSlinky.postmanCollection.mod.PropertyBaseDefinition because Already inherited
- typingsSlinky.postmanCollection.mod.PropertyDefinition because Already inherited
- typingsSlinky.postmanCollection.mod.FormParamDefinition because var conflicts: description, disabled, id, name. Inlined key, value */ @JSImport("postman-collection", "FormParam")
@js.native
class FormParam protected () extends Property[FormParamDefinition] {
  def this(options: FormParamDefinition) = this()
  var key: js.UndefOr[String] = js.native
  var value: js.UndefOr[js.Any] = js.native
}

