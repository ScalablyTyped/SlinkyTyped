package typingsSlinky.formik

import slinky.core.ReactComponentClass
import typingsSlinky.formik.anon.Formik
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("formik/dist/connect", JSImport.Namespace)
@js.native
object connectMod extends js.Object {
  def connect[OuterProps, Values](Comp: ReactComponentClass[OuterProps with Formik[Values]]): ReactComponentClass[OuterProps] = js.native
}

