package typingsSlinky.reactIntl.messageMod

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.ReactNodeArray
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MessageDescriptor * / any */ @js.native
trait Props[V /* <: Record[String, _] */] extends js.Object {
  
  var children: js.UndefOr[js.Function1[/* nodes */ ReactNodeArray, ReactElement]] = js.native
  
  var tagName: js.UndefOr[ReactElement] = js.native
  
  var values: js.UndefOr[V] = js.native
}
object Props {
  
  @scala.inline
  def apply[V /* <: Record[String, _] */](): Props[V] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Props[V]]
  }
  
  @scala.inline
  implicit class PropsOps[Self <: Props[_], V /* <: Record[String, _] */] (val x: Self with Props[V]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setChildren(value: /* nodes */ ReactNodeArray => ReactElement): Self = this.set("children", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setTagNameFunctionComponent(value: ReactComponentClass[_]): Self = this.set("tagName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagNameComponentClass(value: ReactComponentClass[_]): Self = this.set("tagName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagName(value: ReactElement): Self = this.set("tagName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTagName: Self = this.set("tagName", js.undefined)
    
    @scala.inline
    def setValues(value: V): Self = this.set("values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValues: Self = this.set("values", js.undefined)
  }
}
