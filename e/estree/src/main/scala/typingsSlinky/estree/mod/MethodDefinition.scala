package typingsSlinky.estree.mod

import typingsSlinky.estree.estreeStrings.constructor
import typingsSlinky.estree.estreeStrings.get
import typingsSlinky.estree.estreeStrings.method
import typingsSlinky.estree.estreeStrings.set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MethodDefinition
  extends BaseNode
     with Node {
  var computed: Boolean = js.native
  var key: Expression = js.native
  var kind: constructor | method | get | set = js.native
  var static: Boolean = js.native
  @JSName("type")
  var type_MethodDefinition: typingsSlinky.estree.estreeStrings.MethodDefinition = js.native
  var value: FunctionExpression = js.native
}

object MethodDefinition {
  @scala.inline
  def apply(
    computed: Boolean,
    key: Expression,
    kind: constructor | method | get | set,
    static: Boolean,
    `type`: typingsSlinky.estree.estreeStrings.MethodDefinition,
    value: FunctionExpression
  ): MethodDefinition = {
    val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MethodDefinition]
  }
  @scala.inline
  implicit class MethodDefinitionOps[Self <: MethodDefinition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComputed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("computed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKey(value: Expression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKind(value: constructor | method | get | set): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatic(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("static")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: typingsSlinky.estree.estreeStrings.MethodDefinition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: FunctionExpression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

