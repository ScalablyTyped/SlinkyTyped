package typingsSlinky.babylonjs.materialsIndexMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.babylonjs.effectMod.IEffectCreationOptions
import typingsSlinky.babylonjs.iEffectFallbacksMod.IEffectFallbacks
import typingsSlinky.babylonjs.thinEngineMod.ThinEngine
import typingsSlinky.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Materials/index", "Effect")
@js.native
class Effect protected ()
  extends typingsSlinky.babylonjs.effectMod.Effect {
  /**
    * Instantiates an effect.
    * An effect can be used to create/manage/execute vertex and fragment shaders.
    * @param baseName Name of the effect.
    * @param attributesNamesOrOptions List of attribute names that will be passed to the shader or set of all options to create the effect.
    * @param uniformsNamesOrEngine List of uniform variable names that will be passed to the shader or the engine that will be used to render effect.
    * @param samplers List of sampler variables that will be passed to the shader.
    * @param engine Engine to be used to render the effect
    * @param defines Define statements to be added to the shader.
    * @param fallbacks Possible fallbacks for this effect to improve performance when needed.
    * @param onCompiled Callback that will be called when the shader is compiled.
    * @param onError Callback that will be called if an error occurs during shader compilation.
    * @param indexParameters Parameters to be used with Babylons include syntax to iterate over an array (eg. {lights: 10})
    */
  def this(
    baseName: js.Any,
    attributesNamesOrOptions: js.Array[String] | IEffectCreationOptions,
    uniformsNamesOrEngine: js.Array[String] | ThinEngine,
    samplers: js.UndefOr[Nullable[js.Array[String]]],
    engine: js.UndefOr[ThinEngine],
    defines: js.UndefOr[Nullable[String]],
    fallbacks: js.UndefOr[Nullable[IEffectFallbacks]],
    onCompiled: js.UndefOr[
        Nullable[js.Function1[/* effect */ typingsSlinky.babylonjs.effectMod.Effect, Unit]]
      ],
    onError: js.UndefOr[
        Nullable[
          js.Function2[/* effect */ typingsSlinky.babylonjs.effectMod.Effect, /* errors */ String, Unit]
        ]
      ],
    indexParameters: js.UndefOr[js.Any]
  ) = this()
}
/* static members */
object Effect {
  
  @JSImport("babylonjs/Materials/index", "Effect")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Store of each included file for a shader (The can be looked up using effect.key)
    */
  @JSImport("babylonjs/Materials/index", "Effect.IncludesShadersStore")
  @js.native
  def IncludesShadersStore: StringDictionary[String] = js.native
  @scala.inline
  def IncludesShadersStore_=(x: StringDictionary[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IncludesShadersStore")(x.asInstanceOf[js.Any])
  
  /**
    * Enable logging of the shader code when a compilation error occurs
    */
  @JSImport("babylonjs/Materials/index", "Effect.LogShaderCodeOnCompilationError")
  @js.native
  def LogShaderCodeOnCompilationError: Boolean = js.native
  @scala.inline
  def LogShaderCodeOnCompilationError_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LogShaderCodeOnCompilationError")(x.asInstanceOf[js.Any])
  
  /**
    * This function will add a new shader to the shader store
    * @param name the name of the shader
    * @param pixelShader optional pixel shader content
    * @param vertexShader optional vertex shader content
    */
  @JSImport("babylonjs/Materials/index", "Effect.RegisterShader")
  @js.native
  def RegisterShader(name: String): Unit = js.native
  @JSImport("babylonjs/Materials/index", "Effect.RegisterShader")
  @js.native
  def RegisterShader(name: String, pixelShader: js.UndefOr[scala.Nothing], vertexShader: String): Unit = js.native
  @JSImport("babylonjs/Materials/index", "Effect.RegisterShader")
  @js.native
  def RegisterShader(name: String, pixelShader: String): Unit = js.native
  @JSImport("babylonjs/Materials/index", "Effect.RegisterShader")
  @js.native
  def RegisterShader(name: String, pixelShader: String, vertexShader: String): Unit = js.native
  
  /**
    * Resets the cache of effects.
    */
  @JSImport("babylonjs/Materials/index", "Effect.ResetCache")
  @js.native
  def ResetCache(): Unit = js.native
  
  /**
    * Gets or sets the relative url used to load shaders if using the engine in non-minified mode
    */
  @JSImport("babylonjs/Materials/index", "Effect.ShadersRepository")
  @js.native
  def ShadersRepository: String = js.native
  @scala.inline
  def ShadersRepository_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ShadersRepository")(x.asInstanceOf[js.Any])
  
  /**
    * Store of each shader (The can be looked up using effect.key)
    */
  @JSImport("babylonjs/Materials/index", "Effect.ShadersStore")
  @js.native
  def ShadersStore: StringDictionary[String] = js.native
  @scala.inline
  def ShadersStore_=(x: StringDictionary[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ShadersStore")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/Materials/index", "Effect._baseCache")
  @js.native
  def _baseCache: js.Any = js.native
  @scala.inline
  def _baseCache_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_baseCache")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/Materials/index", "Effect._uniqueIdSeed")
  @js.native
  def _uniqueIdSeed: js.Any = js.native
  @scala.inline
  def _uniqueIdSeed_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_uniqueIdSeed")(x.asInstanceOf[js.Any])
}
