package typingsSlinky.reactJss.anon

import typingsSlinky.jss.mod.Styles
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClassesPartial[Props /* <: /* import warning: importer.ImportType#apply Failed type conversion: {  classes  :S extends (theme : any): jss.jss.Styles<ClassNames> ? jss.jss.Classes<keyof std.ReturnType<S>> : jss.jss.Classes<ClassNames>} */ js.Any */, S /* <: Styles[ClassNames] | (js.Function1[/* theme */ js.Any, Styles[ClassNames]]) */, ClassNames /* <: String | Double | js.Symbol */] extends js.Object {
  var classes: js.UndefOr[
    Partial[
      /* import warning: importer.ImportType#apply Failed type conversion: Props['classes'] */ js.Any
    ]
  ] = js.native
}

object ClassesPartial {
  @scala.inline
  def apply[Props, S, ClassNames](): ClassesPartial[Props, S, ClassNames] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClassesPartial[Props, S, ClassNames]]
  }
  @scala.inline
  implicit class ClassesPartialOps[Self[props, s, classnames] <: ClassesPartial[props, s, classnames], Props, S, ClassNames] (val x: Self[Props, S, ClassNames]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Props, S, ClassNames] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Props, S, ClassNames]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[Props, S, ClassNames]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[Props, S, ClassNames]) with Other]
    @scala.inline
    def withClasses(
      value: Partial[
          /* import warning: importer.ImportType#apply Failed type conversion: Props['classes'] */ js.Any
        ]
    ): Self[Props, S, ClassNames] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClasses: Self[Props, S, ClassNames] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classes")(js.undefined)
        ret
    }
  }
  
}

