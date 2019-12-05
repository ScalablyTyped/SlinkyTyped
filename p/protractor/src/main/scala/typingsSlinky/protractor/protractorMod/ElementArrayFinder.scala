package typingsSlinky.protractor.protractorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protractor", "ElementArrayFinder")
@js.native
class ElementArrayFinder protected ()
  extends typingsSlinky.protractor.builtElementMod.ElementArrayFinder {
  def this(browser_ : typingsSlinky.protractor.builtBrowserMod.ProtractorBrowser) = this()
  def this(
    browser_ : typingsSlinky.protractor.builtBrowserMod.ProtractorBrowser,
    getWebElements: js.Function0[
        js.Promise[
          js.Array[typingsSlinky.seleniumDashWebdriver.seleniumDashWebdriverMod.WebElement]
        ]
      ]
  ) = this()
  def this(
    browser_ : typingsSlinky.protractor.builtBrowserMod.ProtractorBrowser,
    getWebElements: js.Function0[
        js.Promise[
          js.Array[typingsSlinky.seleniumDashWebdriver.seleniumDashWebdriverMod.WebElement]
        ]
      ],
    locator_ : js.Any
  ) = this()
  def this(
    browser_ : typingsSlinky.protractor.builtBrowserMod.ProtractorBrowser,
    getWebElements: js.Function0[
        js.Promise[
          js.Array[typingsSlinky.seleniumDashWebdriver.seleniumDashWebdriverMod.WebElement]
        ]
      ],
    locator_ : js.Any,
    actionResults_ : js.Promise[_]
  ) = this()
}

