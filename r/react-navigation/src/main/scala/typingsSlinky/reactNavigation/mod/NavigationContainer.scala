package typingsSlinky.reactNavigation.mod

import typingsSlinky.react.mod.ComponentClass
import typingsSlinky.reactNavigation.anon.Nav
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavigationContainer
  extends ComponentClass[
      (NavigationContainerProps[js.Object, js.Object, _]) with (NavigationNavigatorProps[_, js.Object, _]), 
      js.Object
    ] {
  
  var navigationOptions: js.Any = js.native
  
  var router: NavigationRouter[_, _] = js.native
  
  var screenProps: js.Any = js.native
  
  var state: Nav = js.native
}
