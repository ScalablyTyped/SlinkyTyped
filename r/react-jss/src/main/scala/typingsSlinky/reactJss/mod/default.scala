package typingsSlinky.reactJss.mod

import slinky.core.ReactComponentClass
import typingsSlinky.jss.mod.Styles
import typingsSlinky.react.mod.global.JSX.LibraryManagedAttributes
import typingsSlinky.reactJss.anon.InnerRef
import typingsSlinky.reactJss.reactJssStrings.classes
import typingsSlinky.std.Omit
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-jss", JSImport.Default)
@js.native
object default extends js.Object {
  
  def apply[ClassNames /* <: String | Double | js.Symbol */, S /* <: Styles[ClassNames] | (js.Function1[/* theme */ js.Any, Styles[ClassNames]]) */](styles: S): js.Function1[
    /* comp */ js.Any, 
    ReactComponentClass[
      LibraryManagedAttributes[_, (Omit[GetProps[_], classes]) with Partial[WithStylesProps[S]] with InnerRef]
    ]
  ] = js.native
  def apply[ClassNames /* <: String | Double | js.Symbol */, S /* <: Styles[ClassNames] | (js.Function1[/* theme */ js.Any, Styles[ClassNames]]) */](styles: S, options: WithStylesOptions): js.Function1[
    /* comp */ js.Any, 
    ReactComponentClass[
      LibraryManagedAttributes[_, (Omit[GetProps[_], classes]) with Partial[WithStylesProps[S]] with InnerRef]
    ]
  ] = js.native
}
