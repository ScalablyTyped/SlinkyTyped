package typingsSlinky.reactInstantsearchDom.mod

import org.scalablytyped.runtime.StringDictionary
import slinky.core.ReactComponentClass
import typingsSlinky.reactInstantsearchCore.mod.Omit
import typingsSlinky.reactInstantsearchCore.mod.TranslatableExposed
import typingsSlinky.reactInstantsearchCore.mod.TranslatableProvided
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-instantsearch-dom", "translatable")
@js.native
object translatable extends js.Object {
  
  def apply(defaultTranslations: StringDictionary[String | (js.Function1[/* repeated */ js.Any, String])]): js.Function1[
    /* ctor */ ReactComponentClass[TranslatableProvided], 
    ReactComponentClass[(Omit[TranslatableProvided, TranslatableProvided]) with TranslatableExposed]
  ] = js.native
}
