package typingsSlinky.materialUiStyles.anon

import slinky.core.facade.ReactRef
import typingsSlinky.materialUiStyles.withStylesWithStylesMod.ClassKeyInferable
import typingsSlinky.materialUiStyles.withStylesWithStylesMod.ClassKeyOfStyles
import typingsSlinky.materialUiStyles.withStylesWithStylesMod.ClassNameMap
import typingsSlinky.react.mod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Classes[StylesType /* <: ClassKeyInferable[_, _] */] extends js.Object {
  
  var classes: ClassNameMap[ClassKeyOfStyles[StylesType]] = js.native
  
  var innerRef: js.UndefOr[Ref[_]] = js.native
}
object Classes {
  
  @scala.inline
  def apply[StylesType /* <: ClassKeyInferable[_, _] */](classes: ClassNameMap[ClassKeyOfStyles[StylesType]]): Classes[StylesType] = {
    val __obj = js.Dynamic.literal(classes = classes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Classes[StylesType]]
  }
  
  @scala.inline
  implicit class ClassesOps[Self <: Classes[_], StylesType /* <: ClassKeyInferable[_, _] */] (val x: Self with Classes[StylesType]) extends AnyVal {
    
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
    def setClasses(value: ClassNameMap[ClassKeyOfStyles[StylesType]]): Self = this.set("classes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInnerRefRefObject(value: ReactRef[_]): Self = this.set("innerRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInnerRefFunction1(value: /* instance */ _ | Null => Unit): Self = this.set("innerRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInnerRef(value: Ref[_]): Self = this.set("innerRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInnerRef: Self = this.set("innerRef", js.undefined)
    
    @scala.inline
    def setInnerRefNull: Self = this.set("innerRef", null)
  }
}
