package typingsSlinky.babelTypes.mod

import typingsSlinky.babelTypes.babelTypesStrings.TSPropertySignature
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.babelTypes.mod.Node because Already inherited */ @js.native
trait TSPropertySignature_
  extends TSTypeElement
     with BaseNode {
  var computed: Boolean | Null = js.native
  var initializer: Expression | Null = js.native
  var key: Expression = js.native
  var optional: Boolean | Null = js.native
  var readonly: Boolean | Null = js.native
  var typeAnnotation: TSTypeAnnotation_ | Null = js.native
  @JSName("type")
  var type_TSPropertySignature_ : TSPropertySignature = js.native
}

object TSPropertySignature_ {
  @scala.inline
  def apply(key: Expression, `type`: TSPropertySignature): TSPropertySignature_ = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSPropertySignature_]
  }
  @scala.inline
  implicit class TSPropertySignature_Ops[Self <: TSPropertySignature_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKey(value: Expression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: TSPropertySignature): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComputed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("computed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComputedNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("computed")(null)
        ret
    }
    @scala.inline
    def withInitializer(value: Expression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initializer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInitializerNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initializer")(null)
        ret
    }
    @scala.inline
    def withOptional(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optional")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptionalNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optional")(null)
        ret
    }
    @scala.inline
    def withReadonly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readonly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReadonlyNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readonly")(null)
        ret
    }
    @scala.inline
    def withTypeAnnotation(value: TSTypeAnnotation_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeAnnotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTypeAnnotationNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeAnnotation")(null)
        ret
    }
  }
  
}

