package typingsSlinky.pixiJs.global.PIXI.resources

import typingsSlinky.pixiJs.anon.Width
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Resource that can manage several resource (items) inside.
  * All resources need to have the same pixel size.
  * Parent class for CubeResource and ArrayResource
  *
  * @class
  * @extends PIXI.resources.Resource
  * @memberof PIXI.resources
  * @param {object} [options] Options to for Resource constructor
  * @param {number} [options.width] - Width of the resource
  * @param {number} [options.height] - Height of the resource
  */
@JSGlobal("PIXI.resources.AbstractMultiResource")
@js.native
class AbstractMultiResource ()
  extends typingsSlinky.pixiJs.PIXI.resources.AbstractMultiResource {
  def this(options: Width) = this()
}
