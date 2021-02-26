package typingsSlinky.enzymeRedux

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.enzyme.mod.ReactWrapper
import typingsSlinky.enzyme.mod.ShallowWrapper
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("enzyme-redux", "mountWithState")
  @js.native
  def mountWithState[P](Component: ReactElement, state: js.Any): ReactWrapper[P, js.Object, ReactComponentClass[js.Object]] = js.native
  
  @JSImport("enzyme-redux", "mountWithStore")
  @js.native
  def mountWithStore[P](Component: ReactElement, store: js.Any): ReactWrapper[P, js.Object, ReactComponentClass[js.Object]] = js.native
  
  @JSImport("enzyme-redux", "shallowWithState")
  @js.native
  def shallowWithState[P](Component: ReactElement, state: js.Any): ShallowWrapper[P, js.Object, ReactComponentClass[js.Object]] = js.native
  
  @JSImport("enzyme-redux", "shallowWithStore")
  @js.native
  def shallowWithStore[P](Component: ReactElement, store: js.Any): ShallowWrapper[P, js.Object, ReactComponentClass[js.Object]] = js.native
}
