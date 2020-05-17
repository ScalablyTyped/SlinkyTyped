package typingsSlinky.reactI18next.mod

import slinky.core.ReactComponentClass
import typingsSlinky.reactI18next.anon.WithRef
import typingsSlinky.reactI18next.reactI18nextStrings.i18n
import typingsSlinky.reactI18next.reactI18nextStrings.tReady
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-i18next", "withTranslation")
@js.native
object withTranslation extends js.Object {
  def apply(): js.Function1[
    /* component */ ReactComponentClass[WithTranslation_], 
    ReactComponentClass[Omit[WithTranslation_, i18n | tReady]]
  ] = js.native
  def apply(ns: Namespace): js.Function1[
    /* component */ ReactComponentClass[WithTranslation_], 
    ReactComponentClass[Omit[WithTranslation_, i18n | tReady]]
  ] = js.native
  def apply(ns: Namespace, options: WithRef): js.Function1[
    /* component */ ReactComponentClass[WithTranslation_], 
    ReactComponentClass[Omit[WithTranslation_, i18n | tReady]]
  ] = js.native
}

