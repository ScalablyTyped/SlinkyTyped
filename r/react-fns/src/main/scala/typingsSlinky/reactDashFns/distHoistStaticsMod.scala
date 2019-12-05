package typingsSlinky.reactDashFns

import org.scalablytyped.runtime.StringDictionary
import slinky.core.ReactComponentClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-fns/dist/hoistStatics", JSImport.Namespace)
@js.native
object distHoistStaticsMod extends js.Object {
  def hoistNonReactStatics[P](targetComponent: ReactComponentClass[P], sourceComponent: ReactComponentClass[_]): ReactComponentClass[P] = js.native
  def hoistNonReactStatics[P](
    targetComponent: ReactComponentClass[P],
    sourceComponent: ReactComponentClass[_],
    blacklist: StringDictionary[Boolean]
  ): ReactComponentClass[P] = js.native
  def isEmptyChildren(children: js.Any): Boolean = js.native
}

