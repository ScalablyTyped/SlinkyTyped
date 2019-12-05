package typingsSlinky.estree.ESTree

import typingsSlinky.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FunctionTypeAnnotation extends Node {
  var params: js.Array[FunctionTypeParam] = js.native
  var rest: js.UndefOr[FunctionTypeParam | Null] = js.native
  var returnType: org.scalajs.dom.raw.Node = js.native
  var typeParameters: js.UndefOr[TypeParameterDeclaration | Null] = js.native
}

