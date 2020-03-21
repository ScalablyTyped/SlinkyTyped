package typingsSlinky.nodeunit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ICallbackFunction = js.Function1[/* err */ js.UndefOr[js.Any], scala.Unit]
  type ITestBody = js.Function1[/* callback */ typingsSlinky.nodeunit.mod.Test, scala.Unit]
  type ITestCase = js.Function1[
    /* testCase */ org.scalablytyped.runtime.StringDictionary[
      typingsSlinky.nodeunit.mod.ITestBody | typingsSlinky.nodeunit.mod.ITestGroup | scala.Unit
    ], 
    scala.Unit
  ]
}
