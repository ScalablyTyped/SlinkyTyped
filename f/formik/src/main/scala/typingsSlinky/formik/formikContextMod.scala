package typingsSlinky.formik

import slinky.core.ReactComponentClass
import typingsSlinky.formik.typesMod.FormikContextType
import typingsSlinky.react.mod.ConsumerProps
import typingsSlinky.react.mod.Context
import typingsSlinky.react.mod.ProviderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formikContextMod {
  
  @JSImport("formik/dist/FormikContext", "FormikConsumer")
  @js.native
  val FormikConsumer: ReactComponentClass[ConsumerProps[FormikContextType[js.Any]]] = js.native
  
  @JSImport("formik/dist/FormikContext", "FormikContext")
  @js.native
  val FormikContext: Context[FormikContextType[js.Any]] = js.native
  
  @JSImport("formik/dist/FormikContext", "FormikProvider")
  @js.native
  val FormikProvider: ReactComponentClass[ProviderProps[FormikContextType[js.Any]]] = js.native
  
  @JSImport("formik/dist/FormikContext", "useFormikContext")
  @js.native
  def useFormikContext[Values](): FormikContextType[Values] = js.native
}
