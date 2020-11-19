package typingsSlinky.babelPluginReactHtmlAttrs.experimentalMod.babelPluginReactHtmlAttrsAugmentingMod

import typingsSlinky.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.backwards
import typingsSlinky.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.forwards
import typingsSlinky.babelPluginReactHtmlAttrs.mod.JSXElementConstructor
import typingsSlinky.babelPluginReactHtmlAttrs.mod.ReactElement
import typingsSlinky.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NonDirectionalSuspenseListProps
  extends SuspenseListCommonProps
     with typingsSlinky.babelPluginReactHtmlAttrs.mod.SuspenseListProps
     with SuspenseListProps {
  
  /**
    * Defines the order in which the `SuspenseList` children should be revealed.
    */
  var revealOrder: js.UndefOr[Exclude[SuspenseListRevealOrder, forwards | backwards]] = js.native
  
  /**
    * The tail property is invalid when not using the `forwards` or `backwards` reveal orders.
    */
  var tail: js.UndefOr[scala.Nothing] = js.native
}
object NonDirectionalSuspenseListProps {
  
  @scala.inline
  def apply(
    children: (ReactElement[_, String | JSXElementConstructor[_]]) | (js.Iterable[ReactElement[_, String | JSXElementConstructor[_]]])
  ): NonDirectionalSuspenseListProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.asInstanceOf[NonDirectionalSuspenseListProps]
  }
  
  @scala.inline
  implicit class NonDirectionalSuspenseListPropsOps[Self <: NonDirectionalSuspenseListProps] (val x: Self) extends AnyVal {
    
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
    def setRevealOrder(value: Exclude[SuspenseListRevealOrder, forwards | backwards]): Self = this.set("revealOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRevealOrder: Self = this.set("revealOrder", js.undefined)
  }
}
