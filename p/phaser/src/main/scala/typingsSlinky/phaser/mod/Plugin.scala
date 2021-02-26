package typingsSlinky.phaser.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.phaser.MatterJS.Dependency
import typingsSlinky.phaser.anon.Dict
import typingsSlinky.phaser.anon.IsRange
import typingsSlinky.phaser.anon.Name
import typingsSlinky.phaser.anon.Uses
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("matter", "Plugin")
@js.native
class Plugin ()
  extends typingsSlinky.phaser.MatterJS.Plugin
object Plugin {
  
  /**
    * Recursively finds all of a module's dependencies and returns a flat dependency graph.
    * @method dependencies
    * @param module {} The module.
    * @return {object} A dependency graph.
    */
  /* static member */
  @JSImport("matter", "Plugin.dependencies")
  @js.native
  def dependencies(module: Dependency): js.UndefOr[StringDictionary[js.Array[String]] | String] = js.native
  @JSImport("matter", "Plugin.dependencies")
  @js.native
  def dependencies(module: Dependency, tracked: StringDictionary[js.Array[String]]): js.UndefOr[StringDictionary[js.Array[String]] | String] = js.native
  
  /**
    * Parses a dependency string into its components.
    * The `dependency` is a string of the format `'module-name'` or `'module-name@version'`.
    * See documentation for `Plugin.versionParse` for a description of the format.
    * This function can also handle dependencies that are already resolved (e.g. a module object).
    * @method dependencyParse
    * @param dependency {string} The dependency of the format `'module-name'` or `'module-name@version'`.
    * @return {object} The dependency parsed into its components.
    */
  /* static member */
  @JSImport("matter", "Plugin.dependencyParse")
  @js.native
  def dependencyParse(dependency: Dependency): Name = js.native
  
  /**
    * Returns `true` if `plugin.for` is applicable to `module` by comparing against `module.name` and `module.version`.
    * If `plugin.for` is not specified then it is assumed to be applicable.
    * The value of `plugin.for` is a string of the format `'module-name'` or `'module-name@version'`.
    * @method isFor
    * @param plugin {} The plugin.
    * @param module {} The module.
    * @return {boolean} `true` if `plugin.for` is applicable to `module`, otherwise `false`.
    */
  /* static member */
  @JSImport("matter", "Plugin.isFor")
  @js.native
  def isFor(plugin: typingsSlinky.phaser.MatterJS.Plugin, module: Dict): Boolean = js.native
  
  /**
    * Returns `true` if the object meets the minimum standard to be considered a plugin.
    * This means it must define the following properties:
    * - `name`
    * - `version`
    * - `install`
    * @method isPlugin
    * @param obj {} The obj to test.
    * @return {boolean} `true` if the object can be considered a plugin otherwise `false`.
    */
  /* static member */
  @JSImport("matter", "Plugin.isPlugin")
  @js.native
  def isPlugin(obj: js.Object): Boolean = js.native
  
  /**
    * Registers a plugin object so it can be resolved later by name.
    * @method register
    * @param plugin {} The plugin to register.
    * @return {object} The plugin.
    */
  /* static member */
  @JSImport("matter", "Plugin.register")
  @js.native
  def register(plugin: typingsSlinky.phaser.MatterJS.Plugin): typingsSlinky.phaser.MatterJS.Plugin = js.native
  
  /**
    * Resolves a dependency to a plugin object from the registry if it exists. 
    * The `dependency` may contain a version, but only the name matters when resolving.
    * @method resolve
    * @param dependency {string} The dependency.
    * @return {object} The plugin if resolved, otherwise `undefined`.
    */
  /* static member */
  @JSImport("matter", "Plugin.resolve")
  @js.native
  def resolve(dependency: String): js.UndefOr[typingsSlinky.phaser.MatterJS.Plugin] = js.native
  
  /**
    * Returns a pretty printed plugin name and version.
    * @method toString
    * @param plugin {} The plugin.
    * @return {string} Pretty printed plugin name and version.
    */
  /* static member */
  @JSImport("matter", "Plugin.toString")
  @js.native
  def toString_(plugin: String): String = js.native
  @JSImport("matter", "Plugin.toString")
  @js.native
  def toString_(plugin: typingsSlinky.phaser.MatterJS.Plugin): String = js.native
  
  /**
    * Installs the plugins by calling `plugin.install` on each plugin specified in `plugins` if passed, otherwise `module.uses`.
    * For installing plugins on `Matter` see the convenience function `Matter.use`.
    * Plugins may be specified either by their name or a reference to the plugin object.
    * Plugins themselves may specify further dependencies, but each plugin is installed only once.
    * Order is important, a topological sort is performed to find the best resulting order of installation.
    * This sorting attempts to satisfy every dependency's requested ordering, but may not be exact in all cases.
    * This function logs the resulting status of each dependency in the console, along with any warnings.
    * - A green tick ✅ indicates a dependency was resolved and installed.
    * - An orange diamond 🔶 indicates a dependency was resolved but a warning was thrown for it or one if its dependencies.
    * - A red cross ❌ indicates a dependency could not be resolved.
    * Avoid calling this function multiple times on the same module unless you intend to manually control installation order.
    * @method use
    * @param module {} The module install plugins on.
    * @param [plugins=module.uses] {} The plugins to install on module (optional, defaults to `module.uses`).
    */
  /* static member */
  @JSImport("matter", "Plugin.use")
  @js.native
  def use(module: Uses, plugins: js.Array[typingsSlinky.phaser.MatterJS.Plugin | String]): Unit = js.native
  
  /**
    * Parses a version string into its components.
    * Versions are strictly of the format `x.y.z` (as in [semver](http://semver.org/)).
    * Versions may optionally have a prerelease tag in the format `x.y.z-alpha`.
    * Ranges are a strict subset of [npm ranges](https://docs.npmjs.com/misc/semver#advanced-range-syntax).
    * Only the following range types are supported:
    * - Tilde ranges e.g. `~1.2.3`
    * - Caret ranges e.g. `^1.2.3`
    * - Exact version e.g. `1.2.3`
    * - Any version `*`
    * @method versionParse
    * @param range {string} The version string.
    * @return {object} The version range parsed into its components.
    */
  /* static member */
  @JSImport("matter", "Plugin.versionParse")
  @js.native
  def versionParse(range: String): IsRange = js.native
  
  /**
    * Returns `true` if `version` satisfies the given `range`.
    * See documentation for `Plugin.versionParse` for a description of the format.
    * If a version or range is not specified, then any version (`*`) is assumed to satisfy.
    * @method versionSatisfies
    * @param version {string} The version string.
    * @param range {string} The range string.
    * @return {boolean} `true` if `version` satisfies `range`, otherwise `false`.
    */
  /* static member */
  @JSImport("matter", "Plugin.versionSatisfies")
  @js.native
  def versionSatisfies(version: String, range: String): Boolean = js.native
}
