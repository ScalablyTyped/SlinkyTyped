package typingsSlinky.reactTagInput.components

import typingsSlinky.reactTagInput.AnonId
import typingsSlinky.reactTagInput.mod.ReactTagsProps
import typingsSlinky.reactTagInput.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactTagInput {
  @JSImport("react-tag-input", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: ReactTagsProps): SharedBuilder_ReactTagsProps_1858233423[default] = new SharedBuilder_ReactTagsProps_1858233423[default](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(handleAddition: AnonId => Unit, handleDelete: Double => Unit): SharedBuilder_ReactTagsProps_1858233423[default] = {
    val __props = js.Dynamic.literal(handleAddition = js.Any.fromFunction1(handleAddition), handleDelete = js.Any.fromFunction1(handleDelete))
    new SharedBuilder_ReactTagsProps_1858233423[default](js.Array(this.component, __props.asInstanceOf[ReactTagsProps]))
  }
}

