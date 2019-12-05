package typingsSlinky.babelDashTypes.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSTypeAnnotation extends Node {
  var typeAnnotation: TSType
  @JSName("type")
  var type_TSTypeAnnotation: typingsSlinky.babelDashTypes.babelDashTypesStrings.TSTypeAnnotation
}

@JSImport("babel-types", "TSTypeAnnotation")
@js.native
object TSTypeAnnotation extends js.Object {
  def apply(typeAnnotation: TSType): TSTypeAnnotation = js.native
}

