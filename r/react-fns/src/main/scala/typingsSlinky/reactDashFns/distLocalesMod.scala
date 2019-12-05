package typingsSlinky.reactDashFns

import slinky.core.ReactComponentClass
import typingsSlinky.reactDashFns.distLocalesLocalesMod.LocalesProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-fns/dist/Locales", JSImport.Namespace)
@js.native
object distLocalesMod extends js.Object {
  @js.native
  class Locales ()
    extends typingsSlinky.reactDashFns.distLocalesLocalesMod.Locales
  
  def withLocales[Props](Component: ReactComponentClass[Props with LocalesProps]): ReactComponentClass[Props] = js.native
}

