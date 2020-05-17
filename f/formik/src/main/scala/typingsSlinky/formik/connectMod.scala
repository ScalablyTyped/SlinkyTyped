package typingsSlinky.formik

import slinky.core.ReactComponentClass
import typingsSlinky.formik.anon.FormikFormikContext
import typingsSlinky.formik.typesMod.FormikContext
import typingsSlinky.react.mod.ProviderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("formik/dist/connect", JSImport.Namespace)
@js.native
object connectMod extends js.Object {
  /* import warning: parser.TsParser#tsDeclVar Dropped IArray(FormikConsumer) */ val FormikProvider: ReactComponentClass[ProviderProps[FormikContext[js.Any]]] = js.native
  def connect[OuterProps, Values](Comp: ReactComponentClass[OuterProps with FormikFormikContext[Values]]): ReactComponentClass[OuterProps] = js.native
}

