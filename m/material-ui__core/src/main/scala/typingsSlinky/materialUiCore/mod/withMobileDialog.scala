package typingsSlinky.materialUiCore.mod

import slinky.core.ReactComponentClass
import typingsSlinky.materialUiCore.anon.PartialWithWidth
import typingsSlinky.materialUiCore.withMobileDialogWithMobileDialogMod.InjectedProps
import typingsSlinky.materialUiCore.withMobileDialogWithMobileDialogMod.WithMobileDialogOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material-ui/core", "withMobileDialog")
@js.native
object withMobileDialog extends js.Object {
  def apply[P](): js.Function1[
    /* component */ ReactComponentClass[P with InjectedProps with PartialWithWidth], 
    ReactComponentClass[P with PartialWithWidth]
  ] = js.native
  def apply[P](options: WithMobileDialogOptions): js.Function1[
    /* component */ ReactComponentClass[P with InjectedProps with PartialWithWidth], 
    ReactComponentClass[P with PartialWithWidth]
  ] = js.native
}

