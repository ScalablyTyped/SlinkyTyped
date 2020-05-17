package typingsSlinky.protractor.locatorsMod

import typingsSlinky.seleniumWebdriver.mod.WebDriver
import typingsSlinky.seleniumWebdriver.mod.WebElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProtractorLocator extends Locator {
  var column: js.UndefOr[js.Function1[/* index */ String, Locator]] = js.native
  var row: js.UndefOr[js.Function1[/* index */ Double, Locator]] = js.native
  @JSName("toString")
  var toString_FProtractorLocator: js.UndefOr[js.Function0[String]] = js.native
  def findElementsOverride(driver: WebDriver, using: WebElement, rootSelector: String): js.Promise[js.Array[WebElement]] = js.native
}

object ProtractorLocator {
  @scala.inline
  def apply(findElementsOverride: (WebDriver, WebElement, String) => js.Promise[js.Array[WebElement]]): ProtractorLocator = {
    val __obj = js.Dynamic.literal(findElementsOverride = js.Any.fromFunction3(findElementsOverride))
    __obj.asInstanceOf[ProtractorLocator]
  }
  @scala.inline
  implicit class ProtractorLocatorOps[Self <: ProtractorLocator] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFindElementsOverride(value: (WebDriver, WebElement, String) => js.Promise[js.Array[WebElement]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findElementsOverride")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withColumn(value: /* index */ String => Locator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("column")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutColumn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("column")(js.undefined)
        ret
    }
    @scala.inline
    def withRow(value: /* index */ Double => Locator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("row")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("row")(js.undefined)
        ret
    }
    @scala.inline
    def withToString(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toString")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutToString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toString")(js.undefined)
        ret
    }
  }
  
}

