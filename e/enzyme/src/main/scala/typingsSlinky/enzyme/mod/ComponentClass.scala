package typingsSlinky.enzyme.mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import slinky.core.ReactComponentClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComponentClass[Props]
  extends ComponentType[Props]
     with EnzymeSelector
     with Instantiable1[/* props */ Props, ReactComponentClass[Props]]
     with Instantiable2[/* props */ Props, /* context */ js.Any, ReactComponentClass[Props]]

