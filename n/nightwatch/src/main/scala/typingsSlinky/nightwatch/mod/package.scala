package typingsSlinky.nightwatch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type EnhancedPageObject[Commands, Elements, Sections /* <: typingsSlinky.nightwatch.mod.EnhancedPageObjectSections */] = typingsSlinky.nightwatch.mod.Nightwatch with typingsSlinky.nightwatch.mod.SharedCommands with typingsSlinky.nightwatch.mod.NightwatchCustomCommands with Commands with typingsSlinky.nightwatch.anon.Elements[Sections]
  type EnhancedSectionInstance[Commands, Elements, Sections] = typingsSlinky.nightwatch.mod.EnhancedPageObject[Commands, Elements, Sections]
  type NightwatchAssert = js.Function6[
    /* passed */ scala.Boolean, 
    /* receivedValue */ js.UndefOr[js.Any], 
    /* expectedValue */ js.UndefOr[js.Any], 
    /* message */ js.UndefOr[java.lang.String], 
    /* abortOnFailure */ js.UndefOr[scala.Boolean], 
    /* originalStackTrace */ js.UndefOr[java.lang.String], 
    scala.Unit
  ]
  type NightwatchTest = js.Function1[/* browser */ typingsSlinky.nightwatch.mod.NightwatchBrowser, scala.Unit]
  type NightwatchTestSettings = org.scalablytyped.runtime.StringDictionary[typingsSlinky.nightwatch.mod.NightwatchTestSettingScreenshots]
}
