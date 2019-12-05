package typingsSlinky.reactDashReduxDashToastr.reactDashReduxDashToastrMod

import typingsSlinky.redux.reduxMod.Action
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ToastrActionCreators extends js.Object {
  def add(toastr: AddToastPayload): Action[_] = js.native
  def clean(): Action[_] = js.native
  def hideConfirm(): Action[_] = js.native
  def remove(id: String): Action[_] = js.native
  def removeByType(`type`: toastType): Action[_] = js.native
  def showConfirm(confirm: ConfirmToastrCustomOptions): Action[_] = js.native
  def showConfirm(confirm: ConfirmToastrOptions): Action[_] = js.native
}

