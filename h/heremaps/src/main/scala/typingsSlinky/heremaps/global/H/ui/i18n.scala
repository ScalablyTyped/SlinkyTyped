package typingsSlinky.heremaps.global.H.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Namespace contains functionality related to internationalization.
  */
@JSGlobal("H.ui.i18n")
@js.native
object i18n extends js.Object {
  
  /**
    * Default available locales. UI provides default translations for this set of locale codes.
    */
  val defaultLocales: js.Array[String] = js.native
  
  /**
    * This class is used for internationalization of UI components.
    */
  @js.native
  class Localization protected ()
    extends typingsSlinky.heremaps.H.ui.i18n.Localization {
    def this(locale: String) = this()
    def this(locale: String, opt_translationMap: js.Any) = this()
  }
}
