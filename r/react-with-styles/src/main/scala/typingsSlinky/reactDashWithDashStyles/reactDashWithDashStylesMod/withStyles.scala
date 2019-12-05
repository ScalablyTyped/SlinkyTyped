package typingsSlinky.reactDashWithDashStyles.reactDashWithDashStylesMod

import slinky.core.ReactComponentClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-with-styles", "withStyles")
@js.native
object withStyles extends js.Object {
  def apply[T](): js.Function1[
    /* component */ ReactComponentClass[_], 
    ReactComponentClass[Omit[ElementConfig[ReactComponentClass[_]], String]]
  ] = js.native
  def apply[T](styleFn: js.Function1[/* theme */ T, Styles]): js.Function1[
    /* component */ ReactComponentClass[_], 
    ReactComponentClass[Omit[ElementConfig[ReactComponentClass[_]], String]]
  ] = js.native
  def apply[T](styleFn: js.Function1[/* theme */ T, Styles], options: WithStylesOptions): js.Function1[
    /* component */ ReactComponentClass[_], 
    ReactComponentClass[Omit[ElementConfig[ReactComponentClass[_]], String]]
  ] = js.native
  def apply[T](styleFn: Null, options: WithStylesOptions): js.Function1[
    /* component */ ReactComponentClass[_], 
    ReactComponentClass[Omit[ElementConfig[ReactComponentClass[_]], String]]
  ] = js.native
}

