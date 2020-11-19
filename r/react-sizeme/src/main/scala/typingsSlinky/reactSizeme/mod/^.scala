package typingsSlinky.reactSizeme.mod

import slinky.core.ReactComponentClass
import typingsSlinky.reactSizeme.reactSizemeStrings.size
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-sizeme", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(): js.Function1[
    /* component */ ReactComponentClass[js.Object], 
    ReactComponentClass[(Omit[js.Object, size]) with WithSizeProps]
  ] = js.native
  def apply(options: SizeMeOptions): js.Function1[
    /* component */ ReactComponentClass[js.Object], 
    ReactComponentClass[(Omit[js.Object, size]) with WithSizeProps]
  ] = js.native
  
  var noPlaceholders: Boolean = js.native
}
