package typingsSlinky.reactLazyLoadImageComponent.mod

import slinky.core.ReactComponentClass
import typingsSlinky.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.scrollPosition
import typingsSlinky.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-lazy-load-image-component", "trackWindowScroll")
@js.native
object trackWindowScroll extends js.Object {
  
  def apply[P /* <: LazyComponentProps */](BaseComponent: ReactComponentClass[P]): ReactComponentClass[Omit[P, scrollPosition]] = js.native
}
