package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.Cooked
import typingsSlinky.astTypes.anon.Tail
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TemplateElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TemplateElementBuilder extends StObject {
  
  def apply(value: Cooked, tail: Boolean): TemplateElement = js.native
  
  def from(params: Tail): TemplateElement = js.native
}
