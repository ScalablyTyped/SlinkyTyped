package typingsSlinky.pixiJs.PIXI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Slightly opinionated default shader for PixiJS 2D objects.
  * @class
  * @memberof PIXI
  * @extends PIXI.Shader
  */
@js.native
trait MeshMaterial extends Shader {
  
  /**
    * This gets automatically set by the object using this.
    *
    * @default 1
    * @member {number}
    */
  var alpha: Double = js.native
  
  /**
    * `true` if shader can be batch with the renderer's batch system.
    * @member {boolean} PIXI.MeshMaterial#batchable
    * @default true
    */
  var batchable: Boolean = js.native
  
  /**
    * Renderer plugin for batching
    *
    * @member {string} PIXI.MeshMaterial#pluginName
    * @default 'batch'
    */
  var pluginName: String = js.native
  
  /**
    * Reference to the texture being rendered.
    * @member {PIXI.Texture}
    */
  var texture: Texture = js.native
  
  /**
    * Multiply tint for the material.
    * @member {number}
    * @default 0xFFFFFF
    */
  var tint: Double = js.native
  
  /**
    * Gets called automatically by the Mesh. Intended to be overridden for custom
    * MeshMaterial objects.
    */
  def update(): Unit = js.native
  
  /**
    * TextureMatrix instance for this Mesh, used to track Texture changes
    *
    * @member {PIXI.TextureMatrix} PIXI.MeshMaterial#uvMatrix
    * @readonly
    */
  val uvMatrix: TextureMatrix = js.native
}
object MeshMaterial {
  
  @scala.inline
  def apply(
    alpha: Double,
    batchable: Boolean,
    pluginName: String,
    program: Program,
    texture: Texture,
    tint: Double,
    uniforms: js.Any,
    update: () => Unit,
    uvMatrix: TextureMatrix
  ): MeshMaterial = {
    val __obj = js.Dynamic.literal(alpha = alpha.asInstanceOf[js.Any], batchable = batchable.asInstanceOf[js.Any], pluginName = pluginName.asInstanceOf[js.Any], program = program.asInstanceOf[js.Any], texture = texture.asInstanceOf[js.Any], tint = tint.asInstanceOf[js.Any], uniforms = uniforms.asInstanceOf[js.Any], update = js.Any.fromFunction0(update), uvMatrix = uvMatrix.asInstanceOf[js.Any])
    __obj.asInstanceOf[MeshMaterial]
  }
  
  @scala.inline
  implicit class MeshMaterialMutableBuilder[Self <: MeshMaterial] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBatchable(value: Boolean): Self = StObject.set(x, "batchable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPluginName(value: String): Self = StObject.set(x, "pluginName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTexture(value: Texture): Self = StObject.set(x, "texture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTint(value: Double): Self = StObject.set(x, "tint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdate(value: () => Unit): Self = StObject.set(x, "update", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUvMatrix(value: TextureMatrix): Self = StObject.set(x, "uvMatrix", value.asInstanceOf[js.Any])
  }
}
