package typingsSlinky.materialUiCore

import slinky.core.ReactComponentClass
import typingsSlinky.materialUiCore.anon.PartialWithWidth
import typingsSlinky.materialUiCore.withMobileDialogWithMobileDialogMod.InjectedProps
import typingsSlinky.materialUiCore.withMobileDialogWithMobileDialogMod.WithMobileDialogOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material-ui/core/withMobileDialog", JSImport.Namespace)
@js.native
object withMobileDialogMod extends js.Object {
  def default[P](): js.Function1[
    /* component */ ReactComponentClass[P with InjectedProps with PartialWithWidth], 
    ReactComponentClass[P with PartialWithWidth]
  ] = js.native
  def default[P](options: WithMobileDialogOptions): js.Function1[
    /* component */ ReactComponentClass[P with InjectedProps with PartialWithWidth], 
    ReactComponentClass[P with PartialWithWidth]
  ] = js.native
}

