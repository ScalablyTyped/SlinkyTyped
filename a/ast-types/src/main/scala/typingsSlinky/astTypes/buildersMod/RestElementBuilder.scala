package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.TypeAnnotation
import typingsSlinky.astTypes.kindsMod.PatternKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.RestElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RestElementBuilder extends js.Object {
  def apply(argument: PatternKind): RestElement = js.native
  def from(params: TypeAnnotation): RestElement = js.native
}

