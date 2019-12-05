package typingsSlinky.reactDashI18next.reactDashI18nextMod

import slinky.core.ReactComponentClass
import typingsSlinky.i18next.i18nextMod.WithT
import typingsSlinky.reactDashI18next.Anon_WithRef
import typingsSlinky.reactDashI18next.reactDashI18nextStrings.i18n
import typingsSlinky.reactDashI18next.reactDashI18nextStrings.tReady
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WithTranslation extends WithT {
  var i18n: typingsSlinky.i18next.i18nextMod.i18n = js.native
  var tReady: Boolean = js.native
}

@JSImport("react-i18next", "withTranslation")
@js.native
object withTranslation extends js.Object {
  def apply(): js.Function1[
    /* component */ ReactComponentClass[WithTranslation], 
    ReactComponentClass[Omit[WithTranslation, i18n | tReady]]
  ] = js.native
  def apply(ns: Namespace): js.Function1[
    /* component */ ReactComponentClass[WithTranslation], 
    ReactComponentClass[Omit[WithTranslation, i18n | tReady]]
  ] = js.native
  def apply(ns: Namespace, options: Anon_WithRef): js.Function1[
    /* component */ ReactComponentClass[WithTranslation], 
    ReactComponentClass[Omit[WithTranslation, i18n | tReady]]
  ] = js.native
}

