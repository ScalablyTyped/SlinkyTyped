package typingsSlinky.reactJss.anon

import typingsSlinky.jss.mod.Styles
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Classes[S /* <: Styles[ClassNames] | (js.Function1[/* theme */ js.Any, Styles[ClassNames]]) */, ClassNames /* <: String | Double | js.Symbol */] extends js.Object {
  
  var classes: typingsSlinky.jss.mod.Classes[ClassNames | (/* keyof std.ReturnType<S> */ String)] = js.native
}
object Classes {
  
  @scala.inline
  def apply[S /* <: Styles[ClassNames] | (js.Function1[/* theme */ js.Any, Styles[ClassNames]]) */, ClassNames /* <: String | Double | js.Symbol */](classes: typingsSlinky.jss.mod.Classes[ClassNames | (/* keyof std.ReturnType<S> */ String)]): Classes[S, ClassNames] = {
    val __obj = js.Dynamic.literal(classes = classes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Classes[S, ClassNames]]
  }
  
  @scala.inline
  implicit class ClassesOps[Self <: Classes[_, _], S /* <: Styles[ClassNames] | (js.Function1[/* theme */ js.Any, Styles[ClassNames]]) */, ClassNames /* <: String | Double | js.Symbol */] (val x: Self with (Classes[S, ClassNames])) extends AnyVal {
    
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
    def setClasses(value: typingsSlinky.jss.mod.Classes[ClassNames | (/* keyof std.ReturnType<S> */ String)]): Self = this.set("classes", value.asInstanceOf[js.Any])
  }
}
