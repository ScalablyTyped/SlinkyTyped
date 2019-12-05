package typingsSlinky.hexoDashUtil.hexoDashUtilMod

import typingsSlinky.node.Buffer
import typingsSlinky.node.streamMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hexo-util", "CacheStream")
@js.native
class CacheStream () extends Transform {
  def getCache(): Buffer = js.native
}

