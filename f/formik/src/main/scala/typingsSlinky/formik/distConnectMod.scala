package typingsSlinky.formik

import slinky.core.ReactComponentClass
import typingsSlinky.formik.distTypesMod.FormikContext
import typingsSlinky.react.reactMod.ProviderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("formik/dist/connect", JSImport.Namespace)
@js.native
object distConnectMod extends js.Object {
  /* import warning: parser.TsParser#tsDeclVar $anonfun Dropped List(FormikConsumer) */ val FormikProvider: ReactComponentClass[ProviderProps[FormikContext[js.Any]]] = js.native
  def connect[OuterProps, Values](Comp: ReactComponentClass[OuterProps with Anon_FormikFormikContext[Values]]): ReactComponentClass[OuterProps] = js.native
}

