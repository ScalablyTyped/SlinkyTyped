package typingsSlinky.linguiReact.withI18nMod

import slinky.core.ReactComponentClass
import typingsSlinky.linguiReact.linguiReactStrings.i18n
import typingsSlinky.std.Exclude
import typingsSlinky.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@lingui/react/withI18n", JSImport.Default)
@js.native
object default extends js.Object {
  def apply(): js.Function1[
    /* WrappedComponent */ ComponentConstructor[_], 
    ReactComponentClass[Pick[_, Exclude[String, i18n]]]
  ] = js.native
  def apply(options: withI18nOptions): js.Function1[
    /* WrappedComponent */ ComponentConstructor[_], 
    ReactComponentClass[Pick[_, Exclude[String, i18n]]]
  ] = js.native
}

