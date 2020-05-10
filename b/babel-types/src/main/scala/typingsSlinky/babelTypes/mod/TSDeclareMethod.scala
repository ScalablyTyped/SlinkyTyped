package typingsSlinky.babelTypes.mod

import typingsSlinky.babelTypes.babelTypesStrings.`private`
import typingsSlinky.babelTypes.babelTypesStrings.`protected`
import typingsSlinky.babelTypes.babelTypesStrings.constructor
import typingsSlinky.babelTypes.babelTypesStrings.get
import typingsSlinky.babelTypes.babelTypesStrings.method
import typingsSlinky.babelTypes.babelTypesStrings.public
import typingsSlinky.babelTypes.babelTypesStrings.set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSDeclareMethod extends Node {
  var `abstract`: Boolean | Null = js.native
  var access: public | `private` | `protected` | Null = js.native
  var accessibility: public | `private` | `protected` | Null = js.native
  var async: Boolean = js.native
  var computed: Boolean = js.native
  var decorators: js.Array[Decorator_] | Null = js.native
  var generator: Boolean = js.native
  var key: Expression = js.native
  var kind: get | set | method | constructor = js.native
  var optional: Boolean | Null = js.native
  var params: js.Array[LVal] = js.native
  var returnType: TypeAnnotation_ | TSTypeAnnotation | Noop_ | Null = js.native
  var static: Boolean | Null = js.native
  var typeParameters: TypeParameterDeclaration_ | Noop_ | Null = js.native
  @JSName("type")
  var type_TSDeclareMethod: typingsSlinky.babelTypes.babelTypesStrings.TSDeclareMethod = js.native
}

@JSImport("babel-types", "TSDeclareMethod")
@js.native
object TSDeclareMethod extends js.Object {
  def apply(
    decorators: js.UndefOr[js.Array[Decorator_] | Null],
    key: Expression,
    typeParameters: js.UndefOr[TypeParameterDeclaration_ | Noop_ | Null],
    params: js.Array[LVal]
  ): TSDeclareMethod = js.native
  def apply(
    decorators: js.UndefOr[js.Array[Decorator_] | Null],
    key: Expression,
    typeParameters: js.UndefOr[TypeParameterDeclaration_ | Noop_ | Null],
    params: js.Array[LVal],
    returnType: TypeAnnotation_ | TSTypeAnnotation | Noop_
  ): TSDeclareMethod = js.native
}

