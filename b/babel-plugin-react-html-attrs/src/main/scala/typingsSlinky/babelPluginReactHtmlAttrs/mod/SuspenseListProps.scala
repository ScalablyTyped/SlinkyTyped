package typingsSlinky.babelPluginReactHtmlAttrs.mod

import typingsSlinky.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.backwards
import typingsSlinky.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.forwards
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.babelPluginReactHtmlAttrs.experimentalMod.babelPluginReactHtmlAttrsAugmentingMod.DirectionalSuspenseListProps
  - typingsSlinky.babelPluginReactHtmlAttrs.experimentalMod.babelPluginReactHtmlAttrsAugmentingMod.NonDirectionalSuspenseListProps
*/
trait SuspenseListProps extends StObject
object SuspenseListProps {
  
  @scala.inline
  def DirectionalSuspenseListProps(
    children: (ReactElement[_, String | JSXElementConstructor[_]]) | (js.Iterable[ReactElement[_, String | JSXElementConstructor[_]]]),
    revealOrder: forwards | backwards
  ): typingsSlinky.babelPluginReactHtmlAttrs.experimentalMod.babelPluginReactHtmlAttrsAugmentingMod.DirectionalSuspenseListProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], revealOrder = revealOrder.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelPluginReactHtmlAttrs.experimentalMod.babelPluginReactHtmlAttrsAugmentingMod.DirectionalSuspenseListProps]
  }
  
  @scala.inline
  def NonDirectionalSuspenseListProps(
    children: (ReactElement[_, String | JSXElementConstructor[_]]) | (js.Iterable[ReactElement[_, String | JSXElementConstructor[_]]])
  ): typingsSlinky.babelPluginReactHtmlAttrs.experimentalMod.babelPluginReactHtmlAttrsAugmentingMod.NonDirectionalSuspenseListProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelPluginReactHtmlAttrs.experimentalMod.babelPluginReactHtmlAttrsAugmentingMod.NonDirectionalSuspenseListProps]
  }
}
