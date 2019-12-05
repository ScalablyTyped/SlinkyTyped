package typingsSlinky.postcssDashUrl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object postcssDashUrlMod {
  import typingsSlinky.node.Buffer
  import typingsSlinky.postcss.postcssMod.Plugin
  import typingsSlinky.postcssDashUrl.Anon_AbsolutePath
  import typingsSlinky.postcssDashUrl.Anon_File

  type CustomFilterFunction = js.Function1[/* file */ String, Boolean]
  type CustomHashFunction = js.Function1[/* file */ Buffer, String]
  type CustomTransformFunction = js.Function2[/* asset */ Anon_AbsolutePath, /* dir */ Anon_File, String]
  type Url = Plugin[Options | js.Array[Options]]
}
