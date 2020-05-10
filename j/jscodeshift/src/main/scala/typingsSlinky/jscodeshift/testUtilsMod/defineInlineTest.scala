package typingsSlinky.jscodeshift.testUtilsMod

import typingsSlinky.jscodeshift.coreMod.Options
import typingsSlinky.jscodeshift.coreMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jscodeshift/src/testUtils", "defineInlineTest")
@js.native
object defineInlineTest extends js.Object {
  def apply(module: Transform, options: Options, inputSource: String, expectedOutputSource: String): js.Function0[_] = js.native
  def apply(
    module: Transform,
    options: Options,
    inputSource: String,
    expectedOutputSource: String,
    testName: String
  ): js.Function0[_] = js.native
}

