package typingsSlinky.pixiJs.PIXI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
    * TextureMatrix instance for this Mesh, used to track Texture changes
    *
    * @member {PIXI.TextureMatrix} PIXI.MeshMaterial#uvMatrix
    * @readonly
    */
  val uvMatrix: TextureMatrix = js.native
  /**
    * Gets called automatically by the Mesh. Intended to be overridden for custom
    * MeshMaterial objects.
    */
  def update(): Unit = js.native
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
  implicit class MeshMaterialOps[Self <: MeshMaterial] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlpha(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alpha")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBatchable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batchable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPluginName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pluginName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTexture(value: Texture): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("texture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTint(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdate(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUvMatrix(value: TextureMatrix): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uvMatrix")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

