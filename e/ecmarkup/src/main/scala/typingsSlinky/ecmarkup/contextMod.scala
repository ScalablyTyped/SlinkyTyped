package typingsSlinky.ecmarkup

import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.Node
import typingsSlinky.ecmarkup.specMod.Spec
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object contextMod {
  
  @js.native
  trait Context extends StObject {
    
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
    implicit class ContextMutableBuilder[Self <: Context] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClauseNumberer(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ClauseNumberIterator */ js.Any
      ): Self = StObject.set(x, "clauseNumberer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClauseStack(
        value: js.Array[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Clause */ _
            ]
      ): Self = StObject.set(x, "clauseStack", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClauseStackVarargs(value: js.Any*): Self = StObject.set(x, "clauseStack", js.Array(value :_*))
      
      @scala.inline
      def setCurrentId(value: String): Self = StObject.set(x, "currentId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentIdNull: Self = StObject.set(x, "currentId", null)
      
      @scala.inline
      def setImportStack(
        value: js.Array[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Import */ _
            ]
      ): Self = StObject.set(x, "importStack", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImportStackVarargs(value: js.Any*): Self = StObject.set(x, "importStack", js.Array(value :_*))
      
      @scala.inline
      def setInAlg(value: Boolean): Self = StObject.set(x, "inAlg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInNoAutolink(value: Boolean): Self = StObject.set(x, "inNoAutolink", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInNoEmd(value: Boolean): Self = StObject.set(x, "inNoEmd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNode(value: HTMLElement): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpec(value: Spec): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartEmd(value: Node): Self = StObject.set(x, "startEmd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartEmdNull: Self = StObject.set(x, "startEmd", null)
      
      @scala.inline
      def setTagStack(value: js.Array[HTMLElement]): Self = StObject.set(x, "tagStack", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagStackVarargs(value: HTMLElement*): Self = StObject.set(x, "tagStack", js.Array(value :_*))
    }
  }
}
