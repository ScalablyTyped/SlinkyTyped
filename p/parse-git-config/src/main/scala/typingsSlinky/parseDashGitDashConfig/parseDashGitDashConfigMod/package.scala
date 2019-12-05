package typingsSlinky.parseDashGitDashConfig

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object parseDashGitDashConfigMod {
  import org.scalablytyped.runtime.StringDictionary

  // TODO: Can this be defined more precisely?
  type Config = StringDictionary[js.Any]
  type ParseCallback = js.Function2[/* err */ js.Error | Null, /* config */ Config, Unit]
}
