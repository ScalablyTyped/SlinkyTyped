package typingsSlinky.durandal.compositionMod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.knockout.KnockoutBindingContext
import typingsSlinky.knockout.KnockoutBindingHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("durandal/composition", "addBindingHandler")
@js.native
object addBindingHandler extends js.Object {
  def apply(name: String): Unit = js.native
  def apply(name: String, config: KnockoutBindingHandler[_, _, _]): Unit = js.native
  def apply(
    name: String,
    config: KnockoutBindingHandler[_, _, _],
    initOptionsFactory: js.Function5[
      /* element */ js.UndefOr[HTMLElement], 
      /* valueAccessor */ js.UndefOr[js.Any], 
      /* allBindingsAccessor */ js.UndefOr[js.Any], 
      /* viewModel */ js.UndefOr[js.Any], 
      /* bindingContext */ js.UndefOr[KnockoutBindingContext], 
      _
    ]
  ): Unit = js.native
}

