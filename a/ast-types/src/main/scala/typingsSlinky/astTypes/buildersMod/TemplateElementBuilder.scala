package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.AnonCooked
import typingsSlinky.astTypes.AnonTail
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TemplateElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TemplateElementBuilder extends js.Object {
  def apply(value: AnonCooked, tail: Boolean): TemplateElement = js.native
  def from(params: AnonTail): TemplateElement = js.native
}

