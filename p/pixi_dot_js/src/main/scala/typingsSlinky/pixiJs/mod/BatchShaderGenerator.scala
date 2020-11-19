package typingsSlinky.pixiJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Helper that generates batching multi-texture shader. Use it with your new BatchRenderer
  *
  * @class
  * @memberof PIXI
  */
@JSImport("pixi.js", "BatchShaderGenerator")
@js.native
class BatchShaderGenerator protected ()
  extends typingsSlinky.pixiJs.PIXI.BatchShaderGenerator {
  def this(vertexSrc: String, fragTemplate: String) = this()
}
