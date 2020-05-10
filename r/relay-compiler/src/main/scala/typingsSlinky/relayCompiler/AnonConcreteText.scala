package typingsSlinky.relayCompiler

import typingsSlinky.relayCompiler.iRMod.GeneratedDefinition
import typingsSlinky.relayCompiler.relayCompilerStrings.Fragment
import typingsSlinky.relayCompiler.relayCompilerStrings.Request
import typingsSlinky.relayRuntime.relayConcreteNodeMod.GeneratedNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonConcreteText extends js.Object {
  /**
    * The IR for the document that this module represents.
    */
  var concreteText: String = js.native
  /**
    * The IR node from which the generated node is derived.
    */
  var definition: GeneratedDefinition = js.native
  /**
    * The actual document that this module represents.
    */
  var docText: Null | String = js.native
  /**
    * The type of artifact that this module represents.
    *
    * @todo Document when this can be `empty`.
    */
  var documentType: Fragment | Request | Null = js.native
  /**
    * A hash of the concrete node including the query text.
    *
    * @todo Document how this is different from `sourceHash`.
    */
  var hash: Null | String = js.native
  /**
    * The 'kind' of the generated node.
    */
  var kind: String = js.native
  /**
    * The filename of the module.
    */
  var moduleName: String = js.native
  /**
    * The generated node being written.
    */
  var node: GeneratedNode = js.native
  /**
    * A hash of the document, which is used by relay-compiler to know if it needs
    * to write a new version of the artifact.
    *
    * @todo Is this correct? And document how this is different from `hash`.
    */
  var sourceHash: String = js.native
  /**
    * The type information generated for the GraphQL selections made.
    */
  var typeText: String = js.native
}

object AnonConcreteText {
  @scala.inline
  def apply(
    concreteText: String,
    definition: GeneratedDefinition,
    kind: String,
    moduleName: String,
    node: GeneratedNode,
    sourceHash: String,
    typeText: String
  ): AnonConcreteText = {
    val __obj = js.Dynamic.literal(concreteText = concreteText.asInstanceOf[js.Any], definition = definition.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], moduleName = moduleName.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], sourceHash = sourceHash.asInstanceOf[js.Any], typeText = typeText.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonConcreteText]
  }
  @scala.inline
  implicit class AnonConcreteTextOps[Self <: AnonConcreteText] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConcreteText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("concreteText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefinition(value: GeneratedDefinition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("definition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModuleName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moduleName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNode(value: GeneratedNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("node")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceHash(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceHash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTypeText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDocText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("docText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDocTextNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("docText")(null)
        ret
    }
    @scala.inline
    def withDocumentType(value: Fragment | Request): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDocumentTypeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentType")(null)
        ret
    }
    @scala.inline
    def withHash(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHashNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hash")(null)
        ret
    }
  }
  
}

