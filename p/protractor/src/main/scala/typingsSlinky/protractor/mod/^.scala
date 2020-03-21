package typingsSlinky.protractor.mod

import typingsSlinky.protractor.browserMod.ElementHelper
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protractor", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  @JSName("$$")
  var $: js.Function1[/* search */ String, typingsSlinky.protractor.elementMod.ElementArrayFinder] = js.native
  @JSName("By")
  var By_ : typingsSlinky.protractor.locatorsMod.ProtractorBy = js.native
  var Command: js.Any = js.native
  var CommandName: js.Any = js.native
  var ExpectedConditions: typingsSlinky.protractor.expectedConditionsMod.ProtractorExpectedConditions = js.native
  @JSName("$")
  var _empty: js.Function1[/* search */ String, typingsSlinky.protractor.elementMod.ElementFinder] = js.native
  var browser: typingsSlinky.protractor.browserMod.ProtractorBrowser = js.native
  var by: typingsSlinky.protractor.locatorsMod.ProtractorBy = js.native
  var element: ElementHelper = js.native
}

