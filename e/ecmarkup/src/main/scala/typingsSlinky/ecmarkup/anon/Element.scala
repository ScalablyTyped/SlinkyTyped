package typingsSlinky.ecmarkup.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Element extends StObject {
  
  var element: org.scalajs.dom.raw.Element = js.native
  
  var tree: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EcmarkdownNode */ js.Any
  ] = js.native
}
object Element {
  
  @scala.inline
  def apply(element: org.scalajs.dom.raw.Element): Element = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any])
    __obj.asInstanceOf[Element]
  }
  
  @scala.inline
  implicit class ElementMutableBuilder[Self <: Element] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setElement(value: org.scalajs.dom.raw.Element): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTree(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EcmarkdownNode */ js.Any
    ): Self = StObject.set(x, "tree", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTreeUndefined: Self = StObject.set(x, "tree", js.undefined)
  }
}
