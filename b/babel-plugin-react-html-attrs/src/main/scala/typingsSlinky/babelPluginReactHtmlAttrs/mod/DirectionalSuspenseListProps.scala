package typingsSlinky.babelPluginReactHtmlAttrs.mod

import typingsSlinky.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.backwards
import typingsSlinky.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.forwards
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DirectionalSuspenseListProps
  extends typingsSlinky.babelPluginReactHtmlAttrs.experimentalMod.babelPluginReactHtmlAttrsAugmentingMod.SuspenseListCommonProps {
  
  /**
    * Defines the order in which the `SuspenseList` children should be revealed.
    */
  var revealOrder: forwards | backwards = js.native
  
  /**
    * Dictates how unloaded items in a SuspenseList is shown.
    *
    * - By default, `SuspenseList` will show all fallbacks in the list.
    * - `collapsed` shows only the next fallback in the list.
    * - `hidden` doesn’t show any unloaded items.
    */
  var tail: js.UndefOr[
    typingsSlinky.babelPluginReactHtmlAttrs.experimentalMod.babelPluginReactHtmlAttrsAugmentingMod.SuspenseListTailMode
  ] = js.native
}
object DirectionalSuspenseListProps {
  
  @scala.inline
  def apply(
    children: (ReactElement[_, String | JSXElementConstructor[_]]) | (js.Iterable[ReactElement[_, String | JSXElementConstructor[_]]]),
    revealOrder: forwards | backwards
  ): DirectionalSuspenseListProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], revealOrder = revealOrder.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectionalSuspenseListProps]
  }
  
  @scala.inline
  implicit class DirectionalSuspenseListPropsMutableBuilder[Self <: DirectionalSuspenseListProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRevealOrder(value: forwards | backwards): Self = StObject.set(x, "revealOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTail(
      value: typingsSlinky.babelPluginReactHtmlAttrs.experimentalMod.babelPluginReactHtmlAttrsAugmentingMod.SuspenseListTailMode
    ): Self = StObject.set(x, "tail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTailUndefined: Self = StObject.set(x, "tail", js.undefined)
  }
}
