package typingsSlinky.babylonjs.BABYLON

import typingsSlinky.babylonjs.anon.EmitVertex
import typingsSlinky.babylonjs.anon.NeedAlphaBlending
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeMaterialBuildStateSharedData extends js.Object {
  /**
    * Gets the list of animated inputs
    */
  var animatedInputs: js.Array[InputBlock] = js.native
  /**
    * Bindable blocks (Blocks that need to set data to the effect)
    */
  var bindableBlocks: js.Array[NodeMaterialBlock] = js.native
  /**
    * List of blocks that can block the isReady function for the material
    */
  var blockingBlocks: js.Array[NodeMaterialBlock] = js.native
  /**
    * List of blocks that can provide a define update
    */
  var blocksWithDefines: js.Array[NodeMaterialBlock] = js.native
  /**
    * List of blocks that can provide a compilation fallback
    */
  var blocksWithFallbacks: js.Array[NodeMaterialBlock] = js.native
  /**
    * Build Id used to avoid multiple recompilations
    */
  var buildId: Double = js.native
  /**
    * List of compilation checks
    */
  var checks: EmitVertex = js.native
  /** List of emitted defines */
  var defineNames: org.scalablytyped.runtime.StringDictionary[Double] = js.native
  /**
    * List of blocks that can provide a dynamic list of uniforms
    */
  var dynamicUniformBlocks: js.Array[NodeMaterialBlock] = js.native
  /** Should emit comments? */
  var emitComments: Boolean = js.native
  /**
    * Gets the compilation hints emitted at compilation time
    */
  var hints: NeedAlphaBlending = js.native
  /**
    * Input blocks
    */
  var inputBlocks: js.Array[InputBlock] = js.native
  /**
    * List of blocks that can provide a repeatable content
    */
  var repeatableContentBlocks: js.Array[NodeMaterialBlock] = js.native
  /** Gets or sets the hosting scene */
  var scene: Scene = js.native
  /**
    * Gets the list of emitted varyings
    */
  var temps: js.Array[String] = js.native
  /**
    * Input blocks
    */
  var textureBlocks: js.Array[ReflectionTextureBlock | TextureBlock] = js.native
  /** List of emitted variables */
  var variableNames: org.scalablytyped.runtime.StringDictionary[Double] = js.native
  /**
    * Gets the varying declaration string
    */
  var varyingDeclaration: String = js.native
  /**
    * Gets the list of emitted varyings
    */
  var varyings: js.Array[String] = js.native
  /** Emit build activity */
  var verbose: Boolean = js.native
  /**
    * Emits console errors and exceptions if there is a failing check
    */
  def emitErrors(): Unit = js.native
}

object NodeMaterialBuildStateSharedData {
  @scala.inline
  def apply(
    animatedInputs: js.Array[InputBlock],
    bindableBlocks: js.Array[NodeMaterialBlock],
    blockingBlocks: js.Array[NodeMaterialBlock],
    blocksWithDefines: js.Array[NodeMaterialBlock],
    blocksWithFallbacks: js.Array[NodeMaterialBlock],
    buildId: Double,
    checks: EmitVertex,
    defineNames: org.scalablytyped.runtime.StringDictionary[Double],
    dynamicUniformBlocks: js.Array[NodeMaterialBlock],
    emitComments: Boolean,
    emitErrors: () => Unit,
    hints: NeedAlphaBlending,
    inputBlocks: js.Array[InputBlock],
    repeatableContentBlocks: js.Array[NodeMaterialBlock],
    scene: Scene,
    temps: js.Array[String],
    textureBlocks: js.Array[ReflectionTextureBlock | TextureBlock],
    variableNames: org.scalablytyped.runtime.StringDictionary[Double],
    varyingDeclaration: String,
    varyings: js.Array[String],
    verbose: Boolean
  ): NodeMaterialBuildStateSharedData = {
    val __obj = js.Dynamic.literal(animatedInputs = animatedInputs.asInstanceOf[js.Any], bindableBlocks = bindableBlocks.asInstanceOf[js.Any], blockingBlocks = blockingBlocks.asInstanceOf[js.Any], blocksWithDefines = blocksWithDefines.asInstanceOf[js.Any], blocksWithFallbacks = blocksWithFallbacks.asInstanceOf[js.Any], buildId = buildId.asInstanceOf[js.Any], checks = checks.asInstanceOf[js.Any], defineNames = defineNames.asInstanceOf[js.Any], dynamicUniformBlocks = dynamicUniformBlocks.asInstanceOf[js.Any], emitComments = emitComments.asInstanceOf[js.Any], emitErrors = js.Any.fromFunction0(emitErrors), hints = hints.asInstanceOf[js.Any], inputBlocks = inputBlocks.asInstanceOf[js.Any], repeatableContentBlocks = repeatableContentBlocks.asInstanceOf[js.Any], scene = scene.asInstanceOf[js.Any], temps = temps.asInstanceOf[js.Any], textureBlocks = textureBlocks.asInstanceOf[js.Any], variableNames = variableNames.asInstanceOf[js.Any], varyingDeclaration = varyingDeclaration.asInstanceOf[js.Any], varyings = varyings.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeMaterialBuildStateSharedData]
  }
  @scala.inline
  implicit class NodeMaterialBuildStateSharedDataOps[Self <: NodeMaterialBuildStateSharedData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimatedInputs(value: js.Array[InputBlock]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animatedInputs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBindableBlocks(value: js.Array[NodeMaterialBlock]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindableBlocks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBlockingBlocks(value: js.Array[NodeMaterialBlock]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockingBlocks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBlocksWithDefines(value: js.Array[NodeMaterialBlock]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blocksWithDefines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBlocksWithFallbacks(value: js.Array[NodeMaterialBlock]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blocksWithFallbacks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBuildId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChecks(value: EmitVertex): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefineNames(value: org.scalablytyped.runtime.StringDictionary[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defineNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDynamicUniformBlocks(value: js.Array[NodeMaterialBlock]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynamicUniformBlocks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEmitComments(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emitComments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEmitErrors(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emitErrors")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHints(value: NeedAlphaBlending): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInputBlocks(value: js.Array[InputBlock]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputBlocks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRepeatableContentBlocks(value: js.Array[NodeMaterialBlock]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repeatableContentBlocks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScene(value: Scene): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scene")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTemps(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("temps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextureBlocks(value: js.Array[ReflectionTextureBlock | TextureBlock]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textureBlocks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVariableNames(value: org.scalablytyped.runtime.StringDictionary[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variableNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVaryingDeclaration(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("varyingDeclaration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVaryings(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("varyings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVerbose(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verbose")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

