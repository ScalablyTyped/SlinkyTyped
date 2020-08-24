package typingsSlinky.chayns.global.chayns

import typingsSlinky.chayns.DialogButton
import typingsSlinky.chayns.DialogDateConfig
import typingsSlinky.chayns.DialogDateResult
import typingsSlinky.chayns.DialogFacebookOptions
import typingsSlinky.chayns.DialogFacebookResult
import typingsSlinky.chayns.DialogInputConfig
import typingsSlinky.chayns.DialogInputResult
import typingsSlinky.chayns.DialogSelectConfig
import typingsSlinky.chayns.DialogSelectResult
import typingsSlinky.chayns.chayns.dialog.buttonType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * UI Functions
  * chayns.dialog
  */
@JSGlobal("chayns.dialog")
@js.native
object dialog extends js.Object {
  def alert(title: String): js.Promise[buttonType] = js.native
  def alert(title: String, message: String): js.Promise[buttonType] = js.native
  def confirm(title: String): js.Promise[buttonType] = js.native
  def confirm(title: String, message: js.UndefOr[scala.Nothing], buttons: js.Array[DialogButton]): js.Promise[buttonType] = js.native
  def confirm(title: String, message: String): js.Promise[buttonType] = js.native
  def confirm(title: String, message: String, buttons: js.Array[DialogButton]): js.Promise[buttonType] = js.native
  def date(config: DialogDateConfig): js.Promise[DialogDateResult] = js.native
  def facebook(options: DialogFacebookOptions): js.Promise[DialogFacebookResult] = js.native
  def input(config: DialogInputConfig): js.Promise[DialogInputResult] = js.native
  def select(config: DialogSelectConfig): js.Promise[DialogSelectResult] = js.native
  @js.native
  object buttonText extends js.Object {
    /* "Abbrechen" */ val CANCEL: typingsSlinky.chayns.chayns.dialog.buttonText.CANCEL with String = js.native
    /* "Nein" */ val NO: typingsSlinky.chayns.chayns.dialog.buttonText.NO with String = js.native
    /* "OK" */ val OK: typingsSlinky.chayns.chayns.dialog.buttonText.OK with String = js.native
    /* "Ja" */ val YES: typingsSlinky.chayns.chayns.dialog.buttonText.YES with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.chayns.chayns.dialog.buttonText with String] = js.native
  }
  
  @js.native
  object buttonType extends js.Object {
    /* -1 */ val CANCEL: typingsSlinky.chayns.chayns.dialog.buttonType.CANCEL with Double = js.native
    /* 0 */ val NEGATIVE: typingsSlinky.chayns.chayns.dialog.buttonType.NEGATIVE with Double = js.native
    /* 1 */ val POSITIVE: typingsSlinky.chayns.chayns.dialog.buttonType.POSITIVE with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.chayns.chayns.dialog.buttonType with Double] = js.native
  }
  
  @js.native
  object dateType extends js.Object {
    /* 0 */ val DATE: typingsSlinky.chayns.chayns.dialog.dateType.DATE with Double = js.native
    /* 2 */ val DATE_TIME: typingsSlinky.chayns.chayns.dialog.dateType.DATE_TIME with Double = js.native
    /* 1 */ val TIME: typingsSlinky.chayns.chayns.dialog.dateType.TIME with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.chayns.chayns.dialog.dateType with Double] = js.native
  }
  
  @js.native
  object inputType extends js.Object {
    /* 0 */ val DEFAULT: typingsSlinky.chayns.chayns.dialog.inputType.DEFAULT with Double = js.native
    /* 1 */ val PASSWORD: typingsSlinky.chayns.chayns.dialog.inputType.PASSWORD with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.chayns.chayns.dialog.inputType with Double] = js.native
  }
  
}

