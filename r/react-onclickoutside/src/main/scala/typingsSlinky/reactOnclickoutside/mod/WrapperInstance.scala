package typingsSlinky.reactOnclickoutside.mod

import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.global.JSX.LibraryManagedAttributes
import typingsSlinky.std.InstanceType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WrapperInstance[P, C]
  extends Component[OnClickOutProps[LibraryManagedAttributes[C, P]], js.Object, js.Any] {
  
  def getInstance(): InstanceType[C] = js.native
}
