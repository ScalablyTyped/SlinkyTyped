package typingsSlinky.pixiJs.PIXI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Helper class to create a quad with uvs like in v4
  *
  * @class
  * @memberof PIXI
  * @extends PIXI.Geometry
  */
@js.native
trait QuadUv extends Geometry {
  
  /**
    * legacy upload method, just marks buffers dirty
    * @returns {PIXI.QuadUv} Returns itself.
    */
  def invalidate(): QuadUv = js.native
  
  /**
    * Maps two Rectangle to the quad.
    *
    * @param {PIXI.Rectangle} targetTextureFrame - the first rectangle
    * @param {PIXI.Rectangle} destinationFrame - the second rectangle
    * @return {PIXI.Quad} Returns itself.
    */
  def map(targetTextureFrame: Rectangle, destinationFrame: Rectangle): Quad = js.native
  
  /**
    * The Uvs of the quad
    *
    * @member {Float32Array} PIXI.QuadUv#uvs
    */
  var uvs: js.typedarray.Float32Array = js.native
  
  /**
    * An array of vertices
    *
    * @member {Float32Array} PIXI.QuadUv#vertices
    */
  var vertices: js.typedarray.Float32Array = js.native
}
