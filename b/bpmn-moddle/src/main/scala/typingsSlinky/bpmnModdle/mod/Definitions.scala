package typingsSlinky.bpmnModdle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Definitions extends BaseElement {
  var diagrams: BPMNDiagram = js.native
  var er: String = js.native
  var erVersion: String = js.native
  var expressionLanguage: String = js.native
  var extensions: js.Array[Extension] = js.native
  var imports: js.Array[Import] = js.native
  var name: String = js.native
  var relationship: js.Array[Relationship] = js.native
  var rootElements: js.Array[RootElement] = js.native
  var targetNamespace: String = js.native
  var typeLanguage: String = js.native
}

object Definitions {
  @scala.inline
  def apply(
    $parent: TypeDerived,
    $type: ElementType,
    diagrams: BPMNDiagram,
    er: String,
    erVersion: String,
    expressionLanguage: String,
    extensions: js.Array[Extension],
    id: String,
    imports: js.Array[Import],
    name: String,
    relationship: js.Array[Relationship],
    rootElements: js.Array[RootElement],
    targetNamespace: String,
    typeLanguage: String
  ): Definitions = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], diagrams = diagrams.asInstanceOf[js.Any], er = er.asInstanceOf[js.Any], erVersion = erVersion.asInstanceOf[js.Any], expressionLanguage = expressionLanguage.asInstanceOf[js.Any], extensions = extensions.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], imports = imports.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], relationship = relationship.asInstanceOf[js.Any], rootElements = rootElements.asInstanceOf[js.Any], targetNamespace = targetNamespace.asInstanceOf[js.Any], typeLanguage = typeLanguage.asInstanceOf[js.Any])
    __obj.asInstanceOf[Definitions]
  }
  @scala.inline
  implicit class DefinitionsOps[Self <: Definitions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDiagrams(value: BPMNDiagram): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diagrams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEr(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("er")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("erVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpressionLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expressionLanguage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExtensions(value: js.Array[Extension]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImports(value: js.Array[Import]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imports")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRelationship(value: js.Array[Relationship]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relationship")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRootElements(value: js.Array[RootElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootElements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetNamespace(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetNamespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTypeLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeLanguage")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

