package typingsSlinky.reactFns

import slinky.core.ReactComponentClass
import typingsSlinky.reactFns.localesLocalesMod.LocalesProps
import typingsSlinky.reactFns.typesMod.SharedRenderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object localesMod {
  
  @JSImport("react-fns/dist/Locales", "Locales")
  @js.native
  class Locales protected ()
    extends typingsSlinky.reactFns.localesLocalesMod.Locales {
    def this(props: SharedRenderProps[LocalesProps]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: SharedRenderProps[LocalesProps], context: js.Any) = this()
  }
  
  @JSImport("react-fns/dist/Locales", "withLocales")
  @js.native
  def withLocales[Props](Component: ReactComponentClass[Props with LocalesProps]): ReactComponentClass[Props] = js.native
}
