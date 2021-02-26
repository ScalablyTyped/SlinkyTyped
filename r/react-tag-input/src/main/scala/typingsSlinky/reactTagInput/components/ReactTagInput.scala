package typingsSlinky.reactTagInput.components

import typingsSlinky.reactTagInput.anon.Id
import typingsSlinky.reactTagInput.mod.ReactTagsProps
import typingsSlinky.reactTagInput.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactTagInput {
  
  @scala.inline
  def apply(handleAddition: Id => Unit, handleDelete: Double => Unit): SharedBuilder_ReactTagsProps_1858233423[default] = {
    val __props = js.Dynamic.literal(handleAddition = js.Any.fromFunction1(handleAddition), handleDelete = js.Any.fromFunction1(handleDelete))
    new SharedBuilder_ReactTagsProps_1858233423[default](js.Array(this.component, __props.asInstanceOf[ReactTagsProps]))
  }
  
  @JSImport("react-tag-input", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: ReactTagsProps): SharedBuilder_ReactTagsProps_1858233423[default] = new SharedBuilder_ReactTagsProps_1858233423[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
