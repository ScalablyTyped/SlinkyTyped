package typingsSlinky.reactJss.mod

import slinky.core.ReactComponentClass
import typingsSlinky.jss.mod.Styles
import typingsSlinky.reactJss.anon.Classes
import typingsSlinky.reactJss.anon.`0`
import typingsSlinky.reactJss.reactJssStrings.classes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-jss", JSImport.Default)
@js.native
object default extends js.Object {
  
  def apply[ClassNames /* <: String | Double | js.Symbol */, S /* <: Styles[ClassNames] | (js.Function1[/* theme */ js.Any, Styles[ClassNames]]) */](styles: S): js.Function1[
    /* comp */ ReactComponentClass[Classes[S, ClassNames]], 
    ReactComponentClass[
      (Omit[Classes[S, ClassNames], classes]) with (`0`[Classes[S, ClassNames], S, ClassNames])
    ]
  ] = js.native
  def apply[ClassNames /* <: String | Double | js.Symbol */, S /* <: Styles[ClassNames] | (js.Function1[/* theme */ js.Any, Styles[ClassNames]]) */](styles: S, options: WithStylesOptions): js.Function1[
    /* comp */ ReactComponentClass[Classes[S, ClassNames]], 
    ReactComponentClass[
      (Omit[Classes[S, ClassNames], classes]) with (`0`[Classes[S, ClassNames], S, ClassNames])
    ]
  ] = js.native
}
