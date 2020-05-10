package typingsSlinky.reactTagInput.components

import typingsSlinky.reactTagInput.AnonId
import typingsSlinky.reactTagInput.mod.ReactTagsProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object WithContext {
  @JSImport("react-tag-input", "WithContext")
  @js.native
  object component extends js.Object
  
  def withProps(p: ReactTagsProps): SharedBuilder_ReactTagsProps_1858233423[typingsSlinky.reactTagInput.mod.WithContext] = new SharedBuilder_ReactTagsProps_1858233423[typingsSlinky.reactTagInput.mod.WithContext](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(handleAddition: AnonId => Unit, handleDelete: Double => Unit): SharedBuilder_ReactTagsProps_1858233423[typingsSlinky.reactTagInput.mod.WithContext] = {
    val __props = js.Dynamic.literal(handleAddition = js.Any.fromFunction1(handleAddition), handleDelete = js.Any.fromFunction1(handleDelete))
    new SharedBuilder_ReactTagsProps_1858233423[typingsSlinky.reactTagInput.mod.WithContext](js.Array(this.component, __props.asInstanceOf[ReactTagsProps]))
  }
}

