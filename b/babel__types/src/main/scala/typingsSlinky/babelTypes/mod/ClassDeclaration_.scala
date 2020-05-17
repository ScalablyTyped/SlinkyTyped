package typingsSlinky.babelTypes.mod

import typingsSlinky.babelTypes.babelTypesStrings.ClassDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.babelTypes.mod.Node because Already inherited */ @js.native
trait ClassDeclaration_
  extends Class
     with BaseNode
     with Declaration
     with Scopable
     with Statement {
  var `abstract`: Boolean | Null = js.native
  var body: js.Any = js.native
  var declare: Boolean | Null = js.native
  var decorators: js.Any = js.native
  var id: js.Any = js.native
  var implements: js.Any = js.native
  var mixins: js.Any = js.native
  var superClass: js.Any = js.native
  var superTypeParameters: js.Any = js.native
  var typeParameters: js.Any = js.native
  @JSName("type")
  var type_ClassDeclaration_ : ClassDeclaration = js.native
}

object ClassDeclaration_ {
  @scala.inline
  def apply(
    body: js.Any,
    decorators: js.Any,
    id: js.Any,
    implements: js.Any,
    mixins: js.Any,
    superClass: js.Any,
    superTypeParameters: js.Any,
    `type`: ClassDeclaration,
    typeParameters: js.Any
  ): ClassDeclaration_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], decorators = decorators.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], implements = implements.asInstanceOf[js.Any], mixins = mixins.asInstanceOf[js.Any], superClass = superClass.asInstanceOf[js.Any], superTypeParameters = superTypeParameters.asInstanceOf[js.Any], typeParameters = typeParameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassDeclaration_]
  }
  @scala.inline
  implicit class ClassDeclaration_Ops[Self <: ClassDeclaration_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBody(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDecorators(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decorators")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImplements(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("implements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMixins(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mixins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuperClass(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("superClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuperTypeParameters(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("superTypeParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: ClassDeclaration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTypeParameters(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAbstract(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abstract")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAbstractNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abstract")(null)
        ret
    }
    @scala.inline
    def withDeclare(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("declare")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeclareNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("declare")(null)
        ret
    }
  }
  
}

