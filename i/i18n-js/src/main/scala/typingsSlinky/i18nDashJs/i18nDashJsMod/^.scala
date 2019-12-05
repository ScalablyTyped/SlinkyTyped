package typingsSlinky.i18nDashJs.i18nDashJsMod

import typingsSlinky.i18nDashJs.i18nDashJsStrings.guess
import typingsSlinky.i18nDashJs.i18nDashJsStrings.message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("i18n-js", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var defaultLocale: String = js.native
  var defaultSeparator: String = js.native
  var fallbacks: Boolean = js.native
  var locale: String = js.native
  var missingBehaviour: message | guess = js.native
  // tslint:disable-next-line prefer-declare-function
  var missingPlaceholder: js.Function3[
    /* placeholder */ String, 
    /* message */ String, 
    /* options */ js.UndefOr[InterpolateOptions], 
    js.UndefOr[String | Null]
  ] = js.native
  // tslint:disable-next-line prefer-declare-function
  var missingTranslation: js.Function2[
    /* scope */ String, 
    /* options */ js.UndefOr[TranslateOptions], 
    js.UndefOr[String | Null]
  ] = js.native
  var missingTranslationPrefix: String = js.native
  // tslint:disable-next-line prefer-declare-function
  var nullPlaceholder: js.Function3[
    /* placeholder */ String, 
    /* message */ String, 
    /* options */ js.UndefOr[InterpolateOptions], 
    js.UndefOr[String | Null]
  ] = js.native
  var placeholder: js.RegExp = js.native
}

