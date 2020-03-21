package typingsSlinky.reactFns

import slinky.core.ReactComponentClass
import typingsSlinky.reactFns.localesLocalesMod.LocalesProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-fns/dist/Locales", JSImport.Namespace)
@js.native
object localesMod extends js.Object {
  @js.native
  class Locales ()
    extends typingsSlinky.reactFns.localesLocalesMod.Locales
  
  def withLocales[Props](Component: ReactComponentClass[Props with LocalesProps]): ReactComponentClass[Props] = js.native
}

