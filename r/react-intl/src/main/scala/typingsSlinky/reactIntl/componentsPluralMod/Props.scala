package typingsSlinky.reactIntl.componentsPluralMod

import slinky.core.facade.ReactElement
import typingsSlinky.reactIntl.srcTypesMod.IntlShape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FormatPluralOptions * / any */ @js.native
trait Props extends js.Object {
  
  var children: js.UndefOr[js.Function1[/* value */ ReactElement, ReactElement | Null]] = js.native
  
  var few: js.UndefOr[ReactElement] = js.native
  
  var intl: IntlShape = js.native
  
  var many: js.UndefOr[ReactElement] = js.native
  
  var one: js.UndefOr[ReactElement] = js.native
  
  var other: ReactElement = js.native
  
  var two: js.UndefOr[ReactElement] = js.native
  
  var value: Double = js.native
  
  var zero: js.UndefOr[ReactElement] = js.native
}
object Props {
  
  @scala.inline
  def apply(intl: IntlShape, value: Double): Props = {
    val __obj = js.Dynamic.literal(intl = intl.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
  
  @scala.inline
  implicit class PropsOps[Self <: Props] (val x: Self) extends AnyVal {
    
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
    def setIntl(value: IntlShape): Self = this.set("intl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildren(value: /* value */ ReactElement => ReactElement | Null): Self = this.set("children", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setFewReactElement(value: ReactElement): Self = this.set("few", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFew(value: ReactElement): Self = this.set("few", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFew: Self = this.set("few", js.undefined)
    
    @scala.inline
    def setManyReactElement(value: ReactElement): Self = this.set("many", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMany(value: ReactElement): Self = this.set("many", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMany: Self = this.set("many", js.undefined)
    
    @scala.inline
    def setOneReactElement(value: ReactElement): Self = this.set("one", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOne(value: ReactElement): Self = this.set("one", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOne: Self = this.set("one", js.undefined)
    
    @scala.inline
    def setOther(value: ReactElement): Self = this.set("other", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOther: Self = this.set("other", js.undefined)
    
    @scala.inline
    def setTwoReactElement(value: ReactElement): Self = this.set("two", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTwo(value: ReactElement): Self = this.set("two", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTwo: Self = this.set("two", js.undefined)
    
    @scala.inline
    def setZeroReactElement(value: ReactElement): Self = this.set("zero", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZero(value: ReactElement): Self = this.set("zero", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZero: Self = this.set("zero", js.undefined)
  }
}
