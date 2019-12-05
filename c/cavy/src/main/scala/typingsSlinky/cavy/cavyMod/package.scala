package typingsSlinky.cavy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object cavyMod {
  import slinky.core.TagMod
  import slinky.core.facade.ReactRef
  import typingsSlinky.cavy.Anon_GenerateTestHook

  type RefCallback = js.Function1[/* element */ TagMod[Any] | Null, Unit]
  type TestHookGenerator = TestHookGeneratorWithRefCallback with TestHookGeneratorWithRefObject
  type TestHookGeneratorWithRefCallback = js.Function2[/* label */ String, /* ref */ js.UndefOr[RefCallback], RefCallback]
  type TestHookGeneratorWithRefObject = js.Function2[/* label */ String, /* ref */ js.UndefOr[ReactRef[js.Any]], ReactRef[js.Any]]
  type WithTestHook[P /* <: js.Object */] = P with Anon_GenerateTestHook
}
