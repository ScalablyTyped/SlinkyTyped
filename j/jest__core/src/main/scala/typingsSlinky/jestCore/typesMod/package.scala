package typingsSlinky.jestCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type Filter = js.Function1[
    /* testPaths */ js.Array[java.lang.String], 
    js.Promise[typingsSlinky.jestCore.AnonFiltered]
  ]
  type TestPathCases = js.Array[typingsSlinky.jestCore.AnonIsMatch]
  type TestRunData = js.Array[typingsSlinky.jestCore.AnonMatches]
}
