package typingsSlinky.ecmarkup.contextMod

import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.Node
import typingsSlinky.ecmarkup.specMod.Spec
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Context extends js.Object {
  var clauseNumberer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ClauseNumberIterator */ js.Any = js.native
  var clauseStack: js.Array[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Clause */ _
  ] = js.native
  var currentId: String | Null = js.native
  var importStack: js.Array[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Import */ _
  ] = js.native
  var inAlg: Boolean = js.native
  var inNoAutolink: Boolean = js.native
  var inNoEmd: Boolean = js.native
  var node: HTMLElement = js.native
  var spec: Spec = js.native
  var startEmd: Node | Null = js.native
  var tagStack: js.Array[HTMLElement] = js.native
}

object Context {
  @scala.inline
  def apply(
    clauseNumberer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ClauseNumberIterator */ js.Any,
    clauseStack: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Clause */ _
    ],
    importStack: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Import */ _
    ],
    inAlg: Boolean,
    inNoAutolink: Boolean,
    inNoEmd: Boolean,
    node: HTMLElement,
    spec: Spec,
    tagStack: js.Array[HTMLElement]
  ): Context = {
    val __obj = js.Dynamic.literal(clauseNumberer = clauseNumberer.asInstanceOf[js.Any], clauseStack = clauseStack.asInstanceOf[js.Any], importStack = importStack.asInstanceOf[js.Any], inAlg = inAlg.asInstanceOf[js.Any], inNoAutolink = inNoAutolink.asInstanceOf[js.Any], inNoEmd = inNoEmd.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any], tagStack = tagStack.asInstanceOf[js.Any])
    __obj.asInstanceOf[Context]
  }
  @scala.inline
  implicit class ContextOps[Self <: Context] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClauseNumberer(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ClauseNumberIterator */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clauseNumberer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClauseStack(
      value: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Clause */ _
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clauseStack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImportStack(
      value: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Import */ _
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("importStack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInAlg(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inAlg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInNoAutolink(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inNoAutolink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInNoEmd(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inNoEmd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNode(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("node")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpec(value: Spec): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTagStack(value: js.Array[HTMLElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagStack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentIdNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentId")(null)
        ret
    }
    @scala.inline
    def withStartEmd(value: Node): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startEmd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartEmdNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startEmd")(null)
        ret
    }
  }
  
}

