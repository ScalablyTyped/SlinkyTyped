package typingsSlinky.babylonjs.global.BABYLON

import typingsSlinky.babylonjs.BABYLON.IEffectCreationOptions
import typingsSlinky.babylonjs.BABYLON.IEffectFallbacks
import typingsSlinky.babylonjs.BABYLON.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.Effect")
@js.native
class Effect protected ()
  extends typingsSlinky.babylonjs.BABYLON.Effect {
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
    uniformsNamesOrEngine: js.Array[String] | typingsSlinky.babylonjs.BABYLON.ThinEngine,
    samplers: js.UndefOr[Nullable[js.Array[String]]],
    engine: js.UndefOr[typingsSlinky.babylonjs.BABYLON.ThinEngine],
    defines: js.UndefOr[Nullable[String]],
    fallbacks: js.UndefOr[Nullable[IEffectFallbacks]],
    onCompiled: js.UndefOr[
        Nullable[js.Function1[/* effect */ typingsSlinky.babylonjs.BABYLON.Effect, Unit]]
      ],
    onError: js.UndefOr[
        Nullable[
          js.Function2[/* effect */ typingsSlinky.babylonjs.BABYLON.Effect, /* errors */ String, Unit]
        ]
      ],
    indexParameters: js.UndefOr[js.Any]
  ) = this()
}
/* static members */
object Effect {
  
  @JSGlobal("BABYLON.Effect")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Store of each included file for a shader (The can be looked up using effect.key)
    */
  @JSGlobal("BABYLON.Effect.IncludesShadersStore")
  @js.native
  def IncludesShadersStore: org.scalablytyped.runtime.StringDictionary[String] = js.native
  @scala.inline
  def IncludesShadersStore_=(x: org.scalablytyped.runtime.StringDictionary[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IncludesShadersStore")(x.asInstanceOf[js.Any])
  
  /**
    * Enable logging of the shader code when a compilation error occurs
    */
  @JSGlobal("BABYLON.Effect.LogShaderCodeOnCompilationError")
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
  @JSGlobal("BABYLON.Effect.RegisterShader")
  @js.native
  def RegisterShader(name: String): Unit = js.native
  @JSGlobal("BABYLON.Effect.RegisterShader")
  @js.native
  def RegisterShader(name: String, pixelShader: js.UndefOr[scala.Nothing], vertexShader: String): Unit = js.native
  @JSGlobal("BABYLON.Effect.RegisterShader")
  @js.native
  def RegisterShader(name: String, pixelShader: String): Unit = js.native
  @JSGlobal("BABYLON.Effect.RegisterShader")
  @js.native
  def RegisterShader(name: String, pixelShader: String, vertexShader: String): Unit = js.native
  
  /**
    * Resets the cache of effects.
    */
  @JSGlobal("BABYLON.Effect.ResetCache")
  @js.native
  def ResetCache(): Unit = js.native
  
  /**
    * Gets or sets the relative url used to load shaders if using the engine in non-minified mode
    */
  @JSGlobal("BABYLON.Effect.ShadersRepository")
  @js.native
  def ShadersRepository: String = js.native
  @scala.inline
  def ShadersRepository_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ShadersRepository")(x.asInstanceOf[js.Any])
  
  /**
    * Store of each shader (The can be looked up using effect.key)
    */
  @JSGlobal("BABYLON.Effect.ShadersStore")
  @js.native
  def ShadersStore: org.scalablytyped.runtime.StringDictionary[String] = js.native
  @scala.inline
  def ShadersStore_=(x: org.scalablytyped.runtime.StringDictionary[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ShadersStore")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.Effect._baseCache")
  @js.native
  def _baseCache: js.Any = js.native
  @scala.inline
  def _baseCache_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_baseCache")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.Effect._uniqueIdSeed")
  @js.native
  def _uniqueIdSeed: js.Any = js.native
  @scala.inline
  def _uniqueIdSeed_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_uniqueIdSeed")(x.asInstanceOf[js.Any])
}
