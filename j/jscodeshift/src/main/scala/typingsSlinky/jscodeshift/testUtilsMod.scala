package typingsSlinky.jscodeshift

import typingsSlinky.jscodeshift.coreMod.Options
import typingsSlinky.jscodeshift.coreMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jscodeshift/src/testUtils", JSImport.Namespace)
@js.native
object testUtilsMod extends js.Object {
  def defineInlineTest(module: Transform, options: Options, inputSource: String, expectedOutputSource: String): js.Function0[_] = js.native
  def defineInlineTest(
    module: Transform,
    options: Options,
    inputSource: String,
    expectedOutputSource: String,
    testName: String
  ): js.Function0[_] = js.native
  def defineTest(dirName: String, transformName: String, options: Options): js.Function0[_] = js.native
  def defineTest(dirName: String, transformName: String, options: Options, testFilePrefix: String): js.Function0[_] = js.native
}

