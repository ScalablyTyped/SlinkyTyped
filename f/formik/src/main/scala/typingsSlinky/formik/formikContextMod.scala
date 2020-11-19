package typingsSlinky.formik

import slinky.core.ReactComponentClass
import typingsSlinky.formik.typesMod.FormikContextType
import typingsSlinky.react.mod.ConsumerProps
import typingsSlinky.react.mod.Context
import typingsSlinky.react.mod.ProviderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("formik/dist/FormikContext", JSImport.Namespace)
@js.native
object formikContextMod extends js.Object {
  
  val FormikConsumer: ReactComponentClass[ConsumerProps[FormikContextType[js.Any]]] = js.native
  
  val FormikContext: Context[FormikContextType[js.Any]] = js.native
  
  val FormikProvider: ReactComponentClass[ProviderProps[FormikContextType[js.Any]]] = js.native
  
  def useFormikContext[Values](): FormikContextType[Values] = js.native
}
