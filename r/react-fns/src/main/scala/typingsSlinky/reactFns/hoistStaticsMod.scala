package typingsSlinky.reactFns

import org.scalablytyped.runtime.StringDictionary
import slinky.core.ReactComponentClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hoistStaticsMod {
  
  @JSImport("react-fns/dist/hoistStatics", "hoistNonReactStatics")
  @js.native
  def hoistNonReactStatics[P](targetComponent: ReactComponentClass[P], sourceComponent: ReactComponentClass[_]): ReactComponentClass[P] = js.native
  @JSImport("react-fns/dist/hoistStatics", "hoistNonReactStatics")
  @js.native
  def hoistNonReactStatics[P](
    targetComponent: ReactComponentClass[P],
    sourceComponent: ReactComponentClass[_],
    blacklist: StringDictionary[Boolean]
  ): ReactComponentClass[P] = js.native
  
  @JSImport("react-fns/dist/hoistStatics", "isEmptyChildren")
  @js.native
  def isEmptyChildren(children: js.Any): Boolean = js.native
}
