package typingsSlinky.reactDashJss.reactDashJssMod

import slinky.core.ReactComponentClass
import typingsSlinky.jss.jssMod.Styles
import typingsSlinky.reactDashJss.Anon_Classes
import typingsSlinky.reactDashJss.reactDashJssStrings.classes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-jss", JSImport.Default)
@js.native
object default extends js.Object {
  def apply[S /* <: Styles[String] | ThemedStyles[_] */](styles: S): js.Function1[
    /* comp */ ReactComponentClass[WithStyles[S]], 
    ReactComponentClass[(Omit[WithStyles[S], classes]) with Anon_Classes[WithStyles[S]]]
  ] = js.native
  def apply[S /* <: Styles[String] | ThemedStyles[_] */](styles: S, options: WithStylesOptions): js.Function1[
    /* comp */ ReactComponentClass[WithStyles[S]], 
    ReactComponentClass[(Omit[WithStyles[S], classes]) with Anon_Classes[WithStyles[S]]]
  ] = js.native
}

