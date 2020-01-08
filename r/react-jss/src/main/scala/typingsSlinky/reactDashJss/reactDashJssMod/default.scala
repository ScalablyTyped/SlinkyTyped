package typingsSlinky.reactDashJss.reactDashJssMod

import slinky.core.ReactComponentClass
import typingsSlinky.jss.jssMod.Styles
import typingsSlinky.reactDashJss.Anon_Classes
import typingsSlinky.reactDashJss.Anon_ClassesPartial
import typingsSlinky.reactDashJss.reactDashJssStrings.classes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-jss", JSImport.Default)
@js.native
object default extends js.Object {
  def apply[ClassNames /* <: String | Double | js.Symbol */, S /* <: Styles[ClassNames] | (js.Function1[/* theme */ js.Any, Styles[ClassNames]]) */](styles: S): js.Function1[
    /* comp */ ReactComponentClass[Anon_Classes[S, ClassNames]], 
    ReactComponentClass[
      (Omit[Anon_Classes[S, ClassNames], classes]) with (Anon_ClassesPartial[Anon_Classes[S, ClassNames]])
    ]
  ] = js.native
  def apply[ClassNames /* <: String | Double | js.Symbol */, S /* <: Styles[ClassNames] | (js.Function1[/* theme */ js.Any, Styles[ClassNames]]) */](styles: S, options: WithStylesOptions): js.Function1[
    /* comp */ ReactComponentClass[Anon_Classes[S, ClassNames]], 
    ReactComponentClass[
      (Omit[Anon_Classes[S, ClassNames], classes]) with (Anon_ClassesPartial[Anon_Classes[S, ClassNames]])
    ]
  ] = js.native
}

