package typingsSlinky.reactTagInput.components

import typingsSlinky.reactTagInput.anon.Id
import typingsSlinky.reactTagInput.mod.ReactTagsProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object WithOutContext {
  
  @scala.inline
  def apply(handleAddition: Id => Unit, handleDelete: Double => Unit): SharedBuilder_ReactTagsProps_1858233423[typingsSlinky.reactTagInput.mod.WithOutContext] = {
    val __props = js.Dynamic.literal(handleAddition = js.Any.fromFunction1(handleAddition), handleDelete = js.Any.fromFunction1(handleDelete))
    new SharedBuilder_ReactTagsProps_1858233423[typingsSlinky.reactTagInput.mod.WithOutContext](js.Array(this.component, __props.asInstanceOf[ReactTagsProps]))
  }
  
  @JSImport("react-tag-input", "WithOutContext")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: ReactTagsProps): SharedBuilder_ReactTagsProps_1858233423[typingsSlinky.reactTagInput.mod.WithOutContext] = new SharedBuilder_ReactTagsProps_1858233423[typingsSlinky.reactTagInput.mod.WithOutContext](js.Array(this.component, p.asInstanceOf[js.Any]))
}
