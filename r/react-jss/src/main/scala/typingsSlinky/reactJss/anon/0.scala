package typingsSlinky.reactJss.anon

import typingsSlinky.jss.mod.Styles
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `0`[Props /* <: /* import warning: importer.ImportType#apply Failed type conversion: {  classes :S extends (theme : any): jss.jss.Styles<ClassNames> ? jss.jss.Classes<keyof std.ReturnType<S>> : jss.jss.Classes<ClassNames>} */ js.Any */, S /* <: Styles[ClassNames] | (js.Function1[/* theme */ js.Any, Styles[ClassNames]]) */, ClassNames /* <: String | Double | js.Symbol */] extends js.Object {
  
  var classes: js.UndefOr[
    Partial[
      /* import warning: importer.ImportType#apply Failed type conversion: Props['classes'] */ js.Any
    ]
  ] = js.native
}
object `0` {
  
  @scala.inline
  def apply[Props /* <: /* import warning: importer.ImportType#apply Failed type conversion: {  classes :S extends (theme : any): jss.jss.Styles<ClassNames> ? jss.jss.Classes<keyof std.ReturnType<S>> : jss.jss.Classes<ClassNames>} */ js.Any */, S /* <: Styles[ClassNames] | (js.Function1[/* theme */ js.Any, Styles[ClassNames]]) */, ClassNames /* <: String | Double | js.Symbol */](): `0`[Props, S, ClassNames] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`0`[Props, S, ClassNames]]
  }
  
  @scala.inline
  implicit class `0Ops`[Self <: `0`[_, _, _], Props /* <: /* import warning: importer.ImportType#apply Failed type conversion: {  classes :S extends (theme : any): jss.jss.Styles<ClassNames> ? jss.jss.Classes<keyof std.ReturnType<S>> : jss.jss.Classes<ClassNames>} */ js.Any */, S /* <: Styles[ClassNames] | (js.Function1[/* theme */ js.Any, Styles[ClassNames]]) */, ClassNames /* <: String | Double | js.Symbol */] (val x: Self with (`0`[Props, S, ClassNames])) extends AnyVal {
    
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
    def setClasses(
      value: Partial[
          /* import warning: importer.ImportType#apply Failed type conversion: Props['classes'] */ js.Any
        ]
    ): Self = this.set("classes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClasses: Self = this.set("classes", js.undefined)
  }
}
