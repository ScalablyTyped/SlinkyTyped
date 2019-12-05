package typingsSlinky.protractor.protractorMod

import typingsSlinky.protractor.builtBrowserMod.ElementHelper
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protractor", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  @JSName("$")
  var $: js.Function1[/* search */ String, typingsSlinky.protractor.builtElementMod.ElementFinder] = js.native
  @JSName("$$")
  var $$: js.Function1[/* search */ String, typingsSlinky.protractor.builtElementMod.ElementArrayFinder] = js.native
  var By: typingsSlinky.protractor.builtLocatorsMod.ProtractorBy = js.native
  var Command: js.Any = js.native
  var CommandName: js.Any = js.native
  var ExpectedConditions: typingsSlinky.protractor.builtExpectedConditionsMod.ProtractorExpectedConditions = js.native
  var browser: typingsSlinky.protractor.builtBrowserMod.ProtractorBrowser = js.native
  var by: typingsSlinky.protractor.builtLocatorsMod.ProtractorBy = js.native
  var element: ElementHelper = js.native
}

