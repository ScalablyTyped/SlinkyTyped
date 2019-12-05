package typingsSlinky.cavy.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.cavy.cavyMod.TestHookStore
import typingsSlinky.cavy.cavyMod.TestReport
import typingsSlinky.cavy.cavyMod.TestScope
import typingsSlinky.cavy.cavyMod.TesterProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Tester
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.cavy.cavyMod.Tester] {
  @JSImport("cavy", "Tester")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    specs: js.Array[js.Function1[/* spec */ TestScope, Unit]],
    store: TestHookStore,
    clearAsyncStorage: js.UndefOr[Boolean] = js.undefined,
    reporter: /* report */ TestReport => Unit = null,
    sendReport: js.UndefOr[Boolean] = js.undefined,
    startDelay: Int | Double = null,
    waitTime: Int | Double = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.cavy.cavyMod.Tester] = {
    val __obj = js.Dynamic.literal(specs = specs.asInstanceOf[js.Any], store = store.asInstanceOf[js.Any])
    if (!js.isUndefined(clearAsyncStorage)) __obj.updateDynamic("clearAsyncStorage")(clearAsyncStorage.asInstanceOf[js.Any])
    if (reporter != null) __obj.updateDynamic("reporter")(js.Any.fromFunction1(reporter))
    if (!js.isUndefined(sendReport)) __obj.updateDynamic("sendReport")(sendReport.asInstanceOf[js.Any])
    if (startDelay != null) __obj.updateDynamic("startDelay")(startDelay.asInstanceOf[js.Any])
    if (waitTime != null) __obj.updateDynamic("waitTime")(waitTime.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = TesterProps
}

